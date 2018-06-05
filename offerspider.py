# -*- coding: utf-8 -*
import requests
from bs4 import BeautifulSoup
import time,sched
import datetime

def offerget(url,headers,index):
    s = requests.session()
    s = BeautifulSoup(s.get(url, headers=headers).content)
    offerinfo=s.find('div',{'class':'ui-grid-a'})
    commentinfo=s.find('div',{'class':'ui-grid'})
    #for line in offerinfo.find_all('a'):
    try:
        resa = offerinfo.find_all('a')
        resb = offerinfo.find_all('p')
        gongsihangye = str(resa[0]).split('>')[1].split('<')[0]
        gongsimingcheng = str(resa[1]).split('>')[1].split('<')[0]
        gongzuogangwei = str(resa[2]).split('>')[1].split('<')[0]
        gongzuodidian = str(resa[3]).split('>')[1].split('<')[0]
        gangweixinshui = str(resb[9]).split('>')[1].split('<')[0]
        kexindu = str(resa[4]).split('>')[1].split('<')[0]
        chuangjianshijian = str(resb[13]).split('>')[1].split('<')[0]
        xinshuibeizhu = str(resb[15]).split('>')[1].split('<')[0]
    except:
        print (str(index)+"error")
        return
    f1.write("第"+str(index)+"条"+'\n')
    f1.write("公司行业："+gongsihangye+'\n')
    f1.write("公司名称：" + gongsimingcheng+'\n')
    f1.write("工作岗位：" + gongzuogangwei+'\n')
    f1.write("工作地点：" + gongzuodidian+'\n')
    f1.write("岗位薪水：" + gangweixinshui+'\n')
    f1.write("可信度：" + kexindu+'\n')
    f1.write("创建时间：" + chuangjianshijian+'\n')
    f1.write("薪水备注：" + xinshuibeizhu+'\n')

    lists=commentinfo.find_all('li')
    f2.write("第" + str(index) + "条" + '\n')
    for comm in lists:
        time=str((comm.find_all('p'))[0])
        comment=str((comm.find_all('p'))[1])
        #print time
        #print comment
        time=time.split('>')[1].split('<')[0]
        comment=comment.split('>')[1].split('<')[0]
        f2.write(time+'\n')
        f2.write(comment+'\n')

if __name__ == '__main__':
    index=1
    headers = {
        'Referer':'http://music.163.com/',
        'Host':'music.163.com',
        'User-Agent':'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36',
        'Accept':'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8'
        }
    while True:
        nowtime = datetime.datetime.now().strftime('%Y-%m-%d-%H')
        f1 = file('offers'+str(nowtime)+'.txt', 'w')
        f2 = file('comments'+str(nowtime)+'.txt', 'w')
        for index in range(1,5000):
            url = 'https://www.ioffershow.com/offerdetail/' + str(index) + '/'
            print url
    	    offerget(url,headers,index)
        f1.close()
        f2.close()
        time.sleep(86000)
