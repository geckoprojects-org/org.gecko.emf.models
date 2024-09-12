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
package de.dwd.cdc.metelements.impl;

import de.dwd.cdc.metelements.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetElementsFactoryImpl extends EFactoryImpl implements MetElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetElementsFactory init() {
		try {
			MetElementsFactory theMetElementsFactory = (MetElementsFactory)EPackage.Registry.INSTANCE.getEFactory(MetElementsPackage.eNS_URI);
			if (theMetElementsFactory != null) {
				return theMetElementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetElementsFactoryImpl() {
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
			case MetElementsPackage.MET_DEF_ROOT: return createMetDefRoot();
			case MetElementsPackage.MET_ELEMENT_DEFINITION_TYPE: return createMetElementDefinitionType();
			case MetElementsPackage.MET_ELEMENT_TYPE: return createMetElementType();
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
	public MetDefRoot createMetDefRoot() {
		MetDefRootImpl metDefRoot = new MetDefRootImpl();
		return metDefRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetElementDefinitionType createMetElementDefinitionType() {
		MetElementDefinitionTypeImpl metElementDefinitionType = new MetElementDefinitionTypeImpl();
		return metElementDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetElementType createMetElementType() {
		MetElementTypeImpl metElementType = new MetElementTypeImpl();
		return metElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetElementsPackage getMetElementsPackage() {
		return (MetElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetElementsPackage getPackage() {
		return MetElementsPackage.eINSTANCE;
	}

} //MetElementsFactoryImpl
