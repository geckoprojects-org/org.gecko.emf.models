/*
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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;


import de.xoev.schemata.code.code.Code10Package;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = UnterhaltsvorschussPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/unterhaltsvorschuss.ecore", ecoreSourceLocations="/model/unterhaltsvorschuss.ecore")
public interface UnterhaltsvorschussPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unterhaltsvorschuss";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/unterhaltsvorschussantrag/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unterhaltsvorschuss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnterhaltsvorschussPackage eINSTANCE = de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AmtspflegendeTypeImpl <em>Amtspflegende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AmtspflegendeTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAmtspflegendeType()
	 * @generated
	 */
	int AMTSPFLEGENDE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMTSPFLEGENDE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anschrift Jugendamt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT = 1;

	/**
	 * The feature id for the '<em><b>Jugendamt EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMTSPFLEGENDE_TYPE__JUGENDAMT_EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMTSPFLEGENDE_TYPE__AKTENZEICHEN = 3;

	/**
	 * The feature id for the '<em><b>Beauftragt Geltungsmachung UVanspruch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMTSPFLEGENDE_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH = 4;

	/**
	 * The feature id for the '<em><b>Telefonnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMTSPFLEGENDE_TYPE__TELEFONNUMMER = 5;

	/**
	 * The number of structural features of the '<em>Amtspflegende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMTSPFLEGENDE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Amtspflegende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMTSPFLEGENDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AnderePersonTypeImpl <em>Andere Person Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AnderePersonTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAnderePersonType()
	 * @generated
	 */
	int ANDERE_PERSON_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_PERSON_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_PERSON_TYPE__ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_PERSON_TYPE__BEZEICHNUNG = 2;

	/**
	 * The number of structural features of the '<em>Andere Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_PERSON_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Andere Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_PERSON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl <em>Anderer Elternteil Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAndererElternteilBasisType()
	 * @generated
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__ANREDE = 2;

	/**
	 * The feature id for the '<em><b>Kindschaftsbeziehung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG = 3;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT = 4;

	/**
	 * The feature id for the '<em><b>Andere Regelmaessiger Aufenthaltort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT = 5;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT = 6;

	/**
	 * The feature id for the '<em><b>Zusammenlebend Mit Neuen Partner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER = 7;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT = 8;

	/**
	 * The feature id for the '<em><b>Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG = 9;

	/**
	 * The feature id for the '<em><b>Vermoegen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__VERMOEGEN = 10;

	/**
	 * The feature id for the '<em><b>Einkuenfte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__EINKUENFTE = 11;

	/**
	 * The feature id for the '<em><b>Sonstige Leistungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__SONSTIGE_LEISTUNGEN = 12;

	/**
	 * The feature id for the '<em><b>Traeger Krankenversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG = 13;

	/**
	 * The feature id for the '<em><b>Weitere Kinder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_KINDER = 14;

	/**
	 * The feature id for the '<em><b>Ausbildung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__AUSBILDUNG = 15;

	/**
	 * The feature id for the '<em><b>Leistungsfaehig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__LEISTUNGSFAEHIG = 16;

	/**
	 * The feature id for the '<em><b>Weitere Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN = 17;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT = 18;

	/**
	 * The number of structural features of the '<em>Anderer Elternteil Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Anderer Elternteil Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilTypeImpl <em>Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAndererElternteilType()
	 * @generated
	 */
	int ANDERER_ELTERNTEIL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__NAME = ANDERER_ELTERNTEIL_BASIS_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__GEBURT = ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT;

	/**
	 * The feature id for the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ANREDE = ANDERER_ELTERNTEIL_BASIS_TYPE__ANREDE;

	/**
	 * The feature id for the '<em><b>Kindschaftsbeziehung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__KINDSCHAFTSBEZIEHUNG = ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ANSCHRIFT = ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT;

	/**
	 * The feature id for the '<em><b>Andere Regelmaessiger Aufenthaltort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT = ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT = ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT;

	/**
	 * The feature id for the '<em><b>Zusammenlebend Mit Neuen Partner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER = ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT = ANDERER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT;

	/**
	 * The feature id for the '<em><b>Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__VERTRETUNG = ANDERER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG;

	/**
	 * The feature id for the '<em><b>Vermoegen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__VERMOEGEN = ANDERER_ELTERNTEIL_BASIS_TYPE__VERMOEGEN;

	/**
	 * The feature id for the '<em><b>Einkuenfte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__EINKUENFTE = ANDERER_ELTERNTEIL_BASIS_TYPE__EINKUENFTE;

	/**
	 * The feature id for the '<em><b>Sonstige Leistungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__SONSTIGE_LEISTUNGEN = ANDERER_ELTERNTEIL_BASIS_TYPE__SONSTIGE_LEISTUNGEN;

	/**
	 * The feature id for the '<em><b>Traeger Krankenversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__TRAEGER_KRANKENVERSICHERUNG = ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG;

	/**
	 * The feature id for the '<em><b>Weitere Kinder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__WEITERE_KINDER = ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_KINDER;

	/**
	 * The feature id for the '<em><b>Ausbildung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__AUSBILDUNG = ANDERER_ELTERNTEIL_BASIS_TYPE__AUSBILDUNG;

	/**
	 * The feature id for the '<em><b>Leistungsfaehig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__LEISTUNGSFAEHIG = ANDERER_ELTERNTEIL_BASIS_TYPE__LEISTUNGSFAEHIG;

	/**
	 * The feature id for the '<em><b>Weitere Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABEN = ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__GESCHLECHT = ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT;

	/**
	 * The number of structural features of the '<em>Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = ANDERER_ELTERNTEIL_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = ANDERER_ELTERNTEIL_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilUeberpruefungTypeImpl <em>Anderer Elternteil Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAndererElternteilUeberpruefungType()
	 * @generated
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__NAME = ANDERER_ELTERNTEIL_BASIS_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__GEBURT = ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT;

	/**
	 * The feature id for the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ANREDE = ANDERER_ELTERNTEIL_BASIS_TYPE__ANREDE;

	/**
	 * The feature id for the '<em><b>Kindschaftsbeziehung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__KINDSCHAFTSBEZIEHUNG = ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ANSCHRIFT = ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT;

	/**
	 * The feature id for the '<em><b>Andere Regelmaessiger Aufenthaltort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT = ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__STAATSANGEHOERIGKEIT = ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT;

	/**
	 * The feature id for the '<em><b>Zusammenlebend Mit Neuen Partner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER = ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ERREICHBARKEIT = ANDERER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT;

	/**
	 * The feature id for the '<em><b>Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__VERTRETUNG = ANDERER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG;

	/**
	 * The feature id for the '<em><b>Vermoegen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__VERMOEGEN = ANDERER_ELTERNTEIL_BASIS_TYPE__VERMOEGEN;

	/**
	 * The feature id for the '<em><b>Einkuenfte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__EINKUENFTE = ANDERER_ELTERNTEIL_BASIS_TYPE__EINKUENFTE;

	/**
	 * The feature id for the '<em><b>Sonstige Leistungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__SONSTIGE_LEISTUNGEN = ANDERER_ELTERNTEIL_BASIS_TYPE__SONSTIGE_LEISTUNGEN;

	/**
	 * The feature id for the '<em><b>Traeger Krankenversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__TRAEGER_KRANKENVERSICHERUNG = ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG;

	/**
	 * The feature id for the '<em><b>Weitere Kinder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__WEITERE_KINDER = ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_KINDER;

	/**
	 * The feature id for the '<em><b>Ausbildung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__AUSBILDUNG = ANDERER_ELTERNTEIL_BASIS_TYPE__AUSBILDUNG;

	/**
	 * The feature id for the '<em><b>Leistungsfaehig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__LEISTUNGSFAEHIG = ANDERER_ELTERNTEIL_BASIS_TYPE__LEISTUNGSFAEHIG;

	/**
	 * The feature id for the '<em><b>Weitere Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__WEITERE_ANGABEN = ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__GESCHLECHT = ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT;

	/**
	 * The number of structural features of the '<em>Anderer Elternteil Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = ANDERER_ELTERNTEIL_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anderer Elternteil Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = ANDERER_ELTERNTEIL_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AngabenKindNachreichenTypeImpl <em>Angaben Kind Nachreichen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AngabenKindNachreichenTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAngabenKindNachreichenType()
	 * @generated
	 */
	int ANGABEN_KIND_NACHREICHEN_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_NACHREICHEN_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_NACHREICHEN_TYPE__GEBURT = 1;

	/**
	 * The number of structural features of the '<em>Angaben Kind Nachreichen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_NACHREICHEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Angaben Kind Nachreichen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_NACHREICHEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AnschriftOptionalTypeImpl <em>Anschrift Optional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AnschriftOptionalTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAnschriftOptionalType()
	 * @generated
	 */
	int ANSCHRIFT_OPTIONAL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__HAUSNUMMER = 0;

	/**
	 * The feature id for the '<em><b>Hausnummer Buchstabe Zusatzziffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER = 1;

	/**
	 * The feature id for the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__POSTLEITZAHL = 2;

	/**
	 * The feature id for the '<em><b>Stockwerkswohnungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__STOCKWERKSWOHNUNGSNUMMER = 3;

	/**
	 * The feature id for the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__STRASSE = 4;

	/**
	 * The feature id for the '<em><b>Teilnummer Der Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__TEILNUMMER_DER_HAUSNUMMER = 5;

	/**
	 * The feature id for the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__WOHNORT = 6;

	/**
	 * The feature id for the '<em><b>Wohnort Frueherer Gemeindename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME = 7;

	/**
	 * The feature id for the '<em><b>Wohnungsinhaber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__WOHNUNGSINHABER = 8;

	/**
	 * The feature id for the '<em><b>Zusatzangaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__ZUSATZANGABEN = 9;

	/**
	 * The feature id for the '<em><b>Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE__STAAT = 10;

	/**
	 * The number of structural features of the '<em>Anschrift Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Anschrift Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_OPTIONAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl <em>Antragskind Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAntragskindBasisType()
	 * @generated
	 */
	int ANTRAGSKIND_BASIS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Geburtsurkunde</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__GEBURTSURKUNDE = 2;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__AUFENTHALTSTITEL = 3;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT = 4;

	/**
	 * The feature id for the '<em><b>Aufenthalt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__AUFENTHALT = 5;

	/**
	 * The feature id for the '<em><b>Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__VERTRETUNG = 6;

	/**
	 * The feature id for the '<em><b>Einkuenfte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__EINKUENFTE = 7;

	/**
	 * The feature id for the '<em><b>Sonstige Leistung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__SONSTIGE_LEISTUNG = 8;

	/**
	 * The feature id for the '<em><b>Andere Person Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN = 9;

	/**
	 * The feature id for the '<em><b>Mitbetreuung Durch Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL = 10;

	/**
	 * The feature id for the '<em><b>Schule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__SCHULE = 11;

	/**
	 * The feature id for the '<em><b>Studium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__STUDIUM = 12;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__GESCHLECHT = 13;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE__AKTENZEICHEN = 14;

	/**
	 * The number of structural features of the '<em>Antragskind Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Antragskind Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindTypeImpl <em>Antragskind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAntragskindType()
	 * @generated
	 */
	int ANTRAGSKIND_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__NAME = ANTRAGSKIND_BASIS_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__GEBURT = ANTRAGSKIND_BASIS_TYPE__GEBURT;

	/**
	 * The feature id for the '<em><b>Geburtsurkunde</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__GEBURTSURKUNDE = ANTRAGSKIND_BASIS_TYPE__GEBURTSURKUNDE;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__AUFENTHALTSTITEL = ANTRAGSKIND_BASIS_TYPE__AUFENTHALTSTITEL;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__STAATSANGEHOERIGKEIT = ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT;

	/**
	 * The feature id for the '<em><b>Aufenthalt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__AUFENTHALT = ANTRAGSKIND_BASIS_TYPE__AUFENTHALT;

	/**
	 * The feature id for the '<em><b>Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__VERTRETUNG = ANTRAGSKIND_BASIS_TYPE__VERTRETUNG;

	/**
	 * The feature id for the '<em><b>Einkuenfte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__EINKUENFTE = ANTRAGSKIND_BASIS_TYPE__EINKUENFTE;

	/**
	 * The feature id for the '<em><b>Sonstige Leistung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__SONSTIGE_LEISTUNG = ANTRAGSKIND_BASIS_TYPE__SONSTIGE_LEISTUNG;

	/**
	 * The feature id for the '<em><b>Andere Person Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__ANDERE_PERSON_VERSTORBEN = ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN;

	/**
	 * The feature id for the '<em><b>Mitbetreuung Durch Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL = ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL;

	/**
	 * The feature id for the '<em><b>Schule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__SCHULE = ANTRAGSKIND_BASIS_TYPE__SCHULE;

	/**
	 * The feature id for the '<em><b>Studium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__STUDIUM = ANTRAGSKIND_BASIS_TYPE__STUDIUM;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__GESCHLECHT = ANTRAGSKIND_BASIS_TYPE__GESCHLECHT;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE__AKTENZEICHEN = ANTRAGSKIND_BASIS_TYPE__AKTENZEICHEN;

	/**
	 * The number of structural features of the '<em>Antragskind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE_FEATURE_COUNT = ANTRAGSKIND_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Antragskind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_TYPE_OPERATION_COUNT = ANTRAGSKIND_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindUeberpruefungTypeImpl <em>Antragskind Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragskindUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAntragskindUeberpruefungType()
	 * @generated
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__NAME = ANTRAGSKIND_BASIS_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__GEBURT = ANTRAGSKIND_BASIS_TYPE__GEBURT;

	/**
	 * The feature id for the '<em><b>Geburtsurkunde</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__GEBURTSURKUNDE = ANTRAGSKIND_BASIS_TYPE__GEBURTSURKUNDE;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__AUFENTHALTSTITEL = ANTRAGSKIND_BASIS_TYPE__AUFENTHALTSTITEL;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__STAATSANGEHOERIGKEIT = ANTRAGSKIND_BASIS_TYPE__STAATSANGEHOERIGKEIT;

	/**
	 * The feature id for the '<em><b>Aufenthalt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__AUFENTHALT = ANTRAGSKIND_BASIS_TYPE__AUFENTHALT;

	/**
	 * The feature id for the '<em><b>Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__VERTRETUNG = ANTRAGSKIND_BASIS_TYPE__VERTRETUNG;

	/**
	 * The feature id for the '<em><b>Einkuenfte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__EINKUENFTE = ANTRAGSKIND_BASIS_TYPE__EINKUENFTE;

	/**
	 * The feature id for the '<em><b>Sonstige Leistung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__SONSTIGE_LEISTUNG = ANTRAGSKIND_BASIS_TYPE__SONSTIGE_LEISTUNG;

	/**
	 * The feature id for the '<em><b>Andere Person Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__ANDERE_PERSON_VERSTORBEN = ANTRAGSKIND_BASIS_TYPE__ANDERE_PERSON_VERSTORBEN;

	/**
	 * The feature id for the '<em><b>Mitbetreuung Durch Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL = ANTRAGSKIND_BASIS_TYPE__MITBETREUUNG_DURCH_ANDEREN_ELTERNTEIL;

	/**
	 * The feature id for the '<em><b>Schule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__SCHULE = ANTRAGSKIND_BASIS_TYPE__SCHULE;

	/**
	 * The feature id for the '<em><b>Studium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__STUDIUM = ANTRAGSKIND_BASIS_TYPE__STUDIUM;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__GESCHLECHT = ANTRAGSKIND_BASIS_TYPE__GESCHLECHT;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE__AKTENZEICHEN = ANTRAGSKIND_BASIS_TYPE__AKTENZEICHEN;

	/**
	 * The number of structural features of the '<em>Antragskind Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = ANTRAGSKIND_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Antragskind Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSKIND_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = ANTRAGSKIND_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl <em>Antragstellender Elternteil Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANREDE = 2;

	/**
	 * The feature id for the '<em><b>Kindschaftsbeziehung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG = 3;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT = 4;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel EAT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_EAT = 5;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel Upload</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_UPLOAD = 6;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND = 7;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT = 8;

	/**
	 * The feature id for the '<em><b>Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG = 9;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT = 10;

	/**
	 * The feature id for the '<em><b>Einkommensgrenze Erfuellt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__EINKOMMENSGRENZE_ERFUELLT = 11;

	/**
	 * The feature id for the '<em><b>Post Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE = 12;

	/**
	 * The feature id for the '<em><b>Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG = 13;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE = 14;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_AB = 15;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse Mit Anderem Elternteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL = 16;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse Mit Anderem Elternteil Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB = 17;

	/**
	 * The feature id for the '<em><b>Name Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS = 18;

	/**
	 * The feature id for the '<em><b>Lohnsteuerklasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE = 19;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT = 20;

	/**
	 * The number of structural features of the '<em>Antragstellender Elternteil Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Antragstellender Elternteil Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilTypeImpl <em>Antragstellender Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAntragstellenderElternteilType()
	 * @generated
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__NAME = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__GEBURT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT;

	/**
	 * The feature id for the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ANREDE = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANREDE;

	/**
	 * The feature id for the '<em><b>Kindschaftsbeziehung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__KINDSCHAFTSBEZIEHUNG = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ANSCHRIFT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel EAT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__AUFENTHALTSTITEL_EAT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_EAT;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel Upload</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__AUFENTHALTSTITEL_UPLOAD = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_UPLOAD;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__FAMILIENSTAND = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ERREICHBARKEIT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT;

	/**
	 * The feature id for the '<em><b>Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__BANKVERBINDUNG = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT;

	/**
	 * The feature id for the '<em><b>Einkommensgrenze Erfuellt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__EINKOMMENSGRENZE_ERFUELLT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__EINKOMMENSGRENZE_ERFUELLT;

	/**
	 * The feature id for the '<em><b>Post Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__POST_ADRESSE = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE;

	/**
	 * The feature id for the '<em><b>Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__VERTRETUNG = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ZUKUENFTIGE_ADRESSE = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ZUKUENFTIGE_ADRESSE_AB = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_AB;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse Mit Anderem Elternteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse Mit Anderem Elternteil Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB;

	/**
	 * The feature id for the '<em><b>Name Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__NAME_NACHWEIS = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS;

	/**
	 * The feature id for the '<em><b>Lohnsteuerklasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__LOHNSTEUERKLASSE = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__GESCHLECHT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT;

	/**
	 * The number of structural features of the '<em>Antragstellender Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE_FEATURE_COUNT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Antragstellender Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE_OPERATION_COUNT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilUeberpruefungTypeImpl <em>Antragstellender Elternteil Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAntragstellenderElternteilUeberpruefungType()
	 * @generated
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__NAME = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__GEBURT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT;

	/**
	 * The feature id for the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ANREDE = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANREDE;

	/**
	 * The feature id for the '<em><b>Kindschaftsbeziehung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__KINDSCHAFTSBEZIEHUNG = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ANSCHRIFT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel EAT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__AUFENTHALTSTITEL_EAT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_EAT;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel Upload</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__AUFENTHALTSTITEL_UPLOAD = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_UPLOAD;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__FAMILIENSTAND = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ERREICHBARKEIT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT;

	/**
	 * The feature id for the '<em><b>Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__BANKVERBINDUNG = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__STAATSANGEHOERIGKEIT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT;

	/**
	 * The feature id for the '<em><b>Einkommensgrenze Erfuellt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__EINKOMMENSGRENZE_ERFUELLT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__EINKOMMENSGRENZE_ERFUELLT;

	/**
	 * The feature id for the '<em><b>Post Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__POST_ADRESSE = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE;

	/**
	 * The feature id for the '<em><b>Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__VERTRETUNG = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ZUKUENFTIGE_ADRESSE = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ZUKUENFTIGE_ADRESSE_AB = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_AB;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse Mit Anderem Elternteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL;

	/**
	 * The feature id for the '<em><b>Zukuenftige Adresse Mit Anderem Elternteil Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB;

	/**
	 * The feature id for the '<em><b>Name Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__NAME_NACHWEIS = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS;

	/**
	 * The feature id for the '<em><b>Lohnsteuerklasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__LOHNSTEUERKLASSE = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE__GESCHLECHT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT;

	/**
	 * The number of structural features of the '<em>Antragstellender Elternteil Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Antragstellender Elternteil Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindBasisTypeImpl <em>Aufenthalt Kind Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAufenthaltKindBasisType()
	 * @generated
	 */
	int AUFENTHALT_KIND_BASIS_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_BASIS_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Aufenthaltsort Geheim Halten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN = 1;

	/**
	 * The feature id for the '<em><b>Auslandsschuljahr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR = 2;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_BASIS_TYPE__SEIT_WANN = 3;

	/**
	 * The feature id for the '<em><b>Aufenthalt Heim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALT_HEIM = 4;

	/**
	 * The number of structural features of the '<em>Aufenthalt Kind Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_BASIS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Aufenthalt Kind Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindTypeImpl <em>Aufenthalt Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAufenthaltKindType()
	 * @generated
	 */
	int AUFENTHALT_KIND_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_TYPE__ART = AUFENTHALT_KIND_BASIS_TYPE__ART;

	/**
	 * The feature id for the '<em><b>Aufenthaltsort Geheim Halten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN = AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN;

	/**
	 * The feature id for the '<em><b>Auslandsschuljahr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_TYPE__AUSLANDSSCHULJAHR = AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_TYPE__SEIT_WANN = AUFENTHALT_KIND_BASIS_TYPE__SEIT_WANN;

	/**
	 * The feature id for the '<em><b>Aufenthalt Heim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_TYPE__AUFENTHALT_HEIM = AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALT_HEIM;

	/**
	 * The number of structural features of the '<em>Aufenthalt Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_TYPE_FEATURE_COUNT = AUFENTHALT_KIND_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aufenthalt Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_TYPE_OPERATION_COUNT = AUFENTHALT_KIND_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindUeberpruefungTypeImpl <em>Aufenthalt Kind Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AufenthaltKindUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAufenthaltKindUeberpruefungType()
	 * @generated
	 */
	int AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE__ART = AUFENTHALT_KIND_BASIS_TYPE__ART;

	/**
	 * The feature id for the '<em><b>Aufenthaltsort Geheim Halten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN = AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALTSORT_GEHEIM_HALTEN;

	/**
	 * The feature id for the '<em><b>Auslandsschuljahr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE__AUSLANDSSCHULJAHR = AUFENTHALT_KIND_BASIS_TYPE__AUSLANDSSCHULJAHR;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE__SEIT_WANN = AUFENTHALT_KIND_BASIS_TYPE__SEIT_WANN;

	/**
	 * The feature id for the '<em><b>Aufenthalt Heim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE__AUFENTHALT_HEIM = AUFENTHALT_KIND_BASIS_TYPE__AUFENTHALT_HEIM;

	/**
	 * The number of structural features of the '<em>Aufenthalt Kind Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = AUFENTHALT_KIND_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aufenthalt Kind Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = AUFENTHALT_KIND_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AusbildungAndererElternteilTypeImpl <em>Ausbildung Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AusbildungAndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAusbildungAndererElternteilType()
	 * @generated
	 */
	int AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Zusaetzliche Informationen</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN = 1;

	/**
	 * The number of structural features of the '<em>Ausbildung Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ausbildung Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BeistandTypeImpl <em>Beistand Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BeistandTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getBeistandType()
	 * @generated
	 */
	int BEISTAND_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTAND_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anschrift Jugendamt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTAND_TYPE__ANSCHRIFT_JUGENDAMT = 1;

	/**
	 * The feature id for the '<em><b>Jugendamt EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTAND_TYPE__JUGENDAMT_EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTAND_TYPE__AKTENZEICHEN = 3;

	/**
	 * The feature id for the '<em><b>Telefonnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTAND_TYPE__TELEFONNUMMER = 4;

	/**
	 * The feature id for the '<em><b>Beauftragt Geltungsmachung UVanspruch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTAND_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH = 5;

	/**
	 * The number of structural features of the '<em>Beistand Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTAND_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Beistand Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTAND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BemuehungenUnterhaltTypeImpl <em>Bemuehungen Unterhalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BemuehungenUnterhaltTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getBemuehungenUnterhaltType()
	 * @generated
	 */
	int BEMUEHUNGEN_UNTERHALT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEMUEHUNGEN_UNTERHALT_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEMUEHUNGEN_UNTERHALT_TYPE__NACHWEIS = 1;

	/**
	 * The feature id for the '<em><b>Genauere Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEMUEHUNGEN_UNTERHALT_TYPE__GENAUERE_ANGABEN = 2;

	/**
	 * The feature id for the '<em><b>Gruende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEMUEHUNGEN_UNTERHALT_TYPE__GRUENDE = 3;

	/**
	 * The number of structural features of the '<em>Bemuehungen Unterhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEMUEHUNGEN_UNTERHALT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bemuehungen Unterhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEMUEHUNGEN_UNTERHALT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BestaetigungAngabenTypeImpl <em>Bestaetigung Angaben Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BestaetigungAngabenTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getBestaetigungAngabenType()
	 * @generated
	 */
	int BESTAETIGUNG_ANGABEN_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Wahrheitsgemaesse Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTAETIGUNG_ANGABEN_TYPE__WAHRHEITSGEMAESSE_ANGABEN = 0;

	/**
	 * The feature id for the '<em><b>Verpflichtung Aenderungsmitteilungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTAETIGUNG_ANGABEN_TYPE__VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN = 1;

	/**
	 * The number of structural features of the '<em>Bestaetigung Angaben Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTAETIGUNG_ANGABEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bestaetigung Angaben Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTAETIGUNG_ANGABEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BetreuerTypeImpl <em>Betreuer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BetreuerTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getBetreuerType()
	 * @generated
	 */
	int BETREUER_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREUER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREUER_TYPE__ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>EMail Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREUER_TYPE__EMAIL_ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREUER_TYPE__AKTENZEICHEN = 3;

	/**
	 * The feature id for the '<em><b>Telefonnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREUER_TYPE__TELEFONNUMMER = 4;

	/**
	 * The feature id for the '<em><b>Bestallungsurkunde</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREUER_TYPE__BESTALLUNGSURKUNDE = 5;

	/**
	 * The number of structural features of the '<em>Betreuer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREUER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Betreuer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREUER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BezugUvKindTypeImpl <em>Bezug Uv Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BezugUvKindTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getBezugUvKindType()
	 * @generated
	 */
	int BEZUG_UV_KIND_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Bezugs Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZUG_UV_KIND_TYPE__BEZUGS_JUGENDAMT = 0;

	/**
	 * The feature id for the '<em><b>Bis Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZUG_UV_KIND_TYPE__BIS_WANN = 1;

	/**
	 * The number of structural features of the '<em>Bezug Uv Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZUG_UV_KIND_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bezug Uv Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEZUG_UV_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeAusbildungTypeImpl <em>Code Ausbildung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeAusbildungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getCodeAusbildungType()
	 * @generated
	 */
	int CODE_AUSBILDUNG_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSBILDUNG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSBILDUNG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSBILDUNG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSBILDUNG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Ausbildung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSBILDUNG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Ausbildung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSBILDUNG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeEinkuenfteAndererElternteilTypeImpl <em>Code Einkuenfte Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeEinkuenfteAndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getCodeEinkuenfteAndererElternteilType()
	 * @generated
	 */
	int CODE_EINKUENFTE_ANDERER_ELTERNTEIL_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Einkuenfte Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Einkuenfte Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeEinkuenfteKindTypeImpl <em>Code Einkuenfte Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeEinkuenfteKindTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getCodeEinkuenfteKindType()
	 * @generated
	 */
	int CODE_EINKUENFTE_KIND_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_KIND_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_KIND_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_KIND_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_KIND_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Einkuenfte Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_KIND_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Einkuenfte Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKUENFTE_KIND_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeSonstigeLeistungenUVTypeImpl <em>Code Sonstige Leistungen UV Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeSonstigeLeistungenUVTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getCodeSonstigeLeistungenUVType()
	 * @generated
	 */
	int CODE_SONSTIGE_LEISTUNGEN_UV_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_UV_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_UV_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_UV_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_UV_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Sonstige Leistungen UV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_UV_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Sonstige Leistungen UV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_UV_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeStaatsangehoerigkeitUVTypeImpl <em>Code Staatsangehoerigkeit UV Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeStaatsangehoerigkeitUVTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getCodeStaatsangehoerigkeitUVType()
	 * @generated
	 */
	int CODE_STAATSANGEHOERIGKEIT_UV_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_UV_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_UV_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_UV_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_UV_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Staatsangehoerigkeit UV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_UV_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Staatsangehoerigkeit UV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_UV_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeSteuerklasseTypeImpl <em>Code Steuerklasse Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeSteuerklasseTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getCodeSteuerklasseType()
	 * @generated
	 */
	int CODE_STEUERKLASSE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STEUERKLASSE_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STEUERKLASSE_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STEUERKLASSE_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STEUERKLASSE_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Steuerklasse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STEUERKLASSE_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Steuerklasse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STEUERKLASSE_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeUnterhaltsbemuehungenTypeImpl <em>Code Unterhaltsbemuehungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.CodeUnterhaltsbemuehungenTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getCodeUnterhaltsbemuehungenType()
	 * @generated
	 */
	int CODE_UNTERHALTSBEMUEHUNGEN_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSBEMUEHUNGEN_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSBEMUEHUNGEN_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSBEMUEHUNGEN_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSBEMUEHUNGEN_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Unterhaltsbemuehungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSBEMUEHUNGEN_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Unterhaltsbemuehungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSBEMUEHUNGEN_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 29;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Unterhaltsvorschussantrag Antrag0301</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301 = 3;

	/**
	 * The feature id for the '<em><b>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302 = 4;

	/**
	 * The feature id for the '<em><b>Unterhaltsvorschussantrag Nachreichen0303</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303 = 5;

	/**
	 * The feature id for the '<em><b>Unterhaltsvorschussantrag Nachweisnachricht0311</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311 = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteAndererElternteilTypeImpl <em>Einkuenfte Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteAndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getEinkuenfteAndererElternteilType()
	 * @generated
	 */
	int EINKUENFTE_ANDERER_ELTERNTEIL_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Weitere Informationen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__WEITERE_INFORMATIONEN = 1;

	/**
	 * The feature id for the '<em><b>Betrag Der Einkuenfte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__BETRAG_DER_EINKUENFTE = 2;

	/**
	 * The number of structural features of the '<em>Einkuenfte Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Einkuenfte Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteKindTypeImpl <em>Einkuenfte Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteKindTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getEinkuenfteKindType()
	 * @generated
	 */
	int EINKUENFTE_KIND_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_KIND_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_KIND_TYPE__NACHWEIS = 1;

	/**
	 * The feature id for the '<em><b>Betrag Der Einkuenfte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_KIND_TYPE__BETRAG_DER_EINKUENFTE = 2;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_KIND_TYPE__ZEITRAUM = 3;

	/**
	 * The number of structural features of the '<em>Einkuenfte Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_KIND_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Einkuenfte Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl <em>Elternschaft Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getElternschaftType()
	 * @generated
	 */
	int ELTERNSCHAFT_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Eheliches Antragskind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__EHELICHES_ANTRAGSKIND = 0;

	/**
	 * The feature id for the '<em><b>Vaterschaft Anerkannt Oder Festgestellt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT = 1;

	/**
	 * The feature id for the '<em><b>Ehemann Ist Leiblicher Vater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__EHEMANN_IST_LEIBLICHER_VATER = 2;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__NACHWEIS = 3;

	/**
	 * The feature id for the '<em><b>Name Vater</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__NAME_VATER = 4;

	/**
	 * The feature id for the '<em><b>Antrag Feststellung Gestellt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__ANTRAG_FESTSTELLUNG_GESTELLT = 5;

	/**
	 * The feature id for the '<em><b>Antrag Anfechtung Anhaengig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__ANTRAG_ANFECHTUNG_ANHAENGIG = 6;

	/**
	 * The feature id for the '<em><b>Angabedes Gerichts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__ANGABEDES_GERICHTS = 7;

	/**
	 * The feature id for the '<em><b>Weitere Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__WEITERE_INFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Angabe Ob Bei Geburt Verheiratet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE__ANGABE_OB_BEI_GEBURT_VERHEIRATET = 9;

	/**
	 * The number of structural features of the '<em>Elternschaft Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Elternschaft Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNSCHAFT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.FamilienstandBasisTypeImpl <em>Familienstand Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.FamilienstandBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getFamilienstandBasisType()
	 * @generated
	 */
	int FAMILIENSTAND_BASIS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_BASIS_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Lebenssituation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION = 1;

	/**
	 * The number of structural features of the '<em>Familienstand Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_BASIS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Familienstand Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.FamilienstandTypeImpl <em>Familienstand Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.FamilienstandTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getFamilienstandType()
	 * @generated
	 */
	int FAMILIENSTAND_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_TYPE__ART = FAMILIENSTAND_BASIS_TYPE__ART;

	/**
	 * The feature id for the '<em><b>Lebenssituation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_TYPE__LEBENSSITUATION = FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION;

	/**
	 * The number of structural features of the '<em>Familienstand Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_TYPE_FEATURE_COUNT = FAMILIENSTAND_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Familienstand Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_TYPE_OPERATION_COUNT = FAMILIENSTAND_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.FamilienstandUeberpruefungTypeImpl <em>Familienstand Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.FamilienstandUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getFamilienstandUeberpruefungType()
	 * @generated
	 */
	int FAMILIENSTAND_UEBERPRUEFUNG_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_UEBERPRUEFUNG_TYPE__ART = FAMILIENSTAND_BASIS_TYPE__ART;

	/**
	 * The feature id for the '<em><b>Lebenssituation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_UEBERPRUEFUNG_TYPE__LEBENSSITUATION = FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION;

	/**
	 * The number of structural features of the '<em>Familienstand Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = FAMILIENSTAND_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Familienstand Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = FAMILIENSTAND_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeburtTypeImpl <em>Geburt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeburtTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getGeburtType()
	 * @generated
	 */
	int GEBURT_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE__GEBURTSORT = 0;

	/**
	 * The feature id for the '<em><b>Geburtsort Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE__GEBURTSORT_STAAT = 1;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE__GEBURTSDATUM = 2;

	/**
	 * The number of structural features of the '<em>Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeburtGeburtsortPflichtTypeImpl <em>Geburt Geburtsort Pflicht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeburtGeburtsortPflichtTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getGeburtGeburtsortPflichtType()
	 * @generated
	 */
	int GEBURT_GEBURTSORT_PFLICHT_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_PFLICHT_TYPE__GEBURTSORT = GEBURT_TYPE__GEBURTSORT;

	/**
	 * The feature id for the '<em><b>Geburtsort Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_PFLICHT_TYPE__GEBURTSORT_STAAT = GEBURT_TYPE__GEBURTSORT_STAAT;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_PFLICHT_TYPE__GEBURTSDATUM = GEBURT_TYPE__GEBURTSDATUM;

	/**
	 * The number of structural features of the '<em>Geburt Geburtsort Pflicht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_PFLICHT_TYPE_FEATURE_COUNT = GEBURT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geburt Geburtsort Pflicht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_PFLICHT_TYPE_OPERATION_COUNT = GEBURT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeburtNurGeburtsdatumTypeImpl <em>Geburt Nur Geburtsdatum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeburtNurGeburtsdatumTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getGeburtNurGeburtsdatumType()
	 * @generated
	 */
	int GEBURT_NUR_GEBURTSDATUM_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NUR_GEBURTSDATUM_TYPE__GEBURTSORT = GEBURT_TYPE__GEBURTSORT;

	/**
	 * The feature id for the '<em><b>Geburtsort Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NUR_GEBURTSDATUM_TYPE__GEBURTSORT_STAAT = GEBURT_TYPE__GEBURTSORT_STAAT;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NUR_GEBURTSDATUM_TYPE__GEBURTSDATUM = GEBURT_TYPE__GEBURTSDATUM;

	/**
	 * The number of structural features of the '<em>Geburt Nur Geburtsdatum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NUR_GEBURTSDATUM_TYPE_FEATURE_COUNT = GEBURT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geburt Nur Geburtsdatum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NUR_GEBURTSDATUM_TYPE_OPERATION_COUNT = GEBURT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeschiedenAntragstellendeBasisTypeImpl <em>Geschieden Antragstellende Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeschiedenAntragstellendeBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getGeschiedenAntragstellendeBasisType()
	 * @generated
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS = 0;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT = 1;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = 2;

	/**
	 * The number of structural features of the '<em>Geschieden Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Geschieden Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeschiedenAntragstellendeTypeImpl <em>Geschieden Antragstellende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeschiedenAntragstellendeTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getGeschiedenAntragstellendeType()
	 * @generated
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_TYPE__NACHWEIS = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_TYPE__HOCHZEIT_GEPLANT = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The number of structural features of the '<em>Geschieden Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_TYPE_FEATURE_COUNT = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geschieden Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_TYPE_OPERATION_COUNT = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeschiedenAntragstellendeUeberpruefungTypeImpl <em>Geschieden Antragstellende Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.GeschiedenAntragstellendeUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getGeschiedenAntragstellendeUeberpruefungType()
	 * @generated
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__NACHWEIS = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEIT_GEPLANT = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The number of structural features of the '<em>Geschieden Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geschieden Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHIEDEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.InstitutionUnterhaltstitelTypeImpl <em>Institution Unterhaltstitel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.InstitutionUnterhaltstitelTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getInstitutionUnterhaltstitelType()
	 * @generated
	 */
	int INSTITUTION_UNTERHALTSTITEL_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_UNTERHALTSTITEL_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_UNTERHALTSTITEL_TYPE__ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_UNTERHALTSTITEL_TYPE__BEZEICHNUNG = 2;

	/**
	 * The number of structural features of the '<em>Institution Unterhaltstitel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_UNTERHALTSTITEL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Institution Unterhaltstitel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_UNTERHALTSTITEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl <em>Lebenspartnerschaft Antragstellende Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND = 0;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND = 1;

	/**
	 * The feature id for the '<em><b>Lebenspartner Seit Sechs Monaten In Anstalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT = 2;

	/**
	 * The feature id for the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT = 4;

	/**
	 * The feature id for the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM = 5;

	/**
	 * The feature id for the '<em><b>Steuerklasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE = 6;

	/**
	 * The feature id for the '<em><b>Steuerklasse Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS = 7;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN = 8;

	/**
	 * The number of structural features of the '<em>Lebenspartnerschaft Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Lebenspartnerschaft Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeTypeImpl <em>Lebenspartnerschaft Antragstellende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenspartnerschaftAntragstellendeType()
	 * @generated
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE__GETRENNT_LEBEND = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE__GETRENNT_LEBEND_GRUND = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND;

	/**
	 * The feature id for the '<em><b>Lebenspartner Seit Sechs Monaten In Anstalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT;

	/**
	 * The feature id for the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME;

	/**
	 * The feature id for the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT;

	/**
	 * The feature id for the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM;

	/**
	 * The feature id for the '<em><b>Steuerklasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE__STEUERKLASSE = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE;

	/**
	 * The feature id for the '<em><b>Steuerklasse Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE__STEUERKLASSE_NACHWEIS = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE__SEIT_WANN = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The number of structural features of the '<em>Lebenspartnerschaft Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE_FEATURE_COUNT = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lebenspartnerschaft Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE_OPERATION_COUNT = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeUeberpruefungTypeImpl <em>Lebenspartnerschaft Antragstellende Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenspartnerschaftAntragstellendeUeberpruefungType()
	 * @generated
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__GETRENNT_LEBEND = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__GETRENNT_LEBEND_GRUND = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND;

	/**
	 * The feature id for the '<em><b>Lebenspartner Seit Sechs Monaten In Anstalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT;

	/**
	 * The feature id for the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME;

	/**
	 * The feature id for the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT;

	/**
	 * The feature id for the '<em><b>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM;

	/**
	 * The feature id for the '<em><b>Steuerklasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__STEUERKLASSE = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE;

	/**
	 * The feature id for the '<em><b>Steuerklasse Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__STEUERKLASSE_NACHWEIS = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__SEIT_WANN = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The number of structural features of the '<em>Lebenspartnerschaft Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lebenspartnerschaft Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAufgehobenAntragstellendeBasisTypeImpl <em>Lebenspartnerschaft Aufgehoben Antragstellende Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAufgehobenAntragstellendeBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenspartnerschaftAufgehobenAntragstellendeBasisType()
	 * @generated
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS = 0;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN = 1;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT = 2;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = 3;

	/**
	 * The number of structural features of the '<em>Lebenspartnerschaft Aufgehoben Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Lebenspartnerschaft Aufgehoben Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAufgehobenAntragstellendeTypeImpl <em>Lebenspartnerschaft Aufgehoben Antragstellende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAufgehobenAntragstellendeTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenspartnerschaftAufgehobenAntragstellendeType()
	 * @generated
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_TYPE__NACHWEIS = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_TYPE__SEIT_WANN = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_TYPE__HOCHZEIT_GEPLANT = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The number of structural features of the '<em>Lebenspartnerschaft Aufgehoben Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_TYPE_FEATURE_COUNT = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lebenspartnerschaft Aufgehoben Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_TYPE_OPERATION_COUNT = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeImpl <em>Lebenspartnerschaft Aufgehoben Antragstellende Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType()
	 * @generated
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__NACHWEIS = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__SEIT_WANN = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEIT_GEPLANT = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The number of structural features of the '<em>Lebenspartnerschaft Aufgehoben Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lebenspartnerschaft Aufgehoben Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerVerstorbenAntragstellendeBasisTypeImpl <em>Lebenspartner Verstorben Antragstellende Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerVerstorbenAntragstellendeBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenspartnerVerstorbenAntragstellendeBasisType()
	 * @generated
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS = 0;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN = 1;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT = 2;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = 3;

	/**
	 * The number of structural features of the '<em>Lebenspartner Verstorben Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Lebenspartner Verstorben Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerVerstorbenAntragstellendeTypeImpl <em>Lebenspartner Verstorben Antragstellende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerVerstorbenAntragstellendeTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenspartnerVerstorbenAntragstellendeType()
	 * @generated
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_TYPE__NACHWEIS = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_TYPE__SEIT_WANN = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_TYPE__HOCHZEIT_GEPLANT = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The number of structural features of the '<em>Lebenspartner Verstorben Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_TYPE_FEATURE_COUNT = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lebenspartner Verstorben Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_TYPE_OPERATION_COUNT = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerVerstorbenAntragstellendeUeberpruefungTypeImpl <em>Lebenspartner Verstorben Antragstellende Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerVerstorbenAntragstellendeUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenspartnerVerstorbenAntragstellendeUeberpruefungType()
	 * @generated
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__NACHWEIS = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__SEIT_WANN = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEIT_GEPLANT = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The number of structural features of the '<em>Lebenspartner Verstorben Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lebenspartner Verstorben Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationBasisTypeImpl <em>Lebenssituation Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenssituationBasisType()
	 * @generated
	 */
	int LEBENSSITUATION_BASIS_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Ledig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_BASIS_TYPE__LEDIG = 0;

	/**
	 * The feature id for the '<em><b>Verheiratet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_BASIS_TYPE__VERHEIRATET = 1;

	/**
	 * The feature id for the '<em><b>Lebenspartnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT = 2;

	/**
	 * The feature id for the '<em><b>Geschieden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN = 3;

	/**
	 * The feature id for the '<em><b>Verwitwet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_BASIS_TYPE__VERWITWET = 4;

	/**
	 * The feature id for the '<em><b>Lebenspartnerschaft Aufgehoben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN = 5;

	/**
	 * The feature id for the '<em><b>Lebenspartner Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN = 6;

	/**
	 * The number of structural features of the '<em>Lebenssituation Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_BASIS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Lebenssituation Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationTypeImpl <em>Lebenssituation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenssituationType()
	 * @generated
	 */
	int LEBENSSITUATION_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Ledig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__LEDIG = LEBENSSITUATION_BASIS_TYPE__LEDIG;

	/**
	 * The feature id for the '<em><b>Verheiratet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__VERHEIRATET = LEBENSSITUATION_BASIS_TYPE__VERHEIRATET;

	/**
	 * The feature id for the '<em><b>Lebenspartnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__LEBENSPARTNERSCHAFT = LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT;

	/**
	 * The feature id for the '<em><b>Geschieden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__GESCHIEDEN = LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN;

	/**
	 * The feature id for the '<em><b>Verwitwet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__VERWITWET = LEBENSSITUATION_BASIS_TYPE__VERWITWET;

	/**
	 * The feature id for the '<em><b>Lebenspartnerschaft Aufgehoben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN = LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN;

	/**
	 * The feature id for the '<em><b>Lebenspartner Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__LEBENSPARTNER_VERSTORBEN = LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN;

	/**
	 * The number of structural features of the '<em>Lebenssituation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE_FEATURE_COUNT = LEBENSSITUATION_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lebenssituation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE_OPERATION_COUNT = LEBENSSITUATION_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationUeberpruefungTypeImpl <em>Lebenssituation Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenssituationUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLebenssituationUeberpruefungType()
	 * @generated
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Ledig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE__LEDIG = LEBENSSITUATION_BASIS_TYPE__LEDIG;

	/**
	 * The feature id for the '<em><b>Verheiratet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE__VERHEIRATET = LEBENSSITUATION_BASIS_TYPE__VERHEIRATET;

	/**
	 * The feature id for the '<em><b>Lebenspartnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE__LEBENSPARTNERSCHAFT = LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT;

	/**
	 * The feature id for the '<em><b>Geschieden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE__GESCHIEDEN = LEBENSSITUATION_BASIS_TYPE__GESCHIEDEN;

	/**
	 * The feature id for the '<em><b>Verwitwet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE__VERWITWET = LEBENSSITUATION_BASIS_TYPE__VERWITWET;

	/**
	 * The feature id for the '<em><b>Lebenspartnerschaft Aufgehoben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN = LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNERSCHAFT_AUFGEHOBEN;

	/**
	 * The feature id for the '<em><b>Lebenspartner Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE__LEBENSPARTNER_VERSTORBEN = LEBENSSITUATION_BASIS_TYPE__LEBENSPARTNER_VERSTORBEN;

	/**
	 * The number of structural features of the '<em>Lebenssituation Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = LEBENSSITUATION_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lebenssituation Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = LEBENSSITUATION_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl <em>Ledig Antragstellende Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLedigAntragstellendeBasisType()
	 * @generated
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Anderer Elternteil Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN = 0;

	/**
	 * The feature id for the '<em><b>Lebt Mit Anderem Elternteil Zusammen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN = 1;

	/**
	 * The feature id for the '<em><b>Nie Mit Anderem Elternteil Zusammengelebt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT = 2;

	/**
	 * The feature id for the '<em><b>Vater Ist Namentlich Bekannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VATER_IST_NAMENTLICH_BEKANNT = 3;

	/**
	 * The feature id for the '<em><b>Vom Anderen Elternteil Getrennt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT = 4;

	/**
	 * The feature id for the '<em><b>Seit Wann Getrennt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT = 5;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT = 6;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = 7;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND = 8;

	/**
	 * The number of structural features of the '<em>Ledig Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Ledig Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeTypeImpl <em>Ledig Antragstellende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLedigAntragstellendeType()
	 * @generated
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Anderer Elternteil Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN;

	/**
	 * The feature id for the '<em><b>Lebt Mit Anderem Elternteil Zusammen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN;

	/**
	 * The feature id for the '<em><b>Nie Mit Anderem Elternteil Zusammengelebt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT;

	/**
	 * The feature id for the '<em><b>Vater Ist Namentlich Bekannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE__VATER_IST_NAMENTLICH_BEKANNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VATER_IST_NAMENTLICH_BEKANNT;

	/**
	 * The feature id for the '<em><b>Vom Anderen Elternteil Getrennt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT;

	/**
	 * The feature id for the '<em><b>Seit Wann Getrennt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE__SEIT_WANN_GETRENNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE__HOCHZEIT_GEPLANT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE__GETRENNT_LEBEND_GRUND = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND;

	/**
	 * The number of structural features of the '<em>Ledig Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE_FEATURE_COUNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ledig Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_TYPE_OPERATION_COUNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeUeberpruefungTypeImpl <em>Ledig Antragstellende Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLedigAntragstellendeUeberpruefungType()
	 * @generated
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Anderer Elternteil Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN;

	/**
	 * The feature id for the '<em><b>Lebt Mit Anderem Elternteil Zusammen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN;

	/**
	 * The feature id for the '<em><b>Nie Mit Anderem Elternteil Zusammengelebt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT;

	/**
	 * The feature id for the '<em><b>Vater Ist Namentlich Bekannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__VATER_IST_NAMENTLICH_BEKANNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VATER_IST_NAMENTLICH_BEKANNT;

	/**
	 * The feature id for the '<em><b>Vom Anderen Elternteil Getrennt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT;

	/**
	 * The feature id for the '<em><b>Seit Wann Getrennt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__SEIT_WANN_GETRENNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEIT_GEPLANT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__GETRENNT_LEBEND_GRUND = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND;

	/**
	 * The number of structural features of the '<em>Ledig Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ledig Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = LEDIG_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LeistungserhaltTypeImpl <em>Leistungserhalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LeistungserhaltTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLeistungserhaltType()
	 * @generated
	 */
	int LEISTUNGSERHALT_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEISTUNGSERHALT_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEISTUNGSERHALT_TYPE__NACHWEIS = 1;

	/**
	 * The number of structural features of the '<em>Leistungserhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEISTUNGSERHALT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Leistungserhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEISTUNGSERHALT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LeistungsgewaehrungTypeImpl <em>Leistungsgewaehrung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LeistungsgewaehrungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLeistungsgewaehrungType()
	 * @generated
	 */
	int LEISTUNGSGEWAEHRUNG_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEISTUNGSGEWAEHRUNG_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEISTUNGSGEWAEHRUNG_TYPE__NACHWEIS = 1;

	/**
	 * The number of structural features of the '<em>Leistungsgewaehrung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEISTUNGSGEWAEHRUNG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Leistungsgewaehrung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEISTUNGSGEWAEHRUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LohnsteuerklasseTypeImpl <em>Lohnsteuerklasse Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LohnsteuerklasseTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getLohnsteuerklasseType()
	 * @generated
	 */
	int LOHNSTEUERKLASSE_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Lohnsteuerklasse Veranlagung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE_VERANLAGUNG = 0;

	/**
	 * The feature id for the '<em><b>Lohnsteuerklasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE = 1;

	/**
	 * The number of structural features of the '<em>Lohnsteuerklasse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOHNSTEUERKLASSE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lohnsteuerklasse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOHNSTEUERKLASSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.NameOptionalTypeImpl <em>Name Optional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.NameOptionalTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getNameOptionalType()
	 * @generated
	 */
	int NAME_OPTIONAL_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT = 0;

	/**
	 * The feature id for the '<em><b>Geburtsname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT = 1;

	/**
	 * The feature id for the '<em><b>Vornamen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPTIONAL_TYPE__VORNAMEN = 2;

	/**
	 * The number of structural features of the '<em>Name Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPTIONAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Name Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPTIONAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.NameMitGeburtsnameTypeImpl <em>Name Mit Geburtsname Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.NameMitGeburtsnameTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getNameMitGeburtsnameType()
	 * @generated
	 */
	int NAME_MIT_GEBURTSNAME_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_MIT_GEBURTSNAME_TYPE__FAMILIENNAME_UNSTRUKTURIERT = NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT;

	/**
	 * The feature id for the '<em><b>Geburtsname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_MIT_GEBURTSNAME_TYPE__GEBURTSNAME_UNSTRUKTURIERT = NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT;

	/**
	 * The feature id for the '<em><b>Vornamen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_MIT_GEBURTSNAME_TYPE__VORNAMEN = NAME_OPTIONAL_TYPE__VORNAMEN;

	/**
	 * The number of structural features of the '<em>Name Mit Geburtsname Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_MIT_GEBURTSNAME_TYPE_FEATURE_COUNT = NAME_OPTIONAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Name Mit Geburtsname Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_MIT_GEBURTSNAME_TYPE_OPERATION_COUNT = NAME_OPTIONAL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.NameOhneGeburtsnameTypeImpl <em>Name Ohne Geburtsname Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.NameOhneGeburtsnameTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getNameOhneGeburtsnameType()
	 * @generated
	 */
	int NAME_OHNE_GEBURTSNAME_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OHNE_GEBURTSNAME_TYPE__FAMILIENNAME_UNSTRUKTURIERT = NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT;

	/**
	 * The feature id for the '<em><b>Geburtsname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OHNE_GEBURTSNAME_TYPE__GEBURTSNAME_UNSTRUKTURIERT = NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT;

	/**
	 * The feature id for the '<em><b>Vornamen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OHNE_GEBURTSNAME_TYPE__VORNAMEN = NAME_OPTIONAL_TYPE__VORNAMEN;

	/**
	 * The number of structural features of the '<em>Name Ohne Geburtsname Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OHNE_GEBURTSNAME_TYPE_FEATURE_COUNT = NAME_OPTIONAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Name Ohne Geburtsname Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OHNE_GEBURTSNAME_TYPE_OPERATION_COUNT = NAME_OPTIONAL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.RechtsanwaltTypeImpl <em>Rechtsanwalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.RechtsanwaltTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getRechtsanwaltType()
	 * @generated
	 */
	int RECHTSANWALT_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHTSANWALT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHTSANWALT_TYPE__ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHTSANWALT_TYPE__AKTENZEICHEN = 2;

	/**
	 * The feature id for the '<em><b>Beauftragt Geltungsmachung UVanspruch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHTSANWALT_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH = 3;

	/**
	 * The number of structural features of the '<em>Rechtsanwalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHTSANWALT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rechtsanwalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHTSANWALT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SchuleTypeImpl <em>Schule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SchuleTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getSchuleType()
	 * @generated
	 */
	int SCHULE_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Monat Voraussichtlicher Abschluss Schule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHULE_TYPE__MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE = 0;

	/**
	 * The feature id for the '<em><b>Tatsache Mit Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHULE_TYPE__TATSACHE_MIT_NACHWEIS = 1;

	/**
	 * The feature id for the '<em><b>Schulabschluss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHULE_TYPE__SCHULABSCHLUSS = 2;

	/**
	 * The number of structural features of the '<em>Schule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHULE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Schule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHULE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungAndererElternteilTypeImpl <em>Sonstige Leistung Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungAndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getSonstigeLeistungAndererElternteilType()
	 * @generated
	 */
	int SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Name Leistungsstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__NAME_LEISTUNGSSTELLE = 1;

	/**
	 * The feature id for the '<em><b>Bedarfsgemeinschaftsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BEDARFSGEMEINSCHAFTSNUMMER = 2;

	/**
	 * The feature id for the '<em><b>Rentenversicherungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__RENTENVERSICHERUNGSNUMMER = 3;

	/**
	 * The feature id for the '<em><b>Betraege Zur Leistungshoehe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE = 4;

	/**
	 * The number of structural features of the '<em>Sonstige Leistung Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sonstige Leistung Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl <em>Sonstige Leistung Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getSonstigeLeistungKindType()
	 * @generated
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__NACHWEIS = 1;

	/**
	 * The feature id for the '<em><b>Leistungserhalt Kindergeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD = 2;

	/**
	 * The feature id for the '<em><b>Leistungsgewaehrung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG = 3;

	/**
	 * The feature id for the '<em><b>Name Jobcenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__NAME_JOBCENTER = 4;

	/**
	 * The feature id for the '<em><b>Bedarfsgemeinschaftsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__BEDARFSGEMEINSCHAFTSNUMMER = 5;

	/**
	 * The feature id for the '<em><b>Name Traeger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__NAME_TRAEGER = 6;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__AKTENZEICHEN = 7;

	/**
	 * The feature id for the '<em><b>Betraege Zur Leistungshoehe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE = 8;

	/**
	 * The feature id for the '<em><b>Bezug UV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV = 9;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE__ZEITRAUM = 10;

	/**
	 * The number of structural features of the '<em>Sonstige Leistung Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Sonstige Leistung Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindUeberpruefungTypeImpl <em>Sonstige Leistung Kind Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getSonstigeLeistungKindUeberpruefungType()
	 * @generated
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__ART = SONSTIGE_LEISTUNG_KIND_TYPE__ART;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__NACHWEIS = SONSTIGE_LEISTUNG_KIND_TYPE__NACHWEIS;

	/**
	 * The feature id for the '<em><b>Leistungserhalt Kindergeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__LEISTUNGSERHALT_KINDERGELD = SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD;

	/**
	 * The feature id for the '<em><b>Leistungsgewaehrung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__LEISTUNGSGEWAEHRUNG = SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG;

	/**
	 * The feature id for the '<em><b>Name Jobcenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__NAME_JOBCENTER = SONSTIGE_LEISTUNG_KIND_TYPE__NAME_JOBCENTER;

	/**
	 * The feature id for the '<em><b>Bedarfsgemeinschaftsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__BEDARFSGEMEINSCHAFTSNUMMER = SONSTIGE_LEISTUNG_KIND_TYPE__BEDARFSGEMEINSCHAFTSNUMMER;

	/**
	 * The feature id for the '<em><b>Name Traeger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__NAME_TRAEGER = SONSTIGE_LEISTUNG_KIND_TYPE__NAME_TRAEGER;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__AKTENZEICHEN = SONSTIGE_LEISTUNG_KIND_TYPE__AKTENZEICHEN;

	/**
	 * The feature id for the '<em><b>Betraege Zur Leistungshoehe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE = SONSTIGE_LEISTUNG_KIND_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE;

	/**
	 * The feature id for the '<em><b>Bezug UV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__BEZUG_UV = SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE__ZEITRAUM = SONSTIGE_LEISTUNG_KIND_TYPE__ZEITRAUM;

	/**
	 * The number of structural features of the '<em>Sonstige Leistung Kind Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = SONSTIGE_LEISTUNG_KIND_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sonstige Leistung Kind Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = SONSTIGE_LEISTUNG_KIND_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.StaatsangehoerigkeitAndererElternteilTypeImpl <em>Staatsangehoerigkeit Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.StaatsangehoerigkeitAndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getStaatsangehoerigkeitAndererElternteilType()
	 * @generated
	 */
	int STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Bekannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__BEKANNT = 0;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT = 1;

	/**
	 * The number of structural features of the '<em>Staatsangehoerigkeit Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Staatsangehoerigkeit Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.StaatsangehoerigkeitTypeImpl <em>Staatsangehoerigkeit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.StaatsangehoerigkeitTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getStaatsangehoerigkeitType()
	 * @generated
	 */
	int STAATSANGEHOERIGKEIT_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Verlust Recht Auf Einreise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_TYPE__VERLUST_RECHT_AUF_EINREISE = 1;

	/**
	 * The number of structural features of the '<em>Staatsangehoerigkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Staatsangehoerigkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.TraegerKrankenversicherungTypeImpl <em>Traeger Krankenversicherung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.TraegerKrankenversicherungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getTraegerKrankenversicherungType()
	 * @generated
	 */
	int TRAEGER_KRANKENVERSICHERUNG_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Bekannt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAEGER_KRANKENVERSICHERUNG_TYPE__BEKANNT = 0;

	/**
	 * The feature id for the '<em><b>Kv Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAEGER_KRANKENVERSICHERUNG_TYPE__KV_NUMMER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAEGER_KRANKENVERSICHERUNG_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Traeger Krankenversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAEGER_KRANKENVERSICHERUNG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Traeger Krankenversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAEGER_KRANKENVERSICHERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltBasisTypeImpl <em>Unterhalt Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltBasisType()
	 * @generated
	 */
	int UNTERHALT_BASIS_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Unterhaltstitel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL = 0;

	/**
	 * The feature id for the '<em><b>Unterhaltzahlungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_BASIS_TYPE__UNTERHALTZAHLUNGEN = 1;

	/**
	 * The feature id for the '<em><b>Unterhaltvorauszahlungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_BASIS_TYPE__UNTERHALTVORAUSZAHLUNGEN = 2;

	/**
	 * The feature id for the '<em><b>Bemuehungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_BASIS_TYPE__BEMUEHUNGEN = 3;

	/**
	 * The feature id for the '<em><b>Weitere Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_BASIS_TYPE__WEITERE_ANGABEN = 4;

	/**
	 * The number of structural features of the '<em>Unterhalt Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_BASIS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Unterhalt Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelTypeImpl <em>Unterhaltstitel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltstitelType()
	 * @generated
	 */
	int UNTERHALTSTITEL_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Liegt Mir Vor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR = 0;

	/**
	 * The feature id for the '<em><b>Titel Bei Andere Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON = 1;

	/**
	 * The feature id for the '<em><b>Titel Bei Institution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION = 2;

	/**
	 * The feature id for the '<em><b>Antrag Unterhaltsfestsetzung Gestellt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT = 3;

	/**
	 * The feature id for the '<em><b>Befreiung Unterhalt Durch Vergleich Gerichtlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH = 4;

	/**
	 * The feature id for the '<em><b>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH = 5;

	/**
	 * The feature id for the '<em><b>Es Gibt Einen Unterhaltstitel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_TYPE__ES_GIBT_EINEN_UNTERHALTSTITEL = 6;

	/**
	 * The number of structural features of the '<em>Unterhaltstitel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Unterhaltstitel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelUeberpruefungTypeImpl <em>Unterhaltstitel Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltstitelUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltstitelUeberpruefungType()
	 * @generated
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Liegt Mir Vor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE__LIEGT_MIR_VOR = UNTERHALTSTITEL_TYPE__LIEGT_MIR_VOR;

	/**
	 * The feature id for the '<em><b>Titel Bei Andere Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE__TITEL_BEI_ANDERE_PERSON = UNTERHALTSTITEL_TYPE__TITEL_BEI_ANDERE_PERSON;

	/**
	 * The feature id for the '<em><b>Titel Bei Institution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE__TITEL_BEI_INSTITUTION = UNTERHALTSTITEL_TYPE__TITEL_BEI_INSTITUTION;

	/**
	 * The feature id for the '<em><b>Antrag Unterhaltsfestsetzung Gestellt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT = UNTERHALTSTITEL_TYPE__ANTRAG_UNTERHALTSFESTSETZUNG_GESTELLT;

	/**
	 * The feature id for the '<em><b>Befreiung Unterhalt Durch Vergleich Gerichtlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH = UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_GERICHTLICH;

	/**
	 * The feature id for the '<em><b>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH = UNTERHALTSTITEL_TYPE__BEFREIUNG_UNTERHALT_DURCH_VERGLEICH_AUSSERGERICHTLICH;

	/**
	 * The feature id for the '<em><b>Es Gibt Einen Unterhaltstitel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE__ES_GIBT_EINEN_UNTERHALTSTITEL = UNTERHALTSTITEL_TYPE__ES_GIBT_EINEN_UNTERHALTSTITEL;

	/**
	 * The number of structural features of the '<em>Unterhaltstitel Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = UNTERHALTSTITEL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unterhaltstitel Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = UNTERHALTSTITEL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorauszahlungenTypeImpl <em>Unterhaltsvorauszahlungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorauszahlungenTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltsvorauszahlungenType()
	 * @generated
	 */
	int UNTERHALTSVORAUSZAHLUNGEN_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Zeitraum Der Vorauszahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZEITRAUM_DER_VORAUSZAHLUNG = 0;

	/**
	 * The feature id for the '<em><b>Betrag Der Voraus Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORAUSZAHLUNGEN_TYPE__BETRAG_DER_VORAUS_ZAHLUNG = 1;

	/**
	 * The feature id for the '<em><b>Datum Der Vorauszahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORAUSZAHLUNGEN_TYPE__DATUM_DER_VORAUSZAHLUNG = 2;

	/**
	 * The feature id for the '<em><b>Zahlungen Dritter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORAUSZAHLUNGEN_TYPE__ZAHLUNGEN_DRITTER = 3;

	/**
	 * The feature id for the '<em><b>Person Zahlungen Dritter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORAUSZAHLUNGEN_TYPE__PERSON_ZAHLUNGEN_DRITTER = 4;

	/**
	 * The feature id for the '<em><b>Hoehe Zahlungen Dritter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORAUSZAHLUNGEN_TYPE__HOEHE_ZAHLUNGEN_DRITTER = 5;

	/**
	 * The number of structural features of the '<em>Unterhaltsvorauszahlungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORAUSZAHLUNGEN_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Unterhaltsvorauszahlungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORAUSZAHLUNGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragAntrag0301TypeImpl <em>Unterhaltsvorschussantrag Antrag0301 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragAntrag0301TypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Gesamt Zahl Der Nachrichten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antragskind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__ANTRAGSKIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antragstellender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__ANTRAGSTELLENDER_ELTERNTEIL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anderer Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__ANDERER_ELTERNTEIL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Weitere Gemeinsame Kinder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__WEITERE_GEMEINSAME_KINDER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elternschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__ELTERNSCHAFT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unterhalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__UNTERHALT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Datenabruf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__DATENABRUF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pdf Antrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__PDF_ANTRAG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Warten Auf Unterschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__WARTEN_AUF_UNTERSCHRIFT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__DSGVO = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Art Signatur Digital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__ART_SIGNATUR_DIGITAL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Bestaetigung Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__BESTAETIGUNG_ANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Merkblatt UVG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__MERKBLATT_UVG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Weitergabe Bankverbindung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE__WEITERGABE_BANKVERBINDUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Unterhaltsvorschussantrag Antrag0301 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Unterhaltsvorschussantrag Antrag0301 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl <em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Gesamt Zahl Der Nachrichten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antragskind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antragstellender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anderer Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unterhalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Datenabruf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pdf Antrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Warten Auf Unterschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__WARTEN_AUF_UNTERSCHRIFT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Art Signatur Digital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ART_SIGNATUR_DIGITAL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Bestaetigung Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Merkblatt UVG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__MERKBLATT_UVG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl <em>Unterhaltsvorschussantrag Nachreichen0303 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachreichen0303TypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltsvorschussantragNachreichen0303Type()
	 * @generated
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Fallnummer UVO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__FALLNUMMER_UVO = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Kind Nachreichen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ANGABEN_KIND_NACHREICHEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aenderungsmitteilung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__AENDERUNGSMITTEILUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nachzureichendes Dokument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__NACHZUREICHENDES_DOKUMENT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__DSGVO = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Art Signatur Digital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__ART_SIGNATUR_DIGITAL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bestaetigung Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__BESTAETIGUNG_ANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Merkblatt UVG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE__MERKBLATT_UVG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Unterhaltsvorschussantrag Nachreichen0303 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Unterhaltsvorschussantrag Nachreichen0303 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachweisnachricht0311TypeImpl <em>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragNachweisnachricht0311TypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltsvorschussantragNachweisnachricht0311Type()
	 * @generated
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__NACHWEIS = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Zugehoeriger Antrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ZUGEHOERIGER_ANTRAG = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gesamt Zahl Der Nachrichten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Art Signatur Digital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__ART_SIGNATUR_DIGITAL = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bestaetigung Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__BESTAETIGUNG_ANGABEN = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Merkblatt UVG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE__MERKBLATT_UVG = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltszahlungenTypeImpl <em>Unterhaltszahlungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltszahlungenTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltszahlungenType()
	 * @generated
	 */
	int UNTERHALTSZAHLUNGEN_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Zeitpunkt Der Zahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG = 0;

	/**
	 * The feature id for the '<em><b>Hoehe Der Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSZAHLUNGEN_TYPE__HOEHE_DER_ZAHLUNG = 1;

	/**
	 * The number of structural features of the '<em>Unterhaltszahlungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSZAHLUNGEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unterhaltszahlungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALTSZAHLUNGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltTypeImpl <em>Unterhalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltType()
	 * @generated
	 */
	int UNTERHALT_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Unterhaltstitel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_TYPE__UNTERHALTSTITEL = UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL;

	/**
	 * The feature id for the '<em><b>Unterhaltzahlungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_TYPE__UNTERHALTZAHLUNGEN = UNTERHALT_BASIS_TYPE__UNTERHALTZAHLUNGEN;

	/**
	 * The feature id for the '<em><b>Unterhaltvorauszahlungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_TYPE__UNTERHALTVORAUSZAHLUNGEN = UNTERHALT_BASIS_TYPE__UNTERHALTVORAUSZAHLUNGEN;

	/**
	 * The feature id for the '<em><b>Bemuehungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_TYPE__BEMUEHUNGEN = UNTERHALT_BASIS_TYPE__BEMUEHUNGEN;

	/**
	 * The feature id for the '<em><b>Weitere Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_TYPE__WEITERE_ANGABEN = UNTERHALT_BASIS_TYPE__WEITERE_ANGABEN;

	/**
	 * The number of structural features of the '<em>Unterhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_TYPE_FEATURE_COUNT = UNTERHALT_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unterhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_TYPE_OPERATION_COUNT = UNTERHALT_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltUeberpruefungTypeImpl <em>Unterhalt Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltUeberpruefungType()
	 * @generated
	 */
	int UNTERHALT_UEBERPRUEFUNG_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Unterhaltstitel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_UEBERPRUEFUNG_TYPE__UNTERHALTSTITEL = UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL;

	/**
	 * The feature id for the '<em><b>Unterhaltzahlungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_UEBERPRUEFUNG_TYPE__UNTERHALTZAHLUNGEN = UNTERHALT_BASIS_TYPE__UNTERHALTZAHLUNGEN;

	/**
	 * The feature id for the '<em><b>Unterhaltvorauszahlungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_UEBERPRUEFUNG_TYPE__UNTERHALTVORAUSZAHLUNGEN = UNTERHALT_BASIS_TYPE__UNTERHALTVORAUSZAHLUNGEN;

	/**
	 * The feature id for the '<em><b>Bemuehungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_UEBERPRUEFUNG_TYPE__BEMUEHUNGEN = UNTERHALT_BASIS_TYPE__BEMUEHUNGEN;

	/**
	 * The feature id for the '<em><b>Weitere Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_UEBERPRUEFUNG_TYPE__WEITERE_ANGABEN = UNTERHALT_BASIS_TYPE__WEITERE_ANGABEN;

	/**
	 * The number of structural features of the '<em>Unterhalt Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = UNTERHALT_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unterhalt Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTERHALT_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = UNTERHALT_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl <em>Verheiratet Antragstellende Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND = 0;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND = 1;

	/**
	 * The feature id for the '<em><b>Ehepartner Seit Sechs Monaten In Anstalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT = 2;

	/**
	 * The feature id for the '<em><b>Ehegatte Ist Nicht Der Andere Elternteill Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT = 4;

	/**
	 * The feature id for the '<em><b>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM = 5;

	/**
	 * The feature id for the '<em><b>Steuerklasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE = 6;

	/**
	 * The feature id for the '<em><b>Steuerklasse Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS = 7;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN = 8;

	/**
	 * The number of structural features of the '<em>Verheiratet Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Verheiratet Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeTypeImpl <em>Verheiratet Antragstellende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVerheiratetAntragstellendeType()
	 * @generated
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE__GETRENNT_LEBEND = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE__GETRENNT_LEBEND_GRUND = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND;

	/**
	 * The feature id for the '<em><b>Ehepartner Seit Sechs Monaten In Anstalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT;

	/**
	 * The feature id for the '<em><b>Ehegatte Ist Nicht Der Andere Elternteill Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME;

	/**
	 * The feature id for the '<em><b>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT;

	/**
	 * The feature id for the '<em><b>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM;

	/**
	 * The feature id for the '<em><b>Steuerklasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE__STEUERKLASSE = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE;

	/**
	 * The feature id for the '<em><b>Steuerklasse Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE__STEUERKLASSE_NACHWEIS = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE__SEIT_WANN = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The number of structural features of the '<em>Verheiratet Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE_FEATURE_COUNT = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verheiratet Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_TYPE_OPERATION_COUNT = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeUeberpruefungTypeImpl <em>Verheiratet Antragstellende Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVerheiratetAntragstellendeUeberpruefungType()
	 * @generated
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__GETRENNT_LEBEND = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND;

	/**
	 * The feature id for the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__GETRENNT_LEBEND_GRUND = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND;

	/**
	 * The feature id for the '<em><b>Ehepartner Seit Sechs Monaten In Anstalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT;

	/**
	 * The feature id for the '<em><b>Ehegatte Ist Nicht Der Andere Elternteill Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME;

	/**
	 * The feature id for the '<em><b>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT;

	/**
	 * The feature id for the '<em><b>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM;

	/**
	 * The feature id for the '<em><b>Steuerklasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__STEUERKLASSE = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE;

	/**
	 * The feature id for the '<em><b>Steuerklasse Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__STEUERKLASSE_NACHWEIS = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__SEIT_WANN = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The number of structural features of the '<em>Verheiratet Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verheiratet Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VermoegenAndererElternteilTypeImpl <em>Vermoegen Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VermoegenAndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVermoegenAndererElternteilType()
	 * @generated
	 */
	int VERMOEGEN_ANDERER_ELTERNTEIL_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Zusaetzliche Informationen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERMOEGEN_ANDERER_ELTERNTEIL_TYPE__ZUSAETZLICHE_INFORMATIONEN = 1;

	/**
	 * The number of structural features of the '<em>Vermoegen Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERMOEGEN_ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vermoegen Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERMOEGEN_ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungTypeImpl <em>Vertretung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVertretungType()
	 * @generated
	 */
	int VERTRETUNG_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_TYPE__ART = 0;

	/**
	 * The feature id for the '<em><b>Vormund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_TYPE__VORMUND = 1;

	/**
	 * The feature id for the '<em><b>Beistand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_TYPE__BEISTAND = 2;

	/**
	 * The feature id for the '<em><b>Amtspflegschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_TYPE__AMTSPFLEGSCHAFT = 3;

	/**
	 * The feature id for the '<em><b>Rechtsanwalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_TYPE__RECHTSANWALT = 4;

	/**
	 * The feature id for the '<em><b>Betreuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_TYPE__BETREUER = 5;

	/**
	 * The feature id for the '<em><b>Organisationsname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_TYPE__ORGANISATIONSNAME = 6;

	/**
	 * The number of structural features of the '<em>Vertretung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Vertretung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungUeberpruefungTypeImpl <em>Vertretung Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVertretungUeberpruefungType()
	 * @generated
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE__ART = VERTRETUNG_TYPE__ART;

	/**
	 * The feature id for the '<em><b>Vormund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE__VORMUND = VERTRETUNG_TYPE__VORMUND;

	/**
	 * The feature id for the '<em><b>Beistand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE__BEISTAND = VERTRETUNG_TYPE__BEISTAND;

	/**
	 * The feature id for the '<em><b>Amtspflegschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE__AMTSPFLEGSCHAFT = VERTRETUNG_TYPE__AMTSPFLEGSCHAFT;

	/**
	 * The feature id for the '<em><b>Rechtsanwalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE__RECHTSANWALT = VERTRETUNG_TYPE__RECHTSANWALT;

	/**
	 * The feature id for the '<em><b>Betreuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE__BETREUER = VERTRETUNG_TYPE__BETREUER;

	/**
	 * The feature id for the '<em><b>Organisationsname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE__ORGANISATIONSNAME = VERTRETUNG_TYPE__ORGANISATIONSNAME;

	/**
	 * The number of structural features of the '<em>Vertretung Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = VERTRETUNG_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vertretung Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTRETUNG_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = VERTRETUNG_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeBasisTypeImpl <em>Verwitwet Antragstellende Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeBasisTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVerwitwetAntragstellendeBasisType()
	 * @generated
	 */
	int VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS = 0;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN = 1;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT = 2;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = 3;

	/**
	 * The number of structural features of the '<em>Verwitwet Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Verwitwet Antragstellende Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeTypeImpl <em>Verwitwet Antragstellende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVerwitwetAntragstellendeType()
	 * @generated
	 */
	int VERWITWET_ANTRAGSTELLENDE_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_TYPE__NACHWEIS = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_TYPE__SEIT_WANN = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_TYPE__HOCHZEIT_GEPLANT = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The number of structural features of the '<em>Verwitwet Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_TYPE_FEATURE_COUNT = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verwitwet Antragstellende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_TYPE_OPERATION_COUNT = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeUeberpruefungTypeImpl <em>Verwitwet Antragstellende Ueberpruefung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeUeberpruefungTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVerwitwetAntragstellendeUeberpruefungType()
	 * @generated
	 */
	int VERWITWET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__NACHWEIS = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS;

	/**
	 * The feature id for the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__SEIT_WANN = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN;

	/**
	 * The feature id for the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEIT_GEPLANT = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT;

	/**
	 * The feature id for the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH;

	/**
	 * The number of structural features of the '<em>Verwitwet Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_FEATURE_COUNT = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verwitwet Antragstellende Ueberpruefung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWITWET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE_OPERATION_COUNT = VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VormundTypeImpl <em>Vormund Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VormundTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getVormundType()
	 * @generated
	 */
	int VORMUND_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORMUND_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORMUND_TYPE__ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>EMail Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORMUND_TYPE__EMAIL_ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORMUND_TYPE__AKTENZEICHEN = 3;

	/**
	 * The feature id for the '<em><b>Telefonnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORMUND_TYPE__TELEFONNUMMER = 4;

	/**
	 * The number of structural features of the '<em>Vormund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORMUND_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Vormund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORMUND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereGemeinsameKinderTypeImpl <em>Weitere Gemeinsame Kinder Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereGemeinsameKinderTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getWeitereGemeinsameKinderType()
	 * @generated
	 */
	int WEITERE_GEMEINSAME_KINDER_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_GEMEINSAME_KINDER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Wohnhaft Bei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI = 2;

	/**
	 * The number of structural features of the '<em>Weitere Gemeinsame Kinder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_GEMEINSAME_KINDER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Weitere Gemeinsame Kinder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_GEMEINSAME_KINDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereKinderAndererElternteilTypeImpl <em>Weitere Kinder Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereKinderAndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getWeitereKinderAndererElternteilType()
	 * @generated
	 */
	int WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Wohnhaft Beim Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL = 2;

	/**
	 * The number of structural features of the '<em>Weitere Kinder Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Weitere Kinder Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Ausbildung <em>Ausbildung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Ausbildung
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAusbildung()
	 * @generated
	 */
	int AUSBILDUNG = 95;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenfteandererelternteil <em>Einkuenfteandererelternteil</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenfteandererelternteil
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getEinkuenfteandererelternteil()
	 * @generated
	 */
	int EINKUENFTEANDERERELTERNTEIL = 96;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenftekinduv <em>Einkuenftekinduv</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenftekinduv
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getEinkuenftekinduv()
	 * @generated
	 */
	int EINKUENFTEKINDUV = 97;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Sonstigeleistungenuv <em>Sonstigeleistungenuv</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Sonstigeleistungenuv
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getSonstigeleistungenuv()
	 * @generated
	 */
	int SONSTIGELEISTUNGENUV = 98;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Staatsangehoerigkeituv <em>Staatsangehoerigkeituv</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Staatsangehoerigkeituv
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getStaatsangehoerigkeituv()
	 * @generated
	 */
	int STAATSANGEHOERIGKEITUV = 99;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Steuerklasse <em>Steuerklasse</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Steuerklasse
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getSteuerklasse()
	 * @generated
	 */
	int STEUERKLASSE = 100;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Unterhaltsbemuehungen <em>Unterhaltsbemuehungen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Unterhaltsbemuehungen
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltsbemuehungen()
	 * @generated
	 */
	int UNTERHALTSBEMUEHUNGEN = 101;

	/**
	 * The meta object id for the '<em>Ausbildung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Ausbildung
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getAusbildungObject()
	 * @generated
	 */
	int AUSBILDUNG_OBJECT = 102;

	/**
	 * The meta object id for the '<em>Einkuenfteandererelternteil Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenfteandererelternteil
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getEinkuenfteandererelternteilObject()
	 * @generated
	 */
	int EINKUENFTEANDERERELTERNTEIL_OBJECT = 103;

	/**
	 * The meta object id for the '<em>Einkuenftekinduv Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenftekinduv
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getEinkuenftekinduvObject()
	 * @generated
	 */
	int EINKUENFTEKINDUV_OBJECT = 104;

	/**
	 * The meta object id for the '<em>Sonstigeleistungenuv Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Sonstigeleistungenuv
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getSonstigeleistungenuvObject()
	 * @generated
	 */
	int SONSTIGELEISTUNGENUV_OBJECT = 105;

	/**
	 * The meta object id for the '<em>Staatsangehoerigkeituv Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Staatsangehoerigkeituv
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getStaatsangehoerigkeituvObject()
	 * @generated
	 */
	int STAATSANGEHOERIGKEITUV_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Steuerklasse Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Steuerklasse
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getSteuerklasseObject()
	 * @generated
	 */
	int STEUERKLASSE_OBJECT = 107;

	/**
	 * The meta object id for the '<em>Unterhaltsbemuehungen Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Unterhaltsbemuehungen
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl#getUnterhaltsbemuehungenObject()
	 * @generated
	 */
	int UNTERHALTSBEMUEHUNGEN_OBJECT = 108;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType <em>Amtspflegende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amtspflegende Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType
	 * @generated
	 */
	EClass getAmtspflegendeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getName()
	 * @see #getAmtspflegendeType()
	 * @generated
	 */
	EReference getAmtspflegendeType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getAnschriftJugendamt <em>Anschrift Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Jugendamt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getAnschriftJugendamt()
	 * @see #getAmtspflegendeType()
	 * @generated
	 */
	EReference getAmtspflegendeType_AnschriftJugendamt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getJugendamtEMail <em>Jugendamt EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jugendamt EMail</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getJugendamtEMail()
	 * @see #getAmtspflegendeType()
	 * @generated
	 */
	EAttribute getAmtspflegendeType_JugendamtEMail();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getAktenzeichen <em>Aktenzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getAktenzeichen()
	 * @see #getAmtspflegendeType()
	 * @generated
	 */
	EAttribute getAmtspflegendeType_Aktenzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#isBeauftragtGeltungsmachungUVanspruch <em>Beauftragt Geltungsmachung UVanspruch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beauftragt Geltungsmachung UVanspruch</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#isBeauftragtGeltungsmachungUVanspruch()
	 * @see #getAmtspflegendeType()
	 * @generated
	 */
	EAttribute getAmtspflegendeType_BeauftragtGeltungsmachungUVanspruch();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getTelefonnummer <em>Telefonnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefonnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType#getTelefonnummer()
	 * @see #getAmtspflegendeType()
	 * @generated
	 */
	EAttribute getAmtspflegendeType_Telefonnummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType <em>Andere Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Andere Person Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType
	 * @generated
	 */
	EClass getAnderePersonType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType#getName()
	 * @see #getAnderePersonType()
	 * @generated
	 */
	EReference getAnderePersonType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType#getAnschrift()
	 * @see #getAnderePersonType()
	 * @generated
	 */
	EReference getAnderePersonType_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType#getBezeichnung()
	 * @see #getAnderePersonType()
	 * @generated
	 */
	EAttribute getAnderePersonType_Bezeichnung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType <em>Anderer Elternteil Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anderer Elternteil Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType
	 * @generated
	 */
	EClass getAndererElternteilBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getName()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getGeburt()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAnrede <em>Anrede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anrede</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAnrede()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EAttribute getAndererElternteilBasisType_Anrede();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getKindschaftsbeziehung <em>Kindschaftsbeziehung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kindschaftsbeziehung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getKindschaftsbeziehung()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Kindschaftsbeziehung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAnschrift()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Anschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAndereRegelmaessigerAufenthaltort <em>Andere Regelmaessiger Aufenthaltort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Andere Regelmaessiger Aufenthaltort</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAndereRegelmaessigerAufenthaltort()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_AndereRegelmaessigerAufenthaltort();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getStaatsangehoerigkeit()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getZusammenlebendMitNeuenPartner <em>Zusammenlebend Mit Neuen Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zusammenlebend Mit Neuen Partner</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getZusammenlebendMitNeuenPartner()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_ZusammenlebendMitNeuenPartner();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getErreichbarkeit()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Erreichbarkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getVertretung <em>Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertretung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getVertretung()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Vertretung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getVermoegen <em>Vermoegen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vermoegen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getVermoegen()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Vermoegen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getEinkuenfte <em>Einkuenfte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Einkuenfte</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getEinkuenfte()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Einkuenfte();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getSonstigeLeistungen <em>Sonstige Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sonstige Leistungen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getSonstigeLeistungen()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_SonstigeLeistungen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getTraegerKrankenversicherung <em>Traeger Krankenversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traeger Krankenversicherung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getTraegerKrankenversicherung()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_TraegerKrankenversicherung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getWeitereKinder <em>Weitere Kinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Kinder</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getWeitereKinder()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_WeitereKinder();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAusbildung <em>Ausbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ausbildung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAusbildung()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Ausbildung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getLeistungsfaehig <em>Leistungsfaehig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leistungsfaehig</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getLeistungsfaehig()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EAttribute getAndererElternteilBasisType_Leistungsfaehig();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getWeitereAngaben <em>Weitere Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weitere Angaben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getWeitereAngaben()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_WeitereAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getGeschlecht()
	 * @see #getAndererElternteilBasisType()
	 * @generated
	 */
	EReference getAndererElternteilBasisType_Geschlecht();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilType <em>Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilType
	 * @generated
	 */
	EClass getAndererElternteilType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilUeberpruefungType <em>Anderer Elternteil Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anderer Elternteil Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilUeberpruefungType
	 * @generated
	 */
	EClass getAndererElternteilUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AngabenKindNachreichenType <em>Angaben Kind Nachreichen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Kind Nachreichen Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AngabenKindNachreichenType
	 * @generated
	 */
	EClass getAngabenKindNachreichenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AngabenKindNachreichenType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AngabenKindNachreichenType#getName()
	 * @see #getAngabenKindNachreichenType()
	 * @generated
	 */
	EReference getAngabenKindNachreichenType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AngabenKindNachreichenType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AngabenKindNachreichenType#getGeburt()
	 * @see #getAngabenKindNachreichenType()
	 * @generated
	 */
	EReference getAngabenKindNachreichenType_Geburt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType <em>Anschrift Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anschrift Optional Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType
	 * @generated
	 */
	EClass getAnschriftOptionalType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getHausnummer <em>Hausnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getHausnummer()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_Hausnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getHausnummerBuchstabeZusatzziffer <em>Hausnummer Buchstabe Zusatzziffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer Buchstabe Zusatzziffer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getHausnummerBuchstabeZusatzziffer()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_HausnummerBuchstabeZusatzziffer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getPostleitzahl <em>Postleitzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postleitzahl</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getPostleitzahl()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_Postleitzahl();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStockwerkswohnungsnummer <em>Stockwerkswohnungsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stockwerkswohnungsnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStockwerkswohnungsnummer()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_Stockwerkswohnungsnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStrasse <em>Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strasse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStrasse()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_Strasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getTeilnummerDerHausnummer <em>Teilnummer Der Hausnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teilnummer Der Hausnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getTeilnummerDerHausnummer()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_TeilnummerDerHausnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnort <em>Wohnort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnort</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnort()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_Wohnort();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnortFruehererGemeindename <em>Wohnort Frueherer Gemeindename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnort Frueherer Gemeindename</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnortFruehererGemeindename()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_WohnortFruehererGemeindename();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnungsinhaber <em>Wohnungsinhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnungsinhaber</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnungsinhaber()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_Wohnungsinhaber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getZusatzangaben <em>Zusatzangaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatzangaben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getZusatzangaben()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftOptionalType_Zusatzangaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStaat <em>Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staat</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStaat()
	 * @see #getAnschriftOptionalType()
	 * @generated
	 */
	EReference getAnschriftOptionalType_Staat();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType <em>Antragskind Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragskind Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType
	 * @generated
	 */
	EClass getAntragskindBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getName()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeburt()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_Geburt();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeburtsurkunde <em>Geburtsurkunde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Geburtsurkunde</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeburtsurkunde()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EAttribute getAntragskindBasisType_Geburtsurkunde();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAufenthaltstitel <em>Aufenthaltstitel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aufenthaltstitel</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAufenthaltstitel()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EAttribute getAntragskindBasisType_Aufenthaltstitel();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getStaatsangehoerigkeit()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAufenthalt <em>Aufenthalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aufenthalt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAufenthalt()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_Aufenthalt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getVertretung <em>Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertretung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getVertretung()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_Vertretung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getEinkuenfte <em>Einkuenfte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Einkuenfte</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getEinkuenfte()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_Einkuenfte();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getSonstigeLeistung <em>Sonstige Leistung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sonstige Leistung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getSonstigeLeistung()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_SonstigeLeistung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAnderePersonVerstorben <em>Andere Person Verstorben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Andere Person Verstorben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAnderePersonVerstorben()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_AnderePersonVerstorben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getMitbetreuungDurchAnderenElternteil <em>Mitbetreuung Durch Anderen Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mitbetreuung Durch Anderen Elternteil</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getMitbetreuungDurchAnderenElternteil()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_MitbetreuungDurchAnderenElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getSchule <em>Schule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schule</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getSchule()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_Schule();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getStudium <em>Studium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Studium</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getStudium()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_Studium();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeschlecht()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EReference getAntragskindBasisType_Geschlecht();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAktenzeichen <em>Aktenzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAktenzeichen()
	 * @see #getAntragskindBasisType()
	 * @generated
	 */
	EAttribute getAntragskindBasisType_Aktenzeichen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindType <em>Antragskind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragskind Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindType
	 * @generated
	 */
	EClass getAntragskindType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindUeberpruefungType <em>Antragskind Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragskind Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindUeberpruefungType
	 * @generated
	 */
	EClass getAntragskindUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType <em>Antragstellender Elternteil Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragstellender Elternteil Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType
	 * @generated
	 */
	EClass getAntragstellenderElternteilBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getName()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getGeburt()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAnrede <em>Anrede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anrede</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAnrede()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilBasisType_Anrede();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getKindschaftsbeziehung <em>Kindschaftsbeziehung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kindschaftsbeziehung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getKindschaftsbeziehung()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Kindschaftsbeziehung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAnschrift()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Anschrift();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAufenthaltstitelEAT <em>Aufenthaltstitel EAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aufenthaltstitel EAT</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAufenthaltstitelEAT()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_AufenthaltstitelEAT();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAufenthaltstitelUpload <em>Aufenthaltstitel Upload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aufenthaltstitel Upload</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAufenthaltstitelUpload()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilBasisType_AufenthaltstitelUpload();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getFamilienstand <em>Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienstand</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getFamilienstand()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Familienstand();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getErreichbarkeit()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Erreichbarkeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getBankverbindung <em>Bankverbindung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bankverbindung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getBankverbindung()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Bankverbindung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getStaatsangehoerigkeit()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isEinkommensgrenzeErfuellt <em>Einkommensgrenze Erfuellt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommensgrenze Erfuellt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isEinkommensgrenzeErfuellt()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilBasisType_EinkommensgrenzeErfuellt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getPostAdresse <em>Post Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Adresse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getPostAdresse()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_PostAdresse();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getVertretung <em>Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertretung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getVertretung()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Vertretung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresse <em>Zukuenftige Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zukuenftige Adresse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresse()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_ZukuenftigeAdresse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresseAb <em>Zukuenftige Adresse Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zukuenftige Adresse Ab</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresseAb()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilBasisType_ZukuenftigeAdresseAb();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isZukuenftigeAdresseMitAnderemElternteil <em>Zukuenftige Adresse Mit Anderem Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zukuenftige Adresse Mit Anderem Elternteil</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isZukuenftigeAdresseMitAnderemElternteil()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilBasisType_ZukuenftigeAdresseMitAnderemElternteil();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresseMitAnderemElternteilAb <em>Zukuenftige Adresse Mit Anderem Elternteil Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zukuenftige Adresse Mit Anderem Elternteil Ab</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresseMitAnderemElternteilAb()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilBasisType_ZukuenftigeAdresseMitAnderemElternteilAb();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getNameNachweis <em>Name Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getNameNachweis()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_NameNachweis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getLohnsteuerklasse <em>Lohnsteuerklasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lohnsteuerklasse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getLohnsteuerklasse()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Lohnsteuerklasse();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getGeschlecht()
	 * @see #getAntragstellenderElternteilBasisType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBasisType_Geschlecht();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilType <em>Antragstellender Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragstellender Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilType
	 * @generated
	 */
	EClass getAntragstellenderElternteilType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilUeberpruefungType <em>Antragstellender Elternteil Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragstellender Elternteil Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilUeberpruefungType
	 * @generated
	 */
	EClass getAntragstellenderElternteilUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType <em>Aufenthalt Kind Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aufenthalt Kind Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType
	 * @generated
	 */
	EClass getAufenthaltKindBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getArt()
	 * @see #getAufenthaltKindBasisType()
	 * @generated
	 */
	EReference getAufenthaltKindBasisType_Art();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#isAufenthaltsortGeheimHalten <em>Aufenthaltsort Geheim Halten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aufenthaltsort Geheim Halten</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#isAufenthaltsortGeheimHalten()
	 * @see #getAufenthaltKindBasisType()
	 * @generated
	 */
	EAttribute getAufenthaltKindBasisType_AufenthaltsortGeheimHalten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getAuslandsschuljahr <em>Auslandsschuljahr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auslandsschuljahr</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getAuslandsschuljahr()
	 * @see #getAufenthaltKindBasisType()
	 * @generated
	 */
	EReference getAufenthaltKindBasisType_Auslandsschuljahr();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getSeitWann <em>Seit Wann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seit Wann</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getSeitWann()
	 * @see #getAufenthaltKindBasisType()
	 * @generated
	 */
	EAttribute getAufenthaltKindBasisType_SeitWann();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getAufenthaltHeim <em>Aufenthalt Heim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aufenthalt Heim</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getAufenthaltHeim()
	 * @see #getAufenthaltKindBasisType()
	 * @generated
	 */
	EAttribute getAufenthaltKindBasisType_AufenthaltHeim();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindType <em>Aufenthalt Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aufenthalt Kind Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindType
	 * @generated
	 */
	EClass getAufenthaltKindType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindUeberpruefungType <em>Aufenthalt Kind Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aufenthalt Kind Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindUeberpruefungType
	 * @generated
	 */
	EClass getAufenthaltKindUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType <em>Ausbildung Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ausbildung Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType
	 * @generated
	 */
	EClass getAusbildungAndererElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType#getArt()
	 * @see #getAusbildungAndererElternteilType()
	 * @generated
	 */
	EReference getAusbildungAndererElternteilType_Art();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType#getZusaetzlicheInformationen <em>Zusaetzliche Informationen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Zusaetzliche Informationen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType#getZusaetzlicheInformationen()
	 * @see #getAusbildungAndererElternteilType()
	 * @generated
	 */
	EAttribute getAusbildungAndererElternteilType_ZusaetzlicheInformationen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType <em>Beistand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beistand Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType
	 * @generated
	 */
	EClass getBeistandType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getName()
	 * @see #getBeistandType()
	 * @generated
	 */
	EReference getBeistandType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getAnschriftJugendamt <em>Anschrift Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Jugendamt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getAnschriftJugendamt()
	 * @see #getBeistandType()
	 * @generated
	 */
	EReference getBeistandType_AnschriftJugendamt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getJugendamtEMail <em>Jugendamt EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jugendamt EMail</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getJugendamtEMail()
	 * @see #getBeistandType()
	 * @generated
	 */
	EAttribute getBeistandType_JugendamtEMail();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getAktenzeichen <em>Aktenzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getAktenzeichen()
	 * @see #getBeistandType()
	 * @generated
	 */
	EAttribute getBeistandType_Aktenzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getTelefonnummer <em>Telefonnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefonnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getTelefonnummer()
	 * @see #getBeistandType()
	 * @generated
	 */
	EAttribute getBeistandType_Telefonnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#isBeauftragtGeltungsmachungUVanspruch <em>Beauftragt Geltungsmachung UVanspruch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beauftragt Geltungsmachung UVanspruch</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#isBeauftragtGeltungsmachungUVanspruch()
	 * @see #getBeistandType()
	 * @generated
	 */
	EAttribute getBeistandType_BeauftragtGeltungsmachungUVanspruch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType <em>Bemuehungen Unterhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bemuehungen Unterhalt Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType
	 * @generated
	 */
	EClass getBemuehungenUnterhaltType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType#getArt()
	 * @see #getBemuehungenUnterhaltType()
	 * @generated
	 */
	EReference getBemuehungenUnterhaltType_Art();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType#getNachweis()
	 * @see #getBemuehungenUnterhaltType()
	 * @generated
	 */
	EAttribute getBemuehungenUnterhaltType_Nachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType#getGenauereAngaben <em>Genauere Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genauere Angaben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType#getGenauereAngaben()
	 * @see #getBemuehungenUnterhaltType()
	 * @generated
	 */
	EAttribute getBemuehungenUnterhaltType_GenauereAngaben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType#getGruende <em>Gruende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gruende</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType#getGruende()
	 * @see #getBemuehungenUnterhaltType()
	 * @generated
	 */
	EAttribute getBemuehungenUnterhaltType_Gruende();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType <em>Bestaetigung Angaben Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bestaetigung Angaben Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType
	 * @generated
	 */
	EClass getBestaetigungAngabenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isWahrheitsgemaesseAngaben <em>Wahrheitsgemaesse Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wahrheitsgemaesse Angaben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isWahrheitsgemaesseAngaben()
	 * @see #getBestaetigungAngabenType()
	 * @generated
	 */
	EAttribute getBestaetigungAngabenType_WahrheitsgemaesseAngaben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isVerpflichtungAenderungsmitteilungen <em>Verpflichtung Aenderungsmitteilungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verpflichtung Aenderungsmitteilungen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType#isVerpflichtungAenderungsmitteilungen()
	 * @see #getBestaetigungAngabenType()
	 * @generated
	 */
	EAttribute getBestaetigungAngabenType_VerpflichtungAenderungsmitteilungen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType <em>Betreuer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Betreuer Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType
	 * @generated
	 */
	EClass getBetreuerType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getName()
	 * @see #getBetreuerType()
	 * @generated
	 */
	EReference getBetreuerType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getAnschrift()
	 * @see #getBetreuerType()
	 * @generated
	 */
	EReference getBetreuerType_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getEMailAdresse <em>EMail Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail Adresse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getEMailAdresse()
	 * @see #getBetreuerType()
	 * @generated
	 */
	EAttribute getBetreuerType_EMailAdresse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getAktenzeichen <em>Aktenzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getAktenzeichen()
	 * @see #getBetreuerType()
	 * @generated
	 */
	EAttribute getBetreuerType_Aktenzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getTelefonnummer <em>Telefonnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefonnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getTelefonnummer()
	 * @see #getBetreuerType()
	 * @generated
	 */
	EAttribute getBetreuerType_Telefonnummer();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getBestallungsurkunde <em>Bestallungsurkunde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bestallungsurkunde</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getBestallungsurkunde()
	 * @see #getBetreuerType()
	 * @generated
	 */
	EAttribute getBetreuerType_Bestallungsurkunde();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType <em>Bezug Uv Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bezug Uv Kind Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType
	 * @generated
	 */
	EClass getBezugUvKindType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType#getBezugsJugendamt <em>Bezugs Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezugs Jugendamt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType#getBezugsJugendamt()
	 * @see #getBezugUvKindType()
	 * @generated
	 */
	EAttribute getBezugUvKindType_BezugsJugendamt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType#getBisWann <em>Bis Wann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bis Wann</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType#getBisWann()
	 * @see #getBezugUvKindType()
	 * @generated
	 */
	EReference getBezugUvKindType_BisWann();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeAusbildungType <em>Code Ausbildung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Ausbildung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeAusbildungType
	 * @generated
	 */
	EClass getCodeAusbildungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteAndererElternteilType <em>Code Einkuenfte Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Einkuenfte Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteAndererElternteilType
	 * @generated
	 */
	EClass getCodeEinkuenfteAndererElternteilType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteKindType <em>Code Einkuenfte Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Einkuenfte Kind Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteKindType
	 * @generated
	 */
	EClass getCodeEinkuenfteKindType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSonstigeLeistungenUVType <em>Code Sonstige Leistungen UV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Sonstige Leistungen UV Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSonstigeLeistungenUVType
	 * @generated
	 */
	EClass getCodeSonstigeLeistungenUVType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeStaatsangehoerigkeitUVType <em>Code Staatsangehoerigkeit UV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Staatsangehoerigkeit UV Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeStaatsangehoerigkeitUVType
	 * @generated
	 */
	EClass getCodeStaatsangehoerigkeitUVType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSteuerklasseType <em>Code Steuerklasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Steuerklasse Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSteuerklasseType
	 * @generated
	 */
	EClass getCodeSteuerklasseType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeUnterhaltsbemuehungenType <em>Code Unterhaltsbemuehungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Unterhaltsbemuehungen Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeUnterhaltsbemuehungenType
	 * @generated
	 */
	EClass getCodeUnterhaltsbemuehungenType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragAntrag0301 <em>Unterhaltsvorschussantrag Antrag0301</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unterhaltsvorschussantrag Antrag0301</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragAntrag0301()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnterhaltsvorschussantragAntrag0301();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302 <em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnterhaltsvorschussantragJaehrlicheUeberpruefung0302();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragNachreichen0303 <em>Unterhaltsvorschussantrag Nachreichen0303</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unterhaltsvorschussantrag Nachreichen0303</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragNachreichen0303()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnterhaltsvorschussantragNachreichen0303();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragNachweisnachricht0311 <em>Unterhaltsvorschussantrag Nachweisnachricht0311</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unterhaltsvorschussantrag Nachweisnachricht0311</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragNachweisnachricht0311()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnterhaltsvorschussantragNachweisnachricht0311();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType <em>Einkuenfte Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkuenfte Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType
	 * @generated
	 */
	EClass getEinkuenfteAndererElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getArt()
	 * @see #getEinkuenfteAndererElternteilType()
	 * @generated
	 */
	EReference getEinkuenfteAndererElternteilType_Art();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getWeitereInformationen <em>Weitere Informationen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weitere Informationen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getWeitereInformationen()
	 * @see #getEinkuenfteAndererElternteilType()
	 * @generated
	 */
	EAttribute getEinkuenfteAndererElternteilType_WeitereInformationen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getBetragDerEinkuenfte <em>Betrag Der Einkuenfte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betrag Der Einkuenfte</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType#getBetragDerEinkuenfte()
	 * @see #getEinkuenfteAndererElternteilType()
	 * @generated
	 */
	EAttribute getEinkuenfteAndererElternteilType_BetragDerEinkuenfte();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType <em>Einkuenfte Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkuenfte Kind Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType
	 * @generated
	 */
	EClass getEinkuenfteKindType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getArt()
	 * @see #getEinkuenfteKindType()
	 * @generated
	 */
	EReference getEinkuenfteKindType_Art();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getNachweis()
	 * @see #getEinkuenfteKindType()
	 * @generated
	 */
	EAttribute getEinkuenfteKindType_Nachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getBetragDerEinkuenfte <em>Betrag Der Einkuenfte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betrag Der Einkuenfte</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getBetragDerEinkuenfte()
	 * @see #getEinkuenfteKindType()
	 * @generated
	 */
	EAttribute getEinkuenfteKindType_BetragDerEinkuenfte();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getZeitraum()
	 * @see #getEinkuenfteKindType()
	 * @generated
	 */
	EReference getEinkuenfteKindType_Zeitraum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType <em>Elternschaft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elternschaft Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType
	 * @generated
	 */
	EClass getElternschaftType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhelichesAntragskind <em>Eheliches Antragskind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eheliches Antragskind</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhelichesAntragskind()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EAttribute getElternschaftType_EhelichesAntragskind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isVaterschaftAnerkanntOderFestgestellt <em>Vaterschaft Anerkannt Oder Festgestellt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vaterschaft Anerkannt Oder Festgestellt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isVaterschaftAnerkanntOderFestgestellt()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EAttribute getElternschaftType_VaterschaftAnerkanntOderFestgestellt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhemannIstLeiblicherVater <em>Ehemann Ist Leiblicher Vater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ehemann Ist Leiblicher Vater</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhemannIstLeiblicherVater()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EAttribute getElternschaftType_EhemannIstLeiblicherVater();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getNachweis()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EAttribute getElternschaftType_Nachweis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getNameVater <em>Name Vater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Vater</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getNameVater()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EReference getElternschaftType_NameVater();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragFeststellungGestellt <em>Antrag Feststellung Gestellt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antrag Feststellung Gestellt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragFeststellungGestellt()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EAttribute getElternschaftType_AntragFeststellungGestellt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragAnfechtungAnhaengig <em>Antrag Anfechtung Anhaengig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antrag Anfechtung Anhaengig</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragAnfechtungAnhaengig()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EAttribute getElternschaftType_AntragAnfechtungAnhaengig();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getAngabedesGerichts <em>Angabedes Gerichts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angabedes Gerichts</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getAngabedesGerichts()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EAttribute getElternschaftType_AngabedesGerichts();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getWeitereInformation <em>Weitere Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weitere Information</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getWeitereInformation()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EAttribute getElternschaftType_WeitereInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAngabeObBeiGeburtVerheiratet <em>Angabe Ob Bei Geburt Verheiratet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angabe Ob Bei Geburt Verheiratet</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAngabeObBeiGeburtVerheiratet()
	 * @see #getElternschaftType()
	 * @generated
	 */
	EAttribute getElternschaftType_AngabeObBeiGeburtVerheiratet();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType <em>Familienstand Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Familienstand Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType
	 * @generated
	 */
	EClass getFamilienstandBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType#getArt()
	 * @see #getFamilienstandBasisType()
	 * @generated
	 */
	EReference getFamilienstandBasisType_Art();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType#getLebenssituation <em>Lebenssituation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lebenssituation</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType#getLebenssituation()
	 * @see #getFamilienstandBasisType()
	 * @generated
	 */
	EReference getFamilienstandBasisType_Lebenssituation();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandType <em>Familienstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Familienstand Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandType
	 * @generated
	 */
	EClass getFamilienstandType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandUeberpruefungType <em>Familienstand Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Familienstand Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandUeberpruefungType
	 * @generated
	 */
	EClass getFamilienstandUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtGeburtsortPflichtType <em>Geburt Geburtsort Pflicht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geburt Geburtsort Pflicht Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtGeburtsortPflichtType
	 * @generated
	 */
	EClass getGeburtGeburtsortPflichtType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtNurGeburtsdatumType <em>Geburt Nur Geburtsdatum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geburt Nur Geburtsdatum Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtNurGeburtsdatumType
	 * @generated
	 */
	EClass getGeburtNurGeburtsdatumType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType <em>Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geburt Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType
	 * @generated
	 */
	EClass getGeburtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType#getGeburtsort <em>Geburtsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsort</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType#getGeburtsort()
	 * @see #getGeburtType()
	 * @generated
	 */
	EAttribute getGeburtType_Geburtsort();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType#getGeburtsortStaat <em>Geburtsort Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsort Staat</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType#getGeburtsortStaat()
	 * @see #getGeburtType()
	 * @generated
	 */
	EReference getGeburtType_GeburtsortStaat();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType#getGeburtsdatum()
	 * @see #getGeburtType()
	 * @generated
	 */
	EReference getGeburtType_Geburtsdatum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType <em>Geschieden Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschieden Antragstellende Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType
	 * @generated
	 */
	EClass getGeschiedenAntragstellendeBasisType();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType#getNachweis()
	 * @see #getGeschiedenAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getGeschiedenAntragstellendeBasisType_Nachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeit Geplant</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType#isHochzeitGeplant()
	 * @see #getGeschiedenAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getGeschiedenAntragstellendeBasisType_HochzeitGeplant();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeitsdatum Voraussichtlich</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich()
	 * @see #getGeschiedenAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getGeschiedenAntragstellendeBasisType_HochzeitsdatumVoraussichtlich();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeType <em>Geschieden Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschieden Antragstellende Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeType
	 * @generated
	 */
	EClass getGeschiedenAntragstellendeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeUeberpruefungType <em>Geschieden Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschieden Antragstellende Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeUeberpruefungType
	 * @generated
	 */
	EClass getGeschiedenAntragstellendeUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType <em>Institution Unterhaltstitel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Institution Unterhaltstitel Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType
	 * @generated
	 */
	EClass getInstitutionUnterhaltstitelType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getName()
	 * @see #getInstitutionUnterhaltstitelType()
	 * @generated
	 */
	EReference getInstitutionUnterhaltstitelType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getAnschrift()
	 * @see #getInstitutionUnterhaltstitelType()
	 * @generated
	 */
	EReference getInstitutionUnterhaltstitelType_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getBezeichnung()
	 * @see #getInstitutionUnterhaltstitelType()
	 * @generated
	 */
	EAttribute getInstitutionUnterhaltstitelType_Bezeichnung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType <em>Lebenspartnerschaft Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenspartnerschaft Antragstellende Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType
	 * @generated
	 */
	EClass getLebenspartnerschaftAntragstellendeBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getGetrenntLebend <em>Getrennt Lebend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Getrennt Lebend</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getGetrenntLebend()
	 * @see #getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLebenspartnerschaftAntragstellendeBasisType_GetrenntLebend();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getrennt Lebend Grund</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getGetrenntLebendGrund()
	 * @see #getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerschaftAntragstellendeBasisType_GetrenntLebendGrund();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerSeitSechsMonatenInAnstalt <em>Lebenspartner Seit Sechs Monaten In Anstalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lebenspartner Seit Sechs Monaten In Anstalt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerSeitSechsMonatenInAnstalt()
	 * @see #getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerSeitSechsMonatenInAnstalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilName <em>Lebenspartner Ist Nicht Der Andere Elternteil Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lebenspartner Ist Nicht Der Andere Elternteil Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilName()
	 * @see #getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerIstNichtDerAndereElternteilName();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilAnschrift <em>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilAnschrift()
	 * @see #getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerIstNichtDerAndereElternteilAnschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum <em>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum()
	 * @see #getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerIstNichtDerAndereElternteilGeburtsdatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSteuerklasse <em>Steuerklasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steuerklasse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSteuerklasse()
	 * @see #getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerschaftAntragstellendeBasisType_Steuerklasse();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSteuerklasseNachweis <em>Steuerklasse Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Steuerklasse Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSteuerklasseNachweis()
	 * @see #getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerschaftAntragstellendeBasisType_SteuerklasseNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seit Wann</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType#getSeitWann()
	 * @see #getLebenspartnerschaftAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerschaftAntragstellendeBasisType_SeitWann();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeType <em>Lebenspartnerschaft Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenspartnerschaft Antragstellende Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeType
	 * @generated
	 */
	EClass getLebenspartnerschaftAntragstellendeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeUeberpruefungType <em>Lebenspartnerschaft Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenspartnerschaft Antragstellende Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeUeberpruefungType
	 * @generated
	 */
	EClass getLebenspartnerschaftAntragstellendeUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType <em>Lebenspartnerschaft Aufgehoben Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenspartnerschaft Aufgehoben Antragstellende Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType
	 * @generated
	 */
	EClass getLebenspartnerschaftAufgehobenAntragstellendeBasisType();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getNachweis()
	 * @see #getLebenspartnerschaftAufgehobenAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerschaftAufgehobenAntragstellendeBasisType_Nachweis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seit Wann</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getSeitWann()
	 * @see #getLebenspartnerschaftAufgehobenAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLebenspartnerschaftAufgehobenAntragstellendeBasisType_SeitWann();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeit Geplant</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#isHochzeitGeplant()
	 * @see #getLebenspartnerschaftAufgehobenAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerschaftAufgehobenAntragstellendeBasisType_HochzeitGeplant();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeitsdatum Voraussichtlich</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich()
	 * @see #getLebenspartnerschaftAufgehobenAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerschaftAufgehobenAntragstellendeBasisType_HochzeitsdatumVoraussichtlich();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeType <em>Lebenspartnerschaft Aufgehoben Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenspartnerschaft Aufgehoben Antragstellende Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeType
	 * @generated
	 */
	EClass getLebenspartnerschaftAufgehobenAntragstellendeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType <em>Lebenspartnerschaft Aufgehoben Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenspartnerschaft Aufgehoben Antragstellende Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType
	 * @generated
	 */
	EClass getLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType <em>Lebenspartner Verstorben Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenspartner Verstorben Antragstellende Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType
	 * @generated
	 */
	EClass getLebenspartnerVerstorbenAntragstellendeBasisType();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType#getNachweis()
	 * @see #getLebenspartnerVerstorbenAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerVerstorbenAntragstellendeBasisType_Nachweis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seit Wann</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType#getSeitWann()
	 * @see #getLebenspartnerVerstorbenAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLebenspartnerVerstorbenAntragstellendeBasisType_SeitWann();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeit Geplant</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType#isHochzeitGeplant()
	 * @see #getLebenspartnerVerstorbenAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerVerstorbenAntragstellendeBasisType_HochzeitGeplant();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeitsdatum Voraussichtlich</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich()
	 * @see #getLebenspartnerVerstorbenAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLebenspartnerVerstorbenAntragstellendeBasisType_HochzeitsdatumVoraussichtlich();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeType <em>Lebenspartner Verstorben Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenspartner Verstorben Antragstellende Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeType
	 * @generated
	 */
	EClass getLebenspartnerVerstorbenAntragstellendeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeUeberpruefungType <em>Lebenspartner Verstorben Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenspartner Verstorben Antragstellende Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeUeberpruefungType
	 * @generated
	 */
	EClass getLebenspartnerVerstorbenAntragstellendeUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType <em>Lebenssituation Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenssituation Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType
	 * @generated
	 */
	EClass getLebenssituationBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLedig <em>Ledig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ledig</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLedig()
	 * @see #getLebenssituationBasisType()
	 * @generated
	 */
	EReference getLebenssituationBasisType_Ledig();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getVerheiratet <em>Verheiratet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verheiratet</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getVerheiratet()
	 * @see #getLebenssituationBasisType()
	 * @generated
	 */
	EReference getLebenssituationBasisType_Verheiratet();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerschaft <em>Lebenspartnerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lebenspartnerschaft</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerschaft()
	 * @see #getLebenssituationBasisType()
	 * @generated
	 */
	EReference getLebenssituationBasisType_Lebenspartnerschaft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getGeschieden <em>Geschieden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschieden</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getGeschieden()
	 * @see #getLebenssituationBasisType()
	 * @generated
	 */
	EReference getLebenssituationBasisType_Geschieden();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getVerwitwet <em>Verwitwet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verwitwet</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getVerwitwet()
	 * @see #getLebenssituationBasisType()
	 * @generated
	 */
	EReference getLebenssituationBasisType_Verwitwet();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerschaftAufgehoben <em>Lebenspartnerschaft Aufgehoben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lebenspartnerschaft Aufgehoben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerschaftAufgehoben()
	 * @see #getLebenssituationBasisType()
	 * @generated
	 */
	EReference getLebenssituationBasisType_LebenspartnerschaftAufgehoben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerVerstorben <em>Lebenspartner Verstorben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lebenspartner Verstorben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerVerstorben()
	 * @see #getLebenssituationBasisType()
	 * @generated
	 */
	EReference getLebenssituationBasisType_LebenspartnerVerstorben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationType <em>Lebenssituation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenssituation Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationType
	 * @generated
	 */
	EClass getLebenssituationType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationUeberpruefungType <em>Lebenssituation Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenssituation Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationUeberpruefungType
	 * @generated
	 */
	EClass getLebenssituationUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType <em>Ledig Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ledig Antragstellende Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType
	 * @generated
	 */
	EClass getLedigAntragstellendeBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getAndererElternteilVerstorben <em>Anderer Elternteil Verstorben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anderer Elternteil Verstorben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getAndererElternteilVerstorben()
	 * @see #getLedigAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLedigAntragstellendeBasisType_AndererElternteilVerstorben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isLebtMitAnderemElternteilZusammen <em>Lebt Mit Anderem Elternteil Zusammen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lebt Mit Anderem Elternteil Zusammen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isLebtMitAnderemElternteilZusammen()
	 * @see #getLedigAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLedigAntragstellendeBasisType_LebtMitAnderemElternteilZusammen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isNieMitAnderemElternteilZusammengelebt <em>Nie Mit Anderem Elternteil Zusammengelebt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nie Mit Anderem Elternteil Zusammengelebt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isNieMitAnderemElternteilZusammengelebt()
	 * @see #getLedigAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLedigAntragstellendeBasisType_NieMitAnderemElternteilZusammengelebt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isVaterIstNamentlichBekannt <em>Vater Ist Namentlich Bekannt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vater Ist Namentlich Bekannt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isVaterIstNamentlichBekannt()
	 * @see #getLedigAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLedigAntragstellendeBasisType_VaterIstNamentlichBekannt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getVomAnderenElternteilGetrennt <em>Vom Anderen Elternteil Getrennt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vom Anderen Elternteil Getrennt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getVomAnderenElternteilGetrennt()
	 * @see #getLedigAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLedigAntragstellendeBasisType_VomAnderenElternteilGetrennt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getSeitWannGetrennt <em>Seit Wann Getrennt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seit Wann Getrennt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getSeitWannGetrennt()
	 * @see #getLedigAntragstellendeBasisType()
	 * @generated
	 */
	EReference getLedigAntragstellendeBasisType_SeitWannGetrennt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeit Geplant</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isHochzeitGeplant()
	 * @see #getLedigAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLedigAntragstellendeBasisType_HochzeitGeplant();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeitsdatum Voraussichtlich</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich()
	 * @see #getLedigAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLedigAntragstellendeBasisType_HochzeitsdatumVoraussichtlich();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getrennt Lebend Grund</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getGetrenntLebendGrund()
	 * @see #getLedigAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getLedigAntragstellendeBasisType_GetrenntLebendGrund();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeType <em>Ledig Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ledig Antragstellende Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeType
	 * @generated
	 */
	EClass getLedigAntragstellendeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeUeberpruefungType <em>Ledig Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ledig Antragstellende Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeUeberpruefungType
	 * @generated
	 */
	EClass getLedigAntragstellendeUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType <em>Leistungserhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leistungserhalt Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType
	 * @generated
	 */
	EClass getLeistungserhaltType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType#getArt()
	 * @see #getLeistungserhaltType()
	 * @generated
	 */
	EReference getLeistungserhaltType_Art();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType#getNachweis()
	 * @see #getLeistungserhaltType()
	 * @generated
	 */
	EAttribute getLeistungserhaltType_Nachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungsgewaehrungType <em>Leistungsgewaehrung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leistungsgewaehrung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungsgewaehrungType
	 * @generated
	 */
	EClass getLeistungsgewaehrungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungsgewaehrungType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungsgewaehrungType#getArt()
	 * @see #getLeistungsgewaehrungType()
	 * @generated
	 */
	EReference getLeistungsgewaehrungType_Art();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungsgewaehrungType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungsgewaehrungType#getNachweis()
	 * @see #getLeistungsgewaehrungType()
	 * @generated
	 */
	EAttribute getLeistungsgewaehrungType_Nachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType <em>Lohnsteuerklasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lohnsteuerklasse Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType
	 * @generated
	 */
	EClass getLohnsteuerklasseType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#isLohnsteuerklasseVeranlagung <em>Lohnsteuerklasse Veranlagung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lohnsteuerklasse Veranlagung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#isLohnsteuerklasseVeranlagung()
	 * @see #getLohnsteuerklasseType()
	 * @generated
	 */
	EAttribute getLohnsteuerklasseType_LohnsteuerklasseVeranlagung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#getLohnsteuerklasse <em>Lohnsteuerklasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lohnsteuerklasse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#getLohnsteuerklasse()
	 * @see #getLohnsteuerklasseType()
	 * @generated
	 */
	EReference getLohnsteuerklasseType_Lohnsteuerklasse();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameMitGeburtsnameType <em>Name Mit Geburtsname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Mit Geburtsname Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameMitGeburtsnameType
	 * @generated
	 */
	EClass getNameMitGeburtsnameType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOhneGeburtsnameType <em>Name Ohne Geburtsname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Ohne Geburtsname Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOhneGeburtsnameType
	 * @generated
	 */
	EClass getNameOhneGeburtsnameType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType <em>Name Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Optional Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType
	 * @generated
	 */
	EClass getNameOptionalType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getFamiliennameUnstrukturiert <em>Familienname Unstrukturiert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienname Unstrukturiert</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getFamiliennameUnstrukturiert()
	 * @see #getNameOptionalType()
	 * @generated
	 */
	EReference getNameOptionalType_FamiliennameUnstrukturiert();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getGeburtsnameUnstrukturiert <em>Geburtsname Unstrukturiert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsname Unstrukturiert</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getGeburtsnameUnstrukturiert()
	 * @see #getNameOptionalType()
	 * @generated
	 */
	EReference getNameOptionalType_GeburtsnameUnstrukturiert();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getVornamen <em>Vornamen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vornamen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getVornamen()
	 * @see #getNameOptionalType()
	 * @generated
	 */
	EReference getNameOptionalType_Vornamen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType <em>Rechtsanwalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rechtsanwalt Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType
	 * @generated
	 */
	EClass getRechtsanwaltType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType#getName()
	 * @see #getRechtsanwaltType()
	 * @generated
	 */
	EReference getRechtsanwaltType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType#getAnschrift()
	 * @see #getRechtsanwaltType()
	 * @generated
	 */
	EReference getRechtsanwaltType_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType#getAktenzeichen <em>Aktenzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType#getAktenzeichen()
	 * @see #getRechtsanwaltType()
	 * @generated
	 */
	EAttribute getRechtsanwaltType_Aktenzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType#isBeauftragtGeltungsmachungUVanspruch <em>Beauftragt Geltungsmachung UVanspruch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beauftragt Geltungsmachung UVanspruch</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType#isBeauftragtGeltungsmachungUVanspruch()
	 * @see #getRechtsanwaltType()
	 * @generated
	 */
	EAttribute getRechtsanwaltType_BeauftragtGeltungsmachungUVanspruch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType <em>Schule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schule Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType
	 * @generated
	 */
	EClass getSchuleType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getMonatVoraussichtlicherAbschlussSchule <em>Monat Voraussichtlicher Abschluss Schule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monat Voraussichtlicher Abschluss Schule</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getMonatVoraussichtlicherAbschlussSchule()
	 * @see #getSchuleType()
	 * @generated
	 */
	EAttribute getSchuleType_MonatVoraussichtlicherAbschlussSchule();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getTatsacheMitNachweis <em>Tatsache Mit Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tatsache Mit Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getTatsacheMitNachweis()
	 * @see #getSchuleType()
	 * @generated
	 */
	EReference getSchuleType_TatsacheMitNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getSchulabschluss <em>Schulabschluss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schulabschluss</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getSchulabschluss()
	 * @see #getSchuleType()
	 * @generated
	 */
	EAttribute getSchuleType_Schulabschluss();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType <em>Sonstige Leistung Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sonstige Leistung Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType
	 * @generated
	 */
	EClass getSonstigeLeistungAndererElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getArt()
	 * @see #getSonstigeLeistungAndererElternteilType()
	 * @generated
	 */
	EReference getSonstigeLeistungAndererElternteilType_Art();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getNameLeistungsstelle <em>Name Leistungsstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Leistungsstelle</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getNameLeistungsstelle()
	 * @see #getSonstigeLeistungAndererElternteilType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungAndererElternteilType_NameLeistungsstelle();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getBedarfsgemeinschaftsnummer <em>Bedarfsgemeinschaftsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bedarfsgemeinschaftsnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getBedarfsgemeinschaftsnummer()
	 * @see #getSonstigeLeistungAndererElternteilType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungAndererElternteilType_Bedarfsgemeinschaftsnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getRentenversicherungsnummer <em>Rentenversicherungsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rentenversicherungsnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getRentenversicherungsnummer()
	 * @see #getSonstigeLeistungAndererElternteilType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungAndererElternteilType_Rentenversicherungsnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getBetraegeZurLeistungshoehe <em>Betraege Zur Leistungshoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betraege Zur Leistungshoehe</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType#getBetraegeZurLeistungshoehe()
	 * @see #getSonstigeLeistungAndererElternteilType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungAndererElternteilType_BetraegeZurLeistungshoehe();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType <em>Sonstige Leistung Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sonstige Leistung Kind Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType
	 * @generated
	 */
	EClass getSonstigeLeistungKindType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getArt()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EReference getSonstigeLeistungKindType_Art();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNachweis()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungKindType_Nachweis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getLeistungserhaltKindergeld <em>Leistungserhalt Kindergeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leistungserhalt Kindergeld</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getLeistungserhaltKindergeld()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EReference getSonstigeLeistungKindType_LeistungserhaltKindergeld();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getLeistungsgewaehrung <em>Leistungsgewaehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leistungsgewaehrung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getLeistungsgewaehrung()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EReference getSonstigeLeistungKindType_Leistungsgewaehrung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNameJobcenter <em>Name Jobcenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Jobcenter</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNameJobcenter()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungKindType_NameJobcenter();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBedarfsgemeinschaftsnummer <em>Bedarfsgemeinschaftsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bedarfsgemeinschaftsnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBedarfsgemeinschaftsnummer()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungKindType_Bedarfsgemeinschaftsnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNameTraeger <em>Name Traeger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Traeger</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNameTraeger()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungKindType_NameTraeger();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getAktenzeichen <em>Aktenzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getAktenzeichen()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungKindType_Aktenzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBetraegeZurLeistungshoehe <em>Betraege Zur Leistungshoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betraege Zur Leistungshoehe</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBetraegeZurLeistungshoehe()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungKindType_BetraegeZurLeistungshoehe();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBezugUV <em>Bezug UV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug UV</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBezugUV()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EReference getSonstigeLeistungKindType_BezugUV();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getZeitraum()
	 * @see #getSonstigeLeistungKindType()
	 * @generated
	 */
	EReference getSonstigeLeistungKindType_Zeitraum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindUeberpruefungType <em>Sonstige Leistung Kind Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sonstige Leistung Kind Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindUeberpruefungType
	 * @generated
	 */
	EClass getSonstigeLeistungKindUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType <em>Staatsangehoerigkeit Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staatsangehoerigkeit Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType
	 * @generated
	 */
	EClass getStaatsangehoerigkeitAndererElternteilType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#isBekannt <em>Bekannt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bekannt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#isBekannt()
	 * @see #getStaatsangehoerigkeitAndererElternteilType()
	 * @generated
	 */
	EAttribute getStaatsangehoerigkeitAndererElternteilType_Bekannt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType#getStaatsangehoerigkeit()
	 * @see #getStaatsangehoerigkeitAndererElternteilType()
	 * @generated
	 */
	EReference getStaatsangehoerigkeitAndererElternteilType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType <em>Staatsangehoerigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staatsangehoerigkeit Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType
	 * @generated
	 */
	EClass getStaatsangehoerigkeitType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#getArt()
	 * @see #getStaatsangehoerigkeitType()
	 * @generated
	 */
	EReference getStaatsangehoerigkeitType_Art();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#isVerlustRechtAufEinreise <em>Verlust Recht Auf Einreise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verlust Recht Auf Einreise</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType#isVerlustRechtAufEinreise()
	 * @see #getStaatsangehoerigkeitType()
	 * @generated
	 */
	EAttribute getStaatsangehoerigkeitType_VerlustRechtAufEinreise();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType <em>Traeger Krankenversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traeger Krankenversicherung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType
	 * @generated
	 */
	EClass getTraegerKrankenversicherungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getBekannt <em>Bekannt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bekannt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getBekannt()
	 * @see #getTraegerKrankenversicherungType()
	 * @generated
	 */
	EReference getTraegerKrankenversicherungType_Bekannt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getKvNummer <em>Kv Nummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kv Nummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getKvNummer()
	 * @see #getTraegerKrankenversicherungType()
	 * @generated
	 */
	EAttribute getTraegerKrankenversicherungType_KvNummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType#getName()
	 * @see #getTraegerKrankenversicherungType()
	 * @generated
	 */
	EAttribute getTraegerKrankenversicherungType_Name();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType <em>Unterhalt Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhalt Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType
	 * @generated
	 */
	EClass getUnterhaltBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltstitel <em>Unterhaltstitel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unterhaltstitel</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltstitel()
	 * @see #getUnterhaltBasisType()
	 * @generated
	 */
	EReference getUnterhaltBasisType_Unterhaltstitel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltzahlungen <em>Unterhaltzahlungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unterhaltzahlungen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltzahlungen()
	 * @see #getUnterhaltBasisType()
	 * @generated
	 */
	EReference getUnterhaltBasisType_Unterhaltzahlungen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltvorauszahlungen <em>Unterhaltvorauszahlungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unterhaltvorauszahlungen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getUnterhaltvorauszahlungen()
	 * @see #getUnterhaltBasisType()
	 * @generated
	 */
	EReference getUnterhaltBasisType_Unterhaltvorauszahlungen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getBemuehungen <em>Bemuehungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bemuehungen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getBemuehungen()
	 * @see #getUnterhaltBasisType()
	 * @generated
	 */
	EReference getUnterhaltBasisType_Bemuehungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getWeitereAngaben <em>Weitere Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weitere Angaben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType#getWeitereAngaben()
	 * @see #getUnterhaltBasisType()
	 * @generated
	 */
	EAttribute getUnterhaltBasisType_WeitereAngaben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType <em>Unterhaltstitel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhaltstitel Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType
	 * @generated
	 */
	EClass getUnterhaltstitelType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getLiegtMirVor <em>Liegt Mir Vor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Liegt Mir Vor</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getLiegtMirVor()
	 * @see #getUnterhaltstitelType()
	 * @generated
	 */
	EReference getUnterhaltstitelType_LiegtMirVor();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getTitelBeiAnderePerson <em>Titel Bei Andere Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titel Bei Andere Person</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getTitelBeiAnderePerson()
	 * @see #getUnterhaltstitelType()
	 * @generated
	 */
	EReference getUnterhaltstitelType_TitelBeiAnderePerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getTitelBeiInstitution <em>Titel Bei Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titel Bei Institution</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getTitelBeiInstitution()
	 * @see #getUnterhaltstitelType()
	 * @generated
	 */
	EReference getUnterhaltstitelType_TitelBeiInstitution();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getAntragUnterhaltsfestsetzungGestellt <em>Antrag Unterhaltsfestsetzung Gestellt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antrag Unterhaltsfestsetzung Gestellt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getAntragUnterhaltsfestsetzungGestellt()
	 * @see #getUnterhaltstitelType()
	 * @generated
	 */
	EReference getUnterhaltstitelType_AntragUnterhaltsfestsetzungGestellt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getBefreiungUnterhaltDurchVergleichGerichtlich <em>Befreiung Unterhalt Durch Vergleich Gerichtlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Befreiung Unterhalt Durch Vergleich Gerichtlich</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getBefreiungUnterhaltDurchVergleichGerichtlich()
	 * @see #getUnterhaltstitelType()
	 * @generated
	 */
	EReference getUnterhaltstitelType_BefreiungUnterhaltDurchVergleichGerichtlich();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getBefreiungUnterhaltDurchVergleichAussergerichtlich <em>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Befreiung Unterhalt Durch Vergleich Aussergerichtlich</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#getBefreiungUnterhaltDurchVergleichAussergerichtlich()
	 * @see #getUnterhaltstitelType()
	 * @generated
	 */
	EReference getUnterhaltstitelType_BefreiungUnterhaltDurchVergleichAussergerichtlich();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#isEsGibtEinenUnterhaltstitel <em>Es Gibt Einen Unterhaltstitel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Gibt Einen Unterhaltstitel</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType#isEsGibtEinenUnterhaltstitel()
	 * @see #getUnterhaltstitelType()
	 * @generated
	 */
	EAttribute getUnterhaltstitelType_EsGibtEinenUnterhaltstitel();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelUeberpruefungType <em>Unterhaltstitel Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhaltstitel Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelUeberpruefungType
	 * @generated
	 */
	EClass getUnterhaltstitelUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType <em>Unterhaltsvorauszahlungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhaltsvorauszahlungen Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType
	 * @generated
	 */
	EClass getUnterhaltsvorauszahlungenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getZeitraumDerVorauszahlung <em>Zeitraum Der Vorauszahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeitraum Der Vorauszahlung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getZeitraumDerVorauszahlung()
	 * @see #getUnterhaltsvorauszahlungenType()
	 * @generated
	 */
	EReference getUnterhaltsvorauszahlungenType_ZeitraumDerVorauszahlung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getBetragDerVorausZahlung <em>Betrag Der Voraus Zahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betrag Der Voraus Zahlung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getBetragDerVorausZahlung()
	 * @see #getUnterhaltsvorauszahlungenType()
	 * @generated
	 */
	EAttribute getUnterhaltsvorauszahlungenType_BetragDerVorausZahlung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getDatumDerVorauszahlung <em>Datum Der Vorauszahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datum Der Vorauszahlung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getDatumDerVorauszahlung()
	 * @see #getUnterhaltsvorauszahlungenType()
	 * @generated
	 */
	EReference getUnterhaltsvorauszahlungenType_DatumDerVorauszahlung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#isZahlungenDritter <em>Zahlungen Dritter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zahlungen Dritter</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#isZahlungenDritter()
	 * @see #getUnterhaltsvorauszahlungenType()
	 * @generated
	 */
	EAttribute getUnterhaltsvorauszahlungenType_ZahlungenDritter();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getPersonZahlungenDritter <em>Person Zahlungen Dritter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Zahlungen Dritter</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getPersonZahlungenDritter()
	 * @see #getUnterhaltsvorauszahlungenType()
	 * @generated
	 */
	EAttribute getUnterhaltsvorauszahlungenType_PersonZahlungenDritter();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getHoeheZahlungenDritter <em>Hoehe Zahlungen Dritter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hoehe Zahlungen Dritter</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType#getHoeheZahlungenDritter()
	 * @see #getUnterhaltsvorauszahlungenType()
	 * @generated
	 */
	EAttribute getUnterhaltsvorauszahlungenType_HoeheZahlungenDritter();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type <em>Unterhaltsvorschussantrag Antrag0301 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhaltsvorschussantrag Antrag0301 Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type
	 * @generated
	 */
	EClass getUnterhaltsvorschussantragAntrag0301Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getGesamtZahlDerNachrichten <em>Gesamt Zahl Der Nachrichten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesamt Zahl Der Nachrichten</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getGesamtZahlDerNachrichten()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragAntrag0301Type_GesamtZahlDerNachrichten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getAntragskind <em>Antragskind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragskind</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getAntragskind()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_Antragskind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragstellender Elternteil</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getAntragstellenderElternteil()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_AntragstellenderElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getAndererElternteil <em>Anderer Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anderer Elternteil</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getAndererElternteil()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_AndererElternteil();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getWeitereGemeinsameKinder <em>Weitere Gemeinsame Kinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Gemeinsame Kinder</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getWeitereGemeinsameKinder()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_WeitereGemeinsameKinder();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getElternschaft <em>Elternschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elternschaft</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getElternschaft()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_Elternschaft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getUnterhalt <em>Unterhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unterhalt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getUnterhalt()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_Unterhalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getDatenabruf <em>Datenabruf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenabruf</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getDatenabruf()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_Datenabruf();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getPdfAntrag <em>Pdf Antrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pdf Antrag</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getPdfAntrag()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_PdfAntrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warten Auf Unterschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#isWartenAufUnterschrift()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragAntrag0301Type_WartenAufUnterschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getDsgvo()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_Dsgvo();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#isArtSignaturDigital <em>Art Signatur Digital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Signatur Digital</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#isArtSignaturDigital()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragAntrag0301Type_ArtSignaturDigital();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bestaetigung Angaben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#getBestaetigungAngaben()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragAntrag0301Type_BestaetigungAngaben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#isMerkblattUVG <em>Merkblatt UVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merkblatt UVG</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#isMerkblattUVG()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragAntrag0301Type_MerkblattUVG();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#isWeitergabeBankverbindung <em>Weitergabe Bankverbindung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weitergabe Bankverbindung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type#isWeitergabeBankverbindung()
	 * @see #getUnterhaltsvorschussantragAntrag0301Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragAntrag0301Type_WeitergabeBankverbindung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type <em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type
	 * @generated
	 */
	EClass getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getGesamtZahlDerNachrichten <em>Gesamt Zahl Der Nachrichten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesamt Zahl Der Nachrichten</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getGesamtZahlDerNachrichten()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_GesamtZahlDerNachrichten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAntragskind <em>Antragskind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragskind</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAntragskind()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Antragskind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragstellender Elternteil</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAntragstellenderElternteil()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_AntragstellenderElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAndererElternteil <em>Anderer Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anderer Elternteil</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getAndererElternteil()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_AndererElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getUnterhalt <em>Unterhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unterhalt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getUnterhalt()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Unterhalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getDatenabruf <em>Datenabruf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenabruf</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getDatenabruf()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Datenabruf();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getPdfAntrag <em>Pdf Antrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pdf Antrag</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getPdfAntrag()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_PdfAntrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warten Auf Unterschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isWartenAufUnterschrift()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_WartenAufUnterschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getDsgvo()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Dsgvo();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isArtSignaturDigital <em>Art Signatur Digital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Signatur Digital</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isArtSignaturDigital()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_ArtSignaturDigital();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bestaetigung Angaben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#getBestaetigungAngaben()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_BestaetigungAngaben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isMerkblattUVG <em>Merkblatt UVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merkblatt UVG</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type#isMerkblattUVG()
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_MerkblattUVG();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type <em>Unterhaltsvorschussantrag Nachreichen0303 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhaltsvorschussantrag Nachreichen0303 Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type
	 * @generated
	 */
	EClass getUnterhaltsvorschussantragNachreichen0303Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getFallnummerUVO <em>Fallnummer UVO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fallnummer UVO</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getFallnummerUVO()
	 * @see #getUnterhaltsvorschussantragNachreichen0303Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragNachreichen0303Type_FallnummerUVO();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getAngabenKindNachreichen <em>Angaben Kind Nachreichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Kind Nachreichen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getAngabenKindNachreichen()
	 * @see #getUnterhaltsvorschussantragNachreichen0303Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragNachreichen0303Type_AngabenKindNachreichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getAenderungsmitteilung <em>Aenderungsmitteilung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aenderungsmitteilung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getAenderungsmitteilung()
	 * @see #getUnterhaltsvorschussantragNachreichen0303Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragNachreichen0303Type_Aenderungsmitteilung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getNachzureichendesDokument <em>Nachzureichendes Dokument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachzureichendes Dokument</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getNachzureichendesDokument()
	 * @see #getUnterhaltsvorschussantragNachreichen0303Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragNachreichen0303Type_NachzureichendesDokument();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getDsgvo()
	 * @see #getUnterhaltsvorschussantragNachreichen0303Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragNachreichen0303Type_Dsgvo();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isArtSignaturDigital <em>Art Signatur Digital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Signatur Digital</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isArtSignaturDigital()
	 * @see #getUnterhaltsvorschussantragNachreichen0303Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragNachreichen0303Type_ArtSignaturDigital();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bestaetigung Angaben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#getBestaetigungAngaben()
	 * @see #getUnterhaltsvorschussantragNachreichen0303Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragNachreichen0303Type_BestaetigungAngaben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isMerkblattUVG <em>Merkblatt UVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merkblatt UVG</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type#isMerkblattUVG()
	 * @see #getUnterhaltsvorschussantragNachreichen0303Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragNachreichen0303Type_MerkblattUVG();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type <em>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type
	 * @generated
	 */
	EClass getUnterhaltsvorschussantragNachweisnachricht0311Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getNachweis()
	 * @see #getUnterhaltsvorschussantragNachweisnachricht0311Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragNachweisnachricht0311Type_Nachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getZugehoerigerAntrag <em>Zugehoeriger Antrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zugehoeriger Antrag</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getZugehoerigerAntrag()
	 * @see #getUnterhaltsvorschussantragNachweisnachricht0311Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragNachweisnachricht0311Type_ZugehoerigerAntrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getGesamtZahlDerNachrichten <em>Gesamt Zahl Der Nachrichten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesamt Zahl Der Nachrichten</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getGesamtZahlDerNachrichten()
	 * @see #getUnterhaltsvorschussantragNachweisnachricht0311Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragNachweisnachricht0311Type_GesamtZahlDerNachrichten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isArtSignaturDigital <em>Art Signatur Digital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Signatur Digital</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isArtSignaturDigital()
	 * @see #getUnterhaltsvorschussantragNachweisnachricht0311Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragNachweisnachricht0311Type_ArtSignaturDigital();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bestaetigung Angaben</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#getBestaetigungAngaben()
	 * @see #getUnterhaltsvorschussantragNachweisnachricht0311Type()
	 * @generated
	 */
	EReference getUnterhaltsvorschussantragNachweisnachricht0311Type_BestaetigungAngaben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isMerkblattUVG <em>Merkblatt UVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merkblatt UVG</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type#isMerkblattUVG()
	 * @see #getUnterhaltsvorschussantragNachweisnachricht0311Type()
	 * @generated
	 */
	EAttribute getUnterhaltsvorschussantragNachweisnachricht0311Type_MerkblattUVG();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType <em>Unterhaltszahlungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhaltszahlungen Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType
	 * @generated
	 */
	EClass getUnterhaltszahlungenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType#getZeitpunktDerZahlung <em>Zeitpunkt Der Zahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeitpunkt Der Zahlung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType#getZeitpunktDerZahlung()
	 * @see #getUnterhaltszahlungenType()
	 * @generated
	 */
	EReference getUnterhaltszahlungenType_ZeitpunktDerZahlung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType#getHoeheDerZahlung <em>Hoehe Der Zahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hoehe Der Zahlung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType#getHoeheDerZahlung()
	 * @see #getUnterhaltszahlungenType()
	 * @generated
	 */
	EAttribute getUnterhaltszahlungenType_HoeheDerZahlung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltType <em>Unterhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhalt Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltType
	 * @generated
	 */
	EClass getUnterhaltType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltUeberpruefungType <em>Unterhalt Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unterhalt Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltUeberpruefungType
	 * @generated
	 */
	EClass getUnterhaltUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType <em>Verheiratet Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verheiratet Antragstellende Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType
	 * @generated
	 */
	EClass getVerheiratetAntragstellendeBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getGetrenntLebend <em>Getrennt Lebend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Getrennt Lebend</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getGetrenntLebend()
	 * @see #getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	EReference getVerheiratetAntragstellendeBasisType_GetrenntLebend();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getrennt Lebend Grund</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getGetrenntLebendGrund()
	 * @see #getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getVerheiratetAntragstellendeBasisType_GetrenntLebendGrund();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhepartnerSeitSechsMonatenInAnstalt <em>Ehepartner Seit Sechs Monaten In Anstalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ehepartner Seit Sechs Monaten In Anstalt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhepartnerSeitSechsMonatenInAnstalt()
	 * @see #getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	EReference getVerheiratetAntragstellendeBasisType_EhepartnerSeitSechsMonatenInAnstalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteillName <em>Ehegatte Ist Nicht Der Andere Elternteill Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ehegatte Ist Nicht Der Andere Elternteill Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteillName()
	 * @see #getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	EReference getVerheiratetAntragstellendeBasisType_EhegatteIstNichtDerAndereElternteillName();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteilAnschrift <em>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteilAnschrift()
	 * @see #getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	EReference getVerheiratetAntragstellendeBasisType_EhegatteIstNichtDerAndereElternteilAnschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteilGeburtsdatum <em>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getEhegatteIstNichtDerAndereElternteilGeburtsdatum()
	 * @see #getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	EReference getVerheiratetAntragstellendeBasisType_EhegatteIstNichtDerAndereElternteilGeburtsdatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSteuerklasse <em>Steuerklasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steuerklasse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSteuerklasse()
	 * @see #getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getVerheiratetAntragstellendeBasisType_Steuerklasse();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSteuerklasseNachweis <em>Steuerklasse Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Steuerklasse Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSteuerklasseNachweis()
	 * @see #getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getVerheiratetAntragstellendeBasisType_SteuerklasseNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seit Wann</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType#getSeitWann()
	 * @see #getVerheiratetAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getVerheiratetAntragstellendeBasisType_SeitWann();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeType <em>Verheiratet Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verheiratet Antragstellende Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeType
	 * @generated
	 */
	EClass getVerheiratetAntragstellendeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeUeberpruefungType <em>Verheiratet Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verheiratet Antragstellende Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeUeberpruefungType
	 * @generated
	 */
	EClass getVerheiratetAntragstellendeUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType <em>Vermoegen Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vermoegen Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType
	 * @generated
	 */
	EClass getVermoegenAndererElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType#getArt()
	 * @see #getVermoegenAndererElternteilType()
	 * @generated
	 */
	EReference getVermoegenAndererElternteilType_Art();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType#getZusaetzlicheInformationen <em>Zusaetzliche Informationen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusaetzliche Informationen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType#getZusaetzlicheInformationen()
	 * @see #getVermoegenAndererElternteilType()
	 * @generated
	 */
	EAttribute getVermoegenAndererElternteilType_ZusaetzlicheInformationen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType <em>Vertretung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertretung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType
	 * @generated
	 */
	EClass getVertretungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getArt <em>Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getArt()
	 * @see #getVertretungType()
	 * @generated
	 */
	EReference getVertretungType_Art();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getVormund <em>Vormund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vormund</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getVormund()
	 * @see #getVertretungType()
	 * @generated
	 */
	EReference getVertretungType_Vormund();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getBeistand <em>Beistand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beistand</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getBeistand()
	 * @see #getVertretungType()
	 * @generated
	 */
	EReference getVertretungType_Beistand();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getAmtspflegschaft <em>Amtspflegschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amtspflegschaft</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getAmtspflegschaft()
	 * @see #getVertretungType()
	 * @generated
	 */
	EReference getVertretungType_Amtspflegschaft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getRechtsanwalt <em>Rechtsanwalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rechtsanwalt</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getRechtsanwalt()
	 * @see #getVertretungType()
	 * @generated
	 */
	EReference getVertretungType_Rechtsanwalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getBetreuer <em>Betreuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Betreuer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getBetreuer()
	 * @see #getVertretungType()
	 * @generated
	 */
	EReference getVertretungType_Betreuer();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getOrganisationsname <em>Organisationsname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Organisationsname</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType#getOrganisationsname()
	 * @see #getVertretungType()
	 * @generated
	 */
	EAttribute getVertretungType_Organisationsname();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungUeberpruefungType <em>Vertretung Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertretung Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungUeberpruefungType
	 * @generated
	 */
	EClass getVertretungUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType <em>Verwitwet Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verwitwet Antragstellende Basis Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType
	 * @generated
	 */
	EClass getVerwitwetAntragstellendeBasisType();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType#getNachweis()
	 * @see #getVerwitwetAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getVerwitwetAntragstellendeBasisType_Nachweis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seit Wann</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType#getSeitWann()
	 * @see #getVerwitwetAntragstellendeBasisType()
	 * @generated
	 */
	EReference getVerwitwetAntragstellendeBasisType_SeitWann();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeit Geplant</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType#isHochzeitGeplant()
	 * @see #getVerwitwetAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getVerwitwetAntragstellendeBasisType_HochzeitGeplant();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hochzeitsdatum Voraussichtlich</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich()
	 * @see #getVerwitwetAntragstellendeBasisType()
	 * @generated
	 */
	EAttribute getVerwitwetAntragstellendeBasisType_HochzeitsdatumVoraussichtlich();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeType <em>Verwitwet Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verwitwet Antragstellende Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeType
	 * @generated
	 */
	EClass getVerwitwetAntragstellendeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeUeberpruefungType <em>Verwitwet Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verwitwet Antragstellende Ueberpruefung Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeUeberpruefungType
	 * @generated
	 */
	EClass getVerwitwetAntragstellendeUeberpruefungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType <em>Vormund Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vormund Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType
	 * @generated
	 */
	EClass getVormundType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getName()
	 * @see #getVormundType()
	 * @generated
	 */
	EReference getVormundType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getAnschrift()
	 * @see #getVormundType()
	 * @generated
	 */
	EReference getVormundType_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getEMailAdresse <em>EMail Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail Adresse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getEMailAdresse()
	 * @see #getVormundType()
	 * @generated
	 */
	EAttribute getVormundType_EMailAdresse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getAktenzeichen <em>Aktenzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getAktenzeichen()
	 * @see #getVormundType()
	 * @generated
	 */
	EAttribute getVormundType_Aktenzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getTelefonnummer <em>Telefonnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefonnummer</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType#getTelefonnummer()
	 * @see #getVormundType()
	 * @generated
	 */
	EAttribute getVormundType_Telefonnummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType <em>Weitere Gemeinsame Kinder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weitere Gemeinsame Kinder Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType
	 * @generated
	 */
	EClass getWeitereGemeinsameKinderType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType#getName()
	 * @see #getWeitereGemeinsameKinderType()
	 * @generated
	 */
	EReference getWeitereGemeinsameKinderType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType#getGeburtsdatum()
	 * @see #getWeitereGemeinsameKinderType()
	 * @generated
	 */
	EReference getWeitereGemeinsameKinderType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType#getWohnhaftBei <em>Wohnhaft Bei</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wohnhaft Bei</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType#getWohnhaftBei()
	 * @see #getWeitereGemeinsameKinderType()
	 * @generated
	 */
	EReference getWeitereGemeinsameKinderType_WohnhaftBei();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType <em>Weitere Kinder Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weitere Kinder Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType
	 * @generated
	 */
	EClass getWeitereKinderAndererElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getName()
	 * @see #getWeitereKinderAndererElternteilType()
	 * @generated
	 */
	EReference getWeitereKinderAndererElternteilType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getGeburtsdatum()
	 * @see #getWeitereKinderAndererElternteilType()
	 * @generated
	 */
	EReference getWeitereKinderAndererElternteilType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getWohnhaftBeimAnderenElternteil <em>Wohnhaft Beim Anderen Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wohnhaft Beim Anderen Elternteil</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType#getWohnhaftBeimAnderenElternteil()
	 * @see #getWeitereKinderAndererElternteilType()
	 * @generated
	 */
	EReference getWeitereKinderAndererElternteilType_WohnhaftBeimAnderenElternteil();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Ausbildung <em>Ausbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ausbildung</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Ausbildung
	 * @generated
	 */
	EEnum getAusbildung();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenfteandererelternteil <em>Einkuenfteandererelternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Einkuenfteandererelternteil</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenfteandererelternteil
	 * @generated
	 */
	EEnum getEinkuenfteandererelternteil();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenftekinduv <em>Einkuenftekinduv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Einkuenftekinduv</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenftekinduv
	 * @generated
	 */
	EEnum getEinkuenftekinduv();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Sonstigeleistungenuv <em>Sonstigeleistungenuv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sonstigeleistungenuv</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Sonstigeleistungenuv
	 * @generated
	 */
	EEnum getSonstigeleistungenuv();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Staatsangehoerigkeituv <em>Staatsangehoerigkeituv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Staatsangehoerigkeituv</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Staatsangehoerigkeituv
	 * @generated
	 */
	EEnum getStaatsangehoerigkeituv();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Steuerklasse <em>Steuerklasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Steuerklasse</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Steuerklasse
	 * @generated
	 */
	EEnum getSteuerklasse();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Unterhaltsbemuehungen <em>Unterhaltsbemuehungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unterhaltsbemuehungen</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Unterhaltsbemuehungen
	 * @generated
	 */
	EEnum getUnterhaltsbemuehungen();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Ausbildung <em>Ausbildung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ausbildung Object</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Ausbildung
	 * @model instanceClass="de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Ausbildung"
	 *        extendedMetaData="name='ausbildung:Object' baseType='ausbildung'"
	 * @generated
	 */
	EDataType getAusbildungObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenfteandererelternteil <em>Einkuenfteandererelternteil Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Einkuenfteandererelternteil Object</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenfteandererelternteil
	 * @model instanceClass="de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenfteandererelternteil"
	 *        extendedMetaData="name='einkuenfteandererelternteil:Object' baseType='einkuenfteandererelternteil'"
	 * @generated
	 */
	EDataType getEinkuenfteandererelternteilObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenftekinduv <em>Einkuenftekinduv Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Einkuenftekinduv Object</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenftekinduv
	 * @model instanceClass="de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Einkuenftekinduv"
	 *        extendedMetaData="name='einkuenftekinduv:Object' baseType='einkuenftekinduv'"
	 * @generated
	 */
	EDataType getEinkuenftekinduvObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Sonstigeleistungenuv <em>Sonstigeleistungenuv Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sonstigeleistungenuv Object</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Sonstigeleistungenuv
	 * @model instanceClass="de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Sonstigeleistungenuv"
	 *        extendedMetaData="name='sonstigeleistungenuv:Object' baseType='sonstigeleistungenuv'"
	 * @generated
	 */
	EDataType getSonstigeleistungenuvObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Staatsangehoerigkeituv <em>Staatsangehoerigkeituv Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Staatsangehoerigkeituv Object</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Staatsangehoerigkeituv
	 * @model instanceClass="de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Staatsangehoerigkeituv"
	 *        extendedMetaData="name='staatsangehoerigkeituv:Object' baseType='staatsangehoerigkeituv'"
	 * @generated
	 */
	EDataType getStaatsangehoerigkeituvObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Steuerklasse <em>Steuerklasse Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Steuerklasse Object</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Steuerklasse
	 * @model instanceClass="de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Steuerklasse"
	 *        extendedMetaData="name='steuerklasse:Object' baseType='steuerklasse'"
	 * @generated
	 */
	EDataType getSteuerklasseObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Unterhaltsbemuehungen <em>Unterhaltsbemuehungen Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unterhaltsbemuehungen Object</em>'.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Unterhaltsbemuehungen
	 * @model instanceClass="de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.Unterhaltsbemuehungen"
	 *        extendedMetaData="name='unterhaltsbemuehungen:Object' baseType='unterhaltsbemuehungen'"
	 * @generated
	 */
	EDataType getUnterhaltsbemuehungenObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnterhaltsvorschussFactory getUnterhaltsvorschussFactory();

} //UnterhaltsvorschussPackage
