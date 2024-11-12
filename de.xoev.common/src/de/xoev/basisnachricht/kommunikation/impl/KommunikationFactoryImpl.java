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
package de.xoev.basisnachricht.kommunikation.impl;

import de.xoev.basisnachricht.kommunikation.*;

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
public class KommunikationFactoryImpl extends EFactoryImpl implements KommunikationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KommunikationFactory init() {
		try {
			KommunikationFactory theKommunikationFactory = (KommunikationFactory)EPackage.Registry.INSTANCE.getEFactory(KommunikationPackage.eNS_URI);
			if (theKommunikationFactory != null) {
				return theKommunikationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KommunikationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KommunikationFactoryImpl() {
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
			case KommunikationPackage.CODE_KOMMUNIKATION_KANAL_TYPE: return createCodeKommunikationKanalType();
			case KommunikationPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case KommunikationPackage.KOMMUNIKATION_TYPE: return createKommunikationType();
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
	public CodeKommunikationKanalType createCodeKommunikationKanalType() {
		CodeKommunikationKanalTypeImpl codeKommunikationKanalType = new CodeKommunikationKanalTypeImpl();
		return codeKommunikationKanalType;
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
	public KommunikationType createKommunikationType() {
		KommunikationTypeImpl kommunikationType = new KommunikationTypeImpl();
		return kommunikationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KommunikationPackage getKommunikationPackage() {
		return (KommunikationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KommunikationPackage getPackage() {
		return KommunikationPackage.eINSTANCE;
	}

} //KommunikationFactoryImpl
