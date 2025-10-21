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
package de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl;

import de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.*;

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
public class BasisnachrichtUnqualifiedFactoryImpl extends EFactoryImpl implements BasisnachrichtUnqualifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisnachrichtUnqualifiedFactory init() {
		try {
			BasisnachrichtUnqualifiedFactory theBasisnachrichtUnqualifiedFactory = (BasisnachrichtUnqualifiedFactory)EPackage.Registry.INSTANCE.getEFactory(BasisnachrichtUnqualifiedPackage.eNS_URI);
			if (theBasisnachrichtUnqualifiedFactory != null) {
				return theBasisnachrichtUnqualifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasisnachrichtUnqualifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisnachrichtUnqualifiedFactoryImpl() {
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
			case BasisnachrichtUnqualifiedPackage.BEHOERDE_TYPE: return createBehoerdeType();
			case BasisnachrichtUnqualifiedPackage.CODE_KOMMUNIKATION_KANAL_TYPE: return createCodeKommunikationKanalType();
			case BasisnachrichtUnqualifiedPackage.CODE_VERZEICHNISDIENST_TYPE: return createCodeVerzeichnisdienstType();
			case BasisnachrichtUnqualifiedPackage.IDENTIFIKATION_NACHRICHT_TYPE: return createIdentifikationNachrichtType();
			case BasisnachrichtUnqualifiedPackage.KOMMUNIKATION_TYPE: return createKommunikationType();
			case BasisnachrichtUnqualifiedPackage.NACHRICHTENKOPF_G2G_TYPE: return createNachrichtenkopfG2GType();
			case BasisnachrichtUnqualifiedPackage.NACHRICHT_G2G_TYPE: return createNachrichtG2GType();
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
			case BasisnachrichtUnqualifiedPackage.UUID:
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
			case BasisnachrichtUnqualifiedPackage.UUID:
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
	public BasisnachrichtUnqualifiedPackage getBasisnachrichtUnqualifiedPackage() {
		return (BasisnachrichtUnqualifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasisnachrichtUnqualifiedPackage getPackage() {
		return BasisnachrichtUnqualifiedPackage.eINSTANCE;
	}

} //BasisnachrichtUnqualifiedFactoryImpl
