package amount.transfer.byphone.amounttransferbyphone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import amount.transfer.byphone.amounttransferbyphone.dtos.StatementByPhoneResponseDto;
import amount.transfer.byphone.amounttransferbyphone.service.StatementService;

@RestController
@RequestMapping("/gpay")
public class LastFiveTransactionController {
	
	@Autowired
	StatementService statementService;
	
	@GetMapping("/statementbyphone")
	public List<StatementByPhoneResponseDto> getStatementByPhone(@RequestParam(value = "phoneNumber") String phoneNumber){
		return statementService.getStatementByPhone(phoneNumber);
	}

}
