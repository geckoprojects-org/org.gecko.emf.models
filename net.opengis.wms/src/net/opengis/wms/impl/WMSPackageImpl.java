/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.wms.impl;

import net.opengis.wms.AttributionType;
import net.opengis.wms.AuthorityURLType;
import net.opengis.wms.BoundingBoxType;
import net.opengis.wms.CapabilityType;
import net.opengis.wms.ContactAddressType;
import net.opengis.wms.ContactInformationType;
import net.opengis.wms.ContactPersonPrimaryType;
import net.opengis.wms.DCPTypeType;
import net.opengis.wms.DataURLType;
import net.opengis.wms.DimensionType;
import net.opengis.wms.DocumentRoot;
import net.opengis.wms.EXGeographicBoundingBoxType;
import net.opengis.wms.ExceptionType;
import net.opengis.wms.FeatureListURLType;
import net.opengis.wms.GetType;
import net.opengis.wms.HTTPType;
import net.opengis.wms.IdentifierType;
import net.opengis.wms.KeywordListType;
import net.opengis.wms.KeywordType;
import net.opengis.wms.LayerType;
import net.opengis.wms.LegendURLType;
import net.opengis.wms.LogoURLType;
import net.opengis.wms.MetadataURLType;
import net.opengis.wms.NameType;
import net.opengis.wms.OnlineResourceType;
import net.opengis.wms.OperationType;
import net.opengis.wms.PostType;
import net.opengis.wms.RequestType;
import net.opengis.wms.ServiceType;
import net.opengis.wms.StyleSheetURLType;
import net.opengis.wms.StyleType;
import net.opengis.wms.StyleURLType;
import net.opengis.wms.WMSCapabilitiesType;
import net.opengis.wms.WMSFactory;
import net.opengis.wms.WMSPackage;

import net.opengis.wms.util.WMSValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WMSPackageImpl extends EPackageImpl implements WMSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorityURLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundingBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactAddressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPersonPrimaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataURLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcpTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exGeographicBoundingBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureListURLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legendURLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logoURLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataURLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlineResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSheetURLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleURLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wmsCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latitudeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latitudeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longitudeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longitudeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.opengis.wms.WMSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WMSPackageImpl() {
		super(eNS_URI, WMSFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WMSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WMSPackage init() {
		if (isInited) return (WMSPackage)EPackage.Registry.INSTANCE.getEPackage(WMSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWMSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WMSPackageImpl theWMSPackage = registeredWMSPackage instanceof WMSPackageImpl ? (WMSPackageImpl)registeredWMSPackage : new WMSPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XlinkPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWMSPackage.createPackageContents();

		// Initialize created meta-data
		theWMSPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWMSPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return WMSValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWMSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WMSPackage.eNS_URI, theWMSPackage);
		return theWMSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributionType() {
		return attributionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributionType_Title() {
		return (EAttribute)attributionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributionType_OnlineResource() {
		return (EReference)attributionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributionType_LogoURL() {
		return (EReference)attributionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorityURLType() {
		return authorityURLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorityURLType_OnlineResource() {
		return (EReference)authorityURLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorityURLType_Name() {
		return (EAttribute)authorityURLTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundingBoxType() {
		return boundingBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxType_CRS() {
		return (EAttribute)boundingBoxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxType_Maxx() {
		return (EAttribute)boundingBoxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxType_Maxy() {
		return (EAttribute)boundingBoxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxType_Minx() {
		return (EAttribute)boundingBoxTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxType_Miny() {
		return (EAttribute)boundingBoxTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxType_Resx() {
		return (EAttribute)boundingBoxTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxType_Resy() {
		return (EAttribute)boundingBoxTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityType() {
		return capabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityType_Request() {
		return (EReference)capabilityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityType_Exception() {
		return (EReference)capabilityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapabilityType_ExtendedCapabilitiesGroup() {
		return (EAttribute)capabilityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityType_ExtendedCapabilities() {
		return (EReference)capabilityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityType_Layer() {
		return (EReference)capabilityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactAddressType() {
		return contactAddressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactAddressType_AddressType() {
		return (EAttribute)contactAddressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactAddressType_Address() {
		return (EAttribute)contactAddressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactAddressType_City() {
		return (EAttribute)contactAddressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactAddressType_StateOrProvince() {
		return (EAttribute)contactAddressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactAddressType_PostCode() {
		return (EAttribute)contactAddressTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactAddressType_Country() {
		return (EAttribute)contactAddressTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactInformationType() {
		return contactInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactInformationType_ContactPersonPrimary() {
		return (EReference)contactInformationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactInformationType_ContactPosition() {
		return (EAttribute)contactInformationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactInformationType_ContactAddress() {
		return (EReference)contactInformationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactInformationType_ContactVoiceTelephone() {
		return (EAttribute)contactInformationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactInformationType_ContactFacsimileTelephone() {
		return (EAttribute)contactInformationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactInformationType_ContactElectronicMailAddress() {
		return (EAttribute)contactInformationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactPersonPrimaryType() {
		return contactPersonPrimaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPersonPrimaryType_ContactPerson() {
		return (EAttribute)contactPersonPrimaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPersonPrimaryType_ContactOrganization() {
		return (EAttribute)contactPersonPrimaryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataURLType() {
		return dataURLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataURLType_Format() {
		return (EAttribute)dataURLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataURLType_OnlineResource() {
		return (EReference)dataURLTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDCPTypeType() {
		return dcpTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCPTypeType_HTTP() {
		return (EReference)dcpTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDimensionType() {
		return dimensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimensionType_Value() {
		return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimensionType_Current() {
		return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimensionType_Default() {
		return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimensionType_MultipleValues() {
		return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimensionType_Name() {
		return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimensionType_NearestValue() {
		return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimensionType_Units() {
		return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimensionType_UnitSymbol() {
		return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ExtendedCapabilities() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ExtendedOperation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Abstract() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_AccessConstraints() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Address() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_AddressType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Attribution() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AuthorityURL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BoundingBox() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Capability() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_City() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ContactAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ContactElectronicMailAddress() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ContactFacsimileTelephone() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ContactInformation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ContactOrganization() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ContactPerson() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ContactPersonPrimary() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ContactPosition() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ContactVoiceTelephone() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Country() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_CRS() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DataURL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DCPType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dimension() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EXGeographicBoundingBox() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Exception() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FeatureListURL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Fees() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Format() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Get() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCapabilities() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetFeatureInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HTTP() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Identifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Keyword() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_KeywordList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Layer() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_LayerLimit() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LegendURL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LogoURL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MaxHeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MaxScaleDenominator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MaxWidth() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MetadataURL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MinScaleDenominator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Name() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_OnlineResource() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Post() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_PostCode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Request() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Service() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StateOrProvince() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Style() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StyleSheetURL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StyleURL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Title() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_WMSCapabilities() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExceptionType() {
		return exceptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExceptionType_Format() {
		return (EAttribute)exceptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXGeographicBoundingBoxType() {
		return exGeographicBoundingBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxType_WestBoundLongitude() {
		return (EAttribute)exGeographicBoundingBoxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxType_EastBoundLongitude() {
		return (EAttribute)exGeographicBoundingBoxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxType_SouthBoundLatitude() {
		return (EAttribute)exGeographicBoundingBoxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxType_NorthBoundLatitude() {
		return (EAttribute)exGeographicBoundingBoxTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureListURLType() {
		return featureListURLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureListURLType_Format() {
		return (EAttribute)featureListURLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureListURLType_OnlineResource() {
		return (EReference)featureListURLTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetType() {
		return getTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetType_OnlineResource() {
		return (EReference)getTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTTPType() {
		return httpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHTTPType_Get() {
		return (EReference)httpTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHTTPType_Post() {
		return (EReference)httpTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifierType() {
		return identifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifierType_Value() {
		return (EAttribute)identifierTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifierType_Authority() {
		return (EAttribute)identifierTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeywordListType() {
		return keywordListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeywordListType_Keyword() {
		return (EReference)keywordListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeywordType() {
		return keywordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeywordType_Value() {
		return (EAttribute)keywordTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeywordType_Vocabulary() {
		return (EAttribute)keywordTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerType() {
		return layerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Name() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Title() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Abstract() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_KeywordList() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_CRS() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_EXGeographicBoundingBox() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_BoundingBox() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_Dimension() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_Attribution() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_AuthorityURL() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_Identifier() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_MetadataURL() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_DataURL() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_FeatureListURL() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_Style() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_MinScaleDenominator() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_MaxScaleDenominator() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_Layer() {
		return (EReference)layerTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Cascaded() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_FixedHeight() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_FixedWidth() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_NoSubsets() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Opaque() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Queryable() {
		return (EAttribute)layerTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLegendURLType() {
		return legendURLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegendURLType_Format() {
		return (EAttribute)legendURLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegendURLType_OnlineResource() {
		return (EReference)legendURLTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegendURLType_Height() {
		return (EAttribute)legendURLTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegendURLType_Width() {
		return (EAttribute)legendURLTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogoURLType() {
		return logoURLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogoURLType_Format() {
		return (EAttribute)logoURLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogoURLType_OnlineResource() {
		return (EReference)logoURLTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogoURLType_Height() {
		return (EAttribute)logoURLTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogoURLType_Width() {
		return (EAttribute)logoURLTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadataURLType() {
		return metadataURLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadataURLType_Format() {
		return (EAttribute)metadataURLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadataURLType_OnlineResource() {
		return (EReference)metadataURLTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadataURLType_Type() {
		return (EAttribute)metadataURLTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOnlineResourceType() {
		return onlineResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnlineResourceType_Actuate() {
		return (EAttribute)onlineResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnlineResourceType_Arcrole() {
		return (EAttribute)onlineResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnlineResourceType_Href() {
		return (EAttribute)onlineResourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnlineResourceType_Role() {
		return (EAttribute)onlineResourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnlineResourceType_Show() {
		return (EAttribute)onlineResourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnlineResourceType_Title() {
		return (EAttribute)onlineResourceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnlineResourceType_Type() {
		return (EAttribute)onlineResourceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationType() {
		return operationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationType_Format() {
		return (EAttribute)operationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationType_DCPType() {
		return (EReference)operationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostType() {
		return postTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostType_OnlineResource() {
		return (EReference)postTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestType() {
		return requestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestType_GetCapabilities() {
		return (EReference)requestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestType_GetMap() {
		return (EReference)requestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestType_GetFeatureInfo() {
		return (EReference)requestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestType_ExtendedOperationGroup() {
		return (EAttribute)requestTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestType_ExtendedOperation() {
		return (EReference)requestTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_Name() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_Title() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_Abstract() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceType_KeywordList() {
		return (EReference)serviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceType_OnlineResource() {
		return (EReference)serviceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceType_ContactInformation() {
		return (EReference)serviceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_Fees() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_AccessConstraints() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_LayerLimit() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_MaxWidth() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_MaxHeight() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyleSheetURLType() {
		return styleSheetURLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleSheetURLType_Format() {
		return (EAttribute)styleSheetURLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleSheetURLType_OnlineResource() {
		return (EReference)styleSheetURLTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyleType() {
		return styleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType_Name() {
		return (EAttribute)styleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType_Title() {
		return (EAttribute)styleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType_Abstract() {
		return (EAttribute)styleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleType_LegendURL() {
		return (EReference)styleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleType_StyleSheetURL() {
		return (EReference)styleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleType_StyleURL() {
		return (EReference)styleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyleURLType() {
		return styleURLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleURLType_Format() {
		return (EAttribute)styleURLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleURLType_OnlineResource() {
		return (EReference)styleURLTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWMSCapabilitiesType() {
		return wmsCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMSCapabilitiesType_Service() {
		return (EReference)wmsCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWMSCapabilitiesType_Capability() {
		return (EReference)wmsCapabilitiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMSCapabilitiesType_UpdateSequence() {
		return (EAttribute)wmsCapabilitiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWMSCapabilitiesType_Version() {
		return (EAttribute)wmsCapabilitiesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNameType() {
		return nameTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLatitudeType() {
		return latitudeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLatitudeTypeObject() {
		return latitudeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLongitudeType() {
		return longitudeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLongitudeTypeObject() {
		return longitudeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNameTypeObject() {
		return nameTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMSFactory getWMSFactory() {
		return (WMSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributionTypeEClass = createEClass(ATTRIBUTION_TYPE);
		createEAttribute(attributionTypeEClass, ATTRIBUTION_TYPE__TITLE);
		createEReference(attributionTypeEClass, ATTRIBUTION_TYPE__ONLINE_RESOURCE);
		createEReference(attributionTypeEClass, ATTRIBUTION_TYPE__LOGO_URL);

		authorityURLTypeEClass = createEClass(AUTHORITY_URL_TYPE);
		createEReference(authorityURLTypeEClass, AUTHORITY_URL_TYPE__ONLINE_RESOURCE);
		createEAttribute(authorityURLTypeEClass, AUTHORITY_URL_TYPE__NAME);

		boundingBoxTypeEClass = createEClass(BOUNDING_BOX_TYPE);
		createEAttribute(boundingBoxTypeEClass, BOUNDING_BOX_TYPE__CRS);
		createEAttribute(boundingBoxTypeEClass, BOUNDING_BOX_TYPE__MAXX);
		createEAttribute(boundingBoxTypeEClass, BOUNDING_BOX_TYPE__MAXY);
		createEAttribute(boundingBoxTypeEClass, BOUNDING_BOX_TYPE__MINX);
		createEAttribute(boundingBoxTypeEClass, BOUNDING_BOX_TYPE__MINY);
		createEAttribute(boundingBoxTypeEClass, BOUNDING_BOX_TYPE__RESX);
		createEAttribute(boundingBoxTypeEClass, BOUNDING_BOX_TYPE__RESY);

		capabilityTypeEClass = createEClass(CAPABILITY_TYPE);
		createEReference(capabilityTypeEClass, CAPABILITY_TYPE__REQUEST);
		createEReference(capabilityTypeEClass, CAPABILITY_TYPE__EXCEPTION);
		createEAttribute(capabilityTypeEClass, CAPABILITY_TYPE__EXTENDED_CAPABILITIES_GROUP);
		createEReference(capabilityTypeEClass, CAPABILITY_TYPE__EXTENDED_CAPABILITIES);
		createEReference(capabilityTypeEClass, CAPABILITY_TYPE__LAYER);

		contactAddressTypeEClass = createEClass(CONTACT_ADDRESS_TYPE);
		createEAttribute(contactAddressTypeEClass, CONTACT_ADDRESS_TYPE__ADDRESS_TYPE);
		createEAttribute(contactAddressTypeEClass, CONTACT_ADDRESS_TYPE__ADDRESS);
		createEAttribute(contactAddressTypeEClass, CONTACT_ADDRESS_TYPE__CITY);
		createEAttribute(contactAddressTypeEClass, CONTACT_ADDRESS_TYPE__STATE_OR_PROVINCE);
		createEAttribute(contactAddressTypeEClass, CONTACT_ADDRESS_TYPE__POST_CODE);
		createEAttribute(contactAddressTypeEClass, CONTACT_ADDRESS_TYPE__COUNTRY);

		contactInformationTypeEClass = createEClass(CONTACT_INFORMATION_TYPE);
		createEReference(contactInformationTypeEClass, CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY);
		createEAttribute(contactInformationTypeEClass, CONTACT_INFORMATION_TYPE__CONTACT_POSITION);
		createEReference(contactInformationTypeEClass, CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS);
		createEAttribute(contactInformationTypeEClass, CONTACT_INFORMATION_TYPE__CONTACT_VOICE_TELEPHONE);
		createEAttribute(contactInformationTypeEClass, CONTACT_INFORMATION_TYPE__CONTACT_FACSIMILE_TELEPHONE);
		createEAttribute(contactInformationTypeEClass, CONTACT_INFORMATION_TYPE__CONTACT_ELECTRONIC_MAIL_ADDRESS);

		contactPersonPrimaryTypeEClass = createEClass(CONTACT_PERSON_PRIMARY_TYPE);
		createEAttribute(contactPersonPrimaryTypeEClass, CONTACT_PERSON_PRIMARY_TYPE__CONTACT_PERSON);
		createEAttribute(contactPersonPrimaryTypeEClass, CONTACT_PERSON_PRIMARY_TYPE__CONTACT_ORGANIZATION);

		dataURLTypeEClass = createEClass(DATA_URL_TYPE);
		createEAttribute(dataURLTypeEClass, DATA_URL_TYPE__FORMAT);
		createEReference(dataURLTypeEClass, DATA_URL_TYPE__ONLINE_RESOURCE);

		dcpTypeTypeEClass = createEClass(DCP_TYPE_TYPE);
		createEReference(dcpTypeTypeEClass, DCP_TYPE_TYPE__HTTP);

		dimensionTypeEClass = createEClass(DIMENSION_TYPE);
		createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__VALUE);
		createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__CURRENT);
		createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__DEFAULT);
		createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__MULTIPLE_VALUES);
		createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__NAME);
		createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__NEAREST_VALUE);
		createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__UNITS);
		createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__UNIT_SYMBOL);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENDED_CAPABILITIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENDED_OPERATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ABSTRACT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACCESS_CONSTRAINTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ADDRESS_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTHORITY_URL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOUNDING_BOX);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CAPABILITY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTACT_ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_ELECTRONIC_MAIL_ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_FACSIMILE_TELEPHONE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTACT_INFORMATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_ORGANIZATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_PERSON);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_POSITION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT_VOICE_TELEPHONE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COUNTRY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CRS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA_URL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DCP_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIMENSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE_LIST_URL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FEES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FORMAT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CAPABILITIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_FEATURE_INFO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HTTP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IDENTIFIER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEYWORD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEYWORD_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LAYER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LAYER_LIMIT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LEGEND_URL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOGO_URL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MAX_HEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MAX_SCALE_DENOMINATOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MAX_WIDTH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__METADATA_URL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIN_SCALE_DENOMINATOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ONLINE_RESOURCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__POST_CODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STATE_OR_PROVINCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STYLE_SHEET_URL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STYLE_URL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WMS_CAPABILITIES);

		exceptionTypeEClass = createEClass(EXCEPTION_TYPE);
		createEAttribute(exceptionTypeEClass, EXCEPTION_TYPE__FORMAT);

		exGeographicBoundingBoxTypeEClass = createEClass(EX_GEOGRAPHIC_BOUNDING_BOX_TYPE);
		createEAttribute(exGeographicBoundingBoxTypeEClass, EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE);
		createEAttribute(exGeographicBoundingBoxTypeEClass, EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE);
		createEAttribute(exGeographicBoundingBoxTypeEClass, EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE);
		createEAttribute(exGeographicBoundingBoxTypeEClass, EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE);

		featureListURLTypeEClass = createEClass(FEATURE_LIST_URL_TYPE);
		createEAttribute(featureListURLTypeEClass, FEATURE_LIST_URL_TYPE__FORMAT);
		createEReference(featureListURLTypeEClass, FEATURE_LIST_URL_TYPE__ONLINE_RESOURCE);

		getTypeEClass = createEClass(GET_TYPE);
		createEReference(getTypeEClass, GET_TYPE__ONLINE_RESOURCE);

		httpTypeEClass = createEClass(HTTP_TYPE);
		createEReference(httpTypeEClass, HTTP_TYPE__GET);
		createEReference(httpTypeEClass, HTTP_TYPE__POST);

		identifierTypeEClass = createEClass(IDENTIFIER_TYPE);
		createEAttribute(identifierTypeEClass, IDENTIFIER_TYPE__VALUE);
		createEAttribute(identifierTypeEClass, IDENTIFIER_TYPE__AUTHORITY);

		keywordListTypeEClass = createEClass(KEYWORD_LIST_TYPE);
		createEReference(keywordListTypeEClass, KEYWORD_LIST_TYPE__KEYWORD);

		keywordTypeEClass = createEClass(KEYWORD_TYPE);
		createEAttribute(keywordTypeEClass, KEYWORD_TYPE__VALUE);
		createEAttribute(keywordTypeEClass, KEYWORD_TYPE__VOCABULARY);

		layerTypeEClass = createEClass(LAYER_TYPE);
		createEAttribute(layerTypeEClass, LAYER_TYPE__NAME);
		createEAttribute(layerTypeEClass, LAYER_TYPE__TITLE);
		createEAttribute(layerTypeEClass, LAYER_TYPE__ABSTRACT);
		createEReference(layerTypeEClass, LAYER_TYPE__KEYWORD_LIST);
		createEAttribute(layerTypeEClass, LAYER_TYPE__CRS);
		createEReference(layerTypeEClass, LAYER_TYPE__EX_GEOGRAPHIC_BOUNDING_BOX);
		createEReference(layerTypeEClass, LAYER_TYPE__BOUNDING_BOX);
		createEReference(layerTypeEClass, LAYER_TYPE__DIMENSION);
		createEReference(layerTypeEClass, LAYER_TYPE__ATTRIBUTION);
		createEReference(layerTypeEClass, LAYER_TYPE__AUTHORITY_URL);
		createEReference(layerTypeEClass, LAYER_TYPE__IDENTIFIER);
		createEReference(layerTypeEClass, LAYER_TYPE__METADATA_URL);
		createEReference(layerTypeEClass, LAYER_TYPE__DATA_URL);
		createEReference(layerTypeEClass, LAYER_TYPE__FEATURE_LIST_URL);
		createEReference(layerTypeEClass, LAYER_TYPE__STYLE);
		createEAttribute(layerTypeEClass, LAYER_TYPE__MIN_SCALE_DENOMINATOR);
		createEAttribute(layerTypeEClass, LAYER_TYPE__MAX_SCALE_DENOMINATOR);
		createEReference(layerTypeEClass, LAYER_TYPE__LAYER);
		createEAttribute(layerTypeEClass, LAYER_TYPE__CASCADED);
		createEAttribute(layerTypeEClass, LAYER_TYPE__FIXED_HEIGHT);
		createEAttribute(layerTypeEClass, LAYER_TYPE__FIXED_WIDTH);
		createEAttribute(layerTypeEClass, LAYER_TYPE__NO_SUBSETS);
		createEAttribute(layerTypeEClass, LAYER_TYPE__OPAQUE);
		createEAttribute(layerTypeEClass, LAYER_TYPE__QUERYABLE);

		legendURLTypeEClass = createEClass(LEGEND_URL_TYPE);
		createEAttribute(legendURLTypeEClass, LEGEND_URL_TYPE__FORMAT);
		createEReference(legendURLTypeEClass, LEGEND_URL_TYPE__ONLINE_RESOURCE);
		createEAttribute(legendURLTypeEClass, LEGEND_URL_TYPE__HEIGHT);
		createEAttribute(legendURLTypeEClass, LEGEND_URL_TYPE__WIDTH);

		logoURLTypeEClass = createEClass(LOGO_URL_TYPE);
		createEAttribute(logoURLTypeEClass, LOGO_URL_TYPE__FORMAT);
		createEReference(logoURLTypeEClass, LOGO_URL_TYPE__ONLINE_RESOURCE);
		createEAttribute(logoURLTypeEClass, LOGO_URL_TYPE__HEIGHT);
		createEAttribute(logoURLTypeEClass, LOGO_URL_TYPE__WIDTH);

		metadataURLTypeEClass = createEClass(METADATA_URL_TYPE);
		createEAttribute(metadataURLTypeEClass, METADATA_URL_TYPE__FORMAT);
		createEReference(metadataURLTypeEClass, METADATA_URL_TYPE__ONLINE_RESOURCE);
		createEAttribute(metadataURLTypeEClass, METADATA_URL_TYPE__TYPE);

		onlineResourceTypeEClass = createEClass(ONLINE_RESOURCE_TYPE);
		createEAttribute(onlineResourceTypeEClass, ONLINE_RESOURCE_TYPE__ACTUATE);
		createEAttribute(onlineResourceTypeEClass, ONLINE_RESOURCE_TYPE__ARCROLE);
		createEAttribute(onlineResourceTypeEClass, ONLINE_RESOURCE_TYPE__HREF);
		createEAttribute(onlineResourceTypeEClass, ONLINE_RESOURCE_TYPE__ROLE);
		createEAttribute(onlineResourceTypeEClass, ONLINE_RESOURCE_TYPE__SHOW);
		createEAttribute(onlineResourceTypeEClass, ONLINE_RESOURCE_TYPE__TITLE);
		createEAttribute(onlineResourceTypeEClass, ONLINE_RESOURCE_TYPE__TYPE);

		operationTypeEClass = createEClass(OPERATION_TYPE);
		createEAttribute(operationTypeEClass, OPERATION_TYPE__FORMAT);
		createEReference(operationTypeEClass, OPERATION_TYPE__DCP_TYPE);

		postTypeEClass = createEClass(POST_TYPE);
		createEReference(postTypeEClass, POST_TYPE__ONLINE_RESOURCE);

		requestTypeEClass = createEClass(REQUEST_TYPE);
		createEReference(requestTypeEClass, REQUEST_TYPE__GET_CAPABILITIES);
		createEReference(requestTypeEClass, REQUEST_TYPE__GET_MAP);
		createEReference(requestTypeEClass, REQUEST_TYPE__GET_FEATURE_INFO);
		createEAttribute(requestTypeEClass, REQUEST_TYPE__EXTENDED_OPERATION_GROUP);
		createEReference(requestTypeEClass, REQUEST_TYPE__EXTENDED_OPERATION);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__NAME);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__TITLE);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__ABSTRACT);
		createEReference(serviceTypeEClass, SERVICE_TYPE__KEYWORD_LIST);
		createEReference(serviceTypeEClass, SERVICE_TYPE__ONLINE_RESOURCE);
		createEReference(serviceTypeEClass, SERVICE_TYPE__CONTACT_INFORMATION);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__FEES);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__ACCESS_CONSTRAINTS);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__LAYER_LIMIT);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__MAX_WIDTH);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__MAX_HEIGHT);

		styleSheetURLTypeEClass = createEClass(STYLE_SHEET_URL_TYPE);
		createEAttribute(styleSheetURLTypeEClass, STYLE_SHEET_URL_TYPE__FORMAT);
		createEReference(styleSheetURLTypeEClass, STYLE_SHEET_URL_TYPE__ONLINE_RESOURCE);

		styleTypeEClass = createEClass(STYLE_TYPE);
		createEAttribute(styleTypeEClass, STYLE_TYPE__NAME);
		createEAttribute(styleTypeEClass, STYLE_TYPE__TITLE);
		createEAttribute(styleTypeEClass, STYLE_TYPE__ABSTRACT);
		createEReference(styleTypeEClass, STYLE_TYPE__LEGEND_URL);
		createEReference(styleTypeEClass, STYLE_TYPE__STYLE_SHEET_URL);
		createEReference(styleTypeEClass, STYLE_TYPE__STYLE_URL);

		styleURLTypeEClass = createEClass(STYLE_URL_TYPE);
		createEAttribute(styleURLTypeEClass, STYLE_URL_TYPE__FORMAT);
		createEReference(styleURLTypeEClass, STYLE_URL_TYPE__ONLINE_RESOURCE);

		wmsCapabilitiesTypeEClass = createEClass(WMS_CAPABILITIES_TYPE);
		createEReference(wmsCapabilitiesTypeEClass, WMS_CAPABILITIES_TYPE__SERVICE);
		createEReference(wmsCapabilitiesTypeEClass, WMS_CAPABILITIES_TYPE__CAPABILITY);
		createEAttribute(wmsCapabilitiesTypeEClass, WMS_CAPABILITIES_TYPE__UPDATE_SEQUENCE);
		createEAttribute(wmsCapabilitiesTypeEClass, WMS_CAPABILITIES_TYPE__VERSION);

		// Create enums
		nameTypeEEnum = createEEnum(NAME_TYPE);

		// Create data types
		latitudeTypeEDataType = createEDataType(LATITUDE_TYPE);
		latitudeTypeObjectEDataType = createEDataType(LATITUDE_TYPE_OBJECT);
		longitudeTypeEDataType = createEDataType(LONGITUDE_TYPE);
		longitudeTypeObjectEDataType = createEDataType(LONGITUDE_TYPE_OBJECT);
		nameTypeObjectEDataType = createEDataType(NAME_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(attributionTypeEClass, AttributionType.class, "AttributionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributionType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, AttributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributionType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 0, 1, AttributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributionType_LogoURL(), this.getLogoURLType(), null, "logoURL", null, 0, 1, AttributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorityURLTypeEClass, AuthorityURLType.class, "AuthorityURLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorityURLType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, AuthorityURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorityURLType_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 1, 1, AuthorityURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundingBoxTypeEClass, BoundingBoxType.class, "BoundingBoxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundingBoxType_CRS(), theXMLTypePackage.getString(), "cRS", null, 1, 1, BoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBoxType_Maxx(), theXMLTypePackage.getDouble(), "maxx", null, 1, 1, BoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBoxType_Maxy(), theXMLTypePackage.getDouble(), "maxy", null, 1, 1, BoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBoxType_Minx(), theXMLTypePackage.getDouble(), "minx", null, 1, 1, BoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBoxType_Miny(), theXMLTypePackage.getDouble(), "miny", null, 1, 1, BoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBoxType_Resx(), theXMLTypePackage.getDouble(), "resx", null, 0, 1, BoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBoxType_Resy(), theXMLTypePackage.getDouble(), "resy", null, 0, 1, BoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityTypeEClass, CapabilityType.class, "CapabilityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityType_Request(), this.getRequestType(), null, "request", null, 1, 1, CapabilityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityType_Exception(), this.getExceptionType(), null, "exception", null, 1, 1, CapabilityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilityType_ExtendedCapabilitiesGroup(), ecorePackage.getEFeatureMapEntry(), "extendedCapabilitiesGroup", null, 0, -1, CapabilityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityType_ExtendedCapabilities(), ecorePackage.getEObject(), null, "extendedCapabilities", null, 0, -1, CapabilityType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityType_Layer(), this.getLayerType(), null, "layer", null, 0, 1, CapabilityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactAddressTypeEClass, ContactAddressType.class, "ContactAddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactAddressType_AddressType(), theXMLTypePackage.getString(), "addressType", null, 1, 1, ContactAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactAddressType_Address(), theXMLTypePackage.getString(), "address", null, 1, 1, ContactAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactAddressType_City(), theXMLTypePackage.getString(), "city", null, 1, 1, ContactAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactAddressType_StateOrProvince(), theXMLTypePackage.getString(), "stateOrProvince", null, 1, 1, ContactAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactAddressType_PostCode(), theXMLTypePackage.getString(), "postCode", null, 1, 1, ContactAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactAddressType_Country(), theXMLTypePackage.getString(), "country", null, 1, 1, ContactAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactInformationTypeEClass, ContactInformationType.class, "ContactInformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactInformationType_ContactPersonPrimary(), this.getContactPersonPrimaryType(), null, "contactPersonPrimary", null, 0, 1, ContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformationType_ContactPosition(), theXMLTypePackage.getString(), "contactPosition", null, 0, 1, ContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactInformationType_ContactAddress(), this.getContactAddressType(), null, "contactAddress", null, 0, 1, ContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformationType_ContactVoiceTelephone(), theXMLTypePackage.getString(), "contactVoiceTelephone", null, 0, 1, ContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformationType_ContactFacsimileTelephone(), theXMLTypePackage.getString(), "contactFacsimileTelephone", null, 0, 1, ContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformationType_ContactElectronicMailAddress(), theXMLTypePackage.getString(), "contactElectronicMailAddress", null, 0, 1, ContactInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactPersonPrimaryTypeEClass, ContactPersonPrimaryType.class, "ContactPersonPrimaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactPersonPrimaryType_ContactPerson(), theXMLTypePackage.getString(), "contactPerson", null, 1, 1, ContactPersonPrimaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactPersonPrimaryType_ContactOrganization(), theXMLTypePackage.getString(), "contactOrganization", null, 1, 1, ContactPersonPrimaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataURLTypeEClass, DataURLType.class, "DataURLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataURLType_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, DataURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataURLType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, DataURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcpTypeTypeEClass, DCPTypeType.class, "DCPTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDCPTypeType_HTTP(), this.getHTTPType(), null, "hTTP", null, 1, 1, DCPTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionTypeEClass, DimensionType.class, "DimensionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionType_Current(), theXMLTypePackage.getBoolean(), "current", null, 0, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionType_Default(), theXMLTypePackage.getString(), "default", null, 0, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionType_MultipleValues(), theXMLTypePackage.getBoolean(), "multipleValues", null, 0, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionType_NearestValue(), theXMLTypePackage.getBoolean(), "nearestValue", null, 0, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionType_Units(), theXMLTypePackage.getString(), "units", null, 1, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionType_UnitSymbol(), theXMLTypePackage.getString(), "unitSymbol", null, 0, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtendedCapabilities(), ecorePackage.getEObject(), null, "extendedCapabilities", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtendedOperation(), this.getOperationType(), null, "extendedOperation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Abstract(), theXMLTypePackage.getString(), "abstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AccessConstraints(), theXMLTypePackage.getString(), "accessConstraints", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Address(), theXMLTypePackage.getString(), "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AddressType(), theXMLTypePackage.getString(), "addressType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Attribution(), this.getAttributionType(), null, "attribution", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AuthorityURL(), this.getAuthorityURLType(), null, "authorityURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BoundingBox(), this.getBoundingBoxType(), null, "boundingBox", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Capability(), this.getCapabilityType(), null, "capability", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_City(), theXMLTypePackage.getString(), "city", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ContactAddress(), this.getContactAddressType(), null, "contactAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactElectronicMailAddress(), theXMLTypePackage.getString(), "contactElectronicMailAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactFacsimileTelephone(), theXMLTypePackage.getString(), "contactFacsimileTelephone", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ContactInformation(), this.getContactInformationType(), null, "contactInformation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactOrganization(), theXMLTypePackage.getString(), "contactOrganization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactPerson(), theXMLTypePackage.getString(), "contactPerson", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ContactPersonPrimary(), this.getContactPersonPrimaryType(), null, "contactPersonPrimary", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactPosition(), theXMLTypePackage.getString(), "contactPosition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ContactVoiceTelephone(), theXMLTypePackage.getString(), "contactVoiceTelephone", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Country(), theXMLTypePackage.getString(), "country", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CRS(), theXMLTypePackage.getString(), "cRS", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DataURL(), this.getDataURLType(), null, "dataURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DCPType(), this.getDCPTypeType(), null, "dCPType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dimension(), this.getDimensionType(), null, "dimension", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EXGeographicBoundingBox(), this.getEXGeographicBoundingBoxType(), null, "eXGeographicBoundingBox", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Exception(), this.getExceptionType(), null, "exception", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FeatureListURL(), this.getFeatureListURLType(), null, "featureListURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Fees(), theXMLTypePackage.getString(), "fees", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Format(), theXMLTypePackage.getString(), "format", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Get(), this.getGetType(), null, "get", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCapabilities(), this.getOperationType(), null, "getCapabilities", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetFeatureInfo(), this.getOperationType(), null, "getFeatureInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetMap(), this.getOperationType(), null, "getMap", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HTTP(), this.getHTTPType(), null, "hTTP", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Identifier(), this.getIdentifierType(), null, "identifier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Keyword(), this.getKeywordType(), null, "keyword", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeywordList(), this.getKeywordListType(), null, "keywordList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Layer(), this.getLayerType(), null, "layer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LayerLimit(), theXMLTypePackage.getPositiveInteger(), "layerLimit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LegendURL(), this.getLegendURLType(), null, "legendURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LogoURL(), this.getLogoURLType(), null, "logoURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MaxHeight(), theXMLTypePackage.getPositiveInteger(), "maxHeight", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MaxScaleDenominator(), theXMLTypePackage.getDouble(), "maxScaleDenominator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MaxWidth(), theXMLTypePackage.getPositiveInteger(), "maxWidth", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MetadataURL(), this.getMetadataURLType(), null, "metadataURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MinScaleDenominator(), theXMLTypePackage.getDouble(), "minScaleDenominator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name(), theXMLTypePackage.getString(), "name", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Post(), this.getPostType(), null, "post", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PostCode(), theXMLTypePackage.getString(), "postCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Request(), this.getRequestType(), null, "request", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Service(), this.getServiceType(), null, "service", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StateOrProvince(), theXMLTypePackage.getString(), "stateOrProvince", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Style(), this.getStyleType(), null, "style", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StyleSheetURL(), this.getStyleSheetURLType(), null, "styleSheetURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StyleURL(), this.getStyleURLType(), null, "styleURL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Title(), theXMLTypePackage.getString(), "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WMSCapabilities(), this.getWMSCapabilitiesType(), null, "wMSCapabilities", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exceptionTypeEClass, ExceptionType.class, "ExceptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionType_Format(), theXMLTypePackage.getString(), "format", null, 1, -1, ExceptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exGeographicBoundingBoxTypeEClass, EXGeographicBoundingBoxType.class, "EXGeographicBoundingBoxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEXGeographicBoundingBoxType_WestBoundLongitude(), this.getLongitudeType(), "westBoundLongitude", null, 1, 1, EXGeographicBoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEXGeographicBoundingBoxType_EastBoundLongitude(), this.getLongitudeType(), "eastBoundLongitude", null, 1, 1, EXGeographicBoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEXGeographicBoundingBoxType_SouthBoundLatitude(), this.getLatitudeType(), "southBoundLatitude", null, 1, 1, EXGeographicBoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEXGeographicBoundingBoxType_NorthBoundLatitude(), this.getLatitudeType(), "northBoundLatitude", null, 1, 1, EXGeographicBoundingBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureListURLTypeEClass, FeatureListURLType.class, "FeatureListURLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureListURLType_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, FeatureListURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureListURLType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, FeatureListURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTypeEClass, GetType.class, "GetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, GetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpTypeEClass, HTTPType.class, "HTTPType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTTPType_Get(), this.getGetType(), null, "get", null, 1, 1, HTTPType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPType_Post(), this.getPostType(), null, "post", null, 0, 1, HTTPType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierTypeEClass, IdentifierType.class, "IdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifierType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, IdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifierType_Authority(), theXMLTypePackage.getString(), "authority", null, 1, 1, IdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordListTypeEClass, KeywordListType.class, "KeywordListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeywordListType_Keyword(), this.getKeywordType(), null, "keyword", null, 0, -1, KeywordListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordTypeEClass, KeywordType.class, "KeywordType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeywordType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, KeywordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeywordType_Vocabulary(), theXMLTypePackage.getString(), "vocabulary", null, 0, 1, KeywordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTypeEClass, LayerType.class, "LayerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayerType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_Abstract(), theXMLTypePackage.getString(), "abstract", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_KeywordList(), this.getKeywordListType(), null, "keywordList", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_CRS(), theXMLTypePackage.getString(), "cRS", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_EXGeographicBoundingBox(), this.getEXGeographicBoundingBoxType(), null, "eXGeographicBoundingBox", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_BoundingBox(), this.getBoundingBoxType(), null, "boundingBox", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_Dimension(), this.getDimensionType(), null, "dimension", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_Attribution(), this.getAttributionType(), null, "attribution", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_AuthorityURL(), this.getAuthorityURLType(), null, "authorityURL", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_Identifier(), this.getIdentifierType(), null, "identifier", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_MetadataURL(), this.getMetadataURLType(), null, "metadataURL", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_DataURL(), this.getDataURLType(), null, "dataURL", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_FeatureListURL(), this.getFeatureListURLType(), null, "featureListURL", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_Style(), this.getStyleType(), null, "style", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_MinScaleDenominator(), theXMLTypePackage.getDouble(), "minScaleDenominator", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_MaxScaleDenominator(), theXMLTypePackage.getDouble(), "maxScaleDenominator", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerType_Layer(), this.getLayerType(), null, "layer", null, 0, -1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_Cascaded(), theXMLTypePackage.getNonNegativeInteger(), "cascaded", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_FixedHeight(), theXMLTypePackage.getNonNegativeInteger(), "fixedHeight", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_FixedWidth(), theXMLTypePackage.getNonNegativeInteger(), "fixedWidth", null, 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_NoSubsets(), theXMLTypePackage.getBoolean(), "noSubsets", "0", 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_Opaque(), theXMLTypePackage.getBoolean(), "opaque", "0", 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerType_Queryable(), theXMLTypePackage.getBoolean(), "queryable", "0", 0, 1, LayerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legendURLTypeEClass, LegendURLType.class, "LegendURLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegendURLType_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, LegendURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegendURLType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, LegendURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegendURLType_Height(), theXMLTypePackage.getPositiveInteger(), "height", null, 0, 1, LegendURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegendURLType_Width(), theXMLTypePackage.getPositiveInteger(), "width", null, 0, 1, LegendURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logoURLTypeEClass, LogoURLType.class, "LogoURLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogoURLType_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, LogoURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogoURLType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, LogoURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogoURLType_Height(), theXMLTypePackage.getPositiveInteger(), "height", null, 0, 1, LogoURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogoURLType_Width(), theXMLTypePackage.getPositiveInteger(), "width", null, 0, 1, LogoURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataURLTypeEClass, MetadataURLType.class, "MetadataURLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataURLType_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, MetadataURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataURLType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, MetadataURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataURLType_Type(), theXMLTypePackage.getNMTOKEN(), "type", null, 1, 1, MetadataURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onlineResourceTypeEClass, OnlineResourceType.class, "OnlineResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnlineResourceType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, OnlineResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResourceType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, OnlineResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResourceType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, OnlineResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResourceType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, OnlineResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResourceType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, OnlineResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResourceType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, OnlineResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnlineResourceType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, OnlineResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationTypeEClass, OperationType.class, "OperationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationType_Format(), theXMLTypePackage.getString(), "format", null, 1, -1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationType_DCPType(), this.getDCPTypeType(), null, "dCPType", null, 1, -1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postTypeEClass, PostType.class, "PostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, PostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestTypeEClass, RequestType.class, "RequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestType_GetCapabilities(), this.getOperationType(), null, "getCapabilities", null, 1, 1, RequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestType_GetMap(), this.getOperationType(), null, "getMap", null, 1, 1, RequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestType_GetFeatureInfo(), this.getOperationType(), null, "getFeatureInfo", null, 0, 1, RequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestType_ExtendedOperationGroup(), ecorePackage.getEFeatureMapEntry(), "extendedOperationGroup", null, 0, -1, RequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestType_ExtendedOperation(), this.getOperationType(), null, "extendedOperation", null, 0, -1, RequestType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceType_Name(), this.getNameType(), "name", null, 1, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_Abstract(), theXMLTypePackage.getString(), "abstract", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_KeywordList(), this.getKeywordListType(), null, "keywordList", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_ContactInformation(), this.getContactInformationType(), null, "contactInformation", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_Fees(), theXMLTypePackage.getString(), "fees", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_AccessConstraints(), theXMLTypePackage.getString(), "accessConstraints", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_LayerLimit(), theXMLTypePackage.getPositiveInteger(), "layerLimit", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_MaxWidth(), theXMLTypePackage.getPositiveInteger(), "maxWidth", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_MaxHeight(), theXMLTypePackage.getPositiveInteger(), "maxHeight", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleSheetURLTypeEClass, StyleSheetURLType.class, "StyleSheetURLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleSheetURLType_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, StyleSheetURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleSheetURLType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, StyleSheetURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleTypeEClass, StyleType.class, "StyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleType_Abstract(), theXMLTypePackage.getString(), "abstract", null, 0, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleType_LegendURL(), this.getLegendURLType(), null, "legendURL", null, 0, -1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleType_StyleSheetURL(), this.getStyleSheetURLType(), null, "styleSheetURL", null, 0, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleType_StyleURL(), this.getStyleURLType(), null, "styleURL", null, 0, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleURLTypeEClass, StyleURLType.class, "StyleURLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleURLType_Format(), theXMLTypePackage.getString(), "format", null, 1, 1, StyleURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleURLType_OnlineResource(), this.getOnlineResourceType(), null, "onlineResource", null, 1, 1, StyleURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wmsCapabilitiesTypeEClass, WMSCapabilitiesType.class, "WMSCapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMSCapabilitiesType_Service(), this.getServiceType(), null, "service", null, 1, 1, WMSCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWMSCapabilitiesType_Capability(), this.getCapabilityType(), null, "capability", null, 1, 1, WMSCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMSCapabilitiesType_UpdateSequence(), theXMLTypePackage.getString(), "updateSequence", null, 0, 1, WMSCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMSCapabilitiesType_Version(), theXMLTypePackage.getString(), "version", "1.3.0", 0, 1, WMSCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nameTypeEEnum, NameType.class, "NameType");
		addEEnumLiteral(nameTypeEEnum, NameType.WMS);

		// Initialize data types
		initEDataType(latitudeTypeEDataType, double.class, "LatitudeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(latitudeTypeObjectEDataType, Double.class, "LatitudeTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longitudeTypeEDataType, double.class, "LongitudeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longitudeTypeObjectEDataType, Double.class, "LongitudeTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameTypeObjectEDataType, NameType.class, "NameTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (attributionTypeEClass,
		   source,
		   new String[] {
			   "name", "Attribution_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAttributionType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttributionType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttributionType_LogoURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LogoURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (authorityURLTypeEClass,
		   source,
		   new String[] {
			   "name", "AuthorityURL_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuthorityURLType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuthorityURLType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (boundingBoxTypeEClass,
		   source,
		   new String[] {
			   "name", "BoundingBox_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getBoundingBoxType_CRS(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "CRS"
		   });
		addAnnotation
		  (getBoundingBoxType_Maxx(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxx"
		   });
		addAnnotation
		  (getBoundingBoxType_Maxy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxy"
		   });
		addAnnotation
		  (getBoundingBoxType_Minx(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "minx"
		   });
		addAnnotation
		  (getBoundingBoxType_Miny(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "miny"
		   });
		addAnnotation
		  (getBoundingBoxType_Resx(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resx"
		   });
		addAnnotation
		  (getBoundingBoxType_Resy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resy"
		   });
		addAnnotation
		  (capabilityTypeEClass,
		   source,
		   new String[] {
			   "name", "Capability_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCapabilityType_Request(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Request",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCapabilityType_Exception(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Exception",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCapabilityType_ExtendedCapabilitiesGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "_ExtendedCapabilities:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCapabilityType_ExtendedCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "_ExtendedCapabilities",
			   "namespace", "##targetNamespace",
			   "group", "_ExtendedCapabilities:group"
		   });
		addAnnotation
		  (getCapabilityType_Layer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Layer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (contactAddressTypeEClass,
		   source,
		   new String[] {
			   "name", "ContactAddress_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContactAddressType_AddressType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AddressType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactAddressType_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactAddressType_City(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "City",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactAddressType_StateOrProvince(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StateOrProvince",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactAddressType_PostCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PostCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactAddressType_Country(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Country",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (contactInformationTypeEClass,
		   source,
		   new String[] {
			   "name", "ContactInformation_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContactInformationType_ContactPersonPrimary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactPersonPrimary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactInformationType_ContactPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactPosition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactInformationType_ContactAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactInformationType_ContactVoiceTelephone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactVoiceTelephone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactInformationType_ContactFacsimileTelephone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactFacsimileTelephone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactInformationType_ContactElectronicMailAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactElectronicMailAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (contactPersonPrimaryTypeEClass,
		   source,
		   new String[] {
			   "name", "ContactPersonPrimary_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContactPersonPrimaryType_ContactPerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactPerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactPersonPrimaryType_ContactOrganization(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactOrganization",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataURLTypeEClass,
		   source,
		   new String[] {
			   "name", "DataURL_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataURLType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataURLType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dcpTypeTypeEClass,
		   source,
		   new String[] {
			   "name", "DCPType_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDCPTypeType_HTTP(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HTTP",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dimensionTypeEClass,
		   source,
		   new String[] {
			   "name", "Dimension_._type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDimensionType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDimensionType_Current(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "current"
		   });
		addAnnotation
		  (getDimensionType_Default(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "default"
		   });
		addAnnotation
		  (getDimensionType_MultipleValues(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "multipleValues"
		   });
		addAnnotation
		  (getDimensionType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getDimensionType_NearestValue(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nearestValue"
		   });
		addAnnotation
		  (getDimensionType_Units(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "units"
		   });
		addAnnotation
		  (getDimensionType_UnitSymbol(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "unitSymbol"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_ExtendedCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "_ExtendedCapabilities",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ExtendedOperation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "_ExtendedOperation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Abstract(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Abstract",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AccessConstraints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AccessConstraints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddressType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AddressType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Attribution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Attribution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AuthorityURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AuthorityURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_BoundingBox(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BoundingBox",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Capability(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Capability",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_City(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "City",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ContactAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ContactElectronicMailAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactElectronicMailAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ContactFacsimileTelephone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactFacsimileTelephone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ContactInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ContactOrganization(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactOrganization",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ContactPerson(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactPerson",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ContactPersonPrimary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactPersonPrimary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ContactPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactPosition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ContactVoiceTelephone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactVoiceTelephone",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Country(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Country",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CRS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CRS",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DataURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DCPType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DCPType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Dimension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dimension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_EXGeographicBoundingBox(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EX_GeographicBoundingBox",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Exception(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Exception",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_FeatureListURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureListURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Fees(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fees",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Get(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Get",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GetCapabilities",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetFeatureInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GetFeatureInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetMap(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GetMap",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HTTP(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HTTP",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Identifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Keyword(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Keyword",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_KeywordList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "KeywordList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Layer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Layer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LayerLimit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LayerLimit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LegendURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LegendURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LogoURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LogoURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MaxHeight(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaxHeight",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MaxScaleDenominator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaxScaleDenominator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MaxWidth(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaxWidth",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MetadataURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetadataURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MinScaleDenominator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MinScaleDenominator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Post(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Post",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_PostCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PostCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Request(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Request",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Service",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StateOrProvince(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StateOrProvince",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Style(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Style",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StyleSheetURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StyleSheetURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StyleURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StyleURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WMSCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WMS_Capabilities",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (exceptionTypeEClass,
		   source,
		   new String[] {
			   "name", "Exception_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExceptionType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (exGeographicBoundingBoxTypeEClass,
		   source,
		   new String[] {
			   "name", "EX_GeographicBoundingBox_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEXGeographicBoundingBoxType_WestBoundLongitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "westBoundLongitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEXGeographicBoundingBoxType_EastBoundLongitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eastBoundLongitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEXGeographicBoundingBoxType_SouthBoundLatitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "southBoundLatitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEXGeographicBoundingBoxType_NorthBoundLatitude(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "northBoundLatitude",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (featureListURLTypeEClass,
		   source,
		   new String[] {
			   "name", "FeatureListURL_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureListURLType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureListURLType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTypeEClass,
		   source,
		   new String[] {
			   "name", "Get_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (httpTypeEClass,
		   source,
		   new String[] {
			   "name", "HTTP_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHTTPType_Get(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Get",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHTTPType_Post(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Post",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (identifierTypeEClass,
		   source,
		   new String[] {
			   "name", "Identifier_._type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIdentifierType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIdentifierType_Authority(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "authority"
		   });
		addAnnotation
		  (keywordListTypeEClass,
		   source,
		   new String[] {
			   "name", "KeywordList_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKeywordListType_Keyword(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Keyword",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (keywordTypeEClass,
		   source,
		   new String[] {
			   "name", "Keyword_._type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getKeywordType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getKeywordType_Vocabulary(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "vocabulary"
		   });
		addAnnotation
		  (latitudeTypeEDataType,
		   source,
		   new String[] {
			   "name", "latitudeType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			   "minInclusive", "-90",
			   "maxInclusive", "90"
		   });
		addAnnotation
		  (latitudeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "latitudeType:Object",
			   "baseType", "latitudeType"
		   });
		addAnnotation
		  (layerTypeEClass,
		   source,
		   new String[] {
			   "name", "Layer_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLayerType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_Abstract(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Abstract",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_KeywordList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "KeywordList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_CRS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CRS",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_EXGeographicBoundingBox(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EX_GeographicBoundingBox",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_BoundingBox(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BoundingBox",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_Dimension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dimension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_Attribution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Attribution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_AuthorityURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AuthorityURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Identifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_MetadataURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetadataURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_DataURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_FeatureListURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureListURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_Style(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Style",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_MinScaleDenominator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MinScaleDenominator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_MaxScaleDenominator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaxScaleDenominator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_Layer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Layer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLayerType_Cascaded(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cascaded"
		   });
		addAnnotation
		  (getLayerType_FixedHeight(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fixedHeight"
		   });
		addAnnotation
		  (getLayerType_FixedWidth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fixedWidth"
		   });
		addAnnotation
		  (getLayerType_NoSubsets(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "noSubsets"
		   });
		addAnnotation
		  (getLayerType_Opaque(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "opaque"
		   });
		addAnnotation
		  (getLayerType_Queryable(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "queryable"
		   });
		addAnnotation
		  (legendURLTypeEClass,
		   source,
		   new String[] {
			   "name", "LegendURL_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLegendURLType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLegendURLType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLegendURLType_Height(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "height"
		   });
		addAnnotation
		  (getLegendURLType_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (logoURLTypeEClass,
		   source,
		   new String[] {
			   "name", "LogoURL_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogoURLType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLogoURLType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLogoURLType_Height(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "height"
		   });
		addAnnotation
		  (getLogoURLType_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (longitudeTypeEDataType,
		   source,
		   new String[] {
			   "name", "longitudeType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			   "minInclusive", "-180",
			   "maxInclusive", "180"
		   });
		addAnnotation
		  (longitudeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "longitudeType:Object",
			   "baseType", "longitudeType"
		   });
		addAnnotation
		  (metadataURLTypeEClass,
		   source,
		   new String[] {
			   "name", "MetadataURL_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMetadataURLType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMetadataURLType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMetadataURLType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (nameTypeEEnum,
		   source,
		   new String[] {
			   "name", "Name_._type"
		   });
		addAnnotation
		  (nameTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "Name_._type:Object",
			   "baseType", "Name_._type"
		   });
		addAnnotation
		  (onlineResourceTypeEClass,
		   source,
		   new String[] {
			   "name", "OnlineResource_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getOnlineResourceType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getOnlineResourceType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getOnlineResourceType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getOnlineResourceType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getOnlineResourceType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getOnlineResourceType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getOnlineResourceType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (operationTypeEClass,
		   source,
		   new String[] {
			   "name", "OperationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOperationType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOperationType_DCPType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DCPType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (postTypeEClass,
		   source,
		   new String[] {
			   "name", "Post_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPostType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (requestTypeEClass,
		   source,
		   new String[] {
			   "name", "Request_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRequestType_GetCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GetCapabilities",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRequestType_GetMap(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GetMap",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRequestType_GetFeatureInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GetFeatureInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRequestType_ExtendedOperationGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "_ExtendedOperation:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRequestType_ExtendedOperation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "_ExtendedOperation",
			   "namespace", "##targetNamespace",
			   "group", "_ExtendedOperation:group"
		   });
		addAnnotation
		  (serviceTypeEClass,
		   source,
		   new String[] {
			   "name", "Service_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getServiceType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_Abstract(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Abstract",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_KeywordList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "KeywordList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_ContactInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_Fees(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fees",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_AccessConstraints(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AccessConstraints",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_LayerLimit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LayerLimit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_MaxWidth(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaxWidth",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getServiceType_MaxHeight(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MaxHeight",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (styleSheetURLTypeEClass,
		   source,
		   new String[] {
			   "name", "StyleSheetURL_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStyleSheetURLType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStyleSheetURLType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (styleTypeEClass,
		   source,
		   new String[] {
			   "name", "Style_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStyleType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStyleType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStyleType_Abstract(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Abstract",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStyleType_LegendURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LegendURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStyleType_StyleSheetURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StyleSheetURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStyleType_StyleURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StyleURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (styleURLTypeEClass,
		   source,
		   new String[] {
			   "name", "StyleURL_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStyleURLType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStyleURLType_OnlineResource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OnlineResource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (wmsCapabilitiesTypeEClass,
		   source,
		   new String[] {
			   "name", "WMS_Capabilities_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWMSCapabilitiesType_Service(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Service",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWMSCapabilitiesType_Capability(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Capability",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWMSCapabilitiesType_UpdateSequence(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "updateSequence"
		   });
		addAnnotation
		  (getWMSCapabilitiesType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
	}

} //WMSPackageImpl
