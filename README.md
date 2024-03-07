## JVM性能调用工具

### 1.JProfiler

> https://blog.csdn.net/u011397981/article/details/131210536?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522170677484016800192247996%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=170677484016800192247996&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-4-131210536-null-null.142^v99^pc_search_result_base1&utm_term=JProfiler&spm=1018.2226.3001.4187

> https://blog.csdn.net/weixin_44718708/article/details/119461959?ops_request_misc=&request_id=&biz_id=102&utm_term=JProfiler&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-6-119461959.142^v99^pc_search_result_base1&spm=1018.2226.3001.4187

### 2.JVisualVM

> https://writer.blog.csdn.net/article/details/131217133

## 3.面试题

https://blog.csdn.net/leader_song/article/details/132094080?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522170683914016800226526900%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=170683914016800226526900&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~blog~top_positive~default-1-132094080-null-null.nonecase&utm_term=java%E9%9D%A2%E8%AF%95%E5%85%AB%E8%82%A1%E6%96%872023&spm=1018.2226.3001.4450

### 4.高性能缓存Caffeine

https://ghh3809.github.io/2021/05/31/caffeine/

### 5.curl

 curl -k -X POST \
  https://7.185.126.84:32185/energydesignservice/v1/common/file/upload \
  -H 'Content-Type: multipart/form-data' \
  -H 'Postman-Token: 593b23cb-8786-4ed1-9b1a-d19e63354bcb' \
  -H 'X-Access-User: eyJ0ZW5hbnRJZCI6IjEwMDIiLCJ1c2VySWQiOiIxNjg5Mjk4Mjg4MDIxMTk2OTgxIiwidGVuYW50QWNjb3VudCI6Im5ldGxpdmVhZG1pbiIsInN0YXR1cyI6IiIsInVzZXJOYW1lIjoibHV6aGlnYW5nIiwidXNlckFjY291bnQiOiJsV1gxMjI4OTMxIiwicm9sZXMiOltdfQ==' \
  -H 'cache-control: no-cache' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F 'multipartFile=@/opt/paas/sys/log/energydesignservice/PV70_6PV-4L-30-32W-2.5S.rar'
  
  
