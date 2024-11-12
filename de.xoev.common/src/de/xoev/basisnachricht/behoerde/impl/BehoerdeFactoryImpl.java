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
package de.xoev.basisnachricht.behoerde.impl;

import de.xoev.basisnachricht.behoerde.*;

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
public class BehoerdeFactoryImpl extends EFactoryImpl implements BehoerdeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehoerdeFactory init() {
		try {
			BehoerdeFactory theBehoerdeFactory = (BehoerdeFactory)EPackage.Registry.INSTANCE.getEFactory(BehoerdePackage.eNS_URI);
			if (theBehoerdeFactory != null) {
				return theBehoerdeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehoerdeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehoerdeFactoryImpl() {
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
			case BehoerdePackage.BEHOERDE_TYPE: return createBehoerdeType();
			case BehoerdePackage.CODE_VERZEICHNISDIENST_TYPE: return createCodeVerzeichnisdienstType();
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
	public BehoerdeType createBehoerdeType() {
		BehoerdeTypeImpl behoerdeType = new BehoerdeTypeImpl();
		return behoerdeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVerzeichnisdienstType createCodeVerzeichnisdienstType() {
		CodeVerzeichnisdienstTypeImpl codeVerzeichnisdienstType = new CodeVerzeichnisdienstTypeImpl();
		return codeVerzeichnisdienstType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdePackage getBehoerdePackage() {
		return (BehoerdePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehoerdePackage getPackage() {
		return BehoerdePackage.eINSTANCE;
	}

} //BehoerdeFactoryImpl
