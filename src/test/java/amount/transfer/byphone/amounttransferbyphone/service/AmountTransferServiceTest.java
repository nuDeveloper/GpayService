package amount.transfer.byphone.amounttransferbyphone.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import amount.transfer.byphone.amounttransferbyphone.dtos.TransactionByPhoneRequestDto;
import amount.transfer.byphone.amounttransferbyphone.dtos.TransactionByPhoneResponseDto;
import amount.transfer.byphone.amounttransferbyphone.feignclient.BankApplicationService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
public class AmountTransferServiceTest {

	@InjectMocks
	AmountTransferService amountTransferService;

	@Mock
	BankApplicationService bankApplicationService;

	@Test
	public void testTransactionByPhone() {
		TransactionByPhoneRequestDto transactionByPhoneRequestDto = new TransactionByPhoneRequestDto();
		Mockito.when(bankApplicationService.transactionByPhone(transactionByPhoneRequestDto))
				.thenReturn(new TransactionByPhoneResponseDto());

		TransactionByPhoneResponseDto transactionByPhoneResponseDto = amountTransferService
				.transactionByPhone(transactionByPhoneRequestDto);

		assertNotNull(transactionByPhoneResponseDto);
	}
}
