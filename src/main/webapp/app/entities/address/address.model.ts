import { IUser } from 'app/entities/user/user.model';

export interface IAddress {
  id?: number;
  address?: string;
  city?: string | null;
  addressUSer?: IUser;
}

export class Address implements IAddress {
  constructor(public id?: number, public address?: string, public city?: string | null, public addressUSer?: IUser) {}
}

export function getAddressIdentifier(address: IAddress): number | undefined {
  return address.id;
}
