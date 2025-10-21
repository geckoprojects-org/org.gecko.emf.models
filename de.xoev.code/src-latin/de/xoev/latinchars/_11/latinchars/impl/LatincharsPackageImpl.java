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
package de.xoev.latinchars._11.latinchars.impl;

import de.xoev.latinchars._11.latinchars.LatincharsFactory;
import de.xoev.latinchars._11.latinchars.LatincharsPackage;

import de.xoev.latinchars._11.latinchars.util.LatincharsValidator;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LatincharsPackageImpl extends EPackageImpl implements LatincharsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringLatinEDataType = null;

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
	 * @see de.xoev.latinchars._11.latinchars.LatincharsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LatincharsPackageImpl() {
		super(eNS_URI, LatincharsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LatincharsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LatincharsPackage init() {
		if (isInited) return (LatincharsPackage)EPackage.Registry.INSTANCE.getEPackage(LatincharsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLatincharsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LatincharsPackageImpl theLatincharsPackage = registeredLatincharsPackage instanceof LatincharsPackageImpl ? (LatincharsPackageImpl)registeredLatincharsPackage : new LatincharsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLatincharsPackage.createPackageContents();

		// Initialize created meta-data
		theLatincharsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLatincharsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return LatincharsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLatincharsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LatincharsPackage.eNS_URI, theLatincharsPackage);
		return theLatincharsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStringLatin() {
		return stringLatinEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatincharsFactory getLatincharsFactory() {
		return (LatincharsFactory)getEFactoryInstance();
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

		// Create data types
		stringLatinEDataType = createEDataType(STRING_LATIN);
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

		// Initialize data types
		initEDataType(stringLatinEDataType, String.class, "StringLatin", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (stringLatinEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <datentyp>\n                   \n    <nameLang>X\u00d6V-Datentyp String.Latin</nameLang>\n                   \n    <nameKurz>String.Latin</nameKurz>\n                   \n    <nameTechnisch>String.Latin</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:xoev:datentyp:string.latin</kennung>\n                   \n    <externeWebsite>http://www.xoev.de/de/stringlatin</externeWebsite>\n                \n  </datentyp>\n              \n  <versionDatentyp>\n                   \n    <version>1.1.1</version>\n                   \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                   \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                   \n    <aenderungZurVorversion>Die Versionshistorie des X\u00d6V-Datentyps String.Latin kann in der Dokumentation des zugrundeliegenden Standards eingesehen werden (Lateinische Zeichen in Unicode, http://www.xoev.de/de/einheitlicherzeichensatz).</aenderungZurVorversion>\n                \n  </versionDatentyp>\n           \n"
		   });
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
		  (stringLatinEDataType,
		   source,
		   new String[] {
			   "name", "String.Latin",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "(([\t-\n\r%20-~\u00a1-\u00ac\u00ae-\u0107\u010a-\u011b\u011e-\u0123\u0126-\u0131\u0134-\u015b\u015e-\u016b\u016e-\u017e\u018f\u01a0-\u01a1\u01af-\u01b0\u01b7\u01cd-\u01d4\u01de-\u01df\u01e4-\u01f0\u01f4-\u01f5\u01fa-\u01ff\u0218-\u021b\u021e-\u021f\u022a-\u022b\u022e-\u0233\u0259\u0292\u1e02-\u1e03\u1e0a-\u1e0b\u1e10-\u1e11\u1e1e-\u1e21\u1e24-\u1e27\u1e30-\u1e31\u1e40-\u1e41\u1e44-\u1e45\u1e56-\u1e57\u1e60-\u1e63\u1e6a-\u1e6b\u1e80-\u1e85\u1e8c-\u1e93\u1e9e\u1ea0-\u1ea7\u1eaa-\u1eac\u1eae-\u1ec1\u1ec4-\u1ed3\u1ed6-\u1edd\u1ee4-\u1ef9\u20ac])|(M\u0302|N\u0302|m\u0302|n\u0302|D\u0302|d\u0302|J\u030c|L\u0302|l\u0302))*"
		   });
	}

} //LatincharsPackageImpl
