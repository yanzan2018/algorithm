## Tell me about yourself 
I am a data scientist(data science engineer) with hands-on experience focusing on machine learning application on the big data. My educational background is computer science. Currently I have been working at Vital Scientist from this July, which is an very early staged company. Before that, I have worked at Cisco and some leading Internet companies based in China. I have designed and developed some AI projects like machine learning automatic calibration platform during manafacture,  web user classification system, social media analytics and recommendation system on various domains like mobile news articles, music etc.  Most of the time I worked as a hybrid role in both data science research and engineer development to build a machine learning pipeline. I am strong working independently because I was often the only data scientist on my team, yet love working with others being a team player like collaborating with other engineers or product managers.

## What are you working on your current job or  which project are you currently working on
### At vs
Data pipeline including data ingestion, data manipulation etc. 
Build in house machine learning infrastructure, like metrics codebase

### At cisco
Now I have been working on building a machine learning pipeline to help calibrate Cisco wireless products during manufacture.  We built this pipeline on spark with h2o open source machine learning framework. 
Specifically, We extract the table on Hive and then do data manipulation like join various tables on spark with data frame, then convert spark data frame to h2o data frame, feed into 

Cisco products need calibrated after they are assembled, and it just like tuning your guitar before you play. Usually test engineers manually adjust the parameters with a set of calibration instructions in test station and check correct or not. Now we build a machine learning pipeline to  quickly predicts calibration values to improve the productivity and reduce manufacturing cost(Saves millions on purchase of new testing equipment and also reduces time to calibrate by 90 percent). 

First we analyze data to identify the dependent relations(order matters) among the calibration points with Topological order and then we do cascade predictions.  What does it mean for  cascade predictions. Specifically, if a calibration point like number one is strongly correlated with another calibration points like number two, we can build a model to predict number two based on known calibration point number one. Similarly, when we get good prediction value for calibration point number  two, if there is a strong correlation between point number 2 and point number three, we can predict point number three by building models based on number one and number two. That’s what we call cascade prediction. We have tried two models, which is GBM and GLM. Both perform well and gbm is better than glm. 

