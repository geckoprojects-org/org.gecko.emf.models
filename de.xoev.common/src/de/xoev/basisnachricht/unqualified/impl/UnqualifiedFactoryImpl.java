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
package de.xoev.basisnachricht.unqualified.impl;

import de.xoev.basisnachricht.unqualified.*;

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
public class UnqualifiedFactoryImpl extends EFactoryImpl implements UnqualifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnqualifiedFactory init() {
		try {
			UnqualifiedFactory theUnqualifiedFactory = (UnqualifiedFactory)EPackage.Registry.INSTANCE.getEFactory(UnqualifiedPackage.eNS_URI);
			if (theUnqualifiedFactory != null) {
				return theUnqualifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnqualifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnqualifiedFactoryImpl() {
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
			case UnqualifiedPackage.BEHOERDE_TYPE: return createBehoerdeType();
			case UnqualifiedPackage.CODE_KOMMUNIKATION_KANAL_TYPE: return createCodeKommunikationKanalType();
			case UnqualifiedPackage.CODE_VERZEICHNISDIENST_TYPE: return createCodeVerzeichnisdienstType();
			case UnqualifiedPackage.IDENTIFIKATION_NACHRICHT_TYPE: return createIdentifikationNachrichtType();
			case UnqualifiedPackage.KOMMUNIKATION_TYPE: return createKommunikationType();
			case UnqualifiedPackage.NACHRICHTENKOPF_G2G_TYPE: return createNachrichtenkopfG2GType();
			case UnqualifiedPackage.NACHRICHT_G2G_TYPE: return createNachrichtG2GType();
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
			case UnqualifiedPackage.UUID:
				return createUUIDFromString(eDataType, initialValue);
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
			case UnqualifiedPackage.UUID:
				return convertUUIDToString(eDataType, instanceValue);
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
	public IdentifikationNachrichtType createIdentifikationNachrichtType() {
		IdentifikationNachrichtTypeImpl identifikationNachrichtType = new IdentifikationNachrichtTypeImpl();
		return identifikationNachrichtType;
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
	public NachrichtenkopfG2GType createNachrichtenkopfG2GType() {
		NachrichtenkopfG2GTypeImpl nachrichtenkopfG2GType = new NachrichtenkopfG2GTypeImpl();
		return nachrichtenkopfG2GType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachrichtG2GType createNachrichtG2GType() {
		NachrichtG2GTypeImpl nachrichtG2GType = new NachrichtG2GTypeImpl();
		return nachrichtG2GType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUUIDFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUUIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnqualifiedPackage getUnqualifiedPackage() {
		return (UnqualifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnqualifiedPackage getPackage() {
		return UnqualifiedPackage.eINSTANCE;
	}

} //UnqualifiedFactoryImpl
