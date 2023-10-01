@RestController
public class TeamController {
    private TeamService teamService;
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
    // the rest of the code as before
    @GetMapping("/members/{memberId}")
    public TeamMember getTaskDetails(@PathVariable String memberId) {
        return teamService.getTeamMember2(memberId);
    }
}