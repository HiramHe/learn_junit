package cn.edu.hust;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//测试套件，团队开发用得多
@RunWith(Suite.class)
@SuiteClasses({Calculator_01_Test.class,Calculator_02_Test.class})
public class allTest{

}
