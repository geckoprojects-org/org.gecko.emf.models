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
package net.opengis.wfs.impl;

import java.util.List;

import net.opengis.gml.GMLPackage;

import net.opengis.gml.impl.GMLPackageImpl;

import net.opengis.ogc.OGCPackage;

import net.opengis.ogc.impl.OGCPackageImpl;

import net.opengis.ows.OWSPackage;

import net.opengis.ows.impl.OWSPackageImpl;

import net.opengis.wfs.ActionType;
import net.opengis.wfs.AllSomeType;
import net.opengis.wfs.BaseRequestType;
import net.opengis.wfs.DeleteElementType;
import net.opengis.wfs.DescribeFeatureTypeType;
import net.opengis.wfs.DocumentRoot;
import net.opengis.wfs.FeatureCollectionType;
import net.opengis.wfs.FeatureTypeListType;
import net.opengis.wfs.FeatureTypeType;
import net.opengis.wfs.FeaturesLockedType;
import net.opengis.wfs.FeaturesNotLockedType;
import net.opengis.wfs.FormatType;
import net.opengis.wfs.GMLObjectTypeListType;
import net.opengis.wfs.GMLObjectTypeType;
import net.opengis.wfs.GetCapabilitiesType;
import net.opengis.wfs.GetFeatureType;
import net.opengis.wfs.GetFeatureWithLockType;
import net.opengis.wfs.GetGmlObjectType;
import net.opengis.wfs.IdentifierGenerationOptionType;
import net.opengis.wfs.InsertElementType;
import net.opengis.wfs.InsertResultsType;
import net.opengis.wfs.InsertedFeatureType;
import net.opengis.wfs.LockFeatureResponseType;
import net.opengis.wfs.LockFeatureType;
import net.opengis.wfs.LockType;
import net.opengis.wfs.MetadataURLType;
import net.opengis.wfs.NativeType;
import net.opengis.wfs.NoSRSType;
import net.opengis.wfs.OperationType;
import net.opengis.wfs.OperationsType;
import net.opengis.wfs.OutputFormatListType;
import net.opengis.wfs.PropertyType;
import net.opengis.wfs.QueryType;
import net.opengis.wfs.ResultTypeType;
import net.opengis.wfs.TransactionResponseType;
import net.opengis.wfs.TransactionResultsType;
import net.opengis.wfs.TransactionSummaryType;
import net.opengis.wfs.TransactionType;
import net.opengis.wfs.TypeType;
import net.opengis.wfs.UpdateElementType;
import net.opengis.wfs.WFSCapabilitiesType;
import net.opengis.wfs.WFSFactory;
import net.opengis.wfs.WFSPackage;
import net.opengis.wfs.XlinkPropertyNameType;

import net.opengis.wfs.util.WFSValidator;

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

import org.w3._2001.smil20.Smil20Package;

import org.w3._2001.smil20.language.LanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WFSPackageImpl extends EPackageImpl implements WFSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describeFeatureTypeTypeEClass = null;

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
	private EClass featureCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresLockedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresNotLockedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTypeListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getFeatureWithLockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getGmlObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlObjectTypeListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlObjectTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertedFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertResultsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockFeatureResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockTypeEClass = null;

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
	private EClass nativeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noSRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputFormatListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionResultsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionSummaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wfsCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xlinkPropertyNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allSomeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierGenerationOptionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resultTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allSomeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseTypeNameListTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierGenerationOptionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resultTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeNameListTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

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
	 * @see net.opengis.wfs.WFSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WFSPackageImpl() {
		super(eNS_URI, WFSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WFSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WFSPackage init() {
		if (isInited) return (WFSPackage)EPackage.Registry.INSTANCE.getEPackage(WFSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWFSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WFSPackageImpl theWFSPackage = registeredWFSPackage instanceof WFSPackageImpl ? (WFSPackageImpl)registeredWFSPackage : new WFSPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Smil20Package.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		XlinkPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);
		GMLPackageImpl theGMLPackage = (GMLPackageImpl)(registeredPackage instanceof GMLPackageImpl ? registeredPackage : GMLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OGCPackage.eNS_URI);
		OGCPackageImpl theOGCPackage = (OGCPackageImpl)(registeredPackage instanceof OGCPackageImpl ? registeredPackage : OGCPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OWSPackage.eNS_URI);
		OWSPackageImpl theOWSPackage = (OWSPackageImpl)(registeredPackage instanceof OWSPackageImpl ? registeredPackage : OWSPackage.eINSTANCE);

		// Load packages
		theGMLPackage.loadPackage();

		// Create package meta-data objects
		theWFSPackage.createPackageContents();
		theOGCPackage.createPackageContents();
		theOWSPackage.createPackageContents();

		// Initialize created meta-data
		theWFSPackage.initializePackageContents();
		theOGCPackage.initializePackageContents();
		theOWSPackage.initializePackageContents();

		// Fix loaded packages
		theGMLPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWFSPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return WFSValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWFSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WFSPackage.eNS_URI, theWFSPackage);
		return theWFSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionType() {
		return actionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionType_Message() {
		return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionType_Code() {
		return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionType_Locator() {
		return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseRequestType() {
		return baseRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseRequestType_Handle() {
		return (EAttribute)baseRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseRequestType_Service() {
		return (EAttribute)baseRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseRequestType_Version() {
		return (EAttribute)baseRequestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeleteElementType() {
		return deleteElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeleteElementType_Filter() {
		return (EReference)deleteElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeleteElementType_Handle() {
		return (EAttribute)deleteElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeleteElementType_TypeName() {
		return (EAttribute)deleteElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescribeFeatureTypeType() {
		return describeFeatureTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribeFeatureTypeType_TypeName() {
		return (EAttribute)describeFeatureTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribeFeatureTypeType_OutputFormat() {
		return (EAttribute)describeFeatureTypeTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_Delete() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DescribeFeatureType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FeatureCollection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FeatureTypeList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCapabilities() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetFeature() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetFeatureWithLock() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetGmlObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Insert() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LockFeature() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LockFeatureResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_LockId() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Native() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Property() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_PropertyName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Query() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ServesGMLObjectTypeList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SupportsGMLObjectTypeList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Transaction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TransactionResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Update() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_WFSCapabilities() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XlinkPropertyName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureCollectionType() {
		return featureCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureCollectionType_LockId() {
		return (EAttribute)featureCollectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureCollectionType_NumberOfFeatures() {
		return (EAttribute)featureCollectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureCollectionType_TimeStamp() {
		return (EAttribute)featureCollectionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturesLockedType() {
		return featuresLockedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturesLockedType_Group() {
		return (EAttribute)featuresLockedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturesLockedType_FeatureId() {
		return (EReference)featuresLockedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturesNotLockedType() {
		return featuresNotLockedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturesNotLockedType_Group() {
		return (EAttribute)featuresNotLockedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturesNotLockedType_FeatureId() {
		return (EReference)featuresNotLockedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureTypeListType() {
		return featureTypeListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTypeListType_Operations() {
		return (EReference)featureTypeListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTypeListType_FeatureType() {
		return (EReference)featureTypeListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureTypeType() {
		return featureTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeType_Name() {
		return (EAttribute)featureTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeType_Title() {
		return (EAttribute)featureTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeType_Abstract() {
		return (EAttribute)featureTypeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTypeType_Keywords() {
		return (EReference)featureTypeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeType_DefaultSRS() {
		return (EAttribute)featureTypeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeType_OtherSRS() {
		return (EAttribute)featureTypeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTypeType_NoSRS() {
		return (EReference)featureTypeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTypeType_Operations() {
		return (EReference)featureTypeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTypeType_OutputFormats() {
		return (EReference)featureTypeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTypeType_WGS84BoundingBox() {
		return (EReference)featureTypeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTypeType_MetadataURL() {
		return (EReference)featureTypeTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetCapabilitiesType() {
		return getCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCapabilitiesType_Service() {
		return (EAttribute)getCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetFeatureType() {
		return getFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetFeatureType_Query() {
		return (EReference)getFeatureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureType_MaxFeatures() {
		return (EAttribute)getFeatureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureType_OutputFormat() {
		return (EAttribute)getFeatureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureType_ResultType() {
		return (EAttribute)getFeatureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureType_TraverseXlinkDepth() {
		return (EAttribute)getFeatureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureType_TraverseXlinkExpiry() {
		return (EAttribute)getFeatureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetFeatureWithLockType() {
		return getFeatureWithLockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetFeatureWithLockType_Query() {
		return (EReference)getFeatureWithLockTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureWithLockType_Expiry() {
		return (EAttribute)getFeatureWithLockTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureWithLockType_MaxFeatures() {
		return (EAttribute)getFeatureWithLockTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureWithLockType_OutputFormat() {
		return (EAttribute)getFeatureWithLockTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureWithLockType_ResultType() {
		return (EAttribute)getFeatureWithLockTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureWithLockType_TraverseXlinkDepth() {
		return (EAttribute)getFeatureWithLockTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetFeatureWithLockType_TraverseXlinkExpiry() {
		return (EAttribute)getFeatureWithLockTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetGmlObjectType() {
		return getGmlObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetGmlObjectType_GmlObjectId() {
		return (EReference)getGmlObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetGmlObjectType_OutputFormat() {
		return (EAttribute)getGmlObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetGmlObjectType_TraverseXlinkDepth() {
		return (EAttribute)getGmlObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetGmlObjectType_TraverseXlinkExpiry() {
		return (EAttribute)getGmlObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGMLObjectTypeListType() {
		return gmlObjectTypeListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGMLObjectTypeListType_GMLObjectType() {
		return (EReference)gmlObjectTypeListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGMLObjectTypeType() {
		return gmlObjectTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMLObjectTypeType_Name() {
		return (EAttribute)gmlObjectTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMLObjectTypeType_Title() {
		return (EAttribute)gmlObjectTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMLObjectTypeType_Abstract() {
		return (EAttribute)gmlObjectTypeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGMLObjectTypeType_Keywords() {
		return (EReference)gmlObjectTypeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGMLObjectTypeType_OutputFormats() {
		return (EReference)gmlObjectTypeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsertedFeatureType() {
		return insertedFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsertedFeatureType_FeatureId() {
		return (EReference)insertedFeatureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsertedFeatureType_Handle() {
		return (EAttribute)insertedFeatureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsertElementType() {
		return insertElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsertElementType_FeatureGroup() {
		return (EAttribute)insertElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsertElementType_Feature() {
		return (EReference)insertElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsertElementType_Handle() {
		return (EAttribute)insertElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsertElementType_Idgen() {
		return (EAttribute)insertElementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsertElementType_InputFormat() {
		return (EAttribute)insertElementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsertElementType_SrsName() {
		return (EAttribute)insertElementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsertResultsType() {
		return insertResultsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsertResultsType_Feature() {
		return (EReference)insertResultsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLockFeatureResponseType() {
		return lockFeatureResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLockFeatureResponseType_LockId() {
		return (EAttribute)lockFeatureResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLockFeatureResponseType_FeaturesLocked() {
		return (EReference)lockFeatureResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLockFeatureResponseType_FeaturesNotLocked() {
		return (EReference)lockFeatureResponseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLockFeatureType() {
		return lockFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLockFeatureType_Lock() {
		return (EReference)lockFeatureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLockFeatureType_Expiry() {
		return (EAttribute)lockFeatureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLockFeatureType_LockAction() {
		return (EAttribute)lockFeatureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLockType() {
		return lockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLockType_Filter() {
		return (EReference)lockTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLockType_Handle() {
		return (EAttribute)lockTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLockType_TypeName() {
		return (EAttribute)lockTypeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMetadataURLType_Value() {
		return (EAttribute)metadataURLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadataURLType_Format() {
		return (EAttribute)metadataURLTypeEClass.getEStructuralFeatures().get(1);
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
	public EClass getNativeType() {
		return nativeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNativeType_SafeToIgnore() {
		return (EAttribute)nativeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNativeType_VendorId() {
		return (EAttribute)nativeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoSRSType() {
		return noSRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationsType() {
		return operationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationsType_Operation() {
		return (EAttribute)operationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputFormatListType() {
		return outputFormatListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutputFormatListType_Group() {
		return (EAttribute)outputFormatListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutputFormatListType_Format() {
		return (EAttribute)outputFormatListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyType_Name() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyType_Value() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryType() {
		return queryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryType_Group() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryType_PropertyName() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryType_XlinkPropertyName() {
		return (EReference)queryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryType_Function() {
		return (EReference)queryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryType_Filter() {
		return (EReference)queryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryType_SortBy() {
		return (EReference)queryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryType_FeatureVersion() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryType_Handle() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryType_SrsName() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryType_TypeName() {
		return (EAttribute)queryTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionResponseType() {
		return transactionResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionResponseType_TransactionSummary() {
		return (EReference)transactionResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionResponseType_TransactionResults() {
		return (EReference)transactionResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionResponseType_InsertResults() {
		return (EReference)transactionResponseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionResponseType_Version() {
		return (EAttribute)transactionResponseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionResultsType() {
		return transactionResultsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionResultsType_Action() {
		return (EReference)transactionResultsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionSummaryType() {
		return transactionSummaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionSummaryType_TotalInserted() {
		return (EAttribute)transactionSummaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionSummaryType_TotalUpdated() {
		return (EAttribute)transactionSummaryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionSummaryType_TotalDeleted() {
		return (EAttribute)transactionSummaryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionType() {
		return transactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_LockId() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_Group() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Insert() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Update() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Delete() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Native() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_ReleaseAction() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateElementType() {
		return updateElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateElementType_Property() {
		return (EReference)updateElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdateElementType_Filter() {
		return (EReference)updateElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateElementType_Handle() {
		return (EAttribute)updateElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateElementType_InputFormat() {
		return (EAttribute)updateElementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateElementType_SrsName() {
		return (EAttribute)updateElementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateElementType_TypeName() {
		return (EAttribute)updateElementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWFSCapabilitiesType() {
		return wfsCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFSCapabilitiesType_FeatureTypeList() {
		return (EReference)wfsCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFSCapabilitiesType_ServesGMLObjectTypeList() {
		return (EReference)wfsCapabilitiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFSCapabilitiesType_SupportsGMLObjectTypeList() {
		return (EReference)wfsCapabilitiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWFSCapabilitiesType_FilterCapabilities() {
		return (EReference)wfsCapabilitiesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXlinkPropertyNameType() {
		return xlinkPropertyNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXlinkPropertyNameType_Value() {
		return (EAttribute)xlinkPropertyNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXlinkPropertyNameType_TraverseXlinkDepth() {
		return (EAttribute)xlinkPropertyNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXlinkPropertyNameType_TraverseXlinkExpiry() {
		return (EAttribute)xlinkPropertyNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAllSomeType() {
		return allSomeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFormatType() {
		return formatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdentifierGenerationOptionType() {
		return identifierGenerationOptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperationType() {
		return operationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResultTypeType() {
		return resultTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType() {
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAllSomeTypeObject() {
		return allSomeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBaseTypeNameListType() {
		return baseTypeNameListTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFormatTypeObject() {
		return formatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdentifierGenerationOptionTypeObject() {
		return identifierGenerationOptionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOperationTypeObject() {
		return operationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getResultTypeTypeObject() {
		return resultTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeNameListType() {
		return typeNameListTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WFSFactory getWFSFactory() {
		return (WFSFactory)getEFactoryInstance();
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
		actionTypeEClass = createEClass(ACTION_TYPE);
		createEAttribute(actionTypeEClass, ACTION_TYPE__MESSAGE);
		createEAttribute(actionTypeEClass, ACTION_TYPE__CODE);
		createEAttribute(actionTypeEClass, ACTION_TYPE__LOCATOR);

		baseRequestTypeEClass = createEClass(BASE_REQUEST_TYPE);
		createEAttribute(baseRequestTypeEClass, BASE_REQUEST_TYPE__HANDLE);
		createEAttribute(baseRequestTypeEClass, BASE_REQUEST_TYPE__SERVICE);
		createEAttribute(baseRequestTypeEClass, BASE_REQUEST_TYPE__VERSION);

		deleteElementTypeEClass = createEClass(DELETE_ELEMENT_TYPE);
		createEReference(deleteElementTypeEClass, DELETE_ELEMENT_TYPE__FILTER);
		createEAttribute(deleteElementTypeEClass, DELETE_ELEMENT_TYPE__HANDLE);
		createEAttribute(deleteElementTypeEClass, DELETE_ELEMENT_TYPE__TYPE_NAME);

		describeFeatureTypeTypeEClass = createEClass(DESCRIBE_FEATURE_TYPE_TYPE);
		createEAttribute(describeFeatureTypeTypeEClass, DESCRIBE_FEATURE_TYPE_TYPE__TYPE_NAME);
		createEAttribute(describeFeatureTypeTypeEClass, DESCRIBE_FEATURE_TYPE_TYPE__OUTPUT_FORMAT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DELETE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE_COLLECTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE_TYPE_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CAPABILITIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_FEATURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_GML_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INSERT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCK_FEATURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LOCK_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NATIVE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROPERTY_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSACTION_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WFS_CAPABILITIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XLINK_PROPERTY_NAME);

		featureCollectionTypeEClass = createEClass(FEATURE_COLLECTION_TYPE);
		createEAttribute(featureCollectionTypeEClass, FEATURE_COLLECTION_TYPE__LOCK_ID);
		createEAttribute(featureCollectionTypeEClass, FEATURE_COLLECTION_TYPE__NUMBER_OF_FEATURES);
		createEAttribute(featureCollectionTypeEClass, FEATURE_COLLECTION_TYPE__TIME_STAMP);

		featuresLockedTypeEClass = createEClass(FEATURES_LOCKED_TYPE);
		createEAttribute(featuresLockedTypeEClass, FEATURES_LOCKED_TYPE__GROUP);
		createEReference(featuresLockedTypeEClass, FEATURES_LOCKED_TYPE__FEATURE_ID);

		featuresNotLockedTypeEClass = createEClass(FEATURES_NOT_LOCKED_TYPE);
		createEAttribute(featuresNotLockedTypeEClass, FEATURES_NOT_LOCKED_TYPE__GROUP);
		createEReference(featuresNotLockedTypeEClass, FEATURES_NOT_LOCKED_TYPE__FEATURE_ID);

		featureTypeListTypeEClass = createEClass(FEATURE_TYPE_LIST_TYPE);
		createEReference(featureTypeListTypeEClass, FEATURE_TYPE_LIST_TYPE__OPERATIONS);
		createEReference(featureTypeListTypeEClass, FEATURE_TYPE_LIST_TYPE__FEATURE_TYPE);

		featureTypeTypeEClass = createEClass(FEATURE_TYPE_TYPE);
		createEAttribute(featureTypeTypeEClass, FEATURE_TYPE_TYPE__NAME);
		createEAttribute(featureTypeTypeEClass, FEATURE_TYPE_TYPE__TITLE);
		createEAttribute(featureTypeTypeEClass, FEATURE_TYPE_TYPE__ABSTRACT);
		createEReference(featureTypeTypeEClass, FEATURE_TYPE_TYPE__KEYWORDS);
		createEAttribute(featureTypeTypeEClass, FEATURE_TYPE_TYPE__DEFAULT_SRS);
		createEAttribute(featureTypeTypeEClass, FEATURE_TYPE_TYPE__OTHER_SRS);
		createEReference(featureTypeTypeEClass, FEATURE_TYPE_TYPE__NO_SRS);
		createEReference(featureTypeTypeEClass, FEATURE_TYPE_TYPE__OPERATIONS);
		createEReference(featureTypeTypeEClass, FEATURE_TYPE_TYPE__OUTPUT_FORMATS);
		createEReference(featureTypeTypeEClass, FEATURE_TYPE_TYPE__WGS84_BOUNDING_BOX);
		createEReference(featureTypeTypeEClass, FEATURE_TYPE_TYPE__METADATA_URL);

		getCapabilitiesTypeEClass = createEClass(GET_CAPABILITIES_TYPE);
		createEAttribute(getCapabilitiesTypeEClass, GET_CAPABILITIES_TYPE__SERVICE);

		getFeatureTypeEClass = createEClass(GET_FEATURE_TYPE);
		createEReference(getFeatureTypeEClass, GET_FEATURE_TYPE__QUERY);
		createEAttribute(getFeatureTypeEClass, GET_FEATURE_TYPE__MAX_FEATURES);
		createEAttribute(getFeatureTypeEClass, GET_FEATURE_TYPE__OUTPUT_FORMAT);
		createEAttribute(getFeatureTypeEClass, GET_FEATURE_TYPE__RESULT_TYPE);
		createEAttribute(getFeatureTypeEClass, GET_FEATURE_TYPE__TRAVERSE_XLINK_DEPTH);
		createEAttribute(getFeatureTypeEClass, GET_FEATURE_TYPE__TRAVERSE_XLINK_EXPIRY);

		getFeatureWithLockTypeEClass = createEClass(GET_FEATURE_WITH_LOCK_TYPE);
		createEReference(getFeatureWithLockTypeEClass, GET_FEATURE_WITH_LOCK_TYPE__QUERY);
		createEAttribute(getFeatureWithLockTypeEClass, GET_FEATURE_WITH_LOCK_TYPE__EXPIRY);
		createEAttribute(getFeatureWithLockTypeEClass, GET_FEATURE_WITH_LOCK_TYPE__MAX_FEATURES);
		createEAttribute(getFeatureWithLockTypeEClass, GET_FEATURE_WITH_LOCK_TYPE__OUTPUT_FORMAT);
		createEAttribute(getFeatureWithLockTypeEClass, GET_FEATURE_WITH_LOCK_TYPE__RESULT_TYPE);
		createEAttribute(getFeatureWithLockTypeEClass, GET_FEATURE_WITH_LOCK_TYPE__TRAVERSE_XLINK_DEPTH);
		createEAttribute(getFeatureWithLockTypeEClass, GET_FEATURE_WITH_LOCK_TYPE__TRAVERSE_XLINK_EXPIRY);

		getGmlObjectTypeEClass = createEClass(GET_GML_OBJECT_TYPE);
		createEReference(getGmlObjectTypeEClass, GET_GML_OBJECT_TYPE__GML_OBJECT_ID);
		createEAttribute(getGmlObjectTypeEClass, GET_GML_OBJECT_TYPE__OUTPUT_FORMAT);
		createEAttribute(getGmlObjectTypeEClass, GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_DEPTH);
		createEAttribute(getGmlObjectTypeEClass, GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_EXPIRY);

		gmlObjectTypeListTypeEClass = createEClass(GML_OBJECT_TYPE_LIST_TYPE);
		createEReference(gmlObjectTypeListTypeEClass, GML_OBJECT_TYPE_LIST_TYPE__GML_OBJECT_TYPE);

		gmlObjectTypeTypeEClass = createEClass(GML_OBJECT_TYPE_TYPE);
		createEAttribute(gmlObjectTypeTypeEClass, GML_OBJECT_TYPE_TYPE__NAME);
		createEAttribute(gmlObjectTypeTypeEClass, GML_OBJECT_TYPE_TYPE__TITLE);
		createEAttribute(gmlObjectTypeTypeEClass, GML_OBJECT_TYPE_TYPE__ABSTRACT);
		createEReference(gmlObjectTypeTypeEClass, GML_OBJECT_TYPE_TYPE__KEYWORDS);
		createEReference(gmlObjectTypeTypeEClass, GML_OBJECT_TYPE_TYPE__OUTPUT_FORMATS);

		insertedFeatureTypeEClass = createEClass(INSERTED_FEATURE_TYPE);
		createEReference(insertedFeatureTypeEClass, INSERTED_FEATURE_TYPE__FEATURE_ID);
		createEAttribute(insertedFeatureTypeEClass, INSERTED_FEATURE_TYPE__HANDLE);

		insertElementTypeEClass = createEClass(INSERT_ELEMENT_TYPE);
		createEAttribute(insertElementTypeEClass, INSERT_ELEMENT_TYPE__FEATURE_GROUP);
		createEReference(insertElementTypeEClass, INSERT_ELEMENT_TYPE__FEATURE);
		createEAttribute(insertElementTypeEClass, INSERT_ELEMENT_TYPE__HANDLE);
		createEAttribute(insertElementTypeEClass, INSERT_ELEMENT_TYPE__IDGEN);
		createEAttribute(insertElementTypeEClass, INSERT_ELEMENT_TYPE__INPUT_FORMAT);
		createEAttribute(insertElementTypeEClass, INSERT_ELEMENT_TYPE__SRS_NAME);

		insertResultsTypeEClass = createEClass(INSERT_RESULTS_TYPE);
		createEReference(insertResultsTypeEClass, INSERT_RESULTS_TYPE__FEATURE);

		lockFeatureResponseTypeEClass = createEClass(LOCK_FEATURE_RESPONSE_TYPE);
		createEAttribute(lockFeatureResponseTypeEClass, LOCK_FEATURE_RESPONSE_TYPE__LOCK_ID);
		createEReference(lockFeatureResponseTypeEClass, LOCK_FEATURE_RESPONSE_TYPE__FEATURES_LOCKED);
		createEReference(lockFeatureResponseTypeEClass, LOCK_FEATURE_RESPONSE_TYPE__FEATURES_NOT_LOCKED);

		lockFeatureTypeEClass = createEClass(LOCK_FEATURE_TYPE);
		createEReference(lockFeatureTypeEClass, LOCK_FEATURE_TYPE__LOCK);
		createEAttribute(lockFeatureTypeEClass, LOCK_FEATURE_TYPE__EXPIRY);
		createEAttribute(lockFeatureTypeEClass, LOCK_FEATURE_TYPE__LOCK_ACTION);

		lockTypeEClass = createEClass(LOCK_TYPE);
		createEReference(lockTypeEClass, LOCK_TYPE__FILTER);
		createEAttribute(lockTypeEClass, LOCK_TYPE__HANDLE);
		createEAttribute(lockTypeEClass, LOCK_TYPE__TYPE_NAME);

		metadataURLTypeEClass = createEClass(METADATA_URL_TYPE);
		createEAttribute(metadataURLTypeEClass, METADATA_URL_TYPE__VALUE);
		createEAttribute(metadataURLTypeEClass, METADATA_URL_TYPE__FORMAT);
		createEAttribute(metadataURLTypeEClass, METADATA_URL_TYPE__TYPE);

		nativeTypeEClass = createEClass(NATIVE_TYPE);
		createEAttribute(nativeTypeEClass, NATIVE_TYPE__SAFE_TO_IGNORE);
		createEAttribute(nativeTypeEClass, NATIVE_TYPE__VENDOR_ID);

		noSRSTypeEClass = createEClass(NO_SRS_TYPE);

		operationsTypeEClass = createEClass(OPERATIONS_TYPE);
		createEAttribute(operationsTypeEClass, OPERATIONS_TYPE__OPERATION);

		outputFormatListTypeEClass = createEClass(OUTPUT_FORMAT_LIST_TYPE);
		createEAttribute(outputFormatListTypeEClass, OUTPUT_FORMAT_LIST_TYPE__GROUP);
		createEAttribute(outputFormatListTypeEClass, OUTPUT_FORMAT_LIST_TYPE__FORMAT);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__VALUE);

		queryTypeEClass = createEClass(QUERY_TYPE);
		createEAttribute(queryTypeEClass, QUERY_TYPE__GROUP);
		createEAttribute(queryTypeEClass, QUERY_TYPE__PROPERTY_NAME);
		createEReference(queryTypeEClass, QUERY_TYPE__XLINK_PROPERTY_NAME);
		createEReference(queryTypeEClass, QUERY_TYPE__FUNCTION);
		createEReference(queryTypeEClass, QUERY_TYPE__FILTER);
		createEReference(queryTypeEClass, QUERY_TYPE__SORT_BY);
		createEAttribute(queryTypeEClass, QUERY_TYPE__FEATURE_VERSION);
		createEAttribute(queryTypeEClass, QUERY_TYPE__HANDLE);
		createEAttribute(queryTypeEClass, QUERY_TYPE__SRS_NAME);
		createEAttribute(queryTypeEClass, QUERY_TYPE__TYPE_NAME);

		transactionResponseTypeEClass = createEClass(TRANSACTION_RESPONSE_TYPE);
		createEReference(transactionResponseTypeEClass, TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY);
		createEReference(transactionResponseTypeEClass, TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS);
		createEReference(transactionResponseTypeEClass, TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS);
		createEAttribute(transactionResponseTypeEClass, TRANSACTION_RESPONSE_TYPE__VERSION);

		transactionResultsTypeEClass = createEClass(TRANSACTION_RESULTS_TYPE);
		createEReference(transactionResultsTypeEClass, TRANSACTION_RESULTS_TYPE__ACTION);

		transactionSummaryTypeEClass = createEClass(TRANSACTION_SUMMARY_TYPE);
		createEAttribute(transactionSummaryTypeEClass, TRANSACTION_SUMMARY_TYPE__TOTAL_INSERTED);
		createEAttribute(transactionSummaryTypeEClass, TRANSACTION_SUMMARY_TYPE__TOTAL_UPDATED);
		createEAttribute(transactionSummaryTypeEClass, TRANSACTION_SUMMARY_TYPE__TOTAL_DELETED);

		transactionTypeEClass = createEClass(TRANSACTION_TYPE);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__LOCK_ID);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__GROUP);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__INSERT);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__UPDATE);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__DELETE);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__NATIVE);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__RELEASE_ACTION);

		updateElementTypeEClass = createEClass(UPDATE_ELEMENT_TYPE);
		createEReference(updateElementTypeEClass, UPDATE_ELEMENT_TYPE__PROPERTY);
		createEReference(updateElementTypeEClass, UPDATE_ELEMENT_TYPE__FILTER);
		createEAttribute(updateElementTypeEClass, UPDATE_ELEMENT_TYPE__HANDLE);
		createEAttribute(updateElementTypeEClass, UPDATE_ELEMENT_TYPE__INPUT_FORMAT);
		createEAttribute(updateElementTypeEClass, UPDATE_ELEMENT_TYPE__SRS_NAME);
		createEAttribute(updateElementTypeEClass, UPDATE_ELEMENT_TYPE__TYPE_NAME);

		wfsCapabilitiesTypeEClass = createEClass(WFS_CAPABILITIES_TYPE);
		createEReference(wfsCapabilitiesTypeEClass, WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST);
		createEReference(wfsCapabilitiesTypeEClass, WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST);
		createEReference(wfsCapabilitiesTypeEClass, WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST);
		createEReference(wfsCapabilitiesTypeEClass, WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES);

		xlinkPropertyNameTypeEClass = createEClass(XLINK_PROPERTY_NAME_TYPE);
		createEAttribute(xlinkPropertyNameTypeEClass, XLINK_PROPERTY_NAME_TYPE__VALUE);
		createEAttribute(xlinkPropertyNameTypeEClass, XLINK_PROPERTY_NAME_TYPE__TRAVERSE_XLINK_DEPTH);
		createEAttribute(xlinkPropertyNameTypeEClass, XLINK_PROPERTY_NAME_TYPE__TRAVERSE_XLINK_EXPIRY);

		// Create enums
		allSomeTypeEEnum = createEEnum(ALL_SOME_TYPE);
		formatTypeEEnum = createEEnum(FORMAT_TYPE);
		identifierGenerationOptionTypeEEnum = createEEnum(IDENTIFIER_GENERATION_OPTION_TYPE);
		operationTypeEEnum = createEEnum(OPERATION_TYPE);
		resultTypeTypeEEnum = createEEnum(RESULT_TYPE_TYPE);
		typeTypeEEnum = createEEnum(TYPE_TYPE);

		// Create data types
		allSomeTypeObjectEDataType = createEDataType(ALL_SOME_TYPE_OBJECT);
		baseTypeNameListTypeEDataType = createEDataType(BASE_TYPE_NAME_LIST_TYPE);
		formatTypeObjectEDataType = createEDataType(FORMAT_TYPE_OBJECT);
		identifierGenerationOptionTypeObjectEDataType = createEDataType(IDENTIFIER_GENERATION_OPTION_TYPE_OBJECT);
		operationTypeObjectEDataType = createEDataType(OPERATION_TYPE_OBJECT);
		resultTypeTypeObjectEDataType = createEDataType(RESULT_TYPE_TYPE_OBJECT);
		typeNameListTypeEDataType = createEDataType(TYPE_NAME_LIST_TYPE);
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
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
		OWSPackage theOWSPackage = (OWSPackage)EPackage.Registry.INSTANCE.getEPackage(OWSPackage.eNS_URI);
		OGCPackage theOGCPackage = (OGCPackage)EPackage.Registry.INSTANCE.getEPackage(OGCPackage.eNS_URI);
		GMLPackage theGMLPackage = (GMLPackage)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		describeFeatureTypeTypeEClass.getESuperTypes().add(this.getBaseRequestType());
		featureCollectionTypeEClass.getESuperTypes().add(theGMLPackage.getAbstractFeatureCollectionType());
		getCapabilitiesTypeEClass.getESuperTypes().add(theOWSPackage.getGetCapabilitiesType());
		getFeatureTypeEClass.getESuperTypes().add(this.getBaseRequestType());
		getFeatureWithLockTypeEClass.getESuperTypes().add(this.getBaseRequestType());
		getGmlObjectTypeEClass.getESuperTypes().add(this.getBaseRequestType());
		lockFeatureTypeEClass.getESuperTypes().add(this.getBaseRequestType());
		transactionTypeEClass.getESuperTypes().add(this.getBaseRequestType());
		wfsCapabilitiesTypeEClass.getESuperTypes().add(theOWSPackage.getCapabilitiesBaseType());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionTypeEClass, ActionType.class, "ActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionType_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionType_Code(), theXMLTypePackage.getString(), "code", null, 0, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionType_Locator(), theXMLTypePackage.getString(), "locator", null, 1, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseRequestTypeEClass, BaseRequestType.class, "BaseRequestType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseRequestType_Handle(), theXMLTypePackage.getString(), "handle", null, 0, 1, BaseRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseRequestType_Service(), theOWSPackage.getServiceType(), "service", "WFS", 0, 1, BaseRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseRequestType_Version(), theXMLTypePackage.getString(), "version", "1.1.0", 0, 1, BaseRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteElementTypeEClass, DeleteElementType.class, "DeleteElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeleteElementType_Filter(), theOGCPackage.getFilterType(), null, "filter", null, 1, 1, DeleteElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteElementType_Handle(), theXMLTypePackage.getString(), "handle", null, 0, 1, DeleteElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteElementType_TypeName(), theXMLTypePackage.getQName(), "typeName", null, 1, 1, DeleteElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describeFeatureTypeTypeEClass, DescribeFeatureTypeType.class, "DescribeFeatureTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribeFeatureTypeType_TypeName(), theXMLTypePackage.getQName(), "typeName", null, 0, -1, DescribeFeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescribeFeatureTypeType_OutputFormat(), theXMLTypePackage.getString(), "outputFormat", "text/xml; subtype=gml/3.1.1", 0, 1, DescribeFeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Delete(), this.getDeleteElementType(), null, "delete", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DescribeFeatureType(), this.getDescribeFeatureTypeType(), null, "describeFeatureType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FeatureCollection(), this.getFeatureCollectionType(), null, "featureCollection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FeatureTypeList(), this.getFeatureTypeListType(), null, "featureTypeList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCapabilities(), this.getGetCapabilitiesType(), null, "getCapabilities", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetFeature(), this.getGetFeatureType(), null, "getFeature", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetFeatureWithLock(), this.getGetFeatureWithLockType(), null, "getFeatureWithLock", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetGmlObject(), this.getGetGmlObjectType(), null, "getGmlObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Insert(), this.getInsertElementType(), null, "insert", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LockFeature(), this.getLockFeatureType(), null, "lockFeature", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LockFeatureResponse(), this.getLockFeatureResponseType(), null, "lockFeatureResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LockId(), theXMLTypePackage.getString(), "lockId", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Native(), this.getNativeType(), null, "native", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Property(), this.getPropertyType(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PropertyName(), theXMLTypePackage.getString(), "propertyName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Query(), this.getQueryType(), null, "query", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServesGMLObjectTypeList(), this.getGMLObjectTypeListType(), null, "servesGMLObjectTypeList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SupportsGMLObjectTypeList(), this.getGMLObjectTypeListType(), null, "supportsGMLObjectTypeList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transaction(), this.getTransactionType(), null, "transaction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TransactionResponse(), this.getTransactionResponseType(), null, "transactionResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Update(), this.getUpdateElementType(), null, "update", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WFSCapabilities(), this.getWFSCapabilitiesType(), null, "wFSCapabilities", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XlinkPropertyName(), this.getXlinkPropertyNameType(), null, "xlinkPropertyName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featureCollectionTypeEClass, FeatureCollectionType.class, "FeatureCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureCollectionType_LockId(), theXMLTypePackage.getString(), "lockId", null, 0, 1, FeatureCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureCollectionType_NumberOfFeatures(), theXMLTypePackage.getNonNegativeInteger(), "numberOfFeatures", null, 0, 1, FeatureCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureCollectionType_TimeStamp(), theXMLTypePackage.getDateTime(), "timeStamp", null, 0, 1, FeatureCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featuresLockedTypeEClass, FeaturesLockedType.class, "FeaturesLockedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturesLockedType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FeaturesLockedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeaturesLockedType_FeatureId(), theOGCPackage.getFeatureIdType(), null, "featureId", null, 1, -1, FeaturesLockedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featuresNotLockedTypeEClass, FeaturesNotLockedType.class, "FeaturesNotLockedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturesNotLockedType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FeaturesNotLockedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeaturesNotLockedType_FeatureId(), theOGCPackage.getFeatureIdType(), null, "featureId", null, 1, -1, FeaturesNotLockedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featureTypeListTypeEClass, FeatureTypeListType.class, "FeatureTypeListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureTypeListType_Operations(), this.getOperationsType(), null, "operations", null, 0, 1, FeatureTypeListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureTypeListType_FeatureType(), this.getFeatureTypeType(), null, "featureType", null, 1, -1, FeatureTypeListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureTypeTypeEClass, FeatureTypeType.class, "FeatureTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureTypeType_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureTypeType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureTypeType_Abstract(), theXMLTypePackage.getString(), "abstract", null, 0, 1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureTypeType_Keywords(), theOWSPackage.getKeywordsType(), null, "keywords", null, 0, -1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureTypeType_DefaultSRS(), theXMLTypePackage.getAnyURI(), "defaultSRS", null, 0, 1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureTypeType_OtherSRS(), theXMLTypePackage.getAnyURI(), "otherSRS", null, 0, -1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureTypeType_NoSRS(), this.getNoSRSType(), null, "noSRS", null, 0, 1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureTypeType_Operations(), this.getOperationsType(), null, "operations", null, 0, 1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureTypeType_OutputFormats(), this.getOutputFormatListType(), null, "outputFormats", null, 0, 1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureTypeType_WGS84BoundingBox(), theOWSPackage.getWGS84BoundingBoxType(), null, "wGS84BoundingBox", null, 0, -1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureTypeType_MetadataURL(), this.getMetadataURLType(), null, "metadataURL", null, 0, -1, FeatureTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getCapabilitiesTypeEClass, GetCapabilitiesType.class, "GetCapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetCapabilitiesType_Service(), theOWSPackage.getServiceType(), "service", "WFS", 0, 1, GetCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getFeatureTypeEClass, GetFeatureType.class, "GetFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetFeatureType_Query(), this.getQueryType(), null, "query", null, 1, -1, GetFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureType_MaxFeatures(), theXMLTypePackage.getPositiveInteger(), "maxFeatures", null, 0, 1, GetFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureType_OutputFormat(), theXMLTypePackage.getString(), "outputFormat", "text/xml; subtype=gml/3.1.1", 0, 1, GetFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureType_ResultType(), this.getResultTypeType(), "resultType", "results", 0, 1, GetFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureType_TraverseXlinkDepth(), theXMLTypePackage.getString(), "traverseXlinkDepth", null, 0, 1, GetFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureType_TraverseXlinkExpiry(), theXMLTypePackage.getPositiveInteger(), "traverseXlinkExpiry", null, 0, 1, GetFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getFeatureWithLockTypeEClass, GetFeatureWithLockType.class, "GetFeatureWithLockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetFeatureWithLockType_Query(), this.getQueryType(), null, "query", null, 1, -1, GetFeatureWithLockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureWithLockType_Expiry(), theXMLTypePackage.getPositiveInteger(), "expiry", "5", 0, 1, GetFeatureWithLockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureWithLockType_MaxFeatures(), theXMLTypePackage.getPositiveInteger(), "maxFeatures", null, 0, 1, GetFeatureWithLockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureWithLockType_OutputFormat(), theXMLTypePackage.getString(), "outputFormat", "text/xml; subtype=gml/3.1.1", 0, 1, GetFeatureWithLockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureWithLockType_ResultType(), this.getResultTypeType(), "resultType", "results", 0, 1, GetFeatureWithLockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureWithLockType_TraverseXlinkDepth(), theXMLTypePackage.getString(), "traverseXlinkDepth", null, 0, 1, GetFeatureWithLockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetFeatureWithLockType_TraverseXlinkExpiry(), theXMLTypePackage.getPositiveInteger(), "traverseXlinkExpiry", null, 0, 1, GetFeatureWithLockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getGmlObjectTypeEClass, GetGmlObjectType.class, "GetGmlObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetGmlObjectType_GmlObjectId(), theOGCPackage.getGmlObjectIdType(), null, "gmlObjectId", null, 1, 1, GetGmlObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetGmlObjectType_OutputFormat(), theXMLTypePackage.getString(), "outputFormat", "GML3", 0, 1, GetGmlObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetGmlObjectType_TraverseXlinkDepth(), theXMLTypePackage.getString(), "traverseXlinkDepth", null, 1, 1, GetGmlObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetGmlObjectType_TraverseXlinkExpiry(), theXMLTypePackage.getPositiveInteger(), "traverseXlinkExpiry", null, 0, 1, GetGmlObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gmlObjectTypeListTypeEClass, GMLObjectTypeListType.class, "GMLObjectTypeListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGMLObjectTypeListType_GMLObjectType(), this.getGMLObjectTypeType(), null, "gMLObjectType", null, 1, -1, GMLObjectTypeListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gmlObjectTypeTypeEClass, GMLObjectTypeType.class, "GMLObjectTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGMLObjectTypeType_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, GMLObjectTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMLObjectTypeType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, GMLObjectTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMLObjectTypeType_Abstract(), theXMLTypePackage.getString(), "abstract", null, 0, 1, GMLObjectTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGMLObjectTypeType_Keywords(), theOWSPackage.getKeywordsType(), null, "keywords", null, 0, -1, GMLObjectTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGMLObjectTypeType_OutputFormats(), this.getOutputFormatListType(), null, "outputFormats", null, 0, 1, GMLObjectTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertedFeatureTypeEClass, InsertedFeatureType.class, "InsertedFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInsertedFeatureType_FeatureId(), theOGCPackage.getFeatureIdType(), null, "featureId", null, 1, -1, InsertedFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertedFeatureType_Handle(), theXMLTypePackage.getString(), "handle", null, 0, 1, InsertedFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertElementTypeEClass, InsertElementType.class, "InsertElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertElementType_FeatureGroup(), ecorePackage.getEFeatureMapEntry(), "featureGroup", null, 1, -1, InsertElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertElementType_Feature(), theGMLPackage.getAbstractFeatureType(), null, "feature", null, 1, -1, InsertElementType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertElementType_Handle(), theXMLTypePackage.getString(), "handle", null, 0, 1, InsertElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertElementType_Idgen(), this.getIdentifierGenerationOptionType(), "idgen", "GenerateNew", 0, 1, InsertElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertElementType_InputFormat(), theXMLTypePackage.getString(), "inputFormat", "text/xml; subtype=gml/3.1.1", 0, 1, InsertElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertElementType_SrsName(), theXMLTypePackage.getAnyURI(), "srsName", null, 0, 1, InsertElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertResultsTypeEClass, InsertResultsType.class, "InsertResultsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInsertResultsType_Feature(), this.getInsertedFeatureType(), null, "feature", null, 1, -1, InsertResultsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lockFeatureResponseTypeEClass, LockFeatureResponseType.class, "LockFeatureResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLockFeatureResponseType_LockId(), theXMLTypePackage.getString(), "lockId", null, 1, 1, LockFeatureResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLockFeatureResponseType_FeaturesLocked(), this.getFeaturesLockedType(), null, "featuresLocked", null, 0, 1, LockFeatureResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLockFeatureResponseType_FeaturesNotLocked(), this.getFeaturesNotLockedType(), null, "featuresNotLocked", null, 0, 1, LockFeatureResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lockFeatureTypeEClass, LockFeatureType.class, "LockFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLockFeatureType_Lock(), this.getLockType(), null, "lock", null, 1, -1, LockFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLockFeatureType_Expiry(), theXMLTypePackage.getPositiveInteger(), "expiry", "5", 0, 1, LockFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLockFeatureType_LockAction(), this.getAllSomeType(), "lockAction", "ALL", 0, 1, LockFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lockTypeEClass, LockType.class, "LockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLockType_Filter(), theOGCPackage.getFilterType(), null, "filter", null, 0, 1, LockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLockType_Handle(), theXMLTypePackage.getString(), "handle", null, 0, 1, LockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLockType_TypeName(), theXMLTypePackage.getQName(), "typeName", null, 1, 1, LockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataURLTypeEClass, MetadataURLType.class, "MetadataURLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataURLType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, MetadataURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataURLType_Format(), this.getFormatType(), "format", null, 1, 1, MetadataURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataURLType_Type(), this.getTypeType(), "type", null, 1, 1, MetadataURLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nativeTypeEClass, NativeType.class, "NativeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNativeType_SafeToIgnore(), theXMLTypePackage.getBoolean(), "safeToIgnore", null, 1, 1, NativeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNativeType_VendorId(), theXMLTypePackage.getString(), "vendorId", null, 1, 1, NativeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noSRSTypeEClass, NoSRSType.class, "NoSRSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationsTypeEClass, OperationsType.class, "OperationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationsType_Operation(), this.getOperationType(), "operation", null, 1, -1, OperationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputFormatListTypeEClass, OutputFormatListType.class, "OutputFormatListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputFormatListType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OutputFormatListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputFormatListType_Format(), theXMLTypePackage.getString(), "format", null, 1, -1, OutputFormatListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyType_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryTypeEClass, QueryType.class, "QueryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_PropertyName(), theXMLTypePackage.getString(), "propertyName", null, 0, -1, QueryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getQueryType_XlinkPropertyName(), this.getXlinkPropertyNameType(), null, "xlinkPropertyName", null, 0, -1, QueryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getQueryType_Function(), theOGCPackage.getFunctionType(), null, "function", null, 0, -1, QueryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getQueryType_Filter(), theOGCPackage.getFilterType(), null, "filter", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryType_SortBy(), theOGCPackage.getSortByType(), null, "sortBy", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_FeatureVersion(), theXMLTypePackage.getString(), "featureVersion", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_Handle(), theXMLTypePackage.getString(), "handle", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_SrsName(), theXMLTypePackage.getAnyURI(), "srsName", null, 0, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryType_TypeName(), this.getTypeNameListType(), "typeName", null, 1, 1, QueryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionResponseTypeEClass, TransactionResponseType.class, "TransactionResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransactionResponseType_TransactionSummary(), this.getTransactionSummaryType(), null, "transactionSummary", null, 1, 1, TransactionResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionResponseType_TransactionResults(), this.getTransactionResultsType(), null, "transactionResults", null, 0, 1, TransactionResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionResponseType_InsertResults(), this.getInsertResultsType(), null, "insertResults", null, 0, 1, TransactionResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionResponseType_Version(), theXMLTypePackage.getString(), "version", "1.1.0", 1, 1, TransactionResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionResultsTypeEClass, TransactionResultsType.class, "TransactionResultsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransactionResultsType_Action(), this.getActionType(), null, "action", null, 0, -1, TransactionResultsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionSummaryTypeEClass, TransactionSummaryType.class, "TransactionSummaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransactionSummaryType_TotalInserted(), theXMLTypePackage.getNonNegativeInteger(), "totalInserted", null, 0, 1, TransactionSummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionSummaryType_TotalUpdated(), theXMLTypePackage.getNonNegativeInteger(), "totalUpdated", null, 0, 1, TransactionSummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionSummaryType_TotalDeleted(), theXMLTypePackage.getNonNegativeInteger(), "totalDeleted", null, 0, 1, TransactionSummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionTypeEClass, TransactionType.class, "TransactionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransactionType_LockId(), theXMLTypePackage.getString(), "lockId", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Insert(), this.getInsertElementType(), null, "insert", null, 0, -1, TransactionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Update(), this.getUpdateElementType(), null, "update", null, 0, -1, TransactionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Delete(), this.getDeleteElementType(), null, "delete", null, 0, -1, TransactionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Native(), this.getNativeType(), null, "native", null, 0, -1, TransactionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_ReleaseAction(), this.getAllSomeType(), "releaseAction", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateElementTypeEClass, UpdateElementType.class, "UpdateElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateElementType_Property(), this.getPropertyType(), null, "property", null, 1, -1, UpdateElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateElementType_Filter(), theOGCPackage.getFilterType(), null, "filter", null, 0, 1, UpdateElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateElementType_Handle(), theXMLTypePackage.getString(), "handle", null, 0, 1, UpdateElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateElementType_InputFormat(), theXMLTypePackage.getString(), "inputFormat", "x-application/gml:3", 0, 1, UpdateElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateElementType_SrsName(), theXMLTypePackage.getAnyURI(), "srsName", null, 0, 1, UpdateElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateElementType_TypeName(), theXMLTypePackage.getQName(), "typeName", null, 1, 1, UpdateElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wfsCapabilitiesTypeEClass, WFSCapabilitiesType.class, "WFSCapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWFSCapabilitiesType_FeatureTypeList(), this.getFeatureTypeListType(), null, "featureTypeList", null, 0, 1, WFSCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFSCapabilitiesType_ServesGMLObjectTypeList(), this.getGMLObjectTypeListType(), null, "servesGMLObjectTypeList", null, 0, 1, WFSCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFSCapabilitiesType_SupportsGMLObjectTypeList(), this.getGMLObjectTypeListType(), null, "supportsGMLObjectTypeList", null, 0, 1, WFSCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFSCapabilitiesType_FilterCapabilities(), theOGCPackage.getFilterCapabilitiesType(), null, "filterCapabilities", null, 1, 1, WFSCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xlinkPropertyNameTypeEClass, XlinkPropertyNameType.class, "XlinkPropertyNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXlinkPropertyNameType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, XlinkPropertyNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXlinkPropertyNameType_TraverseXlinkDepth(), theXMLTypePackage.getString(), "traverseXlinkDepth", null, 1, 1, XlinkPropertyNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXlinkPropertyNameType_TraverseXlinkExpiry(), theXMLTypePackage.getPositiveInteger(), "traverseXlinkExpiry", null, 0, 1, XlinkPropertyNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(allSomeTypeEEnum, AllSomeType.class, "AllSomeType");
		addEEnumLiteral(allSomeTypeEEnum, AllSomeType.ALL);
		addEEnumLiteral(allSomeTypeEEnum, AllSomeType.SOME);

		initEEnum(formatTypeEEnum, FormatType.class, "FormatType");
		addEEnumLiteral(formatTypeEEnum, FormatType.TEXT_XML);
		addEEnumLiteral(formatTypeEEnum, FormatType.TEXT_HTML);
		addEEnumLiteral(formatTypeEEnum, FormatType.TEXT_SGML);
		addEEnumLiteral(formatTypeEEnum, FormatType.TEXT_PLAIN);

		initEEnum(identifierGenerationOptionTypeEEnum, IdentifierGenerationOptionType.class, "IdentifierGenerationOptionType");
		addEEnumLiteral(identifierGenerationOptionTypeEEnum, IdentifierGenerationOptionType.USE_EXISTING);
		addEEnumLiteral(identifierGenerationOptionTypeEEnum, IdentifierGenerationOptionType.REPLACE_DUPLICATE);
		addEEnumLiteral(identifierGenerationOptionTypeEEnum, IdentifierGenerationOptionType.GENERATE_NEW);

		initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
		addEEnumLiteral(operationTypeEEnum, OperationType.INSERT);
		addEEnumLiteral(operationTypeEEnum, OperationType.UPDATE);
		addEEnumLiteral(operationTypeEEnum, OperationType.DELETE);
		addEEnumLiteral(operationTypeEEnum, OperationType.QUERY);
		addEEnumLiteral(operationTypeEEnum, OperationType.LOCK);
		addEEnumLiteral(operationTypeEEnum, OperationType.GET_GML_OBJECT);

		initEEnum(resultTypeTypeEEnum, ResultTypeType.class, "ResultTypeType");
		addEEnumLiteral(resultTypeTypeEEnum, ResultTypeType.RESULTS);
		addEEnumLiteral(resultTypeTypeEEnum, ResultTypeType.HITS);

		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.TC211);
		addEEnumLiteral(typeTypeEEnum, TypeType.FGDC);
		addEEnumLiteral(typeTypeEEnum, TypeType._19115);
		addEEnumLiteral(typeTypeEEnum, TypeType._19139);

		// Initialize data types
		initEDataType(allSomeTypeObjectEDataType, AllSomeType.class, "AllSomeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(baseTypeNameListTypeEDataType, List.class, "BaseTypeNameListType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(formatTypeObjectEDataType, FormatType.class, "FormatTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierGenerationOptionTypeObjectEDataType, IdentifierGenerationOptionType.class, "IdentifierGenerationOptionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operationTypeObjectEDataType, OperationType.class, "OperationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resultTypeTypeObjectEDataType, ResultTypeType.class, "ResultTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeNameListTypeEDataType, List.class, "TypeNameListType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryAggregates3Annotations();
		// urn:opengis:specification:gml:schema-xsd:gml:3.1.1
		createUrnopengisspecificationgmlschemaxsdgml3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1
		createUrnopengisspecificationgmlschemaxsddynamicFeature3Annotations();
		// urn:opengis:specification:gml:schema-xsd:topology:3.1.1
		createUrnopengisspecificationgmlschemaxsdtopology3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coverage:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoverage3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:observation:3.1.1
		createUrnopengisspecificationgmlschemaxsdobservation3Annotations();
		// urn:opengis:specification:gml:schema-defaultStyle:v3.1.0
		createUrnopengisspecificationgmlschemadefaultStylev3Annotations();
		// urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdtemporalReferenceSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryPrimitives3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryBasic2d3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryBasic0d1dv3Annotations();
		// urn:opengis:specification:gml:schema-measures:3.1.1
		createUrnopengisspecificationgmlschemameasures3Annotations();
		// urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1
		createUrnopengisspecificationgmlschemaxsdtemporalTopology3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1
		createUrnopengisspecificationgmlschemaxsddictionary3Annotations();
		// urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1
		createUrnopengisspecificationgmlschemaxsdgmlBase3Annotations();
		// urn:opengis:specification:gml:schema-xsd:temporal:3.1.1
		createUrnopengisspecificationgmlschemaxsdtemporal3Annotations();
		// urn:opengis:specification:gml:schema-units:3.1.1
		createUrnopengisspecificationgmlschemaunits3Annotations();
		// urn:opengis:specification:gml:schema-xsd:feature:v3.1.1
		createUrnopengisspecificationgmlschemaxsdfeaturev3Annotations();
		// urn:opengis:specification:gml:schema-xsd:direction:3.1.1
		createUrnopengisspecificationgmlschemaxsddirection3Annotations();
		// urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1
		createUrnopengisspecificationgmlschemaxsdvalueObjects3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoordinateSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:datums:3.1.1
		createUrnopengisspecificationgmlschemaxsddatums3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoordinateOperations3Annotations();
		// urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdreferenceSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1
		createUrnopengisspecificationgmlschemaxsddataQuality3Annotations();
		// urn:opengis:specification:gml:schema-xsd:grids:3.1.1
		createUrnopengisspecificationgmlschemaxsdgrids3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryComplexesv3Annotations();
		// urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1
		createUrnopengisspecificationgmlschemaxsdbasicTypes3Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "owsAll.xsd\nowsGetCapabilities.xsd\nowsExceptionReport.xsd\nowsServiceIdentification.xsd\nowsServiceProvider.xsd\nowsOperationsMetadata.xsd\nowsCommon.xsd\nows19115subset.xsd\nowsDataIdentification.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryAggregates3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryAggregates.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:gml:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgml3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:gml:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "gml.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddynamicFeature3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:topology:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtopology3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:topology:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "topology.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coverage:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoverage3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coverage:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coverage.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:observation:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdobservation3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:observation:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "observation.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-defaultStyle:v3.1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemadefaultStylev3Annotations() {
		String source = "urn:opengis:specification:gml:schema-defaultStyle:v3.1.0";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "defaultStyle.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtemporalReferenceSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryPrimitives3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryPrimitives.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryBasic2d3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryBasic2d.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryBasic0d1dv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryBasic0d1d.xsd\n\n  \t\t\t\n  <sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\n  \t\t\t\n  <sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\n    <sch:rule abstract=\"true\" id=\"CRSLabels\">\n      \t\t\t\t\t\n      <sch:report test=\"not(@srsDimension) or @srsName\">The presence of a dimension attribute implies the presence of the srsName attribute.</sch:report>\n      \t\t\t\t\t\n      <sch:report test=\"not(@axisLabels) or @srsName\">The presence of an axisLabels attribute implies the presence of the srsName attribute.</sch:report>\n      \t\t\t\t\t\n      <sch:report test=\"not(@uomLabels) or @srsName\">The presence of an uomLabels attribute implies the presence of the srsName attribute.</sch:report>\n      \t\t\t\t\t\n      <sch:report test=\"(not(@uomLabels) and not(@axisLabels)) or (@uomLabels and @axisLabels)\">The presence of an uomLabels attribute implies the presence of the axisLabels attribute and vice versa.</sch:report>\n      \t\t\t\t\n    </sch:rule>\n    \t\t\t\n  </sch:pattern>\n  \t\t\t\n  <sch:pattern name=\"Check Dimension\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\n    <sch:rule abstract=\"true\" id=\"Count\">\n      \t\t\t\t\t\n      <sch:report test=\"not(@count) or @srsDimension\">The presence of a count attribute implies the presence of the dimension attribute.</sch:report>\n      \t\t\t\t\n    </sch:rule>\n    \t\t\t\n  </sch:pattern>\n  \t\t\n"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-measures:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemameasures3Annotations() {
		String source = "urn:opengis:specification:gml:schema-measures:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtemporalTopology3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddictionary3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgmlBase3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "\n  \t\t\t\n  <sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\n  \t\t\t\n  <sch:ns prefix=\"gml\" uri=\"http://www.opengis.net/gml\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\n  \t\t\t\n  <sch:ns prefix=\"xlink\" uri=\"http://www.w3.org/1999/xlink\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\n  \t\t\t\n  <sch:pattern name=\"Check either href or content not both\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n    \t\t\t\t\n    <sch:rule abstract=\"true\" id=\"hrefOrContent\">\n      \t\t\t\t\t\n      <sch:report test=\"@xlink:href and (*|text())\">Property element may not carry both a reference to an object and contain an object.</sch:report>\n      \t\t\t\t\t\n      <sch:assert test=\"@xlink:href | (*|text())\">Property element must either carry a reference to an object or contain an object.</sch:assert>\n      \t\t\t\t\n    </sch:rule>\n    \t\t\t\n  </sch:pattern>\n  \t\t\n"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:temporal:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtemporal3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:temporal:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-units:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaunits3Annotations() {
		String source = "urn:opengis:specification:gml:schema-units:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:feature:v3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdfeaturev3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:feature:v3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:direction:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddirection3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:direction:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "direction.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdvalueObjects3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "valueObjects.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoordinateSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:datums:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddatums3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:datums:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoordinateOperations3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdreferenceSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddataQuality3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:grids:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgrids3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:grids:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "grids.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryComplexesv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryComplexes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdbasicTypes3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "basicTypes.xsd"
		   });
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
		  (actionTypeEClass,
		   source,
		   new String[] {
			   "name", "ActionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getActionType_Message(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Message",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionType_Code(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "code"
		   });
		addAnnotation
		  (getActionType_Locator(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "locator"
		   });
		addAnnotation
		  (allSomeTypeEEnum,
		   source,
		   new String[] {
			   "name", "AllSomeType"
		   });
		addAnnotation
		  (allSomeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "AllSomeType:Object",
			   "baseType", "AllSomeType"
		   });
		addAnnotation
		  (baseRequestTypeEClass,
		   source,
		   new String[] {
			   "name", "BaseRequestType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getBaseRequestType_Handle(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "handle"
		   });
		addAnnotation
		  (getBaseRequestType_Service(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "service"
		   });
		addAnnotation
		  (getBaseRequestType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (baseTypeNameListTypeEDataType,
		   source,
		   new String[] {
			   "name", "Base_TypeNameListType",
			   "itemType", "http://www.eclipse.org/emf/2003/XMLType#QName"
		   });
		addAnnotation
		  (deleteElementTypeEClass,
		   source,
		   new String[] {
			   "name", "DeleteElementType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeleteElementType_Filter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filter",
			   "namespace", "http://www.opengis.net/ogc"
		   });
		addAnnotation
		  (getDeleteElementType_Handle(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "handle"
		   });
		addAnnotation
		  (getDeleteElementType_TypeName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeName"
		   });
		addAnnotation
		  (describeFeatureTypeTypeEClass,
		   source,
		   new String[] {
			   "name", "DescribeFeatureTypeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDescribeFeatureTypeType_TypeName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TypeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDescribeFeatureTypeType_OutputFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "outputFormat"
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
		  (getDocumentRoot_Delete(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Delete",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DescribeFeatureType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DescribeFeatureType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_FeatureCollection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureCollection",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://www.opengis.net/gml#_FeatureCollection"
		   });
		addAnnotation
		  (getDocumentRoot_FeatureTypeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureTypeList",
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
		  (getDocumentRoot_GetFeature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GetFeature",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetFeatureWithLock(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GetFeatureWithLock",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetGmlObject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GetGmlObject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Insert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Insert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LockFeature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LockFeature",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LockFeatureResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LockFeatureResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LockId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LockId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Native(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Native",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Property",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_PropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Query(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Query",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ServesGMLObjectTypeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServesGMLObjectTypeList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SupportsGMLObjectTypeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SupportsGMLObjectTypeList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Transaction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Transaction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_TransactionResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransactionResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Update(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Update",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WFSCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WFS_Capabilities",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_XlinkPropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "XlinkPropertyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (featureCollectionTypeEClass,
		   source,
		   new String[] {
			   "name", "FeatureCollectionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureCollectionType_LockId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lockId"
		   });
		addAnnotation
		  (getFeatureCollectionType_NumberOfFeatures(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "numberOfFeatures"
		   });
		addAnnotation
		  (getFeatureCollectionType_TimeStamp(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "timeStamp"
		   });
		addAnnotation
		  (featuresLockedTypeEClass,
		   source,
		   new String[] {
			   "name", "FeaturesLockedType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeaturesLockedType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getFeaturesLockedType_FeatureId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureId",
			   "namespace", "http://www.opengis.net/ogc",
			   "group", "#group:0"
		   });
		addAnnotation
		  (featuresNotLockedTypeEClass,
		   source,
		   new String[] {
			   "name", "FeaturesNotLockedType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeaturesNotLockedType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getFeaturesNotLockedType_FeatureId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureId",
			   "namespace", "http://www.opengis.net/ogc",
			   "group", "#group:0"
		   });
		addAnnotation
		  (featureTypeListTypeEClass,
		   source,
		   new String[] {
			   "name", "FeatureTypeListType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureTypeListType_Operations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Operations",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureTypeListType_FeatureType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (featureTypeTypeEClass,
		   source,
		   new String[] {
			   "name", "FeatureTypeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureTypeType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureTypeType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureTypeType_Abstract(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Abstract",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureTypeType_Keywords(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Keywords",
			   "namespace", "http://www.opengis.net/ows"
		   });
		addAnnotation
		  (getFeatureTypeType_DefaultSRS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultSRS",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureTypeType_OtherSRS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OtherSRS",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureTypeType_NoSRS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NoSRS",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureTypeType_Operations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Operations",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureTypeType_OutputFormats(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OutputFormats",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureTypeType_WGS84BoundingBox(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WGS84BoundingBox",
			   "namespace", "http://www.opengis.net/ows"
		   });
		addAnnotation
		  (getFeatureTypeType_MetadataURL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetadataURL",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (formatTypeEEnum,
		   source,
		   new String[] {
			   "name", "format_._type"
		   });
		addAnnotation
		  (formatTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "format_._type:Object",
			   "baseType", "format_._type"
		   });
		addAnnotation
		  (getCapabilitiesTypeEClass,
		   source,
		   new String[] {
			   "name", "GetCapabilitiesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetCapabilitiesType_Service(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "service"
		   });
		addAnnotation
		  (getFeatureTypeEClass,
		   source,
		   new String[] {
			   "name", "GetFeatureType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetFeatureType_Query(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Query",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetFeatureType_MaxFeatures(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxFeatures"
		   });
		addAnnotation
		  (getGetFeatureType_OutputFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "outputFormat"
		   });
		addAnnotation
		  (getGetFeatureType_ResultType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resultType"
		   });
		addAnnotation
		  (getGetFeatureType_TraverseXlinkDepth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "traverseXlinkDepth"
		   });
		addAnnotation
		  (getGetFeatureType_TraverseXlinkExpiry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "traverseXlinkExpiry"
		   });
		addAnnotation
		  (getFeatureWithLockTypeEClass,
		   source,
		   new String[] {
			   "name", "GetFeatureWithLockType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetFeatureWithLockType_Query(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Query",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetFeatureWithLockType_Expiry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expiry"
		   });
		addAnnotation
		  (getGetFeatureWithLockType_MaxFeatures(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxFeatures"
		   });
		addAnnotation
		  (getGetFeatureWithLockType_OutputFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "outputFormat"
		   });
		addAnnotation
		  (getGetFeatureWithLockType_ResultType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resultType"
		   });
		addAnnotation
		  (getGetFeatureWithLockType_TraverseXlinkDepth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "traverseXlinkDepth"
		   });
		addAnnotation
		  (getGetFeatureWithLockType_TraverseXlinkExpiry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "traverseXlinkExpiry"
		   });
		addAnnotation
		  (getGmlObjectTypeEClass,
		   source,
		   new String[] {
			   "name", "GetGmlObjectType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetGmlObjectType_GmlObjectId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GmlObjectId",
			   "namespace", "http://www.opengis.net/ogc"
		   });
		addAnnotation
		  (getGetGmlObjectType_OutputFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "outputFormat"
		   });
		addAnnotation
		  (getGetGmlObjectType_TraverseXlinkDepth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "traverseXlinkDepth"
		   });
		addAnnotation
		  (getGetGmlObjectType_TraverseXlinkExpiry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "traverseXlinkExpiry"
		   });
		addAnnotation
		  (gmlObjectTypeListTypeEClass,
		   source,
		   new String[] {
			   "name", "GMLObjectTypeListType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGMLObjectTypeListType_GMLObjectType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GMLObjectType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (gmlObjectTypeTypeEClass,
		   source,
		   new String[] {
			   "name", "GMLObjectTypeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGMLObjectTypeType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGMLObjectTypeType_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGMLObjectTypeType_Abstract(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Abstract",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGMLObjectTypeType_Keywords(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Keywords",
			   "namespace", "http://www.opengis.net/ows"
		   });
		addAnnotation
		  (getGMLObjectTypeType_OutputFormats(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OutputFormats",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (identifierGenerationOptionTypeEEnum,
		   source,
		   new String[] {
			   "name", "IdentifierGenerationOptionType"
		   });
		addAnnotation
		  (identifierGenerationOptionTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "IdentifierGenerationOptionType:Object",
			   "baseType", "IdentifierGenerationOptionType"
		   });
		addAnnotation
		  (insertedFeatureTypeEClass,
		   source,
		   new String[] {
			   "name", "InsertedFeatureType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInsertedFeatureType_FeatureId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureId",
			   "namespace", "http://www.opengis.net/ogc"
		   });
		addAnnotation
		  (getInsertedFeatureType_Handle(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "handle"
		   });
		addAnnotation
		  (insertElementTypeEClass,
		   source,
		   new String[] {
			   "name", "InsertElementType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInsertElementType_FeatureGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "_Feature:group",
			   "namespace", "http://www.opengis.net/gml"
		   });
		addAnnotation
		  (getInsertElementType_Feature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "_Feature",
			   "namespace", "http://www.opengis.net/gml",
			   "group", "http://www.opengis.net/gml#_Feature:group"
		   });
		addAnnotation
		  (getInsertElementType_Handle(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "handle"
		   });
		addAnnotation
		  (getInsertElementType_Idgen(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "idgen"
		   });
		addAnnotation
		  (getInsertElementType_InputFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "inputFormat"
		   });
		addAnnotation
		  (getInsertElementType_SrsName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "srsName"
		   });
		addAnnotation
		  (insertResultsTypeEClass,
		   source,
		   new String[] {
			   "name", "InsertResultsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInsertResultsType_Feature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Feature",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (lockFeatureResponseTypeEClass,
		   source,
		   new String[] {
			   "name", "LockFeatureResponseType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLockFeatureResponseType_LockId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LockId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLockFeatureResponseType_FeaturesLocked(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeaturesLocked",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLockFeatureResponseType_FeaturesNotLocked(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeaturesNotLocked",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (lockFeatureTypeEClass,
		   source,
		   new String[] {
			   "name", "LockFeatureType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLockFeatureType_Lock(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Lock",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLockFeatureType_Expiry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expiry"
		   });
		addAnnotation
		  (getLockFeatureType_LockAction(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lockAction"
		   });
		addAnnotation
		  (lockTypeEClass,
		   source,
		   new String[] {
			   "name", "LockType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLockType_Filter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filter",
			   "namespace", "http://www.opengis.net/ogc"
		   });
		addAnnotation
		  (getLockType_Handle(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "handle"
		   });
		addAnnotation
		  (getLockType_TypeName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeName"
		   });
		addAnnotation
		  (metadataURLTypeEClass,
		   source,
		   new String[] {
			   "name", "MetadataURLType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getMetadataURLType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getMetadataURLType_Format(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "format"
		   });
		addAnnotation
		  (getMetadataURLType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (nativeTypeEClass,
		   source,
		   new String[] {
			   "name", "NativeType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getNativeType_SafeToIgnore(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "safeToIgnore"
		   });
		addAnnotation
		  (getNativeType_VendorId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "vendorId"
		   });
		addAnnotation
		  (noSRSTypeEClass,
		   source,
		   new String[] {
			   "name", "NoSRS_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (operationsTypeEClass,
		   source,
		   new String[] {
			   "name", "OperationsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOperationsType_Operation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Operation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (operationTypeEEnum,
		   source,
		   new String[] {
			   "name", "OperationType"
		   });
		addAnnotation
		  (operationTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "OperationType:Object",
			   "baseType", "OperationType"
		   });
		addAnnotation
		  (outputFormatListTypeEClass,
		   source,
		   new String[] {
			   "name", "OutputFormatListType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOutputFormatListType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getOutputFormatListType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (propertyTypeEClass,
		   source,
		   new String[] {
			   "name", "PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertyType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPropertyType_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (queryTypeEClass,
		   source,
		   new String[] {
			   "name", "QueryType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQueryType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getQueryType_PropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PropertyName",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getQueryType_XlinkPropertyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "XlinkPropertyName",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getQueryType_Function(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Function",
			   "namespace", "http://www.opengis.net/ogc",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getQueryType_Filter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filter",
			   "namespace", "http://www.opengis.net/ogc"
		   });
		addAnnotation
		  (getQueryType_SortBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SortBy",
			   "namespace", "http://www.opengis.net/ogc"
		   });
		addAnnotation
		  (getQueryType_FeatureVersion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "featureVersion"
		   });
		addAnnotation
		  (getQueryType_Handle(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "handle"
		   });
		addAnnotation
		  (getQueryType_SrsName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "srsName"
		   });
		addAnnotation
		  (getQueryType_TypeName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeName"
		   });
		addAnnotation
		  (resultTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "ResultTypeType"
		   });
		addAnnotation
		  (resultTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ResultTypeType:Object",
			   "baseType", "ResultTypeType"
		   });
		addAnnotation
		  (transactionResponseTypeEClass,
		   source,
		   new String[] {
			   "name", "TransactionResponseType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTransactionResponseType_TransactionSummary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransactionSummary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionResponseType_TransactionResults(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransactionResults",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionResponseType_InsertResults(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InsertResults",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionResponseType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (transactionResultsTypeEClass,
		   source,
		   new String[] {
			   "name", "TransactionResultsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTransactionResultsType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (transactionSummaryTypeEClass,
		   source,
		   new String[] {
			   "name", "TransactionSummaryType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTransactionSummaryType_TotalInserted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "totalInserted",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionSummaryType_TotalUpdated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "totalUpdated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionSummaryType_TotalDeleted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "totalDeleted",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (transactionTypeEClass,
		   source,
		   new String[] {
			   "name", "TransactionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTransactionType_LockId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LockId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:4"
		   });
		addAnnotation
		  (getTransactionType_Insert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Insert",
			   "namespace", "##targetNamespace",
			   "group", "#group:4"
		   });
		addAnnotation
		  (getTransactionType_Update(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Update",
			   "namespace", "##targetNamespace",
			   "group", "#group:4"
		   });
		addAnnotation
		  (getTransactionType_Delete(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Delete",
			   "namespace", "##targetNamespace",
			   "group", "#group:4"
		   });
		addAnnotation
		  (getTransactionType_Native(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Native",
			   "namespace", "##targetNamespace",
			   "group", "#group:4"
		   });
		addAnnotation
		  (getTransactionType_ReleaseAction(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "releaseAction"
		   });
		addAnnotation
		  (typeNameListTypeEDataType,
		   source,
		   new String[] {
			   "name", "TypeNameListType",
			   "baseType", "Base_TypeNameListType",
			   "pattern", "((\\w:)?\\w(=\\w)?){1,}"
		   });
		addAnnotation
		  (typeTypeEEnum,
		   source,
		   new String[] {
			   "name", "type_._type"
		   });
		addAnnotation
		  (typeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "type_._type:Object",
			   "baseType", "type_._type"
		   });
		addAnnotation
		  (updateElementTypeEClass,
		   source,
		   new String[] {
			   "name", "UpdateElementType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUpdateElementType_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Property",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateElementType_Filter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filter",
			   "namespace", "http://www.opengis.net/ogc"
		   });
		addAnnotation
		  (getUpdateElementType_Handle(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "handle"
		   });
		addAnnotation
		  (getUpdateElementType_InputFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "inputFormat"
		   });
		addAnnotation
		  (getUpdateElementType_SrsName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "srsName"
		   });
		addAnnotation
		  (getUpdateElementType_TypeName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeName"
		   });
		addAnnotation
		  (wfsCapabilitiesTypeEClass,
		   source,
		   new String[] {
			   "name", "WFS_CapabilitiesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWFSCapabilitiesType_FeatureTypeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureTypeList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWFSCapabilitiesType_ServesGMLObjectTypeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ServesGMLObjectTypeList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWFSCapabilitiesType_SupportsGMLObjectTypeList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SupportsGMLObjectTypeList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWFSCapabilitiesType_FilterCapabilities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filter_Capabilities",
			   "namespace", "http://www.opengis.net/ogc"
		   });
		addAnnotation
		  (xlinkPropertyNameTypeEClass,
		   source,
		   new String[] {
			   "name", "XlinkPropertyName_._type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getXlinkPropertyNameType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getXlinkPropertyNameType_TraverseXlinkDepth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "traverseXlinkDepth"
		   });
		addAnnotation
		  (getXlinkPropertyNameType_TraverseXlinkExpiry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "traverseXlinkExpiry"
		   });
	}

} //WFSPackageImpl
