/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package oasis.names.tc.ciq.xsdschema.xAL.util;

import oasis.names.tc.ciq.xsdschema.xAL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage
 * @generated
 */
public class XALAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XALPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XALAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XALPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XALSwitch<Adapter> modelSwitch =
		new XALSwitch<Adapter>() {
			@Override
			public Adapter caseAddressDetails(AddressDetails object) {
				return createAddressDetailsAdapter();
			}
			@Override
			public Adapter caseAddressIdentifierType(AddressIdentifierType object) {
				return createAddressIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseAddressLatitudeDirectionType(AddressLatitudeDirectionType object) {
				return createAddressLatitudeDirectionTypeAdapter();
			}
			@Override
			public Adapter caseAddressLatitudeType(AddressLatitudeType object) {
				return createAddressLatitudeTypeAdapter();
			}
			@Override
			public Adapter caseAddressLinesType(AddressLinesType object) {
				return createAddressLinesTypeAdapter();
			}
			@Override
			public Adapter caseAddressLineType(AddressLineType object) {
				return createAddressLineTypeAdapter();
			}
			@Override
			public Adapter caseAddressLongitudeDirectionType(AddressLongitudeDirectionType object) {
				return createAddressLongitudeDirectionTypeAdapter();
			}
			@Override
			public Adapter caseAddressLongitudeType(AddressLongitudeType object) {
				return createAddressLongitudeTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAdministrativeAreaNameType(AdministrativeAreaNameType object) {
				return createAdministrativeAreaNameTypeAdapter();
			}
			@Override
			public Adapter caseAdministrativeAreaType(AdministrativeAreaType object) {
				return createAdministrativeAreaTypeAdapter();
			}
			@Override
			public Adapter caseBarcodeType(BarcodeType object) {
				return createBarcodeTypeAdapter();
			}
			@Override
			public Adapter caseBuildingNameType(BuildingNameType object) {
				return createBuildingNameTypeAdapter();
			}
			@Override
			public Adapter caseCountryNameCodeType(CountryNameCodeType object) {
				return createCountryNameCodeTypeAdapter();
			}
			@Override
			public Adapter caseCountryNameType(CountryNameType object) {
				return createCountryNameTypeAdapter();
			}
			@Override
			public Adapter caseCountryType(CountryType object) {
				return createCountryTypeAdapter();
			}
			@Override
			public Adapter caseDepartmentNameType(DepartmentNameType object) {
				return createDepartmentNameTypeAdapter();
			}
			@Override
			public Adapter caseDepartmentType(DepartmentType object) {
				return createDepartmentTypeAdapter();
			}
			@Override
			public Adapter caseDependentLocalityNameType(DependentLocalityNameType object) {
				return createDependentLocalityNameTypeAdapter();
			}
			@Override
			public Adapter caseDependentLocalityNumberType(DependentLocalityNumberType object) {
				return createDependentLocalityNumberTypeAdapter();
			}
			@Override
			public Adapter caseDependentLocalityType(DependentLocalityType object) {
				return createDependentLocalityTypeAdapter();
			}
			@Override
			public Adapter caseDependentThoroughfareType(DependentThoroughfareType object) {
				return createDependentThoroughfareTypeAdapter();
			}
			@Override
			public Adapter caseEndorsementLineCodeType(EndorsementLineCodeType object) {
				return createEndorsementLineCodeTypeAdapter();
			}
			@Override
			public Adapter caseFirmNameType(FirmNameType object) {
				return createFirmNameTypeAdapter();
			}
			@Override
			public Adapter caseFirmType(FirmType object) {
				return createFirmTypeAdapter();
			}
			@Override
			public Adapter caseKeyLineCodeType(KeyLineCodeType object) {
				return createKeyLineCodeTypeAdapter();
			}
			@Override
			public Adapter caseLargeMailUserIdentifierType(LargeMailUserIdentifierType object) {
				return createLargeMailUserIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseLargeMailUserNameType(LargeMailUserNameType object) {
				return createLargeMailUserNameTypeAdapter();
			}
			@Override
			public Adapter caseLargeMailUserType(LargeMailUserType object) {
				return createLargeMailUserTypeAdapter();
			}
			@Override
			public Adapter caseLocalityNameType(LocalityNameType object) {
				return createLocalityNameTypeAdapter();
			}
			@Override
			public Adapter caseLocalityType(LocalityType object) {
				return createLocalityTypeAdapter();
			}
			@Override
			public Adapter caseMailStopNameType(MailStopNameType object) {
				return createMailStopNameTypeAdapter();
			}
			@Override
			public Adapter caseMailStopNumberType(MailStopNumberType object) {
				return createMailStopNumberTypeAdapter();
			}
			@Override
			public Adapter caseMailStopType(MailStopType object) {
				return createMailStopTypeAdapter();
			}
			@Override
			public Adapter casePostalCodeNumberExtensionType(PostalCodeNumberExtensionType object) {
				return createPostalCodeNumberExtensionTypeAdapter();
			}
			@Override
			public Adapter casePostalCodeNumberType(PostalCodeNumberType object) {
				return createPostalCodeNumberTypeAdapter();
			}
			@Override
			public Adapter casePostalCodeType(PostalCodeType object) {
				return createPostalCodeTypeAdapter();
			}
			@Override
			public Adapter casePostalRouteNameType(PostalRouteNameType object) {
				return createPostalRouteNameTypeAdapter();
			}
			@Override
			public Adapter casePostalRouteNumberType(PostalRouteNumberType object) {
				return createPostalRouteNumberTypeAdapter();
			}
			@Override
			public Adapter casePostalRouteType(PostalRouteType object) {
				return createPostalRouteTypeAdapter();
			}
			@Override
			public Adapter casePostalServiceElementsType(PostalServiceElementsType object) {
				return createPostalServiceElementsTypeAdapter();
			}
			@Override
			public Adapter casePostBoxNumberExtensionType(PostBoxNumberExtensionType object) {
				return createPostBoxNumberExtensionTypeAdapter();
			}
			@Override
			public Adapter casePostBoxNumberPrefixType(PostBoxNumberPrefixType object) {
				return createPostBoxNumberPrefixTypeAdapter();
			}
			@Override
			public Adapter casePostBoxNumberSuffixType(PostBoxNumberSuffixType object) {
				return createPostBoxNumberSuffixTypeAdapter();
			}
			@Override
			public Adapter casePostBoxNumberType(PostBoxNumberType object) {
				return createPostBoxNumberTypeAdapter();
			}
			@Override
			public Adapter casePostBoxType(PostBoxType object) {
				return createPostBoxTypeAdapter();
			}
			@Override
			public Adapter casePostOfficeNameType(PostOfficeNameType object) {
				return createPostOfficeNameTypeAdapter();
			}
			@Override
			public Adapter casePostOfficeNumberType(PostOfficeNumberType object) {
				return createPostOfficeNumberTypeAdapter();
			}
			@Override
			public Adapter casePostOfficeType(PostOfficeType object) {
				return createPostOfficeTypeAdapter();
			}
			@Override
			public Adapter casePostTownNameType(PostTownNameType object) {
				return createPostTownNameTypeAdapter();
			}
			@Override
			public Adapter casePostTownSuffixType(PostTownSuffixType object) {
				return createPostTownSuffixTypeAdapter();
			}
			@Override
			public Adapter casePostTownType(PostTownType object) {
				return createPostTownTypeAdapter();
			}
			@Override
			public Adapter casePremiseLocationType(PremiseLocationType object) {
				return createPremiseLocationTypeAdapter();
			}
			@Override
			public Adapter casePremiseNameType(PremiseNameType object) {
				return createPremiseNameTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberPrefixType(PremiseNumberPrefixType object) {
				return createPremiseNumberPrefixTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberRangeFromType(PremiseNumberRangeFromType object) {
				return createPremiseNumberRangeFromTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberRangeToType(PremiseNumberRangeToType object) {
				return createPremiseNumberRangeToTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberRangeType(PremiseNumberRangeType object) {
				return createPremiseNumberRangeTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberSuffixType(PremiseNumberSuffixType object) {
				return createPremiseNumberSuffixTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberType(PremiseNumberType object) {
				return createPremiseNumberTypeAdapter();
			}
			@Override
			public Adapter casePremiseType(PremiseType object) {
				return createPremiseTypeAdapter();
			}
			@Override
			public Adapter caseSortingCodeType(SortingCodeType object) {
				return createSortingCodeTypeAdapter();
			}
			@Override
			public Adapter caseSubAdministrativeAreaNameType(SubAdministrativeAreaNameType object) {
				return createSubAdministrativeAreaNameTypeAdapter();
			}
			@Override
			public Adapter caseSubAdministrativeAreaType(SubAdministrativeAreaType object) {
				return createSubAdministrativeAreaTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseLocationType(SubPremiseLocationType object) {
				return createSubPremiseLocationTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseNameType(SubPremiseNameType object) {
				return createSubPremiseNameTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseNumberPrefixType(SubPremiseNumberPrefixType object) {
				return createSubPremiseNumberPrefixTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseNumberSuffixType(SubPremiseNumberSuffixType object) {
				return createSubPremiseNumberSuffixTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseNumberType(SubPremiseNumberType object) {
				return createSubPremiseNumberTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseType(SubPremiseType object) {
				return createSubPremiseTypeAdapter();
			}
			@Override
			public Adapter caseSupplementaryPostalServiceDataType(SupplementaryPostalServiceDataType object) {
				return createSupplementaryPostalServiceDataTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareLeadingTypeType(ThoroughfareLeadingTypeType object) {
				return createThoroughfareLeadingTypeTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNameType(ThoroughfareNameType object) {
				return createThoroughfareNameTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberFromType(ThoroughfareNumberFromType object) {
				return createThoroughfareNumberFromTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberPrefixType(ThoroughfareNumberPrefixType object) {
				return createThoroughfareNumberPrefixTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberRangeType(ThoroughfareNumberRangeType object) {
				return createThoroughfareNumberRangeTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberSuffixType(ThoroughfareNumberSuffixType object) {
				return createThoroughfareNumberSuffixTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberToType(ThoroughfareNumberToType object) {
				return createThoroughfareNumberToTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberType(ThoroughfareNumberType object) {
				return createThoroughfareNumberTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfarePostDirectionType(ThoroughfarePostDirectionType object) {
				return createThoroughfarePostDirectionTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfarePreDirectionType(ThoroughfarePreDirectionType object) {
				return createThoroughfarePreDirectionTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareTrailingTypeType(ThoroughfareTrailingTypeType object) {
				return createThoroughfareTrailingTypeTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareType(ThoroughfareType object) {
				return createThoroughfareTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseXALType(XALType object) {
				return createXALTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails
	 * @generated
	 */
	public Adapter createAddressDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType <em>Address Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType
	 * @generated
	 */
	public Adapter createAddressIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType <em>Address Latitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType
	 * @generated
	 */
	public Adapter createAddressLatitudeDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType <em>Address Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType
	 * @generated
	 */
	public Adapter createAddressLatitudeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType <em>Address Lines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType
	 * @generated
	 */
	public Adapter createAddressLinesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLineType <em>Address Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLineType
	 * @generated
	 */
	public Adapter createAddressLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType <em>Address Longitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType
	 * @generated
	 */
	public Adapter createAddressLongitudeDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType <em>Address Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType
	 * @generated
	 */
	public Adapter createAddressLongitudeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType <em>Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType
	 * @generated
	 */
	public Adapter createAdministrativeAreaNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType <em>Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType
	 * @generated
	 */
	public Adapter createAdministrativeAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.BarcodeType <em>Barcode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BarcodeType
	 * @generated
	 */
	public Adapter createBarcodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType <em>Building Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType
	 * @generated
	 */
	public Adapter createBuildingNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType <em>Country Name Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType
	 * @generated
	 */
	public Adapter createCountryNameCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameType <em>Country Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameType
	 * @generated
	 */
	public Adapter createCountryNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType
	 * @generated
	 */
	public Adapter createCountryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType <em>Department Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType
	 * @generated
	 */
	public Adapter createDepartmentNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentType <em>Department Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentType
	 * @generated
	 */
	public Adapter createDepartmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType <em>Dependent Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType
	 * @generated
	 */
	public Adapter createDependentLocalityNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType <em>Dependent Locality Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType
	 * @generated
	 */
	public Adapter createDependentLocalityNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType <em>Dependent Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType
	 * @generated
	 */
	public Adapter createDependentLocalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType <em>Dependent Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType
	 * @generated
	 */
	public Adapter createDependentThoroughfareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType <em>Endorsement Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType
	 * @generated
	 */
	public Adapter createEndorsementLineCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmNameType <em>Firm Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmNameType
	 * @generated
	 */
	public Adapter createFirmNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType <em>Firm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType
	 * @generated
	 */
	public Adapter createFirmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType <em>Key Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType
	 * @generated
	 */
	public Adapter createKeyLineCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType <em>Large Mail User Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType
	 * @generated
	 */
	public Adapter createLargeMailUserIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType <em>Large Mail User Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType
	 * @generated
	 */
	public Adapter createLargeMailUserNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType <em>Large Mail User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType
	 * @generated
	 */
	public Adapter createLargeMailUserTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType <em>Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType
	 * @generated
	 */
	public Adapter createLocalityNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType <em>Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType
	 * @generated
	 */
	public Adapter createLocalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType <em>Mail Stop Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType
	 * @generated
	 */
	public Adapter createMailStopNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType <em>Mail Stop Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType
	 * @generated
	 */
	public Adapter createMailStopNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopType <em>Mail Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopType
	 * @generated
	 */
	public Adapter createMailStopTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType <em>Postal Code Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType
	 * @generated
	 */
	public Adapter createPostalCodeNumberExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType <em>Postal Code Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType
	 * @generated
	 */
	public Adapter createPostalCodeNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType <em>Postal Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType
	 * @generated
	 */
	public Adapter createPostalCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType <em>Postal Route Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType
	 * @generated
	 */
	public Adapter createPostalRouteNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType <em>Postal Route Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType
	 * @generated
	 */
	public Adapter createPostalRouteNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType <em>Postal Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType
	 * @generated
	 */
	public Adapter createPostalRouteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType <em>Postal Service Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType
	 * @generated
	 */
	public Adapter createPostalServiceElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType <em>Post Box Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType
	 * @generated
	 */
	public Adapter createPostBoxNumberExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType <em>Post Box Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType
	 * @generated
	 */
	public Adapter createPostBoxNumberPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType <em>Post Box Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType
	 * @generated
	 */
	public Adapter createPostBoxNumberSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType <em>Post Box Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType
	 * @generated
	 */
	public Adapter createPostBoxNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType <em>Post Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType
	 * @generated
	 */
	public Adapter createPostBoxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType <em>Post Office Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType
	 * @generated
	 */
	public Adapter createPostOfficeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType <em>Post Office Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType
	 * @generated
	 */
	public Adapter createPostOfficeNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType <em>Post Office Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType
	 * @generated
	 */
	public Adapter createPostOfficeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType <em>Post Town Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType
	 * @generated
	 */
	public Adapter createPostTownNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType <em>Post Town Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType
	 * @generated
	 */
	public Adapter createPostTownSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownType <em>Post Town Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownType
	 * @generated
	 */
	public Adapter createPostTownTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType <em>Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType
	 * @generated
	 */
	public Adapter createPremiseLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType <em>Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType
	 * @generated
	 */
	public Adapter createPremiseNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType <em>Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType
	 * @generated
	 */
	public Adapter createPremiseNumberPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType <em>Premise Number Range From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType
	 * @generated
	 */
	public Adapter createPremiseNumberRangeFromTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType <em>Premise Number Range To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType
	 * @generated
	 */
	public Adapter createPremiseNumberRangeToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType <em>Premise Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType
	 * @generated
	 */
	public Adapter createPremiseNumberRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType <em>Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType
	 * @generated
	 */
	public Adapter createPremiseNumberSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType <em>Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType
	 * @generated
	 */
	public Adapter createPremiseNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType <em>Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType
	 * @generated
	 */
	public Adapter createPremiseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SortingCodeType <em>Sorting Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SortingCodeType
	 * @generated
	 */
	public Adapter createSortingCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType <em>Sub Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType
	 * @generated
	 */
	public Adapter createSubAdministrativeAreaNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType <em>Sub Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType
	 * @generated
	 */
	public Adapter createSubAdministrativeAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseLocationType <em>Sub Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseLocationType
	 * @generated
	 */
	public Adapter createSubPremiseLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType <em>Sub Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType
	 * @generated
	 */
	public Adapter createSubPremiseNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType <em>Sub Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType
	 * @generated
	 */
	public Adapter createSubPremiseNumberPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType <em>Sub Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType
	 * @generated
	 */
	public Adapter createSubPremiseNumberSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType <em>Sub Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType
	 * @generated
	 */
	public Adapter createSubPremiseNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType <em>Sub Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType
	 * @generated
	 */
	public Adapter createSubPremiseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType <em>Supplementary Postal Service Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType
	 * @generated
	 */
	public Adapter createSupplementaryPostalServiceDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType <em>Thoroughfare Leading Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType
	 * @generated
	 */
	public Adapter createThoroughfareLeadingTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType <em>Thoroughfare Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType
	 * @generated
	 */
	public Adapter createThoroughfareNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType <em>Thoroughfare Number From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType
	 * @generated
	 */
	public Adapter createThoroughfareNumberFromTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType <em>Thoroughfare Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType
	 * @generated
	 */
	public Adapter createThoroughfareNumberPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType <em>Thoroughfare Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType
	 * @generated
	 */
	public Adapter createThoroughfareNumberRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType <em>Thoroughfare Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType
	 * @generated
	 */
	public Adapter createThoroughfareNumberSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType <em>Thoroughfare Number To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType
	 * @generated
	 */
	public Adapter createThoroughfareNumberToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType <em>Thoroughfare Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType
	 * @generated
	 */
	public Adapter createThoroughfareNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType <em>Thoroughfare Post Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType
	 * @generated
	 */
	public Adapter createThoroughfarePostDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType <em>Thoroughfare Pre Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType
	 * @generated
	 */
	public Adapter createThoroughfarePreDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType <em>Thoroughfare Trailing Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType
	 * @generated
	 */
	public Adapter createThoroughfareTrailingTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType <em>Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType
	 * @generated
	 */
	public Adapter createThoroughfareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL.XALType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALType
	 * @generated
	 */
	public Adapter createXALTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XALAdapterFactory
