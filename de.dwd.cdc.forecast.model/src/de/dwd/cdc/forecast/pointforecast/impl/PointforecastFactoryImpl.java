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

import de.dwd.cdc.forecast.pointforecast.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PointforecastFactoryImpl extends EFactoryImpl implements PointforecastFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PointforecastFactory init() {
		try {
			PointforecastFactory thePointforecastFactory = (PointforecastFactory)EPackage.Registry.INSTANCE.getEFactory(PointforecastPackage.eNS_URI);
			if (thePointforecastFactory != null) {
				return thePointforecastFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PointforecastFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointforecastFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PointforecastPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case PointforecastPackage.FORECAST_TIME_STEPS_TYPE: return createForecastTimeStepsType();
			case PointforecastPackage.FORECAST_TYPE: return createForecastType();
			case PointforecastPackage.FORMAT_CFG_TYPE: return createFormatCfgType();
			case PointforecastPackage.MODEL_TYPE: return createModelType();
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE: return createProductDefinitionType();
			case PointforecastPackage.REFERENCED_MODEL_TYPE: return createReferencedModelType();
			case PointforecastPackage.VALUE_TYPE: return createValueType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PointforecastPackage.PRODUCT_ID_TYPE:
				return createProductIDTypeFromString(eDataType, initialValue);
			case PointforecastPackage.FLOAT_LIST:
				return createFloatListFromString(eDataType, initialValue);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN:
				return createFloatWithNewUndefSignFromString(eDataType, initialValue);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0:
				return createFloatWithNewUndefSignMember0FromString(eDataType, initialValue);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0_OBJECT:
				return createFloatWithNewUndefSignMember0ObjectFromString(eDataType, initialValue);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1:
				return createFloatWithNewUndefSignMember1FromString(eDataType, initialValue);
			case PointforecastPackage.PRODUCT_ID_TYPE_OBJECT:
				return createProductIDTypeObjectFromString(eDataType, initialValue);
			case PointforecastPackage.UNDEF_CHAR:
				return createUndefCharFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PointforecastPackage.PRODUCT_ID_TYPE:
				return convertProductIDTypeToString(eDataType, instanceValue);
			case PointforecastPackage.FLOAT_LIST:
				return convertFloatListToString(eDataType, instanceValue);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN:
				return convertFloatWithNewUndefSignToString(eDataType, instanceValue);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0:
				return convertFloatWithNewUndefSignMember0ToString(eDataType, instanceValue);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0_OBJECT:
				return convertFloatWithNewUndefSignMember0ObjectToString(eDataType, instanceValue);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1:
				return convertFloatWithNewUndefSignMember1ToString(eDataType, instanceValue);
			case PointforecastPackage.PRODUCT_ID_TYPE_OBJECT:
				return convertProductIDTypeObjectToString(eDataType, instanceValue);
			case PointforecastPackage.UNDEF_CHAR:
				return convertUndefCharToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForecastTimeStepsType createForecastTimeStepsType() {
		ForecastTimeStepsTypeImpl forecastTimeStepsType = new ForecastTimeStepsTypeImpl();
		return forecastTimeStepsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForecastType createForecastType() {
		ForecastTypeImpl forecastType = new ForecastTypeImpl();
		return forecastType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormatCfgType createFormatCfgType() {
		FormatCfgTypeImpl formatCfgType = new FormatCfgTypeImpl();
		return formatCfgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductDefinitionType createProductDefinitionType() {
		ProductDefinitionTypeImpl productDefinitionType = new ProductDefinitionTypeImpl();
		return productDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencedModelType createReferencedModelType() {
		ReferencedModelTypeImpl referencedModelType = new ReferencedModelTypeImpl();
		return referencedModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductIDType createProductIDTypeFromString(EDataType eDataType, String initialValue) {
		ProductIDType result = ProductIDType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductIDTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createFloatListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createFloatWithNewUndefSignFromString(PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertFloatWithNewUndefSignToString(PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFloatWithNewUndefSignFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createFloatWithNewUndefSignMember0FromString(PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFloatWithNewUndefSignMember1FromString(PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatWithNewUndefSignToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertFloatWithNewUndefSignMember0ToString(PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertFloatWithNewUndefSignMember1ToString(PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatWithNewUndefSignMember0FromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatWithNewUndefSignMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatWithNewUndefSignMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createFloatWithNewUndefSignMember0FromString(PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatWithNewUndefSignMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFloatWithNewUndefSignMember0ToString(PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFloatWithNewUndefSignMember1FromString(EDataType eDataType, String initialValue) {
		return createUndefCharFromString(PointforecastPackage.Literals.UNDEF_CHAR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatWithNewUndefSignMember1ToString(EDataType eDataType, Object instanceValue) {
		return convertUndefCharToString(PointforecastPackage.Literals.UNDEF_CHAR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductIDType createProductIDTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProductIDTypeFromString(PointforecastPackage.Literals.PRODUCT_ID_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductIDTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProductIDTypeToString(PointforecastPackage.Literals.PRODUCT_ID_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUndefCharFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUndefCharToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointforecastPackage getPointforecastPackage() {
		return (PointforecastPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PointforecastPackage getPackage() {
		return PointforecastPackage.eINSTANCE;
	}

} //PointforecastFactoryImpl
