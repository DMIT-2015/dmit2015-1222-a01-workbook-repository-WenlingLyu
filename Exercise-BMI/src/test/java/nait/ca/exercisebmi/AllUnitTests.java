package nait.ca.exercisebmi;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import static org.junit.jupiter.api.Assertions.*;
@Suite
@SuiteDisplayName("JUnit 5 Platform Suite")
@SelectPackages("nait.ca.exercisebmi")
@IncludeClassNamePatterns(".*Test")
//@SelectClasses({CircleTest.class, RectangleTest.class})
public class AllUnitTests
{
// the class remains completely empty,
// being used only as a holder for the above annotations
}