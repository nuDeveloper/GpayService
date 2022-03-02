package amount.transfer.byphone.amounttransferbyphone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amount.transfer.byphone.amounttransferbyphone.dtos.TransactionByPhoneRequestDto;
import amount.transfer.byphone.amounttransferbyphone.dtos.TransactionByPhoneResponseDto;
import amount.transfer.byphone.amounttransferbyphone.feignclient.BankApplicationService;

@Service
public class AmountTransferService {

	@Autowired
	BankApplicationService bankApplicationService;

	public TransactionByPhoneResponseDto transactionByPhone(TransactionByPhoneRequestDto transactionByPhoneRequestDto) {
		return bankApplicationService.transactionByPhone(transactionByPhoneRequestDto);
	}
}
