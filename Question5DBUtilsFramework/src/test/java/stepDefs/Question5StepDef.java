package stepDefs;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;
import java.util.Map;

public class Question5StepDef {

    @Given("the count {long} should match the DB record")
    public void the_count_should_match_the_db_record(long count) {
        String query = "SELECT COUNT(*) " +
                "FROM store2_movieCounts\n" +
                "WHERE count = 3\n";

        List<Map<String,Object>> resultMapList = DBUtils.getQueryResultListMap(query);
        long actualResult = (long) resultMapList.get(0).get("count");
        Assert.assertEquals(count,actualResult);
    }
}
