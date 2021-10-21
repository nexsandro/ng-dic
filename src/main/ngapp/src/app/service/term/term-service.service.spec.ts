import { TestBed } from '@angular/core/testing';

import { TermServiceService } from './term-service.service';

describe('TermServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TermServiceService = TestBed.get(TermServiceService);
    expect(service).toBeTruthy();
  });
});
