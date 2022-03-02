package amount.transfer.byphone.amounttransferbyphone.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import amount.transfer.byphone.amounttransferbyphone.dtos.StatementByPhoneResponseDto;
import amount.transfer.byphone.amounttransferbyphone.dtos.TransactionByPhoneRequestDto;
import amount.transfer.byphone.amounttransferbyphone.dtos.TransactionByPhoneResponseDto;

@FeignClient(name = "http://BANK-APPLICATION-SERVICE/bankapplication")
public interface BankApplicationService {

	@PostMapping("/fundtransferbyphone")
	public TransactionByPhoneResponseDto transactionByPhone(
			@RequestBody TransactionByPhoneRequestDto transactionByPhoneRequestDto);

	@GetMapping("/statementbyphone")
	public List<StatementByPhoneResponseDto> getStatementByPhone(
			@RequestParam(value = "phoneNumber") String phoneNumber);
	
	@GetMapping("/port")
	public String getPort();

}