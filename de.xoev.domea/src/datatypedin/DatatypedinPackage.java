/*
 */
package datatypedin;


import org.eclipse.emf.ecore.EDataType;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Diese Schema-Datei enthält die technische Repräsentation der in der Norm DIN 91379 definierten Datentypen.
 * <!-- end-model-doc -->
 * @see datatypedin.DatatypedinFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DatatypedinPackage.eNS_URI, genModel = "/model/xdomea.genmodel", genModelSourceLocations = {"model/xdomea.genmodel","de.xoev.domea/model/xdomea.genmodel"}, ecore="/model/datatype-din.ecore", ecoreSourceLocations="/model/datatype-din.ecore")
public interface DatatypedinPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypedin";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatypedin";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypedinPackage eINSTANCE = datatypedin.impl.DatatypedinPackageImpl.init();

	/**
	 * The meta object id for the '<em>Datatype A</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeA()
	 * @generated
	 */
	int DATATYPE_A = 0;

	/**
	 * The meta object id for the '<em>Datatype B</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeB()
	 * @generated
	 */
	int DATATYPE_B = 1;

	/**
	 * The meta object id for the '<em>Datatype C</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeC()
	 * @generated
	 */
	int DATATYPE_C = 2;

	/**
	 * The meta object id for the '<em>Datatype D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeD()
	 * @generated
	 */
	int DATATYPE_D = 3;

	/**
	 * The meta object id for the '<em>Datatype E</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeE()
	 * @generated
	 */
	int DATATYPE_E = 4;


	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Datentyp A gibt wieder, welche Schriftzeichen für Namen natürlicher Personen verwendet werden sollten.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype A</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeA' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(%20|\'|[,-\\.]|[A-Z]|[`-z]|~|\250|\264|\267|[\300-\326]|[\330-\366]|[\370-\u017e]|[\u0187-\u0188]|\u018f|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c8|\u02cc|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|\u2019|\u2021|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\307\u0306|\333\u0304|\347\u0306|\373\u0304|\377\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*'"
	 * @generated
	 */
	EDataType getDatatypeA();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Datentyp B wurde vor allem für sonstige Namen, wie z. B. Ortsnamen und Straßennamen mit Hausnummer, entworfen.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype B</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeB' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([%20-~]|[\241-\243]|\245|[\247-\254]|[\256-\267]|[\271-\273]|[\277-\u017e]|[\u0187-\u0188]|\u018f|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c8|\u02cc|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|\u2019|\u2021|\u20ac|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\307\u0306|\333\u0304|\347\u0306|\373\u0304|\377\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*'"
	 * @generated
	 */
	EDataType getDatatypeB();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Datentyp C wurde für alle normativen Schriftzeichen der DIN-Norm entworfen. Er ist somit die technische Umsetzung der Schnittstellenvereinbarung Alle nach Norm DIN 91379 normativen Schriftzeichen. Texte mit griechischen oder kyrillischen Buchstaben oder mit erweiterten (nicht-normativen) Nicht-Buchstaben sind unzulässig.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype C</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeC' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDatatypeC();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dieser Datentyp kann nur von solchen IT-Verfahren unterstützt werden, die auch die nicht-normativen Schriftzeichen der Norm DIN 91379 unterstützen. Der Datentyp D wurde vor allem für Namen juristischer Personen und für Produktnamen entworfen.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype D</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeD' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([%20-~]|[\241-\254]|[\256-\u017e]|[\u0187-\u0188]|\u018f|\u0192|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|\u02b0|\u02b3|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c6|\u02c8|\u02cc|\u02dc|\u02e2|\u0386|[\u0388-\u038a]|\u038c|[\u038e-\u03a1]|[\u03a3-\u03ce]|\u1d48|\u1d57|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|[\u2018-\u201a]|[\u201c-\u201e]|[\u2020-\u2021]|\u2026|\u2030|[\u2032-\u2033]|[\u2039-\u203a]|\u2070|[\u2074-\u2079]|[\u207f-\u2089]|\u20ac|\u2122|\u221e|[\u2264-\u2265]|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\307\u0306|\333\u0304|\347\u0306|\373\u0304|\377\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*'"
	 * @generated
	 */
	EDataType getDatatypeD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dieser Datentyp kann nur von solchen IT-Verfahren unterstützt werden, die auch die nicht-normativen Schriftzeichen der Norm DIN 91379 unterstützen. Der Datentyp E wurde für alle normativen und erweiterten Schriftzeichen der DIN-Norm entworfen. Ein Einsatzgebiet dieses Datentyps kann der grenzüberschreitende Datenaustausch sein, wenn auch griechische und kyrillische Buchstaben benötigt werden. Er ist somit die technische Umsetzung der Schnittstellenvereinbarung Alle nach Norm DIN 91379 normativen und nicht-normativen Schriftzeichen. Texte mit Buchstaben oder Nicht-Buchstaben, die in der DIN-Norm nicht enthalten sind, wie z. B. asiatische oder arabische Buchstaben, sind unzulässig.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype E</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeE' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDatatypeE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypedinFactory getDatatypedinFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>Datatype A</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeA()
		 * @generated
		 */
		EDataType DATATYPE_A = eINSTANCE.getDatatypeA();

		/**
		 * The meta object literal for the '<em>Datatype B</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeB()
		 * @generated
		 */
		EDataType DATATYPE_B = eINSTANCE.getDatatypeB();

		/**
		 * The meta object literal for the '<em>Datatype C</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeC()
		 * @generated
		 */
		EDataType DATATYPE_C = eINSTANCE.getDatatypeC();

		/**
		 * The meta object literal for the '<em>Datatype D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeD()
		 * @generated
		 */
		EDataType DATATYPE_D = eINSTANCE.getDatatypeD();

		/**
		 * The meta object literal for the '<em>Datatype E</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see datatypedin.impl.DatatypedinPackageImpl#getDatatypeE()
		 * @generated
		 */
		EDataType DATATYPE_E = eINSTANCE.getDatatypeE();

	}

} //DatatypedinPackage
