package amount.transfer.byphone.amounttransferbyphone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import amount.transfer.byphone.amounttransferbyphone.dtos.TransactionByPhoneRequestDto;
import amount.transfer.byphone.amounttransferbyphone.dtos.TransactionByPhoneResponseDto;
import amount.transfer.byphone.amounttransferbyphone.feignclient.BankApplicationService;
import amount.transfer.byphone.amounttransferbyphone.service.AmountTransferService;

@RestController
@RequestMapping("/gpay")
public class AmountTransferController {
	
	@Autowired
	AmountTransferService amountTransferService;
	
	@Autowired
	BankApplicationService bankApplicationService;
	
	@PostMapping("/fundtransferbyphone")
	public TransactionByPhoneResponseDto transactionByPhone(@RequestBody TransactionByPhoneRequestDto transactionByPhoneRequestDto) {
		return amountTransferService.transactionByPhone(transactionByPhoneRequestDto);
	}

	@GetMapping("/port")
	public String getPort() {
		return bankApplicationService.getPort();
	}
}
