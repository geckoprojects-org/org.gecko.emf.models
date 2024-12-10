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
package ee.jakarta.xml.ns.persistence.impl;

import ee.jakarta.xml.ns.persistence.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceFactoryImpl extends EFactoryImpl implements PersistenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersistenceFactory init() {
		try {
			PersistenceFactory thePersistenceFactory = (PersistenceFactory)EPackage.Registry.INSTANCE.getEFactory(PersistencePackage.eNS_URI);
			if (thePersistenceFactory != null) {
				return thePersistenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PersistenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactoryImpl() {
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
			case PersistencePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case PersistencePackage.PERSISTENCE_TYPE: return createPersistenceType();
			case PersistencePackage.PERSISTENCE_UNIT_TYPE: return createPersistenceUnitType();
			case PersistencePackage.PROPERTIES_TYPE: return createPropertiesType();
			case PersistencePackage.PROPERTY_TYPE: return createPropertyType();
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
			case PersistencePackage.PERSISTENCE_UNIT_CACHING_TYPE:
				return createPersistenceUnitCachingTypeFromString(eDataType, initialValue);
			case PersistencePackage.PERSISTENCE_UNIT_TRANSACTION_TYPE:
				return createPersistenceUnitTransactionTypeFromString(eDataType, initialValue);
			case PersistencePackage.PERSISTENCE_UNIT_VALIDATION_MODE_TYPE:
				return createPersistenceUnitValidationModeTypeFromString(eDataType, initialValue);
			case PersistencePackage.PERSISTENCE_UNIT_CACHING_TYPE_OBJECT:
				return createPersistenceUnitCachingTypeObjectFromString(eDataType, initialValue);
			case PersistencePackage.PERSISTENCE_UNIT_TRANSACTION_TYPE_OBJECT:
				return createPersistenceUnitTransactionTypeObjectFromString(eDataType, initialValue);
			case PersistencePackage.PERSISTENCE_UNIT_VALIDATION_MODE_TYPE_OBJECT:
				return createPersistenceUnitValidationModeTypeObjectFromString(eDataType, initialValue);
			case PersistencePackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
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
			case PersistencePackage.PERSISTENCE_UNIT_CACHING_TYPE:
				return convertPersistenceUnitCachingTypeToString(eDataType, instanceValue);
			case PersistencePackage.PERSISTENCE_UNIT_TRANSACTION_TYPE:
				return convertPersistenceUnitTransactionTypeToString(eDataType, instanceValue);
			case PersistencePackage.PERSISTENCE_UNIT_VALIDATION_MODE_TYPE:
				return convertPersistenceUnitValidationModeTypeToString(eDataType, instanceValue);
			case PersistencePackage.PERSISTENCE_UNIT_CACHING_TYPE_OBJECT:
				return convertPersistenceUnitCachingTypeObjectToString(eDataType, instanceValue);
			case PersistencePackage.PERSISTENCE_UNIT_TRANSACTION_TYPE_OBJECT:
				return convertPersistenceUnitTransactionTypeObjectToString(eDataType, instanceValue);
			case PersistencePackage.PERSISTENCE_UNIT_VALIDATION_MODE_TYPE_OBJECT:
				return convertPersistenceUnitValidationModeTypeObjectToString(eDataType, instanceValue);
			case PersistencePackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
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
	public PersistenceType createPersistenceType() {
		PersistenceTypeImpl persistenceType = new PersistenceTypeImpl();
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistenceUnitType createPersistenceUnitType() {
		PersistenceUnitTypeImpl persistenceUnitType = new PersistenceUnitTypeImpl();
		return persistenceUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitCachingType createPersistenceUnitCachingTypeFromString(EDataType eDataType, String initialValue) {
		PersistenceUnitCachingType result = PersistenceUnitCachingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceUnitCachingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitTransactionType createPersistenceUnitTransactionTypeFromString(EDataType eDataType, String initialValue) {
		PersistenceUnitTransactionType result = PersistenceUnitTransactionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceUnitTransactionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitValidationModeType createPersistenceUnitValidationModeTypeFromString(EDataType eDataType, String initialValue) {
		PersistenceUnitValidationModeType result = PersistenceUnitValidationModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceUnitValidationModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitCachingType createPersistenceUnitCachingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPersistenceUnitCachingTypeFromString(PersistencePackage.Literals.PERSISTENCE_UNIT_CACHING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceUnitCachingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceUnitCachingTypeToString(PersistencePackage.Literals.PERSISTENCE_UNIT_CACHING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitTransactionType createPersistenceUnitTransactionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPersistenceUnitTransactionTypeFromString(PersistencePackage.Literals.PERSISTENCE_UNIT_TRANSACTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceUnitTransactionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceUnitTransactionTypeToString(PersistencePackage.Literals.PERSISTENCE_UNIT_TRANSACTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitValidationModeType createPersistenceUnitValidationModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPersistenceUnitValidationModeTypeFromString(PersistencePackage.Literals.PERSISTENCE_UNIT_VALIDATION_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceUnitValidationModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceUnitValidationModeTypeToString(PersistencePackage.Literals.PERSISTENCE_UNIT_VALIDATION_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistencePackage getPersistencePackage() {
		return (PersistencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PersistencePackage getPackage() {
		return PersistencePackage.eINSTANCE;
	}

} //PersistenceFactoryImpl
