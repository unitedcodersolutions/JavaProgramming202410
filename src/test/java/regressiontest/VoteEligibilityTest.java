package regressiontest;

import com.unitedcoder.homework.week6.VoterEligibility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VoteEligibilityTest {
    @Test
    public  void eligibleToVotePositiveTest()
    {
        VoterEligibility voterEligibility=new VoterEligibility();
        Assertions.assertTrue(voterEligibility.eligibleToVote(18,"yes"));
    }
    @Test
    public  void eligibleToVoteNegativeTest()
    {
        VoterEligibility voterEligibility=new VoterEligibility();
        Assertions.assertFalse(voterEligibility.eligibleToVote(15,"yes"));
        Assertions.assertFalse(voterEligibility.eligibleToVote(18,"No"));
    }
}
