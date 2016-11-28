key=`cat ../config/alsclient.properties |grep "java.naming.provider.url"|head -n 1|cut -f 2 -d "="`
processList=`ps -ef | grep "java -Dsvr=$key" | grep -v "grep" | awk '{print $2}'`
if [ "$processList" == "" ]
then echo "The Server Job Scheduler is not running."
else
echo $processList | while read processID
do
kill -9 $processID
done
echo "Server Job Scheduler stopped successfully."
fi
