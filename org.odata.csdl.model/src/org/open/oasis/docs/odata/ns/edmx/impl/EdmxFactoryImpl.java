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
package org.open.oasis.docs.odata.ns.edmx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.open.oasis.docs.odata.ns.edmx.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdmxFactoryImpl extends EFactoryImpl implements EdmxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdmxFactory init() {
		try {
			EdmxFactory theEdmxFactory = (EdmxFactory)EPackage.Registry.INSTANCE.getEFactory(EdmxPackage.eNS_URI);
			if (theEdmxFactory != null) {
				return theEdmxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdmxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmxFactoryImpl() {
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
			case EdmxPackage.EDMX_ROOT: return createEdmxRoot();
			case EdmxPackage.TDATA_SERVICES: return createTDataServices();
			case EdmxPackage.TEDMX: return createTEdmx();
			case EdmxPackage.TINCLUDE: return createTInclude();
			case EdmxPackage.TINCLUDE_ANNOTATIONS: return createTIncludeAnnotations();
			case EdmxPackage.TREFERENCE: return createTReference();
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
			case EdmxPackage.TVERSION:
				return createTVersionFromString(eDataType, initialValue);
			case EdmxPackage.TVERSION_OBJECT:
				return createTVersionObjectFromString(eDataType, initialValue);
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
			case EdmxPackage.TVERSION:
				return convertTVersionToString(eDataType, instanceValue);
			case EdmxPackage.TVERSION_OBJECT:
				return convertTVersionObjectToString(eDataType, instanceValue);
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
	public EdmxRoot createEdmxRoot() {
		EdmxRootImpl edmxRoot = new EdmxRootImpl();
		return edmxRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataServices createTDataServices() {
		TDataServicesImpl tDataServices = new TDataServicesImpl();
		return tDataServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEdmx createTEdmx() {
		TEdmxImpl tEdmx = new TEdmxImpl();
		return tEdmx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInclude createTInclude() {
		TIncludeImpl tInclude = new TIncludeImpl();
		return tInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIncludeAnnotations createTIncludeAnnotations() {
		TIncludeAnnotationsImpl tIncludeAnnotations = new TIncludeAnnotationsImpl();
		return tIncludeAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TReference createTReference() {
		TReferenceImpl tReference = new TReferenceImpl();
		return tReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVersion createTVersionFromString(EDataType eDataType, String initialValue) {
		TVersion result = TVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVersion createTVersionObjectFromString(EDataType eDataType, String initialValue) {
		return createTVersionFromString(EdmxPackage.Literals.TVERSION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTVersionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTVersionToString(EdmxPackage.Literals.TVERSION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdmxPackage getEdmxPackage() {
		return (EdmxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdmxPackage getPackage() {
		return EdmxPackage.eINSTANCE;
	}

} //EdmxFactoryImpl
