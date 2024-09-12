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
package de.dwd.cdc.forecast.pointforecast.impl;

import de.dwd.cdc.forecast.pointforecast.DocumentRoot;
import de.dwd.cdc.forecast.pointforecast.ForecastTimeStepsType;
import de.dwd.cdc.forecast.pointforecast.ForecastType;
import de.dwd.cdc.forecast.pointforecast.FormatCfgType;
import de.dwd.cdc.forecast.pointforecast.ModelType;
import de.dwd.cdc.forecast.pointforecast.PointforecastFactory;
import de.dwd.cdc.forecast.pointforecast.PointforecastPackage;
import de.dwd.cdc.forecast.pointforecast.ProductDefinitionType;
import de.dwd.cdc.forecast.pointforecast.ProductIDType;
import de.dwd.cdc.forecast.pointforecast.ReferencedModelType;
import de.dwd.cdc.forecast.pointforecast.ValueType;

import de.dwd.cdc.forecast.pointforecast.util.PointforecastValidator;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PointforecastPackageImpl extends EPackageImpl implements PointforecastPackage {
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
	private EClass forecastTimeStepsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forecastTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatCfgTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productIDTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatWithNewUndefSignEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatWithNewUndefSignMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatWithNewUndefSignMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatWithNewUndefSignMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType productIDTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType undefCharEDataType = null;

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
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PointforecastPackageImpl() {
		super(eNS_URI, PointforecastFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PointforecastPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PointforecastPackage init() {
		if (isInited) return (PointforecastPackage)EPackage.Registry.INSTANCE.getEPackage(PointforecastPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPointforecastPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PointforecastPackageImpl thePointforecastPackage = registeredPointforecastPackage instanceof PointforecastPackageImpl ? (PointforecastPackageImpl)registeredPointforecastPackage : new PointforecastPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePointforecastPackage.createPackageContents();

		// Initialize created meta-data
		thePointforecastPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePointforecastPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return PointforecastValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePointforecastPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PointforecastPackage.eNS_URI, thePointforecastPackage);
		return thePointforecastPackage;
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
	public EReference getDocumentRoot_Forecast() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ProductDefinition() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForecastTimeStepsType() {
		return forecastTimeStepsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForecastTimeStepsType_TimeStep() {
		return (EAttribute)forecastTimeStepsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForecastType() {
		return forecastTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForecastType_Value() {
		return (EReference)forecastTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForecastType_ElementName() {
		return (EAttribute)forecastTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormatCfgType() {
		return formatCfgTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormatCfgType_DefaultUndefSign() {
		return (EAttribute)formatCfgTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelType() {
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelType_Name() {
		return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelType_ReferenceTime() {
		return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductDefinitionType() {
		return productDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductDefinitionType_Issuer() {
		return (EAttribute)productDefinitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductDefinitionType_ProductID() {
		return (EAttribute)productDefinitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductDefinitionType_GeneratingProcess() {
		return (EAttribute)productDefinitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductDefinitionType_IssueTime() {
		return (EAttribute)productDefinitionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductDefinitionType_ReferencedModel() {
		return (EReference)productDefinitionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductDefinitionType_ForecastTimeSteps() {
		return (EReference)productDefinitionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductDefinitionType_FormatCfg() {
		return (EReference)productDefinitionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductDefinitionType_MetElementDefinition() {
		return (EAttribute)productDefinitionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferencedModelType() {
		return referencedModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferencedModelType_Model() {
		return (EReference)referencedModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueType_Value() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProductIDType() {
		return productIDTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFloatList() {
		return floatListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFloatWithNewUndefSign() {
		return floatWithNewUndefSignEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFloatWithNewUndefSignMember0() {
		return floatWithNewUndefSignMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFloatWithNewUndefSignMember0Object() {
		return floatWithNewUndefSignMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFloatWithNewUndefSignMember1() {
		return floatWithNewUndefSignMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProductIDTypeObject() {
		return productIDTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUndefChar() {
		return undefCharEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointforecastFactory getPointforecastFactory() {
		return (PointforecastFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FORECAST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PRODUCT_DEFINITION);

		forecastTimeStepsTypeEClass = createEClass(FORECAST_TIME_STEPS_TYPE);
		createEAttribute(forecastTimeStepsTypeEClass, FORECAST_TIME_STEPS_TYPE__TIME_STEP);

		forecastTypeEClass = createEClass(FORECAST_TYPE);
		createEReference(forecastTypeEClass, FORECAST_TYPE__VALUE);
		createEAttribute(forecastTypeEClass, FORECAST_TYPE__ELEMENT_NAME);

		formatCfgTypeEClass = createEClass(FORMAT_CFG_TYPE);
		createEAttribute(formatCfgTypeEClass, FORMAT_CFG_TYPE__DEFAULT_UNDEF_SIGN);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEAttribute(modelTypeEClass, MODEL_TYPE__NAME);
		createEAttribute(modelTypeEClass, MODEL_TYPE__REFERENCE_TIME);

		productDefinitionTypeEClass = createEClass(PRODUCT_DEFINITION_TYPE);
		createEAttribute(productDefinitionTypeEClass, PRODUCT_DEFINITION_TYPE__ISSUER);
		createEAttribute(productDefinitionTypeEClass, PRODUCT_DEFINITION_TYPE__PRODUCT_ID);
		createEAttribute(productDefinitionTypeEClass, PRODUCT_DEFINITION_TYPE__GENERATING_PROCESS);
		createEAttribute(productDefinitionTypeEClass, PRODUCT_DEFINITION_TYPE__ISSUE_TIME);
		createEReference(productDefinitionTypeEClass, PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL);
		createEReference(productDefinitionTypeEClass, PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS);
		createEReference(productDefinitionTypeEClass, PRODUCT_DEFINITION_TYPE__FORMAT_CFG);
		createEAttribute(productDefinitionTypeEClass, PRODUCT_DEFINITION_TYPE__MET_ELEMENT_DEFINITION);

		referencedModelTypeEClass = createEClass(REFERENCED_MODEL_TYPE);
		createEReference(referencedModelTypeEClass, REFERENCED_MODEL_TYPE__MODEL);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEAttribute(valueTypeEClass, VALUE_TYPE__VALUE);

		// Create enums
		productIDTypeEEnum = createEEnum(PRODUCT_ID_TYPE);

		// Create data types
		floatListEDataType = createEDataType(FLOAT_LIST);
		floatWithNewUndefSignEDataType = createEDataType(FLOAT_WITH_NEW_UNDEF_SIGN);
		floatWithNewUndefSignMember0EDataType = createEDataType(FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0);
		floatWithNewUndefSignMember0ObjectEDataType = createEDataType(FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0_OBJECT);
		floatWithNewUndefSignMember1EDataType = createEDataType(FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1);
		productIDTypeObjectEDataType = createEDataType(PRODUCT_ID_TYPE_OBJECT);
		undefCharEDataType = createEDataType(UNDEF_CHAR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Forecast(), this.getForecastType(), null, "forecast", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProductDefinition(), this.getProductDefinitionType(), null, "productDefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(forecastTimeStepsTypeEClass, ForecastTimeStepsType.class, "ForecastTimeStepsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForecastTimeStepsType_TimeStep(), theXMLTypePackage.getDateTime(), "timeStep", null, 0, -1, ForecastTimeStepsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forecastTypeEClass, ForecastType.class, "ForecastType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForecastType_Value(), this.getValueType(), null, "value", null, 1, 1, ForecastType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForecastType_ElementName(), theXMLTypePackage.getString(), "elementName", null, 0, 1, ForecastType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formatCfgTypeEClass, FormatCfgType.class, "FormatCfgType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormatCfgType_DefaultUndefSign(), this.getUndefChar(), "defaultUndefSign", "-", 1, 1, FormatCfgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelType_ReferenceTime(), theXMLTypePackage.getDateTime(), "referenceTime", null, 1, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productDefinitionTypeEClass, ProductDefinitionType.class, "ProductDefinitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductDefinitionType_Issuer(), theXMLTypePackage.getString(), "issuer", null, 1, 1, ProductDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductDefinitionType_ProductID(), this.getProductIDType(), "productID", null, 1, 1, ProductDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductDefinitionType_GeneratingProcess(), theXMLTypePackage.getString(), "generatingProcess", null, 1, 1, ProductDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductDefinitionType_IssueTime(), theXMLTypePackage.getDateTime(), "issueTime", null, 1, 1, ProductDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductDefinitionType_ReferencedModel(), this.getReferencedModelType(), null, "referencedModel", null, 1, 1, ProductDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductDefinitionType_ForecastTimeSteps(), this.getForecastTimeStepsType(), null, "forecastTimeSteps", null, 1, 1, ProductDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductDefinitionType_FormatCfg(), this.getFormatCfgType(), null, "formatCfg", null, 1, 1, ProductDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductDefinitionType_MetElementDefinition(), theXMLTypePackage.getAnyURI(), "metElementDefinition", "https://opendata.dwd.de/weather/lib/MetElementDefinition.xml", 1, 1, ProductDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencedModelTypeEClass, ReferencedModelType.class, "ReferencedModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencedModelType_Model(), this.getModelType(), null, "model", null, 0, -1, ReferencedModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueType_Value(), this.getFloatList(), "value", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(productIDTypeEEnum, ProductIDType.class, "ProductIDType");
		addEEnumLiteral(productIDTypeEEnum, ProductIDType.EZMOS);
		addEEnumLiteral(productIDTypeEEnum, ProductIDType.ICONMOS);
		addEEnumLiteral(productIDTypeEEnum, ProductIDType.MOSMIX);
		addEEnumLiteral(productIDTypeEEnum, ProductIDType.COSMODEEPSEMOS);
		addEEnumLiteral(productIDTypeEEnum, ProductIDType.MODELMIX);
		addEEnumLiteral(productIDTypeEEnum, ProductIDType.GPTMOS);
		addEEnumLiteral(productIDTypeEEnum, ProductIDType.ICONDMO);
		addEEnumLiteral(productIDTypeEEnum, ProductIDType.ICONNESTDMO);
		addEEnumLiteral(productIDTypeEEnum, ProductIDType.DMOPTP);

		// Initialize data types
		initEDataType(floatListEDataType, List.class, "FloatList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatWithNewUndefSignEDataType, Object.class, "FloatWithNewUndefSign", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatWithNewUndefSignMember0EDataType, float.class, "FloatWithNewUndefSignMember0", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatWithNewUndefSignMember0ObjectEDataType, Float.class, "FloatWithNewUndefSignMember0Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatWithNewUndefSignMember1EDataType, String.class, "FloatWithNewUndefSignMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(productIDTypeObjectEDataType, ProductIDType.class, "ProductIDTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(undefCharEDataType, String.class, "UndefChar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (getDocumentRoot_Forecast(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Forecast",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ProductDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProductDefinition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (floatListEDataType,
		   source,
		   new String[] {
			   "name", "floatList",
			   "itemType", "floatWithNewUndefSign"
		   });
		addAnnotation
		  (floatWithNewUndefSignEDataType,
		   source,
		   new String[] {
			   "name", "floatWithNewUndefSign",
			   "memberTypes", "floatWithNewUndefSign_._member_._0 floatWithNewUndefSign_._member_._1"
		   });
		addAnnotation
		  (floatWithNewUndefSignMember0EDataType,
		   source,
		   new String[] {
			   "name", "floatWithNewUndefSign_._member_._0",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#float"
		   });
		addAnnotation
		  (floatWithNewUndefSignMember0ObjectEDataType,
		   source,
		   new String[] {
			   "name", "floatWithNewUndefSign_._member_._0:Object",
			   "baseType", "floatWithNewUndefSign_._member_._0"
		   });
		addAnnotation
		  (floatWithNewUndefSignMember1EDataType,
		   source,
		   new String[] {
			   "name", "floatWithNewUndefSign_._member_._1",
			   "baseType", "UndefChar"
		   });
		addAnnotation
		  (forecastTimeStepsTypeEClass,
		   source,
		   new String[] {
			   "name", "ForecastTimeSteps_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getForecastTimeStepsType_TimeStep(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TimeStep",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (forecastTypeEClass,
		   source,
		   new String[] {
			   "name", "Forecast_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getForecastType_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForecastType_ElementName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "elementName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (formatCfgTypeEClass,
		   source,
		   new String[] {
			   "name", "FormatCfg_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFormatCfgType_DefaultUndefSign(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultUndefSign",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (modelTypeEClass,
		   source,
		   new String[] {
			   "name", "Model_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getModelType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getModelType_ReferenceTime(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "referenceTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (productDefinitionTypeEClass,
		   source,
		   new String[] {
			   "name", "ProductDefinition_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProductDefinitionType_Issuer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Issuer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProductDefinitionType_ProductID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProductID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProductDefinitionType_GeneratingProcess(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GeneratingProcess",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProductDefinitionType_IssueTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IssueTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProductDefinitionType_ReferencedModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferencedModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProductDefinitionType_ForecastTimeSteps(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForecastTimeSteps",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProductDefinitionType_FormatCfg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FormatCfg",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProductDefinitionType_MetElementDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetElementDefinition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (productIDTypeEEnum,
		   source,
		   new String[] {
			   "name", "ProductID_._type"
		   });
		addAnnotation
		  (productIDTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ProductID_._type:Object",
			   "baseType", "ProductID_._type"
		   });
		addAnnotation
		  (referencedModelTypeEClass,
		   source,
		   new String[] {
			   "name", "ReferencedModel_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReferencedModelType_Model(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Model",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (undefCharEDataType,
		   source,
		   new String[] {
			   "name", "UndefChar",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "length", "1"
		   });
		addAnnotation
		  (valueTypeEClass,
		   source,
		   new String[] {
			   "name", "value_._type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getValueType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
	}

} //PointforecastPackageImpl
