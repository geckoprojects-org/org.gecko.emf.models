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
package de.xoev.schemata.basisnachricht.kommunikation.basiskom.impl;

import de.xoev.schemata.basisnachricht.kommunikation.basiskom.*;

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
public class BasisKommunikationFactoryImpl extends EFactoryImpl implements BasisKommunikationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisKommunikationFactory init() {
		try {
			BasisKommunikationFactory theBasisKommunikationFactory = (BasisKommunikationFactory)EPackage.Registry.INSTANCE.getEFactory(BasisKommunikationPackage.eNS_URI);
			if (theBasisKommunikationFactory != null) {
				return theBasisKommunikationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasisKommunikationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisKommunikationFactoryImpl() {
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
			case BasisKommunikationPackage.CODE_KOMMUNIKATION_KANAL_TYPE: return createCodeKommunikationKanalType();
			case BasisKommunikationPackage.KOMMUNIKATION_TYPE: return createKommunikationType();
			case BasisKommunikationPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
	public BasisKommunikationPackage getBasisKommunikationPackage() {
		return (BasisKommunikationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasisKommunikationPackage getPackage() {
		return BasisKommunikationPackage.eINSTANCE;
	}

} //BasisKommunikationFactoryImpl
