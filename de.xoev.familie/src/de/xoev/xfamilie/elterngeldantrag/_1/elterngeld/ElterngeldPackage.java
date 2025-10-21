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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;


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
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = ElterngeldPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/elterngeldantrag.ecore", ecoreSourceLocations="/model/elterngeldantrag.ecore")
public interface ElterngeldPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "elterngeld";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/elterngeldantrag/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "elterngeld";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElterngeldPackage eINSTANCE = de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AdoptionTypeImpl <em>Adoption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AdoptionTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAdoptionType()
	 * @generated
	 */
	int ADOPTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTION_TYPE__ADOPTION = 0;

	/**
	 * The feature id for the '<em><b>Adoption Haushaltsaufnahme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTION_TYPE__ADOPTION_HAUSHALTSAUFNAHME = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Adoption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTION_TYPE__NACHWEIS_ADOPTION = 2;

	/**
	 * The number of structural features of the '<em>Adoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Adoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ALGITypeImpl <em>ALGI Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ALGITypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getALGIType()
	 * @generated
	 */
	int ALGI_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Bezug ALGI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGI_TYPE__BEZUG_ALGI = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum ALGI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGI_TYPE__ZEITRAUM_ALGI = 1;

	/**
	 * The feature id for the '<em><b>Nachweis ALGI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGI_TYPE__NACHWEIS_ALGI = 2;

	/**
	 * The number of structural features of the '<em>ALGI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGI_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ALGI Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGI_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AlleinerziehendenanspruchTypeImpl <em>Alleinerziehendenanspruch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AlleinerziehendenanspruchTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAlleinerziehendenanspruchType()
	 * @generated
	 */
	int ALLEINERZIEHENDENANSPRUCH_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Entlastungsbetrag Alleinerziehende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLEINERZIEHENDENANSPRUCH_TYPE__ENTLASTUNGSBETRAG_ALLEINERZIEHENDE = 0;

	/**
	 * The feature id for the '<em><b>Nachweis Entlastungsbetrag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_ENTLASTUNGSBETRAG = 1;

	/**
	 * The feature id for the '<em><b>Betreuung Durch Anderen ET Unmoeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLEINERZIEHENDENANSPRUCH_TYPE__BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH = 2;

	/**
	 * The feature id for the '<em><b>Nachweis Betreuung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_BETREUUNG = 3;

	/**
	 * The feature id for the '<em><b>Kindeswohlgefaehrdung Durch Anderen ET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLEINERZIEHENDENANSPRUCH_TYPE__KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET = 4;

	/**
	 * The feature id for the '<em><b>Nachweis Kindeswohlgefaehrdung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_KINDESWOHLGEFAEHRDUNG = 5;

	/**
	 * The number of structural features of the '<em>Alleinerziehendenanspruch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLEINERZIEHENDENANSPRUCH_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Alleinerziehendenanspruch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLEINERZIEHENDENANSPRUCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AndereLeistungenTypeImpl <em>Andere Leistungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AndereLeistungenTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAndereLeistungenType()
	 * @generated
	 */
	int ANDERE_LEISTUNGEN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Bezug Andere Leistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_LEISTUNGEN_TYPE__BEZUG_ANDERE_LEISTUNGEN = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum Andere Leistungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_LEISTUNGEN_TYPE__ZEITRAUM_ANDERE_LEISTUNGEN = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Andere Leistungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_LEISTUNGEN_TYPE__NACHWEIS_ANDERE_LEISTUNGEN = 2;

	/**
	 * The feature id for the '<em><b>Art Andere Leistungen</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_LEISTUNGEN_TYPE__ART_ANDERE_LEISTUNGEN = 3;

	/**
	 * The number of structural features of the '<em>Andere Leistungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_LEISTUNGEN_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Andere Leistungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERE_LEISTUNGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenSozialversicherungTypeImpl <em>Angaben Sozialversicherung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenSozialversicherungTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAngabenSozialversicherungType()
	 * @generated
	 */
	int ANGABEN_SOZIALVERSICHERUNG_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Pflichtbeitraege Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_KRANKENKASSE = 0;

	/**
	 * The feature id for the '<em><b>Pflichtbeitraege Rentenversicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_RENTENVERSICHERUNG = 1;

	/**
	 * The feature id for the '<em><b>Pflichtbeitraege Arbeitslosenversicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG = 2;

	/**
	 * The feature id for the '<em><b>Nachweis Pflichtbetrag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_SOZIALVERSICHERUNG_TYPE__NACHWEIS_PFLICHTBETRAG = 3;

	/**
	 * The number of structural features of the '<em>Angaben Sozialversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_SOZIALVERSICHERUNG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Angaben Sozialversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_SOZIALVERSICHERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl <em>Angaben Weiteres Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAngabenWeiteresKindType()
	 * @generated
	 */
	int ANGABEN_WEITERES_KIND_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name Weiteres Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Geburtsdatum Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM_NACHWEIS = 2;

	/**
	 * The feature id for the '<em><b>Haushaltsaufnahme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME = 3;

	/**
	 * The feature id for the '<em><b>Haushaltsaufnahme Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME_NACHWEIS = 4;

	/**
	 * The feature id for the '<em><b>Behinderungsgrad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD = 5;

	/**
	 * The feature id for the '<em><b>Behinderungsgrad Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD_NACHWEIS = 6;

	/**
	 * The feature id for the '<em><b>Verhaeltnis ET1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1 = 7;

	/**
	 * The feature id for the '<em><b>Verhaeltnis ET2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2 = 8;

	/**
	 * The number of structural features of the '<em>Angaben Weiteres Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Angaben Weiteres Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_WEITERES_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftKindOptionalTypeImpl <em>Anschrift Kind Optional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftKindOptionalTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAnschriftKindOptionalType()
	 * @generated
	 */
	int ANSCHRIFT_KIND_OPTIONAL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_KIND_OPTIONAL_TYPE__HAUSNUMMER = 0;

	/**
	 * The feature id for the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_KIND_OPTIONAL_TYPE__POSTLEITZAHL = 1;

	/**
	 * The feature id for the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_KIND_OPTIONAL_TYPE__STRASSE = 2;

	/**
	 * The feature id for the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_KIND_OPTIONAL_TYPE__WOHNORT = 3;

	/**
	 * The number of structural features of the '<em>Anschrift Kind Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_KIND_OPTIONAL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Anschrift Kind Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_KIND_OPTIONAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftTypeImpl <em>Anschrift Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAnschriftType()
	 * @generated
	 */
	int ANSCHRIFT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Anschrift Inland Oder Ausland</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__ANSCHRIFT_INLAND_ODER_AUSLAND = 0;

	/**
	 * The feature id for the '<em><b>Anschrift Inland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__ANSCHRIFT_INLAND = 1;

	/**
	 * The feature id for the '<em><b>Anschrift Ausland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND = 2;

	/**
	 * The number of structural features of the '<em>Anschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Anschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AntragstellenderElternteilVorabmeldungTypeImpl <em>Antragstellender Elternteil Vorabmeldung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AntragstellenderElternteilVorabmeldungTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAntragstellenderElternteilVorabmeldungType()
	 * @generated
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_VORABMELDUNG_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_VORABMELDUNG_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_VORABMELDUNG_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_VORABMELDUNG_TYPE__ANSCHRIFT = 2;

	/**
	 * The number of structural features of the '<em>Antragstellender Elternteil Vorabmeldung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_VORABMELDUNG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Antragstellender Elternteil Vorabmeldung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_VORABMELDUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ArbeitszeitTypeImpl <em>Arbeitszeit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ArbeitszeitTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getArbeitszeitType()
	 * @generated
	 */
	int ARBEITSZEIT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Arbeitszeit Wochenstunden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBEITSZEIT_TYPE__ARBEITSZEIT_WOCHENSTUNDEN = 0;

	/**
	 * The feature id for the '<em><b>Abweichende Bezugsgroesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBEITSZEIT_TYPE__ABWEICHENDE_BEZUGSGROESSE = 1;

	/**
	 * The number of structural features of the '<em>Arbeitszeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBEITSZEIT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arbeitszeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBEITSZEIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslaendischesArbeitsverhaeltnisTypeImpl <em>Auslaendisches Arbeitsverhaeltnis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslaendischesArbeitsverhaeltnisTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAuslaendischesArbeitsverhaeltnisType()
	 * @generated
	 */
	int AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Auslaendisches Arbeitsverhaeltnis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS = 0;

	/**
	 * The feature id for the '<em><b>Beschaeftigungsland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND = 1;

	/**
	 * The feature id for the '<em><b>Auslaendisches Arbeitsverhaeltnis Anderer ET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET = 2;

	/**
	 * The number of structural features of the '<em>Auslaendisches Arbeitsverhaeltnis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Auslaendisches Arbeitsverhaeltnis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltBefrTypeImpl <em>Auslandsaufenthalt Befr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltBefrTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAuslandsaufenthaltBefrType()
	 * @generated
	 */
	int AUSLANDSAUFENTHALT_BEFR_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Befristeter Aufenthalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT = 0;

	/**
	 * The feature id for the '<em><b>Ende Aufenthalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_BEFR_TYPE__ENDE_AUFENTHALT = 1;

	/**
	 * The number of structural features of the '<em>Auslandsaufenthalt Befr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_BEFR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Auslandsaufenthalt Befr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_BEFR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltTypeImpl <em>Auslandsaufenthalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAuslandsaufenthaltType()
	 * @generated
	 */
	int AUSLANDSAUFENTHALT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Grund Des Aufenthalts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_TYPE__GRUND_DES_AUFENTHALTS = 0;

	/**
	 * The feature id for the '<em><b>Aufenthaltsland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Auslandsaufenthalt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_TYPE__NACHWEIS_AUSLANDSAUFENTHALT = 2;

	/**
	 * The feature id for the '<em><b>Inlaendisches Arbeitsverhaeltnis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_TYPE__INLAENDISCHES_ARBEITSVERHAELTNIS = 3;

	/**
	 * The feature id for the '<em><b>Plz Arbeitgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_TYPE__PLZ_ARBEITGEBER = 4;

	/**
	 * The feature id for the '<em><b>Ort Arbeitgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_TYPE__ORT_ARBEITGEBER = 5;

	/**
	 * The feature id for the '<em><b>Beginn Aufenthalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_TYPE__BEGINN_AUFENTHALT = 6;

	/**
	 * The number of structural features of the '<em>Auslandsaufenthalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Auslandsaufenthalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSAUFENTHALT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BeantragungElterngeldTypeImpl <em>Beantragung Elterngeld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BeantragungElterngeldTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getBeantragungElterngeldType()
	 * @generated
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Leistungshoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE = 0;

	/**
	 * The feature id for the '<em><b>Basis Elterngeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE__BASIS_ELTERNGELD = 1;

	/**
	 * The feature id for the '<em><b>Zeitraum Basis Elterngeld</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_BASIS_ELTERNGELD = 2;

	/**
	 * The feature id for the '<em><b>Elterngeld Plus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE__ELTERNGELD_PLUS = 3;

	/**
	 * The feature id for the '<em><b>Zeitraum Elterngeld Plus</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_ELTERNGELD_PLUS = 4;

	/**
	 * The feature id for the '<em><b>Partnerschafts Bonus Monate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE__PARTNERSCHAFTS_BONUS_MONATE = 5;

	/**
	 * The feature id for the '<em><b>Zeitraum Partnerschafts Bonus Monate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_PARTNERSCHAFTS_BONUS_MONATE = 6;

	/**
	 * The number of structural features of the '<em>Beantragung Elterngeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Beantragung Elterngeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANTRAGUNG_ELTERNGELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BehinderungKindTypeImpl <em>Behinderung Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BehinderungKindTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getBehinderungKindType()
	 * @generated
	 */
	int BEHINDERUNG_KIND_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Behinderung Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHINDERUNG_KIND_TYPE__BEHINDERUNG_KIND = 0;

	/**
	 * The feature id for the '<em><b>Nachweis Behinderung Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHINDERUNG_KIND_TYPE__NACHWEIS_BEHINDERUNG_KIND = 1;

	/**
	 * The number of structural features of the '<em>Behinderung Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHINDERUNG_KIND_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behinderung Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHINDERUNG_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsausbildungTypeImpl <em>Berufsausbildung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsausbildungTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getBerufsausbildungType()
	 * @generated
	 */
	int BERUFSAUSBILDUNG_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Berufsbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSAUSBILDUNG_TYPE__BERUFSBILDUNG = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSAUSBILDUNG_TYPE__ZEITRAUM = 1;

	/**
	 * The feature id for the '<em><b>Wochenstunden Je Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSAUSBILDUNG_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT = 2;

	/**
	 * The number of structural features of the '<em>Berufsausbildung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSAUSBILDUNG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Berufsausbildung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSAUSBILDUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsbildungTypeImpl <em>Berufsbildung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsbildungTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getBerufsbildungType()
	 * @generated
	 */
	int BERUFSBILDUNG_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Berufsbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSBILDUNG_TYPE__BERUFSBILDUNG = 0;

	/**
	 * The feature id for the '<em><b>Ausbildung Ende Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSBILDUNG_TYPE__AUSBILDUNG_ENDE_VORAUSSICHTLICH = 1;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSBILDUNG_TYPE__NACHWEIS = 2;

	/**
	 * The number of structural features of the '<em>Berufsbildung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSBILDUNG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Berufsbildung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BERUFSBILDUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BesondersFruehGeborenesKindTypeImpl <em>Besonders Frueh Geborenes Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BesondersFruehGeborenesKindTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getBesondersFruehGeborenesKindType()
	 * @generated
	 */
	int BESONDERS_FRUEH_GEBORENES_KIND_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Besonders Frueh Geborenes Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESONDERS_FRUEH_GEBORENES_KIND_TYPE__BESONDERS_FRUEH_GEBORENES_KIND = 0;

	/**
	 * The feature id for the '<em><b>Errechneter Geburtstermin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESONDERS_FRUEH_GEBORENES_KIND_TYPE__ERRECHNETER_GEBURTSTERMIN = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Besonders Frueh Geboren</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESONDERS_FRUEH_GEBORENES_KIND_TYPE__NACHWEIS_BESONDERS_FRUEH_GEBOREN = 2;

	/**
	 * The number of structural features of the '<em>Besonders Frueh Geborenes Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESONDERS_FRUEH_GEBORENES_KIND_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Besonders Frueh Geborenes Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESONDERS_FRUEH_GEBORENES_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BuergergeldTypeImpl <em>Buergergeld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BuergergeldTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getBuergergeldType()
	 * @generated
	 */
	int BUERGERGELD_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Bezug Buergergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUERGERGELD_TYPE__BEZUG_BUERGERGELD = 0;

	/**
	 * The feature id for the '<em><b>Beginn Zeitraum Buergergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUERGERGELD_TYPE__BEGINN_ZEITRAUM_BUERGERGELD = 1;

	/**
	 * The feature id for the '<em><b>Ende Zeitraum Buergergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUERGERGELD_TYPE__ENDE_ZEITRAUM_BUERGERGELD = 2;

	/**
	 * The number of structural features of the '<em>Buergergeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUERGERGELD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Buergergeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUERGERGELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeAbbruchgrundTypeImpl <em>Code Abbruchgrund Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeAbbruchgrundTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getCodeAbbruchgrundType()
	 * @generated
	 */
	int CODE_ABBRUCHGRUND_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ABBRUCHGRUND_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ABBRUCHGRUND_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ABBRUCHGRUND_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ABBRUCHGRUND_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Abbruchgrund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ABBRUCHGRUND_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Abbruchgrund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ABBRUCHGRUND_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeAnfragegrundTypeImpl <em>Code Anfragegrund Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeAnfragegrundTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getCodeAnfragegrundType()
	 * @generated
	 */
	int CODE_ANFRAGEGRUND_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANFRAGEGRUND_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANFRAGEGRUND_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANFRAGEGRUND_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANFRAGEGRUND_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Anfragegrund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANFRAGEGRUND_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Anfragegrund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANFRAGEGRUND_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeElterngeldantragTypeImpl <em>Code Elterngeldantrag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeElterngeldantragTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getCodeElterngeldantragType()
	 * @generated
	 */
	int CODE_ELTERNGELDANTRAG_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELTERNGELDANTRAG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELTERNGELDANTRAG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELTERNGELDANTRAG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELTERNGELDANTRAG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Elterngeldantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELTERNGELDANTRAG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Elterngeldantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELTERNGELDANTRAG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeFehlerfallTypeImpl <em>Code Fehlerfall Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeFehlerfallTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getCodeFehlerfallType()
	 * @generated
	 */
	int CODE_FEHLERFALL_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEHLERFALL_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEHLERFALL_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEHLERFALL_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEHLERFALL_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Fehlerfall Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEHLERFALL_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Fehlerfall Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEHLERFALL_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeGesamteinkommenTypeImpl <em>Code Gesamteinkommen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeGesamteinkommenTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getCodeGesamteinkommenType()
	 * @generated
	 */
	int CODE_GESAMTEINKOMMEN_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESAMTEINKOMMEN_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESAMTEINKOMMEN_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESAMTEINKOMMEN_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESAMTEINKOMMEN_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Gesamteinkommen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESAMTEINKOMMEN_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Gesamteinkommen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESAMTEINKOMMEN_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeKindschaftsverhaeltnisTypeImpl <em>Code Kindschaftsverhaeltnis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeKindschaftsverhaeltnisTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getCodeKindschaftsverhaeltnisType()
	 * @generated
	 */
	int CODE_KINDSCHAFTSVERHAELTNIS_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSVERHAELTNIS_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSVERHAELTNIS_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSVERHAELTNIS_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSVERHAELTNIS_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Kindschaftsverhaeltnis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSVERHAELTNIS_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Kindschaftsverhaeltnis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSVERHAELTNIS_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeLeistungshoeheTypeImpl <em>Code Leistungshoehe Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeLeistungshoeheTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getCodeLeistungshoeheType()
	 * @generated
	 */
	int CODE_LEISTUNGSHOEHE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSHOEHE_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSHOEHE_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSHOEHE_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSHOEHE_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Leistungshoehe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSHOEHE_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Leistungshoehe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSHOEHE_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeVersandwegTypeImpl <em>Code Versandweg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeVersandwegTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getCodeVersandwegType()
	 * @generated
	 */
	int CODE_VERSANDWEG_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSANDWEG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSANDWEG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSANDWEG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSANDWEG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Versandweg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSANDWEG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Versandweg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSANDWEG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeVersicherungsartTypeImpl <em>Code Versicherungsart Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.CodeVersicherungsartTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getCodeVersicherungsartType()
	 * @generated
	 */
	int CODE_VERSICHERUNGSART_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSICHERUNGSART_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSICHERUNGSART_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSICHERUNGSART_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSICHERUNGSART_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Versicherungsart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSICHERUNGSART_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Versicherungsart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERSICHERUNGSART_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 28;

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
	 * The feature id for the '<em><b>Elterngeldantrag Abbruch0206</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELTERNGELDANTRAG_ABBRUCH0206 = 3;

	/**
	 * The feature id for the '<em><b>Elterngeldantrag Anfrage0204</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGE0204 = 4;

	/**
	 * The feature id for the '<em><b>Elterngeldantrag Anfrageabschluss0205</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205 = 5;

	/**
	 * The feature id for the '<em><b>Elterngeldantrag Antrag0201</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELTERNGELDANTRAG_ANTRAG0201 = 6;

	/**
	 * The feature id for the '<em><b>Elterngeldantrag Standesamtsmeldung0203</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203 = 7;

	/**
	 * The feature id for the '<em><b>Elterngeldantrag Vorabmeldung0202</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELTERNGELDANTRAG_VORABMELDUNG0202 = 8;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EGAelteresKindTypeImpl <em>EG Aelteres Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EGAelteresKindTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getEGAelteresKindType()
	 * @generated
	 */
	int EG_AELTERES_KIND_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Bezug EG Aelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_AELTERES_KIND_TYPE__BEZUG_EG_AELTERES_KIND = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum EG Aelteres Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_AELTERES_KIND_TYPE__ZEITRAUM_EG_AELTERES_KIND = 1;

	/**
	 * The feature id for the '<em><b>Nachweis EG Aelteres Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_AELTERES_KIND_TYPE__NACHWEIS_EG_AELTERES_KIND = 2;

	/**
	 * The number of structural features of the '<em>EG Aelteres Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_AELTERES_KIND_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EG Aelteres Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_AELTERES_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl <em>Einkommensersatzleistungen Bezugszeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Bezug Einkommensersatzleistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN = 0;

	/**
	 * The feature id for the '<em><b>Bezug ALGI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI = 1;

	/**
	 * The feature id for the '<em><b>Bezug Krankentagegeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD = 2;

	/**
	 * The feature id for the '<em><b>Bezug Krankengeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD = 3;

	/**
	 * The feature id for the '<em><b>Bezug EG Aelteres Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND = 4;

	/**
	 * The feature id for the '<em><b>Bezug Renten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN = 5;

	/**
	 * The feature id for the '<em><b>Bezug Sonstige Leistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN = 6;

	/**
	 * The feature id for the '<em><b>Andere Leistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN = 7;

	/**
	 * The feature id for the '<em><b>Bezug Ausl Leistungen Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND = 8;

	/**
	 * The feature id for the '<em><b>Bezug Zwischenstaatl Leistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN = 9;

	/**
	 * The number of structural features of the '<em>Einkommensersatzleistungen Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Einkommensersatzleistungen Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl <em>Einkommensersatzleistungen Vor Geburt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Bezug Einkommensersatzleistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN = 0;

	/**
	 * The feature id for the '<em><b>Bezug ALGI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI = 1;

	/**
	 * The feature id for the '<em><b>Bezug Krankentagegeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD = 2;

	/**
	 * The feature id for the '<em><b>Bezug Krankengeld Schwangerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT = 3;

	/**
	 * The feature id for the '<em><b>Bezug EG Aelteres Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND = 4;

	/**
	 * The feature id for the '<em><b>Bezug Renten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN = 5;

	/**
	 * The feature id for the '<em><b>Bezug Andere Leistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN = 6;

	/**
	 * The feature id for the '<em><b>Bezug Ausl Leistungen Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND = 7;

	/**
	 * The feature id for the '<em><b>Bezug Zwischenstaatl Leistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN = 8;

	/**
	 * The feature id for the '<em><b>Buergergeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD = 9;

	/**
	 * The number of structural features of the '<em>Einkommensersatzleistungen Vor Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Einkommensersatzleistungen Vor Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl <em>Einkommen Vor Geburt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getEinkommenVorGeburtType()
	 * @generated
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Nichtselbststaendige Beschaeftigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG = 0;

	/**
	 * The feature id for the '<em><b>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG = 1;

	/**
	 * The feature id for the '<em><b>Einkommen Aus Nichtselbststaendiger Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT = 2;

	/**
	 * The feature id for the '<em><b>Selbstaendige Beschaeftigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG = 3;

	/**
	 * The feature id for the '<em><b>Geringes Einkommen Covid19</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19 = 4;

	/**
	 * The feature id for the '<em><b>Entgeltdaten Dsrv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV = 5;

	/**
	 * The feature id for the '<em><b>Gewerbebetrieb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__GEWERBEBETRIEB = 6;

	/**
	 * The feature id for the '<em><b>Land Und Forstwirtschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__LAND_UND_FORSTWIRTSCHAFT = 7;

	/**
	 * The feature id for the '<em><b>Freiwilligendienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__FREIWILLIGENDIENST = 8;

	/**
	 * The feature id for the '<em><b>Nachweis Mutter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__NACHWEIS_MUTTER = 9;

	/**
	 * The feature id for the '<em><b>Selbststaendigkeit Gewerbe Land Forstwirtschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT = 10;

	/**
	 * The feature id for the '<em><b>Einkommensersatzleistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN = 11;

	/**
	 * The number of structural features of the '<em>Einkommen Vor Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Einkommen Vor Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_VOR_GEBURT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl <em>Einkommen Waehrend Bezugszeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Nichtselbststaendige Beschaeftigung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG = 0;

	/**
	 * The feature id for the '<em><b>Selbstaendige Beschaeftigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG = 1;

	/**
	 * The feature id for the '<em><b>Land Und Forstwirtschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__LAND_UND_FORSTWIRTSCHAFT = 2;

	/**
	 * The feature id for the '<em><b>Gewerbebetrieb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__GEWERBEBETRIEB = 3;

	/**
	 * The feature id for the '<em><b>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT = 4;

	/**
	 * The feature id for the '<em><b>Beruecksichtigung Betriebsausgaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUECKSICHTIGUNG_BETRIEBSAUSGABEN = 5;

	/**
	 * The feature id for the '<em><b>Nachweis Betriebsausgaben</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NACHWEIS_BETRIEBSAUSGABEN = 6;

	/**
	 * The feature id for the '<em><b>Einkommensersatzleistungen Bezugszeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM = 7;

	/**
	 * The feature id for the '<em><b>Einkommen Aus Nichtselbststaendiger Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT = 8;

	/**
	 * The feature id for the '<em><b>Arbeitgeberformblatt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__ARBEITGEBERFORMBLATT = 9;

	/**
	 * The feature id for the '<em><b>Freiwilligendienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST = 10;

	/**
	 * The number of structural features of the '<em>Einkommen Waehrend Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Einkommen Waehrend Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteBeantragterZeitraumTypeImpl <em>Einkuenfte Beantragter Zeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteBeantragterZeitraumTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getEinkuenfteBeantragterZeitraumType()
	 * @generated
	 */
	int EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM = 0;

	/**
	 * The feature id for the '<em><b>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT = 1;

	/**
	 * The feature id for the '<em><b>Wochenstunden Je Taetigkeit Selbststaendigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT = 2;

	/**
	 * The feature id for the '<em><b>Nachweis Einkommenssteuerbescheid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID = 3;

	/**
	 * The number of structural features of the '<em>Einkuenfte Beantragter Zeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Einkuenfte Beantragter Zeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeImpl <em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType()
	 * @generated
	 */
	int EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Steuerfreibetrag Selbstaendigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG_SELBSTAENDIGKEIT = 0;

	/**
	 * The feature id for the '<em><b>Einkuenfte Beantragter Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_BEANTRAGTER_ZEITRAUM = 1;

	/**
	 * The number of structural features of the '<em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAbbruch0206TypeImpl <em>Elterngeldantrag Abbruch0206 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAbbruch0206TypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElterngeldantragAbbruch0206Type()
	 * @generated
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Anfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__ANFRAGE_ID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grund Abbruch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE__GRUND_ABBRUCH = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elterngeldantrag Abbruch0206 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Elterngeldantrag Abbruch0206 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ABBRUCH0206_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrage0204TypeImpl <em>Elterngeldantrag Anfrage0204 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrage0204TypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElterngeldantragAnfrage0204Type()
	 * @generated
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Anfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGE_ID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antrags Referenz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTRAGS_REFERENZ = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anfragegrund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEGRUND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anfrageparameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGEPARAMETER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Anfragendes System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGENDES_SYSTEM = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Anfrager Organisations ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANFRAGER_ORGANISATIONS_ID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Antwort Abweichender Empfaenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Elterngeldantrag Anfrage0204 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Elterngeldantrag Anfrage0204 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGE0204_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrageabschluss0205TypeImpl <em>Elterngeldantrag Anfrageabschluss0205 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAnfrageabschluss0205TypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Anfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ANFRAGE_ID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antrags Referenz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ANTRAGS_REFERENZ = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anfragegrund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ANFRAGEGRUND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anfrageparameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ANFRAGEPARAMETER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Anfragendes System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ANFRAGENDES_SYSTEM = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Anfrager Organisations ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ANFRAGER_ORGANISATIONS_ID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Antwort Abweichender Empfaenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ANTWORT_ABWEICHENDER_EMPFAENGER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Anfrageergebnis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__ANFRAGEERGEBNIS = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fehlerfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE__FEHLERFALL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Elterngeldantrag Anfrageabschluss0205 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Elterngeldantrag Anfrageabschluss0205 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl <em>Elterngeldantrag Antrag0201 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elterngeldantrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gesamteinkommen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elternteil Eins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Elternteil Zwei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weitere Kinder Im Haushalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nachweisdokument Antragsservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSSERVICE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pdf Antrag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__PDF_ANTRAG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Nachweisdokument Antragsteller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Datenabruf</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE__DATENABRUF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Elterngeldantrag Antrag0201 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Elterngeldantrag Antrag0201 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_ANTRAG0201_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragStandesamtsmeldung0203TypeImpl <em>Elterngeldantrag Standesamtsmeldung0203 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragStandesamtsmeldung0203TypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElterngeldantragStandesamtsmeldung0203Type()
	 * @generated
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Anforderung Erfolgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__ANFORDERUNG_ERFOLGT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elterngeldantrag Standesamtsmeldung0203 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elterngeldantrag Standesamtsmeldung0203 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragVorabmeldung0202TypeImpl <em>Elterngeldantrag Vorabmeldung0202 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragVorabmeldung0202TypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElterngeldantragVorabmeldung0202Type()
	 * @generated
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Antragstellener Elternteil Vorabmeldung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSTELLENER_ELTERNTEIL_VORABMELDUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Kind Vorabmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antragsdokumente</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSDOKUMENTE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Elterngeldantrag Vorabmeldung0202 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Elterngeldantrag Vorabmeldung0202 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl <em>Elternteil Eins Elterngeldantrag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Persoenliche Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN = 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>Gewoehnlicher Aufenthalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT = 2;

	/**
	 * The feature id for the '<em><b>Kindschaftsverhaeltnis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS = 3;

	/**
	 * The feature id for the '<em><b>Haushaltszugehoerigkeit Des Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES = 4;

	/**
	 * The feature id for the '<em><b>Alleinerziehendenanspruch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH = 5;

	/**
	 * The feature id for the '<em><b>Beantragung Elterngeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD = 6;

	/**
	 * The feature id for the '<em><b>Krankenversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG = 7;

	/**
	 * The feature id for the '<em><b>Einkommen Vor Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT = 8;

	/**
	 * The feature id for the '<em><b>Einkommen Waehrend Bezugszeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM = 9;

	/**
	 * The feature id for the '<em><b>Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG = 10;

	/**
	 * The feature id for the '<em><b>Zustimmung Datenabrufe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE = 11;

	/**
	 * The feature id for the '<em><b>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT = 12;

	/**
	 * The feature id for the '<em><b>Kontaktmoeglichkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KONTAKTMOEGLICHKEIT = 13;

	/**
	 * The feature id for the '<em><b>Steuerliche Identifikationsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__STEUERLICHE_IDENTIFIKATIONSNUMMER = 14;

	/**
	 * The feature id for the '<em><b>Nutzerkonto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO = 15;

	/**
	 * The feature id for the '<em><b>Erwerbstaetigkeit Bezugszeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM = 16;

	/**
	 * The feature id for the '<em><b>Bescheidzustellung Versandweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG = 17;

	/**
	 * The feature id for the '<em><b>Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG = 18;

	/**
	 * The feature id for the '<em><b>Elternzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT = 19;

	/**
	 * The feature id for the '<em><b>Zusammenveranlagung Liegt Vor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSAMMENVERANLAGUNG_LIEGT_VOR = 20;

	/**
	 * The feature id for the '<em><b>Mitteilung An Behoerde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__MITTEILUNG_AN_BEHOERDE = 21;

	/**
	 * The number of structural features of the '<em>Elternteil Eins Elterngeldantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Elternteil Eins Elterngeldantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilZweiElterngeldantragTypeImpl <em>Elternteil Zwei Elterngeldantrag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilZweiElterngeldantragTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Persoenliche Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN = 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>Gewoehnlicher Aufenthalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT = 2;

	/**
	 * The feature id for the '<em><b>Kindschaftsverhaeltnis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS = 3;

	/**
	 * The feature id for the '<em><b>Haushaltszugehoerigkeit Des Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES = 4;

	/**
	 * The feature id for the '<em><b>Beantragung Elterngeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD = 5;

	/**
	 * The feature id for the '<em><b>Krankenversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG = 6;

	/**
	 * The feature id for the '<em><b>Einkommen Vor Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT = 7;

	/**
	 * The feature id for the '<em><b>Einkommen Waehrend Bezugszeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM = 8;

	/**
	 * The feature id for the '<em><b>Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG = 9;

	/**
	 * The feature id for the '<em><b>Zustimmung Datenabrufe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE = 10;

	/**
	 * The feature id for the '<em><b>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT = 11;

	/**
	 * The feature id for the '<em><b>Kontaktmoeglichkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__KONTAKTMOEGLICHKEIT = 12;

	/**
	 * The feature id for the '<em><b>Steuerliche Identifikationsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__STEUERLICHE_IDENTIFIKATIONSNUMMER = 13;

	/**
	 * The feature id for the '<em><b>Nutzerkonto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__NUTZERKONTO = 14;

	/**
	 * The feature id for the '<em><b>Erwerbstaetigkeit Bezugszeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM = 15;

	/**
	 * The feature id for the '<em><b>Bescheidzustellung Versandweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG = 16;

	/**
	 * The feature id for the '<em><b>Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG = 17;

	/**
	 * The feature id for the '<em><b>Elternzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__ELTERNZEIT = 18;

	/**
	 * The feature id for the '<em><b>Zusammenveranlagung Liegt Vor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__ZUSAMMENVERANLAGUNG_LIEGT_VOR = 19;

	/**
	 * The feature id for the '<em><b>Mitteilung An Behoerde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE__MITTEILUNG_AN_BEHOERDE = 20;

	/**
	 * The number of structural features of the '<em>Elternteil Zwei Elterngeldantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Elternteil Zwei Elterngeldantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternzeitTypeImpl <em>Elternzeit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternzeitTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElternzeitType()
	 * @generated
	 */
	int ELTERNZEIT_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Zeitraum Von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNZEIT_TYPE__ZEITRAUM_VON = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNZEIT_TYPE__ZEITRAUM_BIS = 1;

	/**
	 * The number of structural features of the '<em>Elternzeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNZEIT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Elternzeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELTERNZEIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ErwerbstaetigkeitBezugszeitraumTypeImpl <em>Erwerbstaetigkeit Bezugszeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ErwerbstaetigkeitBezugszeitraumTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getErwerbstaetigkeitBezugszeitraumType()
	 * @generated
	 */
	int ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM = 0;

	/**
	 * The feature id for the '<em><b>Resturlaub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__RESTURLAUB = 1;

	/**
	 * The feature id for the '<em><b>Berufsbildung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG = 2;

	/**
	 * The feature id for the '<em><b>Tagespflege</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE = 3;

	/**
	 * The number of structural features of the '<em>Erwerbstaetigkeit Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Erwerbstaetigkeit Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.FreiwilligendienstTypeImpl <em>Freiwilligendienst Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.FreiwilligendienstTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getFreiwilligendienstType()
	 * @generated
	 */
	int FREIWILLIGENDIENST_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Freiwilligendienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIWILLIGENDIENST_TYPE__FREIWILLIGENDIENST = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIWILLIGENDIENST_TYPE__ZEITRAUM = 1;

	/**
	 * The feature id for the '<em><b>Wochenstunden Je Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIWILLIGENDIENST_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT = 2;

	/**
	 * The number of structural features of the '<em>Freiwilligendienst Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIWILLIGENDIENST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Freiwilligendienst Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREIWILLIGENDIENST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GeringesEinkommenCovid19TypeImpl <em>Geringes Einkommen Covid19 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GeringesEinkommenCovid19TypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getGeringesEinkommenCovid19Type()
	 * @generated
	 */
	int GERINGES_EINKOMMEN_COVID19_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Geringes Einkommen Covid19</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERINGES_EINKOMMEN_COVID19_TYPE__GERINGES_EINKOMMEN_COVID19 = 0;

	/**
	 * The feature id for the '<em><b>Antrag Ausklammerung Monate Nichtselbststaendige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE = 1;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERINGES_EINKOMMEN_COVID19_TYPE__ZEITRAUM = 2;

	/**
	 * The feature id for the '<em><b>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE = 3;

	/**
	 * The feature id for the '<em><b>Verschiebung Bemessungszeitraumes Selbststaendige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERINGES_EINKOMMEN_COVID19_TYPE__VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE = 4;

	/**
	 * The feature id for the '<em><b>Nachweis Geringes Einkommen Covid19</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERINGES_EINKOMMEN_COVID19_TYPE__NACHWEIS_GERINGES_EINKOMMEN_COVID19 = 5;

	/**
	 * The number of structural features of the '<em>Geringes Einkommen Covid19 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERINGES_EINKOMMEN_COVID19_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Geringes Einkommen Covid19 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERINGES_EINKOMMEN_COVID19_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesamteinkommenTypeImpl <em>Gesamteinkommen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesamteinkommenTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getGesamteinkommenType()
	 * @generated
	 */
	int GESAMTEINKOMMEN_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Gesamteinkommen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESAMTEINKOMMEN_TYPE__GESAMTEINKOMMEN = 0;

	/**
	 * The feature id for the '<em><b>Nachweis Gesamteinkommen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESAMTEINKOMMEN_TYPE__NACHWEIS_GESAMTEINKOMMEN = 1;

	/**
	 * The number of structural features of the '<em>Gesamteinkommen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESAMTEINKOMMEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gesamteinkommen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESAMTEINKOMMEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesetzlicheVertretungTypeImpl <em>Gesetzliche Vertretung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesetzlicheVertretungTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getGesetzlicheVertretungType()
	 * @generated
	 */
	int GESETZLICHE_VERTRETUNG_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Anrede Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG = 0;

	/**
	 * The feature id for the '<em><b>Name Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG = 1;

	/**
	 * The feature id for the '<em><b>Anschrift Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG = 2;

	/**
	 * The feature id for the '<em><b>Nutzerkonto Gesetzliche Vertretung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG = 3;

	/**
	 * The feature id for the '<em><b>Nachweis Gesetzliche Vertretung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESETZLICHE_VERTRETUNG_TYPE__NACHWEIS_GESETZLICHE_VERTRETUNG = 4;

	/**
	 * The number of structural features of the '<em>Gesetzliche Vertretung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESETZLICHE_VERTRETUNG_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Gesetzliche Vertretung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESETZLICHE_VERTRETUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GewoehnlicherAufenthaltTypeImpl <em>Gewoehnlicher Aufenthalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GewoehnlicherAufenthaltTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getGewoehnlicherAufenthaltType()
	 * @generated
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Wohnsitz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ = 0;

	/**
	 * The feature id for the '<em><b>Beginn Aufenthalt D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE__BEGINN_AUFENTHALT_D = 1;

	/**
	 * The feature id for the '<em><b>Befristeter Auslandsaufenthalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT = 2;

	/**
	 * The feature id for the '<em><b>Unbefristeter Auslandsaufenthalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT = 3;

	/**
	 * The feature id for the '<em><b>Auslaendisches Arbeitsverhaeltnis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS = 4;

	/**
	 * The feature id for the '<em><b>Mitglied Nato Ziviles Gefolge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_NATO_ZIVILES_GEFOLGE = 5;

	/**
	 * The feature id for the '<em><b>Mitglied Diplomatische Mission Oder Konsularische Vertretung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG = 6;

	/**
	 * The number of structural features of the '<em>Gewoehnlicher Aufenthalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Gewoehnlicher Aufenthalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEWOEHNLICHER_AUFENTHALT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.HaushaltszugehoerigkeitDesKindesTypeImpl <em>Haushaltszugehoerigkeit Des Kindes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.HaushaltszugehoerigkeitDesKindesTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getHaushaltszugehoerigkeitDesKindesType()
	 * @generated
	 */
	int HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Betreuung Und Erziehung Im Eigenen Haushalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE__BETREUUNG_UND_ERZIEHUNG_IM_EIGENEN_HAUSHALT = 0;

	/**
	 * The number of structural features of the '<em>Haushaltszugehoerigkeit Des Kindes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Haushaltszugehoerigkeit Des Kindes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl <em>Kind Elterngeld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getKindElterngeldType()
	 * @generated
	 */
	int KIND_ELTERNGELD_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Name Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE__NAME_KIND = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Geburtsurkunde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE__GEBURTSURKUNDE = 2;

	/**
	 * The feature id for the '<em><b>Anschrift Bei Antragstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG = 3;

	/**
	 * The feature id for the '<em><b>Besonders Frueh Geborenes Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND = 4;

	/**
	 * The feature id for the '<em><b>Adoption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE__ADOPTION = 5;

	/**
	 * The feature id for the '<em><b>Mehrlingsgeburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT = 6;

	/**
	 * The feature id for the '<em><b>Behinderung Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND = 7;

	/**
	 * The feature id for the '<em><b>Nummer Geburtsstandesamt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT = 8;

	/**
	 * The number of structural features of the '<em>Kind Elterngeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Kind Elterngeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_ELTERNGELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindschaftsverhaeltnisTypeImpl <em>Kindschaftsverhaeltnis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindschaftsverhaeltnisTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getKindschaftsverhaeltnisType()
	 * @generated
	 */
	int KINDSCHAFTSVERHAELTNIS_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Kindschaftsverhaeltnis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDSCHAFTSVERHAELTNIS_TYPE__KINDSCHAFTSVERHAELTNIS = 0;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDSCHAFTSVERHAELTNIS_TYPE__NACHWEIS = 1;

	/**
	 * The number of structural features of the '<em>Kindschaftsverhaeltnis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDSCHAFTSVERHAELTNIS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Kindschaftsverhaeltnis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDSCHAFTSVERHAELTNIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindVorabmeldungTypeImpl <em>Kind Vorabmeldung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindVorabmeldungTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getKindVorabmeldungType()
	 * @generated
	 */
	int KIND_VORABMELDUNG_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Name Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_VORABMELDUNG_TYPE__NAME_KIND = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_VORABMELDUNG_TYPE__GEBURTSDATUM = 1;

	/**
	 * The number of structural features of the '<em>Kind Vorabmeldung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_VORABMELDUNG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Kind Vorabmeldung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_VORABMELDUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankengeldTypeImpl <em>Krankengeld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankengeldTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getKrankengeldType()
	 * @generated
	 */
	int KRANKENGELD_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Bezug Krankengeld Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENGELD_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum Krankengeld Schwangerschaft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENGELD_TYPE__ZEITRAUM_KRANKENGELD_SCHWANGERSCHAFT = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Krankengeld Schwangerschaft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENGELD_TYPE__NACHWEIS_KRANKENGELD_SCHWANGERSCHAFT = 2;

	/**
	 * The number of structural features of the '<em>Krankengeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENGELD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Krankengeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENGELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankentagegeldTypeImpl <em>Krankentagegeld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankentagegeldTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getKrankentagegeldType()
	 * @generated
	 */
	int KRANKENTAGEGELD_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Bezug Krankentagegeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENTAGEGELD_TYPE__BEZUG_KRANKENTAGEGELD = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum Krankentagegeld</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENTAGEGELD_TYPE__ZEITRAUM_KRANKENTAGEGELD = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Krankentagegeld</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENTAGEGELD_TYPE__NACHWEIS_KRANKENTAGEGELD = 2;

	/**
	 * The number of structural features of the '<em>Krankentagegeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENTAGEGELD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Krankentagegeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENTAGEGELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankenversicherungTypeImpl <em>Krankenversicherung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankenversicherungTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getKrankenversicherungType()
	 * @generated
	 */
	int KRANKENVERSICHERUNG_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Versicherungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART = 0;

	/**
	 * The feature id for the '<em><b>Bezeichnung Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENVERSICHERUNG_TYPE__BEZEICHNUNG_KRANKENKASSE = 1;

	/**
	 * The feature id for the '<em><b>Anschrift Krankenkasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE = 2;

	/**
	 * The feature id for the '<em><b>Versichertennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENVERSICHERUNG_TYPE__VERSICHERTENNUMMER = 3;

	/**
	 * The feature id for the '<em><b>Anschrift Postfach Krankenkasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE = 4;

	/**
	 * The feature id for the '<em><b>Nachweis Krankenversicherung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENVERSICHERUNG_TYPE__NACHWEIS_KRANKENVERSICHERUNG = 5;

	/**
	 * The number of structural features of the '<em>Krankenversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENVERSICHERUNG_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Krankenversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENVERSICHERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.LebenssituationTypeImpl <em>Lebenssituation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.LebenssituationTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getLebenssituationType()
	 * @generated
	 */
	int LEBENSSITUATION_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Unverheiratetes Zusammenleben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN = 0;

	/**
	 * The feature id for the '<em><b>Unverheiratetes Zusammenleben Seit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT = 1;

	/**
	 * The feature id for the '<em><b>Dauerndes Getrennt Leben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN = 2;

	/**
	 * The feature id for the '<em><b>Dauerndes Getrennt Leben Seit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT = 3;

	/**
	 * The number of structural features of the '<em>Lebenssituation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Lebenssituation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEBENSSITUATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MehrlingsgeburtTypeImpl <em>Mehrlingsgeburt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MehrlingsgeburtTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getMehrlingsgeburtType()
	 * @generated
	 */
	int MEHRLINGSGEBURT_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Mehrlingsgeburt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEHRLINGSGEBURT_TYPE__MEHRLINGSGEBURT = 0;

	/**
	 * The feature id for the '<em><b>Anzahl Mehrlinge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEHRLINGSGEBURT_TYPE__ANZAHL_MEHRLINGE = 1;

	/**
	 * The feature id for the '<em><b>Vornamen Mehrlingskind</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEHRLINGSGEBURT_TYPE__VORNAMEN_MEHRLINGSKIND = 2;

	/**
	 * The feature id for the '<em><b>Nachweis Mehrlingsgeburt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEHRLINGSGEBURT_TYPE__NACHWEIS_MEHRLINGSGEBURT = 3;

	/**
	 * The number of structural features of the '<em>Mehrlingsgeburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEHRLINGSGEBURT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mehrlingsgeburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEHRLINGSGEBURT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MidijobTypeImpl <em>Midijob Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MidijobTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getMidijobType()
	 * @generated
	 */
	int MIDIJOB_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDIJOB_TYPE__ZEITRAUM = 0;

	/**
	 * The feature id for the '<em><b>Wochenstunden Je Taetigkeit Midijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Midijob</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDIJOB_TYPE__NACHWEIS_MIDIJOB = 2;

	/**
	 * The number of structural features of the '<em>Midijob Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDIJOB_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Midijob Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDIJOB_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MinijobTypeImpl <em>Minijob Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MinijobTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getMinijobType()
	 * @generated
	 */
	int MINIJOB_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIJOB_TYPE__ZEITRAUM = 0;

	/**
	 * The feature id for the '<em><b>Wochenstunden Je Taetigkeit Minijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Minijob</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIJOB_TYPE__NACHWEIS_MINIJOB = 2;

	/**
	 * The number of structural features of the '<em>Minijob Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIJOB_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Minijob Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIJOB_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl <em>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD = 0;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeld Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_ZEITRAUM = 1;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeld Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_NACHWEIS = 2;

	/**
	 * The feature id for the '<em><b>Arbeitgeberzuschuss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS = 3;

	/**
	 * The feature id for the '<em><b>Arbeitgeberzuschuss Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_ZEITRAUM = 4;

	/**
	 * The feature id for the '<em><b>Arbeitgeberzuschuss Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_NACHWEIS = 5;

	/**
	 * The feature id for the '<em><b>Krankentagegeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD = 6;

	/**
	 * The feature id for the '<em><b>Krankentagegeld Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_ZEITRAUM = 7;

	/**
	 * The feature id for the '<em><b>Krankentagegeld Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_NACHWEIS = 8;

	/**
	 * The feature id for the '<em><b>Dienst Anwaerterbezug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG = 9;

	/**
	 * The feature id for the '<em><b>Dienst Anwaerterbezug Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_ZEITRAUM = 10;

	/**
	 * The feature id for the '<em><b>Dienst Anwaerterbezug Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_NACHWEIS = 11;

	/**
	 * The feature id for the '<em><b>Beamten Soldatenrecht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT = 12;

	/**
	 * The feature id for the '<em><b>Beamten Soldatenrecht Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT_ZEITRAUM = 13;

	/**
	 * The feature id for the '<em><b>Beamten Sodatenrecht Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SODATENRECHT_NACHWEIS = 14;

	/**
	 * The feature id for the '<em><b>Ausl Familienleistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN = 15;

	/**
	 * The feature id for the '<em><b>Ausl Familienleistungen Zeitraum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_ZEITRAUM = 16;

	/**
	 * The feature id for the '<em><b>Ausl Familienleistungen Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_NACHWEIS = 17;

	/**
	 * The number of structural features of the '<em>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl <em>Nichtselbststaendige Beschaeftigung Vor Geburt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getNichtselbststaendigeBeschaeftigungVorGeburtType()
	 * @generated
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Nichtselbststaendigkeit Ausklammerungstatbestaende</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE = 0;

	/**
	 * The feature id for the '<em><b>Berufsbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__BERUFSBILDUNG = 1;

	/**
	 * The feature id for the '<em><b>Midijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MIDIJOB = 2;

	/**
	 * The feature id for the '<em><b>Steuerfreibetrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__STEUERFREIBETRAG = 3;

	/**
	 * The feature id for the '<em><b>Minijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MINIJOB = 4;

	/**
	 * The feature id for the '<em><b>Freiwilligendienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__FREIWILLIGENDIENST = 5;

	/**
	 * The number of structural features of the '<em>Nichtselbststaendige Beschaeftigung Vor Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Nichtselbststaendige Beschaeftigung Vor Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl <em>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Teilzeittaetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__TEILZEITTAETIGKEIT = 0;

	/**
	 * The feature id for the '<em><b>Angaben Teilzeittaetigkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_TEILZEITTAETIGKEIT = 1;

	/**
	 * The feature id for the '<em><b>Midijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MIDIJOB = 2;

	/**
	 * The feature id for the '<em><b>Angaben Midijob</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MIDIJOB = 3;

	/**
	 * The feature id for the '<em><b>Minijob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MINIJOB = 4;

	/**
	 * The feature id for the '<em><b>Angaben Minijob</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MINIJOB = 5;

	/**
	 * The feature id for the '<em><b>Steuerfreibetrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG = 6;

	/**
	 * The feature id for the '<em><b>Berufsausbildung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG = 7;

	/**
	 * The feature id for the '<em><b>Freiwilligendienst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST = 8;

	/**
	 * The number of structural features of the '<em>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl <em>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeldbezug Vor Geburt Antragskind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND = 0;

	/**
	 * The feature id for the '<em><b>Nachweis Mutterschaftsgeldbezug Antragskind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_ANTRAGSKIND = 1;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND = 2;

	/**
	 * The feature id for the '<em><b>Nachweis Mutterschaftsgeldbezug Aelteres Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_AELTERES_KIND = 3;

	/**
	 * The feature id for the '<em><b>Elterngeldbezug Aelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_AELTERES_KIND = 4;

	/**
	 * The feature id for the '<em><b>Nachweis Elterngeldbezug Aelteres Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_ELTERNGELDBEZUG_AELTERES_KIND = 5;

	/**
	 * The feature id for the '<em><b>Moegliche Einkommensverluste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MOEGLICHE_EINKOMMENSVERLUSTE = 6;

	/**
	 * The feature id for the '<em><b>Nachweis Moegliche Einkommensverluste</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MOEGLICHE_EINKOMMENSVERLUSTE = 7;

	/**
	 * The feature id for the '<em><b>Einkommensverlust Wehr Und Zivildienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST = 8;

	/**
	 * The feature id for the '<em><b>Nachweis Einkommensverlust Wehr Und Zivildienst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST = 9;

	/**
	 * The feature id for the '<em><b>Antrag Ausklammerungsverzicht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ANTRAG_AUSKLAMMERUNGSVERZICHT = 10;

	/**
	 * The feature id for the '<em><b>Zeitraum Antrag Ausklammerungsverzicht</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ZEITRAUM_ANTRAG_AUSKLAMMERUNGSVERZICHT = 11;

	/**
	 * The feature id for the '<em><b>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND = 12;

	/**
	 * The feature id for the '<em><b>Nachweis Aelteres Besonders Frueh Geborenes Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_AELTERES_BESONDERS_FRUEH_GEBORENES_KIND = 13;

	/**
	 * The feature id for the '<em><b>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG = 14;

	/**
	 * The feature id for the '<em><b>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_NACHWEIS = 15;

	/**
	 * The number of structural features of the '<em>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl <em>Persoenliche Angaben ET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getPersoenlicheAngabenETType()
	 * @generated
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSORT = 2;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT = 3;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND = 4;

	/**
	 * The feature id for the '<em><b>Verheiratet Verpartnert Mit ET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__VERHEIRATET_VERPARTNERT_MIT_ET = 5;

	/**
	 * The feature id for the '<em><b>Unverheiratetes Zusammenleben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN = 6;

	/**
	 * The feature id for the '<em><b>Alleinerziehend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__ALLEINERZIEHEND = 7;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT = 8;

	/**
	 * The feature id for the '<em><b>Nachweis Personalausweis Pass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__NACHWEIS_PERSONALAUSWEIS_PASS = 9;

	/**
	 * The feature id for the '<em><b>Meldedatenabgleich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE__MELDEDATENABGLEICH = 10;

	/**
	 * The number of structural features of the '<em>Persoenliche Angaben ET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Persoenliche Angaben ET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_ET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.RentenTypeImpl <em>Renten Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.RentenTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getRentenType()
	 * @generated
	 */
	int RENTEN_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Bezug Rente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTEN_TYPE__BEZUG_RENTE = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum Rente</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTEN_TYPE__ZEITRAUM_RENTE = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Rente</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTEN_TYPE__NACHWEIS_RENTE = 2;

	/**
	 * The feature id for the '<em><b>Art Rente</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTEN_TYPE__ART_RENTE = 3;

	/**
	 * The number of structural features of the '<em>Renten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTEN_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Renten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ResturlaubTypeImpl <em>Resturlaub Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ResturlaubTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getResturlaubType()
	 * @generated
	 */
	int RESTURLAUB_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Anzahl Tage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTURLAUB_TYPE__ANZAHL_TAGE = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTURLAUB_TYPE__ZEITRAUM = 1;

	/**
	 * The feature id for the '<em><b>Anzahl Der Wochenstunden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTURLAUB_TYPE__ANZAHL_DER_WOCHENSTUNDEN = 2;

	/**
	 * The number of structural features of the '<em>Resturlaub Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTURLAUB_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resturlaub Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTURLAUB_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl <em>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType()
	 * @generated
	 */
	int SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Angaben Sozialversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG = 0;

	/**
	 * The feature id for the '<em><b>Kirchensteuerpflicht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__KIRCHENSTEUERPFLICHT = 1;

	/**
	 * The feature id for the '<em><b>Verschiebetatbestaende</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE = 2;

	/**
	 * The feature id for the '<em><b>Steuerfreibetrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__STEUERFREIBETRAG = 3;

	/**
	 * The feature id for the '<em><b>Nachweis Einkommenssteuerbescheid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID = 4;

	/**
	 * The number of structural features of the '<em>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SelbststaendigkeitVerschiebetatbestaendeTypeImpl <em>Selbststaendigkeit Verschiebetatbestaende Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SelbststaendigkeitVerschiebetatbestaendeTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeldbezug Vor Geburt Antragskind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND = 0;

	/**
	 * The feature id for the '<em><b>Nachweis Mutterschaftsgeldbezug Antragskind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_ANTRAGSKIND = 1;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND = 2;

	/**
	 * The feature id for the '<em><b>Nachweis Mutterschaftsgeldbezug Aelteres Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_AELTERES_KIND = 3;

	/**
	 * The feature id for the '<em><b>Elterngeldbezug Aelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__ELTERNGELDBEZUG_AELTERES_KIND = 4;

	/**
	 * The feature id for the '<em><b>Nachweis Elterngeldbezug Aelteres Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__NACHWEIS_ELTERNGELDBEZUG_AELTERES_KIND = 5;

	/**
	 * The feature id for the '<em><b>Moegliche Einkommensverluste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__MOEGLICHE_EINKOMMENSVERLUSTE = 6;

	/**
	 * The feature id for the '<em><b>Nachweis Moegliche Einkommensverluste</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__NACHWEIS_MOEGLICHE_EINKOMMENSVERLUSTE = 7;

	/**
	 * The feature id for the '<em><b>Einkommensverlust Wehr Und Zivildienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST = 8;

	/**
	 * The feature id for the '<em><b>Nachweis Einkommensverlust Wehr Und Zivildienst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__NACHWEIS_EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST = 9;

	/**
	 * The feature id for the '<em><b>Antrag Verschiebung Bemessungszeitraum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUM = 10;

	/**
	 * The feature id for the '<em><b>Angabe Kalenderjahr Zur Berechnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__ANGABE_KALENDERJAHR_ZUR_BERECHNUNG = 11;

	/**
	 * The feature id for the '<em><b>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND = 12;

	/**
	 * The feature id for the '<em><b>Nachweis Aelteres Besonders Frueh Geborenes Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__NACHWEIS_AELTERES_BESONDERS_FRUEH_GEBORENES_KIND = 13;

	/**
	 * The feature id for the '<em><b>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG = 14;

	/**
	 * The feature id for the '<em><b>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_NACHWEIS = 15;

	/**
	 * The number of structural features of the '<em>Selbststaendigkeit Verschiebetatbestaende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Selbststaendigkeit Verschiebetatbestaende Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SonstigeLeistungenBezugszeitraumTypeImpl <em>Sonstige Leistungen Bezugszeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SonstigeLeistungenBezugszeitraumTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getSonstigeLeistungenBezugszeitraumType()
	 * @generated
	 */
	int SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Bezug Elterngeld Ausland</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ELTERNGELD_AUSLAND = 0;

	/**
	 * The feature id for the '<em><b>Nachweis Elterngeld Ausland</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ELTERNGELD_AUSLAND = 1;

	/**
	 * The feature id for the '<em><b>Bezug ALGII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGII = 2;

	/**
	 * The feature id for the '<em><b>Nachweis ALGII</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ALGII = 3;

	/**
	 * The feature id for the '<em><b>Name Sozialleistungstraeger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NAME_SOZIALLEISTUNGSTRAEGER = 4;

	/**
	 * The feature id for the '<em><b>Anschrift Sozialleistungstraeger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER = 5;

	/**
	 * The number of structural features of the '<em>Sonstige Leistungen Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Sonstige Leistungen Bezugszeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.StaatsangehoerigkeitTypeImpl <em>Staatsangehoerigkeit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.StaatsangehoerigkeitTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getStaatsangehoerigkeitType()
	 * @generated
	 */
	int STAATSANGEHOERIGKEIT_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeiten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN = 0;

	/**
	 * The feature id for the '<em><b>Verlust Freizuegigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_TYPE__VERLUST_FREIZUEGIGKEIT = 1;

	/**
	 * The feature id for the '<em><b>Aufenthaltstitel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL = 2;

	/**
	 * The number of structural features of the '<em>Staatsangehoerigkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Staatsangehoerigkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TagespflegeTypeImpl <em>Tagespflege Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TagespflegeTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getTagespflegeType()
	 * @generated
	 */
	int TAGESPFLEGE_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Tagespflege</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGESPFLEGE_TYPE__TAGESPFLEGE = 0;

	/**
	 * The feature id for the '<em><b>Anzahl Der Kinder Ohne Eigene Kinder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGESPFLEGE_TYPE__ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER = 1;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGESPFLEGE_TYPE__NACHWEIS = 2;

	/**
	 * The number of structural features of the '<em>Tagespflege Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGESPFLEGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tagespflege Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGESPFLEGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TeilzeittaetigkeitTypeImpl <em>Teilzeittaetigkeit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TeilzeittaetigkeitTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getTeilzeittaetigkeitType()
	 * @generated
	 */
	int TEILZEITTAETIGKEIT_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILZEITTAETIGKEIT_TYPE__ZEITRAUM = 0;

	/**
	 * The feature id for the '<em><b>Wochenstunden Je Taetigkeit Teilzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILZEITTAETIGKEIT_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Teilzeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILZEITTAETIGKEIT_TYPE__NACHWEIS_TEILZEIT = 2;

	/**
	 * The number of structural features of the '<em>Teilzeittaetigkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILZEITTAETIGKEIT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Teilzeittaetigkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILZEITTAETIGKEIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.WeitereKinderTypeImpl <em>Weitere Kinder Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.WeitereKinderTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getWeitereKinderType()
	 * @generated
	 */
	int WEITERE_KINDER_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Anzahl Aller Im Haushalt Lebenden Kinder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_TYPE__ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER = 0;

	/**
	 * The feature id for the '<em><b>Angaben Weiteres Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_TYPE__ANGABEN_WEITERES_KIND = 1;

	/**
	 * The number of structural features of the '<em>Weitere Kinder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Weitere Kinder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ZustimmungDatenabrufeTypeImpl <em>Zustimmung Datenabrufe Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ZustimmungDatenabrufeTypeImpl
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getZustimmungDatenabrufeType()
	 * @generated
	 */
	int ZUSTIMMUNG_DATENABRUFE_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Zustimmung Datenabruf DSRV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_DSRV = 0;

	/**
	 * The feature id for the '<em><b>Zustimmung Datenabruf Standesamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_STANDESAMT = 1;

	/**
	 * The feature id for the '<em><b>Zustimmung Datenabruf Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_KRANKENKASSE = 2;

	/**
	 * The feature id for the '<em><b>Zustimmung Datenabruf Finanzamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_FINANZAMT = 3;

	/**
	 * The feature id for the '<em><b>Zustimmung Datenabruf Beamte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_BEAMTE = 4;

	/**
	 * The number of structural features of the '<em>Zustimmung Datenabrufe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_DATENABRUFE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Zustimmung Datenabrufe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_DATENABRUFE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Abbruchgrund <em>Abbruchgrund</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Abbruchgrund
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAbbruchgrund()
	 * @generated
	 */
	int ABBRUCHGRUND = 77;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Anfragegrund <em>Anfragegrund</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Anfragegrund
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAnfragegrund()
	 * @generated
	 */
	int ANFRAGEGRUND = 78;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Elterngeldantrag <em>Elterngeldantrag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Elterngeldantrag
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElterngeldantrag()
	 * @generated
	 */
	int ELTERNGELDANTRAG = 79;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Fehlerfall <em>Fehlerfall</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Fehlerfall
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getFehlerfall()
	 * @generated
	 */
	int FEHLERFALL = 80;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Gesamteinkommen <em>Gesamteinkommen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Gesamteinkommen
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getGesamteinkommen()
	 * @generated
	 */
	int GESAMTEINKOMMEN = 81;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Kindschaftsverhaeltnis <em>Kindschaftsverhaeltnis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Kindschaftsverhaeltnis
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getKindschaftsverhaeltnis()
	 * @generated
	 */
	int KINDSCHAFTSVERHAELTNIS = 82;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Leistungshoehe <em>Leistungshoehe</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Leistungshoehe
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getLeistungshoehe()
	 * @generated
	 */
	int LEISTUNGSHOEHE = 83;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versandweg <em>Versandweg</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versandweg
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getVersandweg()
	 * @generated
	 */
	int VERSANDWEG = 84;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versicherungsart <em>Versicherungsart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versicherungsart
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getVersicherungsart()
	 * @generated
	 */
	int VERSICHERUNGSART = 85;

	/**
	 * The meta object id for the '<em>Abbruchgrund Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Abbruchgrund
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAbbruchgrundObject()
	 * @generated
	 */
	int ABBRUCHGRUND_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Anfragegrund Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Anfragegrund
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getAnfragegrundObject()
	 * @generated
	 */
	int ANFRAGEGRUND_OBJECT = 87;

	/**
	 * The meta object id for the '<em>Elterngeldantrag Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Elterngeldantrag
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getElterngeldantragObject()
	 * @generated
	 */
	int ELTERNGELDANTRAG_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Fehlerfall Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Fehlerfall
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getFehlerfallObject()
	 * @generated
	 */
	int FEHLERFALL_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Gesamteinkommen Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Gesamteinkommen
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getGesamteinkommenObject()
	 * @generated
	 */
	int GESAMTEINKOMMEN_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Kindschaftsverhaeltnis Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Kindschaftsverhaeltnis
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getKindschaftsverhaeltnisObject()
	 * @generated
	 */
	int KINDSCHAFTSVERHAELTNIS_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Leistungshoehe Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Leistungshoehe
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getLeistungshoeheObject()
	 * @generated
	 */
	int LEISTUNGSHOEHE_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Versandweg Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versandweg
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getVersandwegObject()
	 * @generated
	 */
	int VERSANDWEG_OBJECT = 93;

	/**
	 * The meta object id for the '<em>Versicherungsart Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versicherungsart
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl#getVersicherungsartObject()
	 * @generated
	 */
	int VERSICHERUNGSART_OBJECT = 94;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType <em>Adoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adoption Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType
	 * @generated
	 */
	EClass getAdoptionType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#isAdoption <em>Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adoption</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#isAdoption()
	 * @see #getAdoptionType()
	 * @generated
	 */
	EAttribute getAdoptionType_Adoption();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#getAdoptionHaushaltsaufnahme <em>Adoption Haushaltsaufnahme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adoption Haushaltsaufnahme</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#getAdoptionHaushaltsaufnahme()
	 * @see #getAdoptionType()
	 * @generated
	 */
	EAttribute getAdoptionType_AdoptionHaushaltsaufnahme();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#getNachweisAdoption <em>Nachweis Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Adoption</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType#getNachweisAdoption()
	 * @see #getAdoptionType()
	 * @generated
	 */
	EReference getAdoptionType_NachweisAdoption();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType <em>ALGI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALGI Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType
	 * @generated
	 */
	EClass getALGIType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#isBezugALGI <em>Bezug ALGI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug ALGI</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#isBezugALGI()
	 * @see #getALGIType()
	 * @generated
	 */
	EAttribute getALGIType_BezugALGI();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#getZeitraumALGI <em>Zeitraum ALGI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum ALGI</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#getZeitraumALGI()
	 * @see #getALGIType()
	 * @generated
	 */
	EReference getALGIType_ZeitraumALGI();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#getNachweisALGI <em>Nachweis ALGI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis ALGI</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#getNachweisALGI()
	 * @see #getALGIType()
	 * @generated
	 */
	EReference getALGIType_NachweisALGI();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType <em>Alleinerziehendenanspruch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alleinerziehendenanspruch Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType
	 * @generated
	 */
	EClass getAlleinerziehendenanspruchType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isEntlastungsbetragAlleinerziehende <em>Entlastungsbetrag Alleinerziehende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entlastungsbetrag Alleinerziehende</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isEntlastungsbetragAlleinerziehende()
	 * @see #getAlleinerziehendenanspruchType()
	 * @generated
	 */
	EAttribute getAlleinerziehendenanspruchType_EntlastungsbetragAlleinerziehende();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#getNachweisEntlastungsbetrag <em>Nachweis Entlastungsbetrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Entlastungsbetrag</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#getNachweisEntlastungsbetrag()
	 * @see #getAlleinerziehendenanspruchType()
	 * @generated
	 */
	EReference getAlleinerziehendenanspruchType_NachweisEntlastungsbetrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isBetreuungDurchAnderenETUnmoeglich <em>Betreuung Durch Anderen ET Unmoeglich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betreuung Durch Anderen ET Unmoeglich</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isBetreuungDurchAnderenETUnmoeglich()
	 * @see #getAlleinerziehendenanspruchType()
	 * @generated
	 */
	EAttribute getAlleinerziehendenanspruchType_BetreuungDurchAnderenETUnmoeglich();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#getNachweisBetreuung <em>Nachweis Betreuung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Betreuung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#getNachweisBetreuung()
	 * @see #getAlleinerziehendenanspruchType()
	 * @generated
	 */
	EReference getAlleinerziehendenanspruchType_NachweisBetreuung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isKindeswohlgefaehrdungDurchAnderenET <em>Kindeswohlgefaehrdung Durch Anderen ET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kindeswohlgefaehrdung Durch Anderen ET</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isKindeswohlgefaehrdungDurchAnderenET()
	 * @see #getAlleinerziehendenanspruchType()
	 * @generated
	 */
	EAttribute getAlleinerziehendenanspruchType_KindeswohlgefaehrdungDurchAnderenET();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#getNachweisKindeswohlgefaehrdung <em>Nachweis Kindeswohlgefaehrdung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Kindeswohlgefaehrdung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#getNachweisKindeswohlgefaehrdung()
	 * @see #getAlleinerziehendenanspruchType()
	 * @generated
	 */
	EReference getAlleinerziehendenanspruchType_NachweisKindeswohlgefaehrdung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType <em>Andere Leistungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Andere Leistungen Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType
	 * @generated
	 */
	EClass getAndereLeistungenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#isBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Andere Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#isBezugAndereLeistungen()
	 * @see #getAndereLeistungenType()
	 * @generated
	 */
	EAttribute getAndereLeistungenType_BezugAndereLeistungen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#getZeitraumAndereLeistungen <em>Zeitraum Andere Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum Andere Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#getZeitraumAndereLeistungen()
	 * @see #getAndereLeistungenType()
	 * @generated
	 */
	EReference getAndereLeistungenType_ZeitraumAndereLeistungen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#getNachweisAndereLeistungen <em>Nachweis Andere Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Andere Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#getNachweisAndereLeistungen()
	 * @see #getAndereLeistungenType()
	 * @generated
	 */
	EReference getAndereLeistungenType_NachweisAndereLeistungen();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#getArtAndereLeistungen <em>Art Andere Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Art Andere Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#getArtAndereLeistungen()
	 * @see #getAndereLeistungenType()
	 * @generated
	 */
	EAttribute getAndereLeistungenType_ArtAndereLeistungen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType <em>Angaben Sozialversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Sozialversicherung Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType
	 * @generated
	 */
	EClass getAngabenSozialversicherungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeKrankenkasse <em>Pflichtbeitraege Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pflichtbeitraege Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeKrankenkasse()
	 * @see #getAngabenSozialversicherungType()
	 * @generated
	 */
	EAttribute getAngabenSozialversicherungType_PflichtbeitraegeKrankenkasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeRentenversicherung <em>Pflichtbeitraege Rentenversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pflichtbeitraege Rentenversicherung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeRentenversicherung()
	 * @see #getAngabenSozialversicherungType()
	 * @generated
	 */
	EAttribute getAngabenSozialversicherungType_PflichtbeitraegeRentenversicherung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeArbeitslosenversicherung <em>Pflichtbeitraege Arbeitslosenversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pflichtbeitraege Arbeitslosenversicherung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeArbeitslosenversicherung()
	 * @see #getAngabenSozialversicherungType()
	 * @generated
	 */
	EAttribute getAngabenSozialversicherungType_PflichtbeitraegeArbeitslosenversicherung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#getNachweisPflichtbetrag <em>Nachweis Pflichtbetrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Pflichtbetrag</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#getNachweisPflichtbetrag()
	 * @see #getAngabenSozialversicherungType()
	 * @generated
	 */
	EReference getAngabenSozialversicherungType_NachweisPflichtbetrag();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType <em>Angaben Weiteres Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Weiteres Kind Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType
	 * @generated
	 */
	EClass getAngabenWeiteresKindType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getNameWeiteresKind <em>Name Weiteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Weiteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getNameWeiteresKind()
	 * @see #getAngabenWeiteresKindType()
	 * @generated
	 */
	EReference getAngabenWeiteresKindType_NameWeiteresKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getGeburtsdatum()
	 * @see #getAngabenWeiteresKindType()
	 * @generated
	 */
	EAttribute getAngabenWeiteresKindType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getGeburtsdatumNachweis <em>Geburtsdatum Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geburtsdatum Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getGeburtsdatumNachweis()
	 * @see #getAngabenWeiteresKindType()
	 * @generated
	 */
	EReference getAngabenWeiteresKindType_GeburtsdatumNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getHaushaltsaufnahme <em>Haushaltsaufnahme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Haushaltsaufnahme</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getHaushaltsaufnahme()
	 * @see #getAngabenWeiteresKindType()
	 * @generated
	 */
	EAttribute getAngabenWeiteresKindType_Haushaltsaufnahme();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getHaushaltsaufnahmeNachweis <em>Haushaltsaufnahme Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Haushaltsaufnahme Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getHaushaltsaufnahmeNachweis()
	 * @see #getAngabenWeiteresKindType()
	 * @generated
	 */
	EReference getAngabenWeiteresKindType_HaushaltsaufnahmeNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#isBehinderungsgrad <em>Behinderungsgrad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behinderungsgrad</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#isBehinderungsgrad()
	 * @see #getAngabenWeiteresKindType()
	 * @generated
	 */
	EAttribute getAngabenWeiteresKindType_Behinderungsgrad();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getBehinderungsgradNachweis <em>Behinderungsgrad Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behinderungsgrad Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getBehinderungsgradNachweis()
	 * @see #getAngabenWeiteresKindType()
	 * @generated
	 */
	EReference getAngabenWeiteresKindType_BehinderungsgradNachweis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getVerhaeltnisET1 <em>Verhaeltnis ET1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verhaeltnis ET1</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getVerhaeltnisET1()
	 * @see #getAngabenWeiteresKindType()
	 * @generated
	 */
	EReference getAngabenWeiteresKindType_VerhaeltnisET1();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getVerhaeltnisET2 <em>Verhaeltnis ET2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verhaeltnis ET2</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getVerhaeltnisET2()
	 * @see #getAngabenWeiteresKindType()
	 * @generated
	 */
	EReference getAngabenWeiteresKindType_VerhaeltnisET2();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType <em>Anschrift Kind Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anschrift Kind Optional Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType
	 * @generated
	 */
	EClass getAnschriftKindOptionalType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getHausnummer <em>Hausnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getHausnummer()
	 * @see #getAnschriftKindOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftKindOptionalType_Hausnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getPostleitzahl <em>Postleitzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postleitzahl</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getPostleitzahl()
	 * @see #getAnschriftKindOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftKindOptionalType_Postleitzahl();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getStrasse <em>Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strasse</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getStrasse()
	 * @see #getAnschriftKindOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftKindOptionalType_Strasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getWohnort <em>Wohnort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnort</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getWohnort()
	 * @see #getAnschriftKindOptionalType()
	 * @generated
	 */
	EAttribute getAnschriftKindOptionalType_Wohnort();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType <em>Anschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anschrift Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType
	 * @generated
	 */
	EClass getAnschriftType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#isAnschriftInlandOderAusland <em>Anschrift Inland Oder Ausland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschrift Inland Oder Ausland</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#isAnschriftInlandOderAusland()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EAttribute getAnschriftType_AnschriftInlandOderAusland();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#getAnschriftInland <em>Anschrift Inland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Inland</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#getAnschriftInland()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EReference getAnschriftType_AnschriftInland();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#getAnschriftAusland <em>Anschrift Ausland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Ausland</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType#getAnschriftAusland()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EReference getAnschriftType_AnschriftAusland();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType <em>Antragstellender Elternteil Vorabmeldung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragstellender Elternteil Vorabmeldung Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType
	 * @generated
	 */
	EClass getAntragstellenderElternteilVorabmeldungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getName()
	 * @see #getAntragstellenderElternteilVorabmeldungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilVorabmeldungType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getGeburtsdatum()
	 * @see #getAntragstellenderElternteilVorabmeldungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilVorabmeldungType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getAnschrift()
	 * @see #getAntragstellenderElternteilVorabmeldungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilVorabmeldungType_Anschrift();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType <em>Arbeitszeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbeitszeit Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType
	 * @generated
	 */
	EClass getArbeitszeitType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType#getArbeitszeitWochenstunden <em>Arbeitszeit Wochenstunden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arbeitszeit Wochenstunden</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType#getArbeitszeitWochenstunden()
	 * @see #getArbeitszeitType()
	 * @generated
	 */
	EAttribute getArbeitszeitType_ArbeitszeitWochenstunden();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType#getAbweichendeBezugsgroesse <em>Abweichende Bezugsgroesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abweichende Bezugsgroesse</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType#getAbweichendeBezugsgroesse()
	 * @see #getArbeitszeitType()
	 * @generated
	 */
	EAttribute getArbeitszeitType_AbweichendeBezugsgroesse();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType <em>Auslaendisches Arbeitsverhaeltnis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auslaendisches Arbeitsverhaeltnis Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType
	 * @generated
	 */
	EClass getAuslaendischesArbeitsverhaeltnisType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auslaendisches Arbeitsverhaeltnis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnis()
	 * @see #getAuslaendischesArbeitsverhaeltnisType()
	 * @generated
	 */
	EAttribute getAuslaendischesArbeitsverhaeltnisType_AuslaendischesArbeitsverhaeltnis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#getBeschaeftigungsland <em>Beschaeftigungsland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beschaeftigungsland</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#getBeschaeftigungsland()
	 * @see #getAuslaendischesArbeitsverhaeltnisType()
	 * @generated
	 */
	EReference getAuslaendischesArbeitsverhaeltnisType_Beschaeftigungsland();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnisAndererET <em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType#isAuslaendischesArbeitsverhaeltnisAndererET()
	 * @see #getAuslaendischesArbeitsverhaeltnisType()
	 * @generated
	 */
	EAttribute getAuslaendischesArbeitsverhaeltnisType_AuslaendischesArbeitsverhaeltnisAndererET();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType <em>Auslandsaufenthalt Befr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auslandsaufenthalt Befr Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType
	 * @generated
	 */
	EClass getAuslandsaufenthaltBefrType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType#getBefristeterAufenthalt <em>Befristeter Aufenthalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Befristeter Aufenthalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType#getBefristeterAufenthalt()
	 * @see #getAuslandsaufenthaltBefrType()
	 * @generated
	 */
	EReference getAuslandsaufenthaltBefrType_BefristeterAufenthalt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType#getEndeAufenthalt <em>Ende Aufenthalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ende Aufenthalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType#getEndeAufenthalt()
	 * @see #getAuslandsaufenthaltBefrType()
	 * @generated
	 */
	EAttribute getAuslandsaufenthaltBefrType_EndeAufenthalt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType <em>Auslandsaufenthalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auslandsaufenthalt Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType
	 * @generated
	 */
	EClass getAuslandsaufenthaltType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getGrundDesAufenthalts <em>Grund Des Aufenthalts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grund Des Aufenthalts</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getGrundDesAufenthalts()
	 * @see #getAuslandsaufenthaltType()
	 * @generated
	 */
	EAttribute getAuslandsaufenthaltType_GrundDesAufenthalts();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getAufenthaltsland <em>Aufenthaltsland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufenthaltsland</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getAufenthaltsland()
	 * @see #getAuslandsaufenthaltType()
	 * @generated
	 */
	EReference getAuslandsaufenthaltType_Aufenthaltsland();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getNachweisAuslandsaufenthalt <em>Nachweis Auslandsaufenthalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Auslandsaufenthalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getNachweisAuslandsaufenthalt()
	 * @see #getAuslandsaufenthaltType()
	 * @generated
	 */
	EReference getAuslandsaufenthaltType_NachweisAuslandsaufenthalt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#isInlaendischesArbeitsverhaeltnis <em>Inlaendisches Arbeitsverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inlaendisches Arbeitsverhaeltnis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#isInlaendischesArbeitsverhaeltnis()
	 * @see #getAuslandsaufenthaltType()
	 * @generated
	 */
	EAttribute getAuslandsaufenthaltType_InlaendischesArbeitsverhaeltnis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getPlzArbeitgeber <em>Plz Arbeitgeber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plz Arbeitgeber</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getPlzArbeitgeber()
	 * @see #getAuslandsaufenthaltType()
	 * @generated
	 */
	EAttribute getAuslandsaufenthaltType_PlzArbeitgeber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getOrtArbeitgeber <em>Ort Arbeitgeber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ort Arbeitgeber</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getOrtArbeitgeber()
	 * @see #getAuslandsaufenthaltType()
	 * @generated
	 */
	EAttribute getAuslandsaufenthaltType_OrtArbeitgeber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getBeginnAufenthalt <em>Beginn Aufenthalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginn Aufenthalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType#getBeginnAufenthalt()
	 * @see #getAuslandsaufenthaltType()
	 * @generated
	 */
	EAttribute getAuslandsaufenthaltType_BeginnAufenthalt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType <em>Beantragung Elterngeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beantragung Elterngeld Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType
	 * @generated
	 */
	EClass getBeantragungElterngeldType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getLeistungshoehe <em>Leistungshoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leistungshoehe</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getLeistungshoehe()
	 * @see #getBeantragungElterngeldType()
	 * @generated
	 */
	EReference getBeantragungElterngeldType_Leistungshoehe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isBasisElterngeld <em>Basis Elterngeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basis Elterngeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isBasisElterngeld()
	 * @see #getBeantragungElterngeldType()
	 * @generated
	 */
	EAttribute getBeantragungElterngeldType_BasisElterngeld();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getZeitraumBasisElterngeld <em>Zeitraum Basis Elterngeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Zeitraum Basis Elterngeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getZeitraumBasisElterngeld()
	 * @see #getBeantragungElterngeldType()
	 * @generated
	 */
	EAttribute getBeantragungElterngeldType_ZeitraumBasisElterngeld();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isElterngeldPlus <em>Elterngeld Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elterngeld Plus</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isElterngeldPlus()
	 * @see #getBeantragungElterngeldType()
	 * @generated
	 */
	EAttribute getBeantragungElterngeldType_ElterngeldPlus();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getZeitraumElterngeldPlus <em>Zeitraum Elterngeld Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Zeitraum Elterngeld Plus</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getZeitraumElterngeldPlus()
	 * @see #getBeantragungElterngeldType()
	 * @generated
	 */
	EAttribute getBeantragungElterngeldType_ZeitraumElterngeldPlus();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isPartnerschaftsBonusMonate <em>Partnerschafts Bonus Monate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partnerschafts Bonus Monate</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isPartnerschaftsBonusMonate()
	 * @see #getBeantragungElterngeldType()
	 * @generated
	 */
	EAttribute getBeantragungElterngeldType_PartnerschaftsBonusMonate();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getZeitraumPartnerschaftsBonusMonate <em>Zeitraum Partnerschafts Bonus Monate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Zeitraum Partnerschafts Bonus Monate</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getZeitraumPartnerschaftsBonusMonate()
	 * @see #getBeantragungElterngeldType()
	 * @generated
	 */
	EAttribute getBeantragungElterngeldType_ZeitraumPartnerschaftsBonusMonate();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType <em>Behinderung Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behinderung Kind Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType
	 * @generated
	 */
	EClass getBehinderungKindType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType#isBehinderungKind <em>Behinderung Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behinderung Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType#isBehinderungKind()
	 * @see #getBehinderungKindType()
	 * @generated
	 */
	EAttribute getBehinderungKindType_BehinderungKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType#getNachweisBehinderungKind <em>Nachweis Behinderung Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Behinderung Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType#getNachweisBehinderungKind()
	 * @see #getBehinderungKindType()
	 * @generated
	 */
	EReference getBehinderungKindType_NachweisBehinderungKind();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType <em>Berufsausbildung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Berufsausbildung Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType
	 * @generated
	 */
	EClass getBerufsausbildungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#isBerufsbildung <em>Berufsbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Berufsbildung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#isBerufsbildung()
	 * @see #getBerufsausbildungType()
	 * @generated
	 */
	EAttribute getBerufsausbildungType_Berufsbildung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#getZeitraum()
	 * @see #getBerufsausbildungType()
	 * @generated
	 */
	EAttribute getBerufsausbildungType_Zeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#getWochenstundenJeTaetigkeit <em>Wochenstunden Je Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wochenstunden Je Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#getWochenstundenJeTaetigkeit()
	 * @see #getBerufsausbildungType()
	 * @generated
	 */
	EAttribute getBerufsausbildungType_WochenstundenJeTaetigkeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType <em>Berufsbildung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Berufsbildung Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType
	 * @generated
	 */
	EClass getBerufsbildungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#isBerufsbildung <em>Berufsbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Berufsbildung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#isBerufsbildung()
	 * @see #getBerufsbildungType()
	 * @generated
	 */
	EAttribute getBerufsbildungType_Berufsbildung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#getAusbildungEndeVoraussichtlich <em>Ausbildung Ende Voraussichtlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ausbildung Ende Voraussichtlich</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#getAusbildungEndeVoraussichtlich()
	 * @see #getBerufsbildungType()
	 * @generated
	 */
	EAttribute getBerufsbildungType_AusbildungEndeVoraussichtlich();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType#getNachweis()
	 * @see #getBerufsbildungType()
	 * @generated
	 */
	EReference getBerufsbildungType_Nachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType <em>Besonders Frueh Geborenes Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Besonders Frueh Geborenes Kind Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType
	 * @generated
	 */
	EClass getBesondersFruehGeborenesKindType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#isBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Besonders Frueh Geborenes Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#isBesondersFruehGeborenesKind()
	 * @see #getBesondersFruehGeborenesKindType()
	 * @generated
	 */
	EAttribute getBesondersFruehGeborenesKindType_BesondersFruehGeborenesKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#getErrechneterGeburtstermin <em>Errechneter Geburtstermin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errechneter Geburtstermin</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#getErrechneterGeburtstermin()
	 * @see #getBesondersFruehGeborenesKindType()
	 * @generated
	 */
	EAttribute getBesondersFruehGeborenesKindType_ErrechneterGeburtstermin();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#getNachweisBesondersFruehGeboren <em>Nachweis Besonders Frueh Geboren</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Besonders Frueh Geboren</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#getNachweisBesondersFruehGeboren()
	 * @see #getBesondersFruehGeborenesKindType()
	 * @generated
	 */
	EReference getBesondersFruehGeborenesKindType_NachweisBesondersFruehGeboren();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType <em>Buergergeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buergergeld Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType
	 * @generated
	 */
	EClass getBuergergeldType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#isBezugBuergergeld <em>Bezug Buergergeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Buergergeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#isBezugBuergergeld()
	 * @see #getBuergergeldType()
	 * @generated
	 */
	EAttribute getBuergergeldType_BezugBuergergeld();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#getBeginnZeitraumBuergergeld <em>Beginn Zeitraum Buergergeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginn Zeitraum Buergergeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#getBeginnZeitraumBuergergeld()
	 * @see #getBuergergeldType()
	 * @generated
	 */
	EAttribute getBuergergeldType_BeginnZeitraumBuergergeld();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#getEndeZeitraumBuergergeld <em>Ende Zeitraum Buergergeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ende Zeitraum Buergergeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#getEndeZeitraumBuergergeld()
	 * @see #getBuergergeldType()
	 * @generated
	 */
	EAttribute getBuergergeldType_EndeZeitraumBuergergeld();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAbbruchgrundType <em>Code Abbruchgrund Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Abbruchgrund Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAbbruchgrundType
	 * @generated
	 */
	EClass getCodeAbbruchgrundType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAnfragegrundType <em>Code Anfragegrund Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Anfragegrund Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAnfragegrundType
	 * @generated
	 */
	EClass getCodeAnfragegrundType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeElterngeldantragType <em>Code Elterngeldantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Elterngeldantrag Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeElterngeldantragType
	 * @generated
	 */
	EClass getCodeElterngeldantragType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeFehlerfallType <em>Code Fehlerfall Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Fehlerfall Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeFehlerfallType
	 * @generated
	 */
	EClass getCodeFehlerfallType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeGesamteinkommenType <em>Code Gesamteinkommen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Gesamteinkommen Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeGesamteinkommenType
	 * @generated
	 */
	EClass getCodeGesamteinkommenType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeKindschaftsverhaeltnisType <em>Code Kindschaftsverhaeltnis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Kindschaftsverhaeltnis Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeKindschaftsverhaeltnisType
	 * @generated
	 */
	EClass getCodeKindschaftsverhaeltnisType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeLeistungshoeheType <em>Code Leistungshoehe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Leistungshoehe Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeLeistungshoeheType
	 * @generated
	 */
	EClass getCodeLeistungshoeheType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersandwegType <em>Code Versandweg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Versandweg Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersandwegType
	 * @generated
	 */
	EClass getCodeVersandwegType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersicherungsartType <em>Code Versicherungsart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Versicherungsart Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersicherungsartType
	 * @generated
	 */
	EClass getCodeVersicherungsartType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAbbruch0206 <em>Elterngeldantrag Abbruch0206</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elterngeldantrag Abbruch0206</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAbbruch0206()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ElterngeldantragAbbruch0206();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAnfrage0204 <em>Elterngeldantrag Anfrage0204</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elterngeldantrag Anfrage0204</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAnfrage0204()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ElterngeldantragAnfrage0204();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAnfrageabschluss0205 <em>Elterngeldantrag Anfrageabschluss0205</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elterngeldantrag Anfrageabschluss0205</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAnfrageabschluss0205()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ElterngeldantragAnfrageabschluss0205();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAntrag0201 <em>Elterngeldantrag Antrag0201</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elterngeldantrag Antrag0201</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAntrag0201()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ElterngeldantragAntrag0201();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragStandesamtsmeldung0203 <em>Elterngeldantrag Standesamtsmeldung0203</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elterngeldantrag Standesamtsmeldung0203</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragStandesamtsmeldung0203()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ElterngeldantragStandesamtsmeldung0203();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragVorabmeldung0202 <em>Elterngeldantrag Vorabmeldung0202</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elterngeldantrag Vorabmeldung0202</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragVorabmeldung0202()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ElterngeldantragVorabmeldung0202();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType <em>EG Aelteres Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG Aelteres Kind Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType
	 * @generated
	 */
	EClass getEGAelteresKindType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#isBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug EG Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#isBezugEGAelteresKind()
	 * @see #getEGAelteresKindType()
	 * @generated
	 */
	EAttribute getEGAelteresKindType_BezugEGAelteresKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#getZeitraumEGAelteresKind <em>Zeitraum EG Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum EG Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#getZeitraumEGAelteresKind()
	 * @see #getEGAelteresKindType()
	 * @generated
	 */
	EReference getEGAelteresKindType_ZeitraumEGAelteresKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#getNachweisEGAelteresKind <em>Nachweis EG Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis EG Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType#getNachweisEGAelteresKind()
	 * @see #getEGAelteresKindType()
	 * @generated
	 */
	EReference getEGAelteresKindType_NachweisEGAelteresKind();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType <em>Einkommensersatzleistungen Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkommensersatzleistungen Bezugszeitraum Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType
	 * @generated
	 */
	EClass getEinkommensersatzleistungenBezugszeitraumType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Einkommensersatzleistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugEinkommensersatzleistungen()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkommensersatzleistungenBezugszeitraumType_BezugEinkommensersatzleistungen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugALGI <em>Bezug ALGI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug ALGI</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugALGI()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenBezugszeitraumType_BezugALGI();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug Krankentagegeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugKrankentagegeld()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenBezugszeitraumType_BezugKrankentagegeld();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugKrankengeld <em>Bezug Krankengeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug Krankengeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugKrankengeld()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenBezugszeitraumType_BezugKrankengeld();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug EG Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugEGAelteresKind()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenBezugszeitraumType_BezugEGAelteresKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugRenten <em>Bezug Renten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug Renten</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugRenten()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenBezugszeitraumType_BezugRenten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugSonstigeLeistungen <em>Bezug Sonstige Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug Sonstige Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugSonstigeLeistungen()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenBezugszeitraumType_BezugSonstigeLeistungen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getAndereLeistungen <em>Andere Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Andere Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getAndereLeistungen()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenBezugszeitraumType_AndereLeistungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Ausl Leistungen Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugAuslLeistungenKind()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkommensersatzleistungenBezugszeitraumType_BezugAuslLeistungenKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Zwischenstaatl Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugZwischenstaatlLeistungen()
	 * @see #getEinkommensersatzleistungenBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkommensersatzleistungenBezugszeitraumType_BezugZwischenstaatlLeistungen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType <em>Einkommensersatzleistungen Vor Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkommensersatzleistungen Vor Geburt Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType
	 * @generated
	 */
	EClass getEinkommensersatzleistungenVorGeburtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Einkommensersatzleistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugEinkommensersatzleistungen()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EAttribute getEinkommensersatzleistungenVorGeburtType_BezugEinkommensersatzleistungen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugALGI <em>Bezug ALGI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug ALGI</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugALGI()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenVorGeburtType_BezugALGI();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug Krankentagegeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugKrankentagegeld()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenVorGeburtType_BezugKrankentagegeld();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug Krankengeld Schwangerschaft</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugKrankengeldSchwangerschaft()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenVorGeburtType_BezugKrankengeldSchwangerschaft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug EG Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugEGAelteresKind()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenVorGeburtType_BezugEGAelteresKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugRenten <em>Bezug Renten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug Renten</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugRenten()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenVorGeburtType_BezugRenten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bezug Andere Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugAndereLeistungen()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenVorGeburtType_BezugAndereLeistungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Ausl Leistungen Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugAuslLeistungenKind()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EAttribute getEinkommensersatzleistungenVorGeburtType_BezugAuslLeistungenKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Zwischenstaatl Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugZwischenstaatlLeistungen()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EAttribute getEinkommensersatzleistungenVorGeburtType_BezugZwischenstaatlLeistungen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBuergergeld <em>Buergergeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buergergeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBuergergeld()
	 * @see #getEinkommensersatzleistungenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommensersatzleistungenVorGeburtType_Buergergeld();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType <em>Einkommen Vor Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkommen Vor Geburt Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType
	 * @generated
	 */
	EClass getEinkommenVorGeburtType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getNichtselbststaendigeBeschaeftigung <em>Nichtselbststaendige Beschaeftigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nichtselbststaendige Beschaeftigung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getNichtselbststaendigeBeschaeftigung()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommenVorGeburtType_NichtselbststaendigeBeschaeftigung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig <em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EAttribute getEinkommenVorGeburtType_BeruecksichtigungAusschliesslichEinkommenNichtselbststaendig();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EAttribute getEinkommenVorGeburtType_EinkommenAusNichtselbststaendigerTaetigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selbstaendige Beschaeftigung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isSelbstaendigeBeschaeftigung()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EAttribute getEinkommenVorGeburtType_SelbstaendigeBeschaeftigung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geringes Einkommen Covid19</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getGeringesEinkommenCovid19()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommenVorGeburtType_GeringesEinkommenCovid19();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getEntgeltdatenDsrv <em>Entgeltdaten Dsrv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entgeltdaten Dsrv</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getEntgeltdatenDsrv()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommenVorGeburtType_EntgeltdatenDsrv();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isGewerbebetrieb <em>Gewerbebetrieb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gewerbebetrieb</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isGewerbebetrieb()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EAttribute getEinkommenVorGeburtType_Gewerbebetrieb();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Land Und Forstwirtschaft</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isLandUndForstwirtschaft()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EAttribute getEinkommenVorGeburtType_LandUndForstwirtschaft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freiwilligendienst</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#isFreiwilligendienst()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EAttribute getEinkommenVorGeburtType_Freiwilligendienst();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getNachweisMutter <em>Nachweis Mutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Mutter</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getNachweisMutter()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommenVorGeburtType_NachweisMutter();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getSelbststaendigkeitGewerbeLandForstwirtschaft <em>Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getSelbststaendigkeitGewerbeLandForstwirtschaft()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommenVorGeburtType_SelbststaendigkeitGewerbeLandForstwirtschaft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getEinkommensersatzleistungen <em>Einkommensersatzleistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einkommensersatzleistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType#getEinkommensersatzleistungen()
	 * @see #getEinkommenVorGeburtType()
	 * @generated
	 */
	EReference getEinkommenVorGeburtType_Einkommensersatzleistungen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType <em>Einkommen Waehrend Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkommen Waehrend Bezugszeitraum Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType
	 * @generated
	 */
	EClass getEinkommenWaehrendBezugszeitraumType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getNichtselbststaendigeBeschaeftigung <em>Nichtselbststaendige Beschaeftigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nichtselbststaendige Beschaeftigung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getNichtselbststaendigeBeschaeftigung()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommenWaehrendBezugszeitraumType_NichtselbststaendigeBeschaeftigung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selbstaendige Beschaeftigung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isSelbstaendigeBeschaeftigung()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkommenWaehrendBezugszeitraumType_SelbstaendigeBeschaeftigung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Land Und Forstwirtschaft</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isLandUndForstwirtschaft()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkommenWaehrendBezugszeitraumType_LandUndForstwirtschaft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isGewerbebetrieb <em>Gewerbebetrieb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gewerbebetrieb</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isGewerbebetrieb()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkommenWaehrendBezugszeitraumType_Gewerbebetrieb();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft <em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommenWaehrendBezugszeitraumType_EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isBeruecksichtigungBetriebsausgaben <em>Beruecksichtigung Betriebsausgaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beruecksichtigung Betriebsausgaben</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isBeruecksichtigungBetriebsausgaben()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkommenWaehrendBezugszeitraumType_BeruecksichtigungBetriebsausgaben();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getNachweisBetriebsausgaben <em>Nachweis Betriebsausgaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Betriebsausgaben</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getNachweisBetriebsausgaben()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommenWaehrendBezugszeitraumType_NachweisBetriebsausgaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getEinkommensersatzleistungenBezugszeitraum <em>Einkommensersatzleistungen Bezugszeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einkommensersatzleistungen Bezugszeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getEinkommensersatzleistungenBezugszeitraum()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommenWaehrendBezugszeitraumType_EinkommensersatzleistungenBezugszeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkommenWaehrendBezugszeitraumType_EinkommenAusNichtselbststaendigerTaetigkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getArbeitgeberformblatt <em>Arbeitgeberformblatt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arbeitgeberformblatt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#getArbeitgeberformblatt()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkommenWaehrendBezugszeitraumType_Arbeitgeberformblatt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isFreiwilligendienst <em>Freiwilligendienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freiwilligendienst</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType#isFreiwilligendienst()
	 * @see #getEinkommenWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkommenWaehrendBezugszeitraumType_Freiwilligendienst();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType <em>Einkuenfte Beantragter Zeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkuenfte Beantragter Zeitraum Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType
	 * @generated
	 */
	EClass getEinkuenfteBeantragterZeitraumType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getZeitraum()
	 * @see #getEinkuenfteBeantragterZeitraumType()
	 * @generated
	 */
	EReference getEinkuenfteBeantragterZeitraumType_Zeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit <em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @see #getEinkuenfteBeantragterZeitraumType()
	 * @generated
	 */
	EAttribute getEinkuenfteBeantragterZeitraumType_DurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getWochenstundenJeTaetigkeitSelbststaendigkeit <em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @see #getEinkuenfteBeantragterZeitraumType()
	 * @generated
	 */
	EAttribute getEinkuenfteBeantragterZeitraumType_WochenstundenJeTaetigkeitSelbststaendigkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getNachweisEinkommenssteuerbescheid <em>Nachweis Einkommenssteuerbescheid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Einkommenssteuerbescheid</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType#getNachweisEinkommenssteuerbescheid()
	 * @see #getEinkuenfteBeantragterZeitraumType()
	 * @generated
	 */
	EReference getEinkuenfteBeantragterZeitraumType_NachweisEinkommenssteuerbescheid();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType <em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType
	 * @generated
	 */
	EClass getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType#isSteuerfreibetragSelbstaendigkeit <em>Steuerfreibetrag Selbstaendigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steuerfreibetrag Selbstaendigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType#isSteuerfreibetragSelbstaendigkeit()
	 * @see #getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType_SteuerfreibetragSelbstaendigkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType#getEinkuenfteBeantragterZeitraum <em>Einkuenfte Beantragter Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Einkuenfte Beantragter Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType#getEinkuenfteBeantragterZeitraum()
	 * @see #getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType_EinkuenfteBeantragterZeitraum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type <em>Elterngeldantrag Abbruch0206 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elterngeldantrag Abbruch0206 Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type
	 * @generated
	 */
	EClass getElterngeldantragAbbruch0206Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type#getAnfrageID <em>Anfrage ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anfrage ID</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type#getAnfrageID()
	 * @see #getElterngeldantragAbbruch0206Type()
	 * @generated
	 */
	EAttribute getElterngeldantragAbbruch0206Type_AnfrageID();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type#getGrundAbbruch <em>Grund Abbruch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grund Abbruch</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type#getGrundAbbruch()
	 * @see #getElterngeldantragAbbruch0206Type()
	 * @generated
	 */
	EReference getElterngeldantragAbbruch0206Type_GrundAbbruch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type <em>Elterngeldantrag Anfrage0204 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elterngeldantrag Anfrage0204 Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type
	 * @generated
	 */
	EClass getElterngeldantragAnfrage0204Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfrageID <em>Anfrage ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anfrage ID</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfrageID()
	 * @see #getElterngeldantragAnfrage0204Type()
	 * @generated
	 */
	EAttribute getElterngeldantragAnfrage0204Type_AnfrageID();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAntragsReferenz <em>Antrags Referenz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antrags Referenz</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAntragsReferenz()
	 * @see #getElterngeldantragAnfrage0204Type()
	 * @generated
	 */
	EAttribute getElterngeldantragAnfrage0204Type_AntragsReferenz();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfragegrund <em>Anfragegrund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anfragegrund</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfragegrund()
	 * @see #getElterngeldantragAnfrage0204Type()
	 * @generated
	 */
	EReference getElterngeldantragAnfrage0204Type_Anfragegrund();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfrageparameter <em>Anfrageparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anfrageparameter</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfrageparameter()
	 * @see #getElterngeldantragAnfrage0204Type()
	 * @generated
	 */
	EReference getElterngeldantragAnfrage0204Type_Anfrageparameter();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfragendesSystem <em>Anfragendes System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anfragendes System</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfragendesSystem()
	 * @see #getElterngeldantragAnfrage0204Type()
	 * @generated
	 */
	EAttribute getElterngeldantragAnfrage0204Type_AnfragendesSystem();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfragerOrganisationsID <em>Anfrager Organisations ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anfrager Organisations ID</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAnfragerOrganisationsID()
	 * @see #getElterngeldantragAnfrage0204Type()
	 * @generated
	 */
	EAttribute getElterngeldantragAnfrage0204Type_AnfragerOrganisationsID();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAntwortAbweichenderEmpfaenger <em>Antwort Abweichender Empfaenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antwort Abweichender Empfaenger</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type#getAntwortAbweichenderEmpfaenger()
	 * @see #getElterngeldantragAnfrage0204Type()
	 * @generated
	 */
	EReference getElterngeldantragAnfrage0204Type_AntwortAbweichenderEmpfaenger();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type <em>Elterngeldantrag Anfrageabschluss0205 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elterngeldantrag Anfrageabschluss0205 Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type
	 * @generated
	 */
	EClass getElterngeldantragAnfrageabschluss0205Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageID <em>Anfrage ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anfrage ID</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageID()
	 * @see #getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	EAttribute getElterngeldantragAnfrageabschluss0205Type_AnfrageID();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAntragsReferenz <em>Antrags Referenz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antrags Referenz</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAntragsReferenz()
	 * @see #getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	EAttribute getElterngeldantragAnfrageabschluss0205Type_AntragsReferenz();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragegrund <em>Anfragegrund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anfragegrund</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragegrund()
	 * @see #getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	EReference getElterngeldantragAnfrageabschluss0205Type_Anfragegrund();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageparameter <em>Anfrageparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anfrageparameter</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageparameter()
	 * @see #getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	EReference getElterngeldantragAnfrageabschluss0205Type_Anfrageparameter();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragendesSystem <em>Anfragendes System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anfragendes System</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragendesSystem()
	 * @see #getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	EAttribute getElterngeldantragAnfrageabschluss0205Type_AnfragendesSystem();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragerOrganisationsID <em>Anfrager Organisations ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anfrager Organisations ID</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragerOrganisationsID()
	 * @see #getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	EAttribute getElterngeldantragAnfrageabschluss0205Type_AnfragerOrganisationsID();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAntwortAbweichenderEmpfaenger <em>Antwort Abweichender Empfaenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antwort Abweichender Empfaenger</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAntwortAbweichenderEmpfaenger()
	 * @see #getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	EReference getElterngeldantragAnfrageabschluss0205Type_AntwortAbweichenderEmpfaenger();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageergebnis <em>Anfrageergebnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anfrageergebnis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageergebnis()
	 * @see #getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	EReference getElterngeldantragAnfrageabschluss0205Type_Anfrageergebnis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getFehlerfall <em>Fehlerfall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fehlerfall</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getFehlerfall()
	 * @see #getElterngeldantragAnfrageabschluss0205Type()
	 * @generated
	 */
	EReference getElterngeldantragAnfrageabschluss0205Type_Fehlerfall();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type <em>Elterngeldantrag Antrag0201 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elterngeldantrag Antrag0201 Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type
	 * @generated
	 */
	EClass getElterngeldantragAntrag0201Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getKind()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElterngeldantrag <em>Elterngeldantrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elterngeldantrag</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElterngeldantrag()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_Elterngeldantrag();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getGesamteinkommen <em>Gesamteinkommen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gesamteinkommen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getGesamteinkommen()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_Gesamteinkommen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElternteilEins <em>Elternteil Eins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elternteil Eins</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElternteilEins()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_ElternteilEins();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElternteilZwei <em>Elternteil Zwei</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elternteil Zwei</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElternteilZwei()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_ElternteilZwei();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getMutterschaftsgeldArbeitgeberzuschussVglLeistungen <em>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getMutterschaftsgeldArbeitgeberzuschussVglLeistungen()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_MutterschaftsgeldArbeitgeberzuschussVglLeistungen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weitere Kinder Im Haushalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getWeitereKinderImHaushalt()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_WeitereKinderImHaushalt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getNachweisdokumentAntragsservice <em>Nachweisdokument Antragsservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweisdokument Antragsservice</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getNachweisdokumentAntragsservice()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_NachweisdokumentAntragsservice();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getPdfAntrag <em>Pdf Antrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pdf Antrag</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getPdfAntrag()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_PdfAntrag();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getNachweisdokumentAntragsteller <em>Nachweisdokument Antragsteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweisdokument Antragsteller</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getNachweisdokumentAntragsteller()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_NachweisdokumentAntragsteller();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getDatenabruf <em>Datenabruf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenabruf</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getDatenabruf()
	 * @see #getElterngeldantragAntrag0201Type()
	 * @generated
	 */
	EReference getElterngeldantragAntrag0201Type_Datenabruf();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type <em>Elterngeldantrag Standesamtsmeldung0203 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elterngeldantrag Standesamtsmeldung0203 Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type
	 * @generated
	 */
	EClass getElterngeldantragStandesamtsmeldung0203Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type#isAnforderungErfolgt <em>Anforderung Erfolgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anforderung Erfolgt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type#isAnforderungErfolgt()
	 * @see #getElterngeldantragStandesamtsmeldung0203Type()
	 * @generated
	 */
	EAttribute getElterngeldantragStandesamtsmeldung0203Type_AnforderungErfolgt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type <em>Elterngeldantrag Vorabmeldung0202 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elterngeldantrag Vorabmeldung0202 Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type
	 * @generated
	 */
	EClass getElterngeldantragVorabmeldung0202Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAntragstellenerElternteilVorabmeldung <em>Antragstellener Elternteil Vorabmeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Antragstellener Elternteil Vorabmeldung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAntragstellenerElternteilVorabmeldung()
	 * @see #getElterngeldantragVorabmeldung0202Type()
	 * @generated
	 */
	EReference getElterngeldantragVorabmeldung0202Type_AntragstellenerElternteilVorabmeldung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAngabenKindVorabmeldung <em>Angaben Kind Vorabmeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Kind Vorabmeldung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAngabenKindVorabmeldung()
	 * @see #getElterngeldantragVorabmeldung0202Type()
	 * @generated
	 */
	EReference getElterngeldantragVorabmeldung0202Type_AngabenKindVorabmeldung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAntragsdokumente <em>Antragsdokumente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Antragsdokumente</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAntragsdokumente()
	 * @see #getElterngeldantragVorabmeldung0202Type()
	 * @generated
	 */
	EReference getElterngeldantragVorabmeldung0202Type_Antragsdokumente();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType <em>Elternteil Eins Elterngeldantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elternteil Eins Elterngeldantrag Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType
	 * @generated
	 */
	EClass getElternteilEinsElterngeldantragType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getPersoenlicheAngaben <em>Persoenliche Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persoenliche Angaben</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getPersoenlicheAngaben()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_PersoenlicheAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getAnschrift()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_Anschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getGewoehnlicherAufenthalt <em>Gewoehnlicher Aufenthalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gewoehnlicher Aufenthalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getGewoehnlicherAufenthalt()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_GewoehnlicherAufenthalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKindschaftsverhaeltnis <em>Kindschaftsverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kindschaftsverhaeltnis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKindschaftsverhaeltnis()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_Kindschaftsverhaeltnis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getHaushaltszugehoerigkeitDesKindes <em>Haushaltszugehoerigkeit Des Kindes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Haushaltszugehoerigkeit Des Kindes</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getHaushaltszugehoerigkeitDesKindes()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_HaushaltszugehoerigkeitDesKindes();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getAlleinerziehendenanspruch <em>Alleinerziehendenanspruch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alleinerziehendenanspruch</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getAlleinerziehendenanspruch()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_Alleinerziehendenanspruch();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBeantragungElterngeld <em>Beantragung Elterngeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beantragung Elterngeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBeantragungElterngeld()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_BeantragungElterngeld();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKrankenversicherung <em>Krankenversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Krankenversicherung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKrankenversicherung()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_Krankenversicherung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getEinkommenVorGeburt <em>Einkommen Vor Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einkommen Vor Geburt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getEinkommenVorGeburt()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_EinkommenVorGeburt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getEinkommenWaehrendBezugszeitraum <em>Einkommen Waehrend Bezugszeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einkommen Waehrend Bezugszeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getEinkommenWaehrendBezugszeitraum()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_EinkommenWaehrendBezugszeitraum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBankverbindung <em>Bankverbindung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bankverbindung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBankverbindung()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_Bankverbindung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getZustimmungDatenabrufe <em>Zustimmung Datenabrufe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zustimmung Datenabrufe</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getZustimmungDatenabrufe()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_ZustimmungDatenabrufe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZustimmungAuskunftseinholungJobcenterArbeitsamt <em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EAttribute getElternteilEinsElterngeldantragType_ZustimmungAuskunftseinholungJobcenterArbeitsamt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKontaktmoeglichkeit <em>Kontaktmoeglichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontaktmoeglichkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getKontaktmoeglichkeit()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_Kontaktmoeglichkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getSteuerlicheIdentifikationsnummer <em>Steuerliche Identifikationsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steuerliche Identifikationsnummer</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getSteuerlicheIdentifikationsnummer()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EAttribute getElternteilEinsElterngeldantragType_SteuerlicheIdentifikationsnummer();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getNutzerkonto <em>Nutzerkonto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nutzerkonto</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getNutzerkonto()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_Nutzerkonto();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getErwerbstaetigkeitBezugszeitraum <em>Erwerbstaetigkeit Bezugszeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erwerbstaetigkeit Bezugszeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getErwerbstaetigkeitBezugszeitraum()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_ErwerbstaetigkeitBezugszeitraum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBescheidzustellungVersandweg <em>Bescheidzustellung Versandweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bescheidzustellung Versandweg</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getBescheidzustellungVersandweg()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_BescheidzustellungVersandweg();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getGesetzlicheVertretung <em>Gesetzliche Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gesetzliche Vertretung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getGesetzlicheVertretung()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_GesetzlicheVertretung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getElternzeit <em>Elternzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elternzeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getElternzeit()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilEinsElterngeldantragType_Elternzeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZusammenveranlagungLiegtVor <em>Zusammenveranlagung Liegt Vor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusammenveranlagung Liegt Vor</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#isZusammenveranlagungLiegtVor()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EAttribute getElternteilEinsElterngeldantragType_ZusammenveranlagungLiegtVor();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getMitteilungAnBehoerde <em>Mitteilung An Behoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitteilung An Behoerde</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType#getMitteilungAnBehoerde()
	 * @see #getElternteilEinsElterngeldantragType()
	 * @generated
	 */
	EAttribute getElternteilEinsElterngeldantragType_MitteilungAnBehoerde();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType <em>Elternteil Zwei Elterngeldantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elternteil Zwei Elterngeldantrag Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType
	 * @generated
	 */
	EClass getElternteilZweiElterngeldantragType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getPersoenlicheAngaben <em>Persoenliche Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persoenliche Angaben</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getPersoenlicheAngaben()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_PersoenlicheAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getAnschrift()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_Anschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getGewoehnlicherAufenthalt <em>Gewoehnlicher Aufenthalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gewoehnlicher Aufenthalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getGewoehnlicherAufenthalt()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_GewoehnlicherAufenthalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getKindschaftsverhaeltnis <em>Kindschaftsverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kindschaftsverhaeltnis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getKindschaftsverhaeltnis()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_Kindschaftsverhaeltnis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getHaushaltszugehoerigkeitDesKindes <em>Haushaltszugehoerigkeit Des Kindes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Haushaltszugehoerigkeit Des Kindes</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getHaushaltszugehoerigkeitDesKindes()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_HaushaltszugehoerigkeitDesKindes();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getBeantragungElterngeld <em>Beantragung Elterngeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beantragung Elterngeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getBeantragungElterngeld()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_BeantragungElterngeld();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getKrankenversicherung <em>Krankenversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Krankenversicherung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getKrankenversicherung()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_Krankenversicherung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getEinkommenVorGeburt <em>Einkommen Vor Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einkommen Vor Geburt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getEinkommenVorGeburt()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_EinkommenVorGeburt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getEinkommenWaehrendBezugszeitraum <em>Einkommen Waehrend Bezugszeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einkommen Waehrend Bezugszeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getEinkommenWaehrendBezugszeitraum()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_EinkommenWaehrendBezugszeitraum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getBankverbindung <em>Bankverbindung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bankverbindung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getBankverbindung()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_Bankverbindung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getZustimmungDatenabrufe <em>Zustimmung Datenabrufe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zustimmung Datenabrufe</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getZustimmungDatenabrufe()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_ZustimmungDatenabrufe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#isZustimmungAuskunftseinholungJobcenterArbeitsamt <em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#isZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EAttribute getElternteilZweiElterngeldantragType_ZustimmungAuskunftseinholungJobcenterArbeitsamt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getKontaktmoeglichkeit <em>Kontaktmoeglichkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontaktmoeglichkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getKontaktmoeglichkeit()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_Kontaktmoeglichkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getSteuerlicheIdentifikationsnummer <em>Steuerliche Identifikationsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steuerliche Identifikationsnummer</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getSteuerlicheIdentifikationsnummer()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EAttribute getElternteilZweiElterngeldantragType_SteuerlicheIdentifikationsnummer();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getNutzerkonto <em>Nutzerkonto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nutzerkonto</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getNutzerkonto()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_Nutzerkonto();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getErwerbstaetigkeitBezugszeitraum <em>Erwerbstaetigkeit Bezugszeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erwerbstaetigkeit Bezugszeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getErwerbstaetigkeitBezugszeitraum()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_ErwerbstaetigkeitBezugszeitraum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getBescheidzustellungVersandweg <em>Bescheidzustellung Versandweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bescheidzustellung Versandweg</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getBescheidzustellungVersandweg()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_BescheidzustellungVersandweg();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getGesetzlicheVertretung <em>Gesetzliche Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gesetzliche Vertretung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getGesetzlicheVertretung()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_GesetzlicheVertretung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getElternzeit <em>Elternzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elternzeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getElternzeit()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EReference getElternteilZweiElterngeldantragType_Elternzeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#isZusammenveranlagungLiegtVor <em>Zusammenveranlagung Liegt Vor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusammenveranlagung Liegt Vor</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#isZusammenveranlagungLiegtVor()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EAttribute getElternteilZweiElterngeldantragType_ZusammenveranlagungLiegtVor();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getMitteilungAnBehoerde <em>Mitteilung An Behoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitteilung An Behoerde</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType#getMitteilungAnBehoerde()
	 * @see #getElternteilZweiElterngeldantragType()
	 * @generated
	 */
	EAttribute getElternteilZweiElterngeldantragType_MitteilungAnBehoerde();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType <em>Elternzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elternzeit Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType
	 * @generated
	 */
	EClass getElternzeitType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType#getZeitraumVon <em>Zeitraum Von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitraum Von</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType#getZeitraumVon()
	 * @see #getElternzeitType()
	 * @generated
	 */
	EAttribute getElternzeitType_ZeitraumVon();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType#getZeitraumBis <em>Zeitraum Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitraum Bis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType#getZeitraumBis()
	 * @see #getElternzeitType()
	 * @generated
	 */
	EAttribute getElternzeitType_ZeitraumBis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType <em>Erwerbstaetigkeit Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erwerbstaetigkeit Bezugszeitraum Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType
	 * @generated
	 */
	EClass getErwerbstaetigkeitBezugszeitraumType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#isEinkuenfteErwerbstaetigkeitBezugszeitraum <em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#isEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @see #getErwerbstaetigkeitBezugszeitraumType()
	 * @generated
	 */
	EAttribute getErwerbstaetigkeitBezugszeitraumType_EinkuenfteErwerbstaetigkeitBezugszeitraum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getResturlaub <em>Resturlaub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resturlaub</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getResturlaub()
	 * @see #getErwerbstaetigkeitBezugszeitraumType()
	 * @generated
	 */
	EReference getErwerbstaetigkeitBezugszeitraumType_Resturlaub();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getBerufsbildung <em>Berufsbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Berufsbildung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getBerufsbildung()
	 * @see #getErwerbstaetigkeitBezugszeitraumType()
	 * @generated
	 */
	EReference getErwerbstaetigkeitBezugszeitraumType_Berufsbildung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getTagespflege <em>Tagespflege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tagespflege</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getTagespflege()
	 * @see #getErwerbstaetigkeitBezugszeitraumType()
	 * @generated
	 */
	EReference getErwerbstaetigkeitBezugszeitraumType_Tagespflege();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType <em>Freiwilligendienst Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freiwilligendienst Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType
	 * @generated
	 */
	EClass getFreiwilligendienstType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#isFreiwilligendienst <em>Freiwilligendienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freiwilligendienst</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#isFreiwilligendienst()
	 * @see #getFreiwilligendienstType()
	 * @generated
	 */
	EAttribute getFreiwilligendienstType_Freiwilligendienst();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#getZeitraum()
	 * @see #getFreiwilligendienstType()
	 * @generated
	 */
	EAttribute getFreiwilligendienstType_Zeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#getWochenstundenJeTaetigkeit <em>Wochenstunden Je Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wochenstunden Je Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#getWochenstundenJeTaetigkeit()
	 * @see #getFreiwilligendienstType()
	 * @generated
	 */
	EAttribute getFreiwilligendienstType_WochenstundenJeTaetigkeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type <em>Geringes Einkommen Covid19 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geringes Einkommen Covid19 Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type
	 * @generated
	 */
	EClass getGeringesEinkommenCovid19Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geringes Einkommen Covid19</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isGeringesEinkommenCovid19()
	 * @see #getGeringesEinkommenCovid19Type()
	 * @generated
	 */
	EAttribute getGeringesEinkommenCovid19Type_GeringesEinkommenCovid19();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragAusklammerungMonateNichtselbststaendige <em>Antrag Ausklammerung Monate Nichtselbststaendige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antrag Ausklammerung Monate Nichtselbststaendige</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragAusklammerungMonateNichtselbststaendige()
	 * @see #getGeringesEinkommenCovid19Type()
	 * @generated
	 */
	EAttribute getGeringesEinkommenCovid19Type_AntragAusklammerungMonateNichtselbststaendige();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getZeitraum()
	 * @see #getGeringesEinkommenCovid19Type()
	 * @generated
	 */
	EReference getGeringesEinkommenCovid19Type_Zeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragVerschiebungBemessungszeitraumesSelbststaendige <em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #getGeringesEinkommenCovid19Type()
	 * @generated
	 */
	EAttribute getGeringesEinkommenCovid19Type_AntragVerschiebungBemessungszeitraumesSelbststaendige();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getVerschiebungBemessungszeitraumesSelbststaendige <em>Verschiebung Bemessungszeitraumes Selbststaendige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verschiebung Bemessungszeitraumes Selbststaendige</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #getGeringesEinkommenCovid19Type()
	 * @generated
	 */
	EAttribute getGeringesEinkommenCovid19Type_VerschiebungBemessungszeitraumesSelbststaendige();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getNachweisGeringesEinkommenCovid19 <em>Nachweis Geringes Einkommen Covid19</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Geringes Einkommen Covid19</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getNachweisGeringesEinkommenCovid19()
	 * @see #getGeringesEinkommenCovid19Type()
	 * @generated
	 */
	EReference getGeringesEinkommenCovid19Type_NachweisGeringesEinkommenCovid19();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType <em>Gesamteinkommen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gesamteinkommen Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType
	 * @generated
	 */
	EClass getGesamteinkommenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType#getGesamteinkommen <em>Gesamteinkommen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gesamteinkommen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType#getGesamteinkommen()
	 * @see #getGesamteinkommenType()
	 * @generated
	 */
	EReference getGesamteinkommenType_Gesamteinkommen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType#getNachweisGesamteinkommen <em>Nachweis Gesamteinkommen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Gesamteinkommen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType#getNachweisGesamteinkommen()
	 * @see #getGesamteinkommenType()
	 * @generated
	 */
	EReference getGesamteinkommenType_NachweisGesamteinkommen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType <em>Gesetzliche Vertretung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gesetzliche Vertretung Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType
	 * @generated
	 */
	EClass getGesetzlicheVertretungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getAnredeGesetzlicheVertretung <em>Anrede Gesetzliche Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anrede Gesetzliche Vertretung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getAnredeGesetzlicheVertretung()
	 * @see #getGesetzlicheVertretungType()
	 * @generated
	 */
	EReference getGesetzlicheVertretungType_AnredeGesetzlicheVertretung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNameGesetzlicheVertretung <em>Name Gesetzliche Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Gesetzliche Vertretung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNameGesetzlicheVertretung()
	 * @see #getGesetzlicheVertretungType()
	 * @generated
	 */
	EReference getGesetzlicheVertretungType_NameGesetzlicheVertretung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getAnschriftGesetzlicheVertretung <em>Anschrift Gesetzliche Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Gesetzliche Vertretung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getAnschriftGesetzlicheVertretung()
	 * @see #getGesetzlicheVertretungType()
	 * @generated
	 */
	EReference getGesetzlicheVertretungType_AnschriftGesetzlicheVertretung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNutzerkontoGesetzlicheVertretung <em>Nutzerkonto Gesetzliche Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nutzerkonto Gesetzliche Vertretung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNutzerkontoGesetzlicheVertretung()
	 * @see #getGesetzlicheVertretungType()
	 * @generated
	 */
	EReference getGesetzlicheVertretungType_NutzerkontoGesetzlicheVertretung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNachweisGesetzlicheVertretung <em>Nachweis Gesetzliche Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Gesetzliche Vertretung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType#getNachweisGesetzlicheVertretung()
	 * @see #getGesetzlicheVertretungType()
	 * @generated
	 */
	EReference getGesetzlicheVertretungType_NachweisGesetzlicheVertretung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType <em>Gewoehnlicher Aufenthalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gewoehnlicher Aufenthalt Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType
	 * @generated
	 */
	EClass getGewoehnlicherAufenthaltType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getWohnsitz <em>Wohnsitz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wohnsitz</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getWohnsitz()
	 * @see #getGewoehnlicherAufenthaltType()
	 * @generated
	 */
	EReference getGewoehnlicherAufenthaltType_Wohnsitz();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getBeginnAufenthaltD <em>Beginn Aufenthalt D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginn Aufenthalt D</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getBeginnAufenthaltD()
	 * @see #getGewoehnlicherAufenthaltType()
	 * @generated
	 */
	EAttribute getGewoehnlicherAufenthaltType_BeginnAufenthaltD();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getBefristeterAuslandsaufenthalt <em>Befristeter Auslandsaufenthalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Befristeter Auslandsaufenthalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getBefristeterAuslandsaufenthalt()
	 * @see #getGewoehnlicherAufenthaltType()
	 * @generated
	 */
	EReference getGewoehnlicherAufenthaltType_BefristeterAuslandsaufenthalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getUnbefristeterAuslandsaufenthalt <em>Unbefristeter Auslandsaufenthalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unbefristeter Auslandsaufenthalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getUnbefristeterAuslandsaufenthalt()
	 * @see #getGewoehnlicherAufenthaltType()
	 * @generated
	 */
	EReference getGewoehnlicherAufenthaltType_UnbefristeterAuslandsaufenthalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auslaendisches Arbeitsverhaeltnis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#getAuslaendischesArbeitsverhaeltnis()
	 * @see #getGewoehnlicherAufenthaltType()
	 * @generated
	 */
	EReference getGewoehnlicherAufenthaltType_AuslaendischesArbeitsverhaeltnis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedNatoZivilesGefolge <em>Mitglied Nato Ziviles Gefolge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitglied Nato Ziviles Gefolge</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedNatoZivilesGefolge()
	 * @see #getGewoehnlicherAufenthaltType()
	 * @generated
	 */
	EAttribute getGewoehnlicherAufenthaltType_MitgliedNatoZivilesGefolge();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedDiplomatischeMissionOderKonsularischeVertretung <em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType#isMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @see #getGewoehnlicherAufenthaltType()
	 * @generated
	 */
	EAttribute getGewoehnlicherAufenthaltType_MitgliedDiplomatischeMissionOderKonsularischeVertretung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType <em>Haushaltszugehoerigkeit Des Kindes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Haushaltszugehoerigkeit Des Kindes Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType
	 * @generated
	 */
	EClass getHaushaltszugehoerigkeitDesKindesType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType#getBetreuungUndErziehungImEigenenHaushalt <em>Betreuung Und Erziehung Im Eigenen Haushalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Betreuung Und Erziehung Im Eigenen Haushalt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType#getBetreuungUndErziehungImEigenenHaushalt()
	 * @see #getHaushaltszugehoerigkeitDesKindesType()
	 * @generated
	 */
	EReference getHaushaltszugehoerigkeitDesKindesType_BetreuungUndErziehungImEigenenHaushalt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType <em>Kind Elterngeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind Elterngeld Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType
	 * @generated
	 */
	EClass getKindElterngeldType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getNameKind <em>Name Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getNameKind()
	 * @see #getKindElterngeldType()
	 * @generated
	 */
	EReference getKindElterngeldType_NameKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getGeburtsdatum()
	 * @see #getKindElterngeldType()
	 * @generated
	 */
	EReference getKindElterngeldType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getGeburtsurkunde <em>Geburtsurkunde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geburtsurkunde</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getGeburtsurkunde()
	 * @see #getKindElterngeldType()
	 * @generated
	 */
	EReference getKindElterngeldType_Geburtsurkunde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getAnschriftBeiAntragstellung <em>Anschrift Bei Antragstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Bei Antragstellung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getAnschriftBeiAntragstellung()
	 * @see #getKindElterngeldType()
	 * @generated
	 */
	EReference getKindElterngeldType_AnschriftBeiAntragstellung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Besonders Frueh Geborenes Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getBesondersFruehGeborenesKind()
	 * @see #getKindElterngeldType()
	 * @generated
	 */
	EReference getKindElterngeldType_BesondersFruehGeborenesKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getAdoption <em>Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adoption</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getAdoption()
	 * @see #getKindElterngeldType()
	 * @generated
	 */
	EReference getKindElterngeldType_Adoption();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getMehrlingsgeburt <em>Mehrlingsgeburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mehrlingsgeburt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getMehrlingsgeburt()
	 * @see #getKindElterngeldType()
	 * @generated
	 */
	EReference getKindElterngeldType_Mehrlingsgeburt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getBehinderungKind <em>Behinderung Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behinderung Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getBehinderungKind()
	 * @see #getKindElterngeldType()
	 * @generated
	 */
	EReference getKindElterngeldType_BehinderungKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getNummerGeburtsstandesamt <em>Nummer Geburtsstandesamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nummer Geburtsstandesamt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getNummerGeburtsstandesamt()
	 * @see #getKindElterngeldType()
	 * @generated
	 */
	EReference getKindElterngeldType_NummerGeburtsstandesamt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType <em>Kindschaftsverhaeltnis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kindschaftsverhaeltnis Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType
	 * @generated
	 */
	EClass getKindschaftsverhaeltnisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType#getKindschaftsverhaeltnis <em>Kindschaftsverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kindschaftsverhaeltnis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType#getKindschaftsverhaeltnis()
	 * @see #getKindschaftsverhaeltnisType()
	 * @generated
	 */
	EReference getKindschaftsverhaeltnisType_Kindschaftsverhaeltnis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType#getNachweis()
	 * @see #getKindschaftsverhaeltnisType()
	 * @generated
	 */
	EReference getKindschaftsverhaeltnisType_Nachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType <em>Kind Vorabmeldung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind Vorabmeldung Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType
	 * @generated
	 */
	EClass getKindVorabmeldungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType#getNameKind <em>Name Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType#getNameKind()
	 * @see #getKindVorabmeldungType()
	 * @generated
	 */
	EReference getKindVorabmeldungType_NameKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType#getGeburtsdatum()
	 * @see #getKindVorabmeldungType()
	 * @generated
	 */
	EReference getKindVorabmeldungType_Geburtsdatum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType <em>Krankengeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Krankengeld Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType
	 * @generated
	 */
	EClass getKrankengeldType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#isBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Krankengeld Schwangerschaft</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#isBezugKrankengeldSchwangerschaft()
	 * @see #getKrankengeldType()
	 * @generated
	 */
	EAttribute getKrankengeldType_BezugKrankengeldSchwangerschaft();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#getZeitraumKrankengeldSchwangerschaft <em>Zeitraum Krankengeld Schwangerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum Krankengeld Schwangerschaft</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#getZeitraumKrankengeldSchwangerschaft()
	 * @see #getKrankengeldType()
	 * @generated
	 */
	EReference getKrankengeldType_ZeitraumKrankengeldSchwangerschaft();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#getNachweisKrankengeldSchwangerschaft <em>Nachweis Krankengeld Schwangerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Krankengeld Schwangerschaft</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType#getNachweisKrankengeldSchwangerschaft()
	 * @see #getKrankengeldType()
	 * @generated
	 */
	EReference getKrankengeldType_NachweisKrankengeldSchwangerschaft();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType <em>Krankentagegeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Krankentagegeld Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType
	 * @generated
	 */
	EClass getKrankentagegeldType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#isBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Krankentagegeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#isBezugKrankentagegeld()
	 * @see #getKrankentagegeldType()
	 * @generated
	 */
	EAttribute getKrankentagegeldType_BezugKrankentagegeld();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#getZeitraumKrankentagegeld <em>Zeitraum Krankentagegeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum Krankentagegeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#getZeitraumKrankentagegeld()
	 * @see #getKrankentagegeldType()
	 * @generated
	 */
	EReference getKrankentagegeldType_ZeitraumKrankentagegeld();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#getNachweisKrankentagegeld <em>Nachweis Krankentagegeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Krankentagegeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType#getNachweisKrankentagegeld()
	 * @see #getKrankentagegeldType()
	 * @generated
	 */
	EReference getKrankentagegeldType_NachweisKrankentagegeld();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType <em>Krankenversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Krankenversicherung Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType
	 * @generated
	 */
	EClass getKrankenversicherungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getVersicherungsart <em>Versicherungsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Versicherungsart</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getVersicherungsart()
	 * @see #getKrankenversicherungType()
	 * @generated
	 */
	EReference getKrankenversicherungType_Versicherungsart();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getBezeichnungKrankenkasse <em>Bezeichnung Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezeichnung Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getBezeichnungKrankenkasse()
	 * @see #getKrankenversicherungType()
	 * @generated
	 */
	EAttribute getKrankenversicherungType_BezeichnungKrankenkasse();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getAnschriftKrankenkasse <em>Anschrift Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getAnschriftKrankenkasse()
	 * @see #getKrankenversicherungType()
	 * @generated
	 */
	EReference getKrankenversicherungType_AnschriftKrankenkasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getVersichertennummer <em>Versichertennummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versichertennummer</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getVersichertennummer()
	 * @see #getKrankenversicherungType()
	 * @generated
	 */
	EAttribute getKrankenversicherungType_Versichertennummer();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getAnschriftPostfachKrankenkasse <em>Anschrift Postfach Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Postfach Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getAnschriftPostfachKrankenkasse()
	 * @see #getKrankenversicherungType()
	 * @generated
	 */
	EReference getKrankenversicherungType_AnschriftPostfachKrankenkasse();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getNachweisKrankenversicherung <em>Nachweis Krankenversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Krankenversicherung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getNachweisKrankenversicherung()
	 * @see #getKrankenversicherungType()
	 * @generated
	 */
	EReference getKrankenversicherungType_NachweisKrankenversicherung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType <em>Lebenssituation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lebenssituation Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType
	 * @generated
	 */
	EClass getLebenssituationType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unverheiratetes Zusammenleben</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isUnverheiratetesZusammenleben()
	 * @see #getLebenssituationType()
	 * @generated
	 */
	EAttribute getLebenssituationType_UnverheiratetesZusammenleben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#getUnverheiratetesZusammenlebenSeit <em>Unverheiratetes Zusammenleben Seit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unverheiratetes Zusammenleben Seit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#getUnverheiratetesZusammenlebenSeit()
	 * @see #getLebenssituationType()
	 * @generated
	 */
	EReference getLebenssituationType_UnverheiratetesZusammenlebenSeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isDauerndesGetrenntLeben <em>Dauerndes Getrennt Leben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dauerndes Getrennt Leben</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isDauerndesGetrenntLeben()
	 * @see #getLebenssituationType()
	 * @generated
	 */
	EAttribute getLebenssituationType_DauerndesGetrenntLeben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#getDauerndesGetrenntLebenSeit <em>Dauerndes Getrennt Leben Seit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dauerndes Getrennt Leben Seit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#getDauerndesGetrenntLebenSeit()
	 * @see #getLebenssituationType()
	 * @generated
	 */
	EReference getLebenssituationType_DauerndesGetrenntLebenSeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType <em>Mehrlingsgeburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mehrlingsgeburt Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType
	 * @generated
	 */
	EClass getMehrlingsgeburtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#isMehrlingsgeburt <em>Mehrlingsgeburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mehrlingsgeburt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#isMehrlingsgeburt()
	 * @see #getMehrlingsgeburtType()
	 * @generated
	 */
	EAttribute getMehrlingsgeburtType_Mehrlingsgeburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getAnzahlMehrlinge <em>Anzahl Mehrlinge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Mehrlinge</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getAnzahlMehrlinge()
	 * @see #getMehrlingsgeburtType()
	 * @generated
	 */
	EAttribute getMehrlingsgeburtType_AnzahlMehrlinge();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getVornamenMehrlingskind <em>Vornamen Mehrlingskind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vornamen Mehrlingskind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getVornamenMehrlingskind()
	 * @see #getMehrlingsgeburtType()
	 * @generated
	 */
	EAttribute getMehrlingsgeburtType_VornamenMehrlingskind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getNachweisMehrlingsgeburt <em>Nachweis Mehrlingsgeburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Mehrlingsgeburt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getNachweisMehrlingsgeburt()
	 * @see #getMehrlingsgeburtType()
	 * @generated
	 */
	EReference getMehrlingsgeburtType_NachweisMehrlingsgeburt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType <em>Midijob Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midijob Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType
	 * @generated
	 */
	EClass getMidijobType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getZeitraum()
	 * @see #getMidijobType()
	 * @generated
	 */
	EReference getMidijobType_Zeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getWochenstundenJeTaetigkeitMidijob <em>Wochenstunden Je Taetigkeit Midijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wochenstunden Je Taetigkeit Midijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getWochenstundenJeTaetigkeitMidijob()
	 * @see #getMidijobType()
	 * @generated
	 */
	EAttribute getMidijobType_WochenstundenJeTaetigkeitMidijob();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getNachweisMidijob <em>Nachweis Midijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Midijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType#getNachweisMidijob()
	 * @see #getMidijobType()
	 * @generated
	 */
	EReference getMidijobType_NachweisMidijob();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType <em>Minijob Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minijob Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType
	 * @generated
	 */
	EClass getMinijobType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getZeitraum()
	 * @see #getMinijobType()
	 * @generated
	 */
	EReference getMinijobType_Zeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getWochenstundenJeTaetigkeitMinijob <em>Wochenstunden Je Taetigkeit Minijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wochenstunden Je Taetigkeit Minijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getWochenstundenJeTaetigkeitMinijob()
	 * @see #getMinijobType()
	 * @generated
	 */
	EAttribute getMinijobType_WochenstundenJeTaetigkeitMinijob();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getNachweisMinijob <em>Nachweis Minijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Minijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType#getNachweisMinijob()
	 * @see #getMinijobType()
	 * @generated
	 */
	EReference getMinijobType_NachweisMinijob();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType <em>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType
	 * @generated
	 */
	EClass getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isMutterschaftsgeld <em>Mutterschaftsgeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutterschaftsgeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isMutterschaftsgeld()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_Mutterschaftsgeld();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getMutterschaftsgeldZeitraum <em>Mutterschaftsgeld Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mutterschaftsgeld Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getMutterschaftsgeldZeitraum()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_MutterschaftsgeldZeitraum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getMutterschaftsgeldNachweis <em>Mutterschaftsgeld Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mutterschaftsgeld Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getMutterschaftsgeldNachweis()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_MutterschaftsgeldNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isArbeitgeberzuschuss <em>Arbeitgeberzuschuss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arbeitgeberzuschuss</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isArbeitgeberzuschuss()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_Arbeitgeberzuschuss();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getArbeitgeberzuschussZeitraum <em>Arbeitgeberzuschuss Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arbeitgeberzuschuss Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getArbeitgeberzuschussZeitraum()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_ArbeitgeberzuschussZeitraum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getArbeitgeberzuschussNachweis <em>Arbeitgeberzuschuss Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arbeitgeberzuschuss Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getArbeitgeberzuschussNachweis()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_ArbeitgeberzuschussNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isKrankentagegeld <em>Krankentagegeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Krankentagegeld</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isKrankentagegeld()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_Krankentagegeld();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getKrankentagegeldZeitraum <em>Krankentagegeld Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Krankentagegeld Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getKrankentagegeldZeitraum()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_KrankentagegeldZeitraum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getKrankentagegeldNachweis <em>Krankentagegeld Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Krankentagegeld Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getKrankentagegeldNachweis()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_KrankentagegeldNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isDienstAnwaerterbezug <em>Dienst Anwaerterbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dienst Anwaerterbezug</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isDienstAnwaerterbezug()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_DienstAnwaerterbezug();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getDienstAnwaerterbezugZeitraum <em>Dienst Anwaerterbezug Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dienst Anwaerterbezug Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getDienstAnwaerterbezugZeitraum()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_DienstAnwaerterbezugZeitraum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getDienstAnwaerterbezugNachweis <em>Dienst Anwaerterbezug Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dienst Anwaerterbezug Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getDienstAnwaerterbezugNachweis()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_DienstAnwaerterbezugNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isBeamtenSoldatenrecht <em>Beamten Soldatenrecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beamten Soldatenrecht</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isBeamtenSoldatenrecht()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_BeamtenSoldatenrecht();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getBeamtenSoldatenrechtZeitraum <em>Beamten Soldatenrecht Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beamten Soldatenrecht Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getBeamtenSoldatenrechtZeitraum()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_BeamtenSoldatenrechtZeitraum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getBeamtenSodatenrechtNachweis <em>Beamten Sodatenrecht Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beamten Sodatenrecht Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getBeamtenSodatenrechtNachweis()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_BeamtenSodatenrechtNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isAuslFamilienleistungen <em>Ausl Familienleistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ausl Familienleistungen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isAuslFamilienleistungen()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_AuslFamilienleistungen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getAuslFamilienleistungenZeitraum <em>Ausl Familienleistungen Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ausl Familienleistungen Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getAuslFamilienleistungenZeitraum()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_AuslFamilienleistungenZeitraum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getAuslFamilienleistungenNachweis <em>Ausl Familienleistungen Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ausl Familienleistungen Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getAuslFamilienleistungenNachweis()
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
	 * @generated
	 */
	EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_AuslFamilienleistungenNachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType <em>Nichtselbststaendige Beschaeftigung Vor Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nichtselbststaendige Beschaeftigung Vor Geburt Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType
	 * @generated
	 */
	EClass getNichtselbststaendigeBeschaeftigungVorGeburtType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#getNichtselbststaendigkeitAusklammerungstatbestaende <em>Nichtselbststaendigkeit Ausklammerungstatbestaende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nichtselbststaendigkeit Ausklammerungstatbestaende</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#getNichtselbststaendigkeitAusklammerungstatbestaende()
	 * @see #getNichtselbststaendigeBeschaeftigungVorGeburtType()
	 * @generated
	 */
	EReference getNichtselbststaendigeBeschaeftigungVorGeburtType_NichtselbststaendigkeitAusklammerungstatbestaende();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isBerufsbildung <em>Berufsbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Berufsbildung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isBerufsbildung()
	 * @see #getNichtselbststaendigeBeschaeftigungVorGeburtType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Berufsbildung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMidijob <em>Midijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMidijob()
	 * @see #getNichtselbststaendigeBeschaeftigungVorGeburtType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Midijob();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steuerfreibetrag</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isSteuerfreibetrag()
	 * @see #getNichtselbststaendigeBeschaeftigungVorGeburtType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Steuerfreibetrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMinijob <em>Minijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isMinijob()
	 * @see #getNichtselbststaendigeBeschaeftigungVorGeburtType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Minijob();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isFreiwilligendienst <em>Freiwilligendienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freiwilligendienst</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType#isFreiwilligendienst()
	 * @see #getNichtselbststaendigeBeschaeftigungVorGeburtType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Freiwilligendienst();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType <em>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType
	 * @generated
	 */
	EClass getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isTeilzeittaetigkeit <em>Teilzeittaetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teilzeittaetigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isTeilzeittaetigkeit()
	 * @see #getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Teilzeittaetigkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getAngabenTeilzeittaetigkeit <em>Angaben Teilzeittaetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Teilzeittaetigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getAngabenTeilzeittaetigkeit()
	 * @see #getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_AngabenTeilzeittaetigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMidijob <em>Midijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMidijob()
	 * @see #getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Midijob();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getAngabenMidijob <em>Angaben Midijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Midijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getAngabenMidijob()
	 * @see #getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_AngabenMidijob();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMinijob <em>Minijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isMinijob()
	 * @see #getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Minijob();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getAngabenMinijob <em>Angaben Minijob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Minijob</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getAngabenMinijob()
	 * @see #getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_AngabenMinijob();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steuerfreibetrag</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#isSteuerfreibetrag()
	 * @see #getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Steuerfreibetrag();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getBerufsausbildung <em>Berufsausbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Berufsausbildung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getBerufsausbildung()
	 * @see #getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Berufsausbildung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getFreiwilligendienst <em>Freiwilligendienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Freiwilligendienst</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType#getFreiwilligendienst()
	 * @see #getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType()
	 * @generated
	 */
	EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Freiwilligendienst();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType <em>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType
	 * @generated
	 */
	EClass getNichtselbststaendigkeitAusklammerungstatbestaendeType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtAntragskind <em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_MutterschaftsgeldbezugVorGeburtAntragskind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisMutterschaftsgeldbezugAntragskind <em>Nachweis Mutterschaftsgeldbezug Antragskind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Mutterschaftsgeldbezug Antragskind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisMutterschaftsgeldbezugAntragskind()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisMutterschaftsgeldbezugAntragskind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtaelteresKind <em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_MutterschaftsgeldbezugVorGeburtaelteresKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisMutterschaftsgeldbezugAelteresKind <em>Nachweis Mutterschaftsgeldbezug Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Mutterschaftsgeldbezug Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisMutterschaftsgeldbezugAelteresKind()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisMutterschaftsgeldbezugAelteresKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugAelteresKind <em>Elterngeldbezug Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elterngeldbezug Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugAelteresKind()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_ElterngeldbezugAelteresKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisElterngeldbezugAelteresKind <em>Nachweis Elterngeldbezug Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Elterngeldbezug Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisElterngeldbezugAelteresKind()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisElterngeldbezugAelteresKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMoeglicheEinkommensverluste <em>Moegliche Einkommensverluste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moegliche Einkommensverluste</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMoeglicheEinkommensverluste()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_MoeglicheEinkommensverluste();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisMoeglicheEinkommensverluste <em>Nachweis Moegliche Einkommensverluste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Moegliche Einkommensverluste</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisMoeglicheEinkommensverluste()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisMoeglicheEinkommensverluste();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustWehrUndZivildienst <em>Einkommensverlust Wehr Und Zivildienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommensverlust Wehr Und Zivildienst</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustWehrUndZivildienst()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_EinkommensverlustWehrUndZivildienst();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisEinkommensverlustWehrUndZivildienst <em>Nachweis Einkommensverlust Wehr Und Zivildienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Einkommensverlust Wehr Und Zivildienst</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisEinkommensverlustWehrUndZivildienst()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisEinkommensverlustWehrUndZivildienst();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isAntragAusklammerungsverzicht <em>Antrag Ausklammerungsverzicht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antrag Ausklammerungsverzicht</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isAntragAusklammerungsverzicht()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_AntragAusklammerungsverzicht();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getZeitraumAntragAusklammerungsverzicht <em>Zeitraum Antrag Ausklammerungsverzicht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum Antrag Ausklammerungsverzicht</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getZeitraumAntragAusklammerungsverzicht()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_ZeitraumAntragAusklammerungsverzicht();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind <em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_ElterngeldbezugFuerBesondersFruehGeborenesAelteresKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisAelteresBesondersFruehGeborenesKind <em>Nachweis Aelteres Besonders Frueh Geborenes Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Aelteres Besonders Frueh Geborenes Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisAelteresBesondersFruehGeborenesKind()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisAelteresBesondersFruehGeborenesKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankung();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis()
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaendeType()
	 * @generated
	 */
	EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType <em>Persoenliche Angaben ET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persoenliche Angaben ET Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType
	 * @generated
	 */
	EClass getPersoenlicheAngabenETType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getName()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenETType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeburtsdatum()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenETType_Geburtsdatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeburtsort <em>Geburtsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsort</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeburtsort()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenETType_Geburtsort();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeschlecht()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenETType_Geschlecht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getFamilienstand <em>Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienstand</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getFamilienstand()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenETType_Familienstand();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isVerheiratetVerpartnertMitET <em>Verheiratet Verpartnert Mit ET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verheiratet Verpartnert Mit ET</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isVerheiratetVerpartnertMitET()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenETType_VerheiratetVerpartnertMitET();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unverheiratetes Zusammenleben</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isUnverheiratetesZusammenleben()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenETType_UnverheiratetesZusammenleben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isAlleinerziehend <em>Alleinerziehend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alleinerziehend</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isAlleinerziehend()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenETType_Alleinerziehend();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getStaatsangehoerigkeit()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenETType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getNachweisPersonalausweisPass <em>Nachweis Personalausweis Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Personalausweis Pass</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getNachweisPersonalausweisPass()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenETType_NachweisPersonalausweisPass();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getMeldedatenabgleich <em>Meldedatenabgleich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meldedatenabgleich</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getMeldedatenabgleich()
	 * @see #getPersoenlicheAngabenETType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenETType_Meldedatenabgleich();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType <em>Renten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renten Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType
	 * @generated
	 */
	EClass getRentenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#isBezugRente <em>Bezug Rente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Rente</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#isBezugRente()
	 * @see #getRentenType()
	 * @generated
	 */
	EAttribute getRentenType_BezugRente();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#getZeitraumRente <em>Zeitraum Rente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zeitraum Rente</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#getZeitraumRente()
	 * @see #getRentenType()
	 * @generated
	 */
	EReference getRentenType_ZeitraumRente();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#getNachweisRente <em>Nachweis Rente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Rente</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#getNachweisRente()
	 * @see #getRentenType()
	 * @generated
	 */
	EReference getRentenType_NachweisRente();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#getArtRente <em>Art Rente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Art Rente</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#getArtRente()
	 * @see #getRentenType()
	 * @generated
	 */
	EAttribute getRentenType_ArtRente();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType <em>Resturlaub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resturlaub Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType
	 * @generated
	 */
	EClass getResturlaubType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getAnzahlTage <em>Anzahl Tage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Tage</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getAnzahlTage()
	 * @see #getResturlaubType()
	 * @generated
	 */
	EAttribute getResturlaubType_AnzahlTage();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getZeitraum()
	 * @see #getResturlaubType()
	 * @generated
	 */
	EReference getResturlaubType_Zeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getAnzahlDerWochenstunden <em>Anzahl Der Wochenstunden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Der Wochenstunden</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType#getAnzahlDerWochenstunden()
	 * @see #getResturlaubType()
	 * @generated
	 */
	EAttribute getResturlaubType_AnzahlDerWochenstunden();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType <em>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType
	 * @generated
	 */
	EClass getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getAngabenSozialversicherung <em>Angaben Sozialversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Sozialversicherung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getAngabenSozialversicherung()
	 * @see #getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType()
	 * @generated
	 */
	EReference getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_AngabenSozialversicherung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isKirchensteuerpflicht <em>Kirchensteuerpflicht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kirchensteuerpflicht</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isKirchensteuerpflicht()
	 * @see #getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_Kirchensteuerpflicht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getVerschiebetatbestaende <em>Verschiebetatbestaende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verschiebetatbestaende</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getVerschiebetatbestaende()
	 * @see #getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType()
	 * @generated
	 */
	EReference getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_Verschiebetatbestaende();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steuerfreibetrag</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isSteuerfreibetrag()
	 * @see #getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_Steuerfreibetrag();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getNachweisEinkommenssteuerbescheid <em>Nachweis Einkommenssteuerbescheid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Einkommenssteuerbescheid</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getNachweisEinkommenssteuerbescheid()
	 * @see #getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType()
	 * @generated
	 */
	EReference getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_NachweisEinkommenssteuerbescheid();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType <em>Selbststaendigkeit Verschiebetatbestaende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selbststaendigkeit Verschiebetatbestaende Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType
	 * @generated
	 */
	EClass getSelbststaendigkeitVerschiebetatbestaendeType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isMutterschaftsgeldbezugVorGeburtAntragskind <em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_MutterschaftsgeldbezugVorGeburtAntragskind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisMutterschaftsgeldbezugAntragskind <em>Nachweis Mutterschaftsgeldbezug Antragskind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Mutterschaftsgeldbezug Antragskind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisMutterschaftsgeldbezugAntragskind()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisMutterschaftsgeldbezugAntragskind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isMutterschaftsgeldbezugVorGeburtaelteresKind <em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_MutterschaftsgeldbezugVorGeburtaelteresKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisMutterschaftsgeldbezugAelteresKind <em>Nachweis Mutterschaftsgeldbezug Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Mutterschaftsgeldbezug Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisMutterschaftsgeldbezugAelteresKind()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisMutterschaftsgeldbezugAelteresKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isElterngeldbezugAelteresKind <em>Elterngeldbezug Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elterngeldbezug Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isElterngeldbezugAelteresKind()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_ElterngeldbezugAelteresKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisElterngeldbezugAelteresKind <em>Nachweis Elterngeldbezug Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Elterngeldbezug Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisElterngeldbezugAelteresKind()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisElterngeldbezugAelteresKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isMoeglicheEinkommensverluste <em>Moegliche Einkommensverluste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moegliche Einkommensverluste</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isMoeglicheEinkommensverluste()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_MoeglicheEinkommensverluste();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisMoeglicheEinkommensverluste <em>Nachweis Moegliche Einkommensverluste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Moegliche Einkommensverluste</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisMoeglicheEinkommensverluste()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisMoeglicheEinkommensverluste();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isEinkommensverlustWehrUndZivildienst <em>Einkommensverlust Wehr Und Zivildienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommensverlust Wehr Und Zivildienst</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isEinkommensverlustWehrUndZivildienst()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_EinkommensverlustWehrUndZivildienst();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisEinkommensverlustWehrUndZivildienst <em>Nachweis Einkommensverlust Wehr Und Zivildienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Einkommensverlust Wehr Und Zivildienst</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisEinkommensverlustWehrUndZivildienst()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisEinkommensverlustWehrUndZivildienst();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isAntragVerschiebungBemessungszeitraum <em>Antrag Verschiebung Bemessungszeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antrag Verschiebung Bemessungszeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isAntragVerschiebungBemessungszeitraum()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_AntragVerschiebungBemessungszeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getAngabeKalenderjahrZurBerechnung <em>Angabe Kalenderjahr Zur Berechnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angabe Kalenderjahr Zur Berechnung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getAngabeKalenderjahrZurBerechnung()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_AngabeKalenderjahrZurBerechnung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind <em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_ElterngeldbezugFuerBesondersFruehGeborenesAelteresKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisAelteresBesondersFruehGeborenesKind <em>Nachweis Aelteres Besonders Frueh Geborenes Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Aelteres Besonders Frueh Geborenes Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getNachweisAelteresBesondersFruehGeborenesKind()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisAelteresBesondersFruehGeborenesKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankung();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType#getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis()
	 * @see #getSelbststaendigkeitVerschiebetatbestaendeType()
	 * @generated
	 */
	EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType <em>Sonstige Leistungen Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sonstige Leistungen Bezugszeitraum Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType
	 * @generated
	 */
	EClass getSonstigeLeistungenBezugszeitraumType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugElterngeldAusland <em>Bezug Elterngeld Ausland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Elterngeld Ausland</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugElterngeldAusland()
	 * @see #getSonstigeLeistungenBezugszeitraumType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungenBezugszeitraumType_BezugElterngeldAusland();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNachweisElterngeldAusland <em>Nachweis Elterngeld Ausland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Elterngeld Ausland</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNachweisElterngeldAusland()
	 * @see #getSonstigeLeistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getSonstigeLeistungenBezugszeitraumType_NachweisElterngeldAusland();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugALGII <em>Bezug ALGII</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug ALGII</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugALGII()
	 * @see #getSonstigeLeistungenBezugszeitraumType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungenBezugszeitraumType_BezugALGII();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNachweisALGII <em>Nachweis ALGII</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis ALGII</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNachweisALGII()
	 * @see #getSonstigeLeistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getSonstigeLeistungenBezugszeitraumType_NachweisALGII();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNameSozialleistungstraeger <em>Name Sozialleistungstraeger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Sozialleistungstraeger</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNameSozialleistungstraeger()
	 * @see #getSonstigeLeistungenBezugszeitraumType()
	 * @generated
	 */
	EAttribute getSonstigeLeistungenBezugszeitraumType_NameSozialleistungstraeger();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getAnschriftSozialleistungstraeger <em>Anschrift Sozialleistungstraeger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Sozialleistungstraeger</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getAnschriftSozialleistungstraeger()
	 * @see #getSonstigeLeistungenBezugszeitraumType()
	 * @generated
	 */
	EReference getSonstigeLeistungenBezugszeitraumType_AnschriftSozialleistungstraeger();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType <em>Staatsangehoerigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staatsangehoerigkeit Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType
	 * @generated
	 */
	EClass getStaatsangehoerigkeitType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#getStaatsangehoerigkeiten <em>Staatsangehoerigkeiten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeiten</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#getStaatsangehoerigkeiten()
	 * @see #getStaatsangehoerigkeitType()
	 * @generated
	 */
	EReference getStaatsangehoerigkeitType_Staatsangehoerigkeiten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#isVerlustFreizuegigkeit <em>Verlust Freizuegigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verlust Freizuegigkeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#isVerlustFreizuegigkeit()
	 * @see #getStaatsangehoerigkeitType()
	 * @generated
	 */
	EAttribute getStaatsangehoerigkeitType_VerlustFreizuegigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#getAufenthaltstitel <em>Aufenthaltstitel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufenthaltstitel</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType#getAufenthaltstitel()
	 * @see #getStaatsangehoerigkeitType()
	 * @generated
	 */
	EReference getStaatsangehoerigkeitType_Aufenthaltstitel();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType <em>Tagespflege Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagespflege Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType
	 * @generated
	 */
	EClass getTagespflegeType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#isTagespflege <em>Tagespflege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tagespflege</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#isTagespflege()
	 * @see #getTagespflegeType()
	 * @generated
	 */
	EAttribute getTagespflegeType_Tagespflege();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#getAnzahlDerKinderOhneEigeneKinder <em>Anzahl Der Kinder Ohne Eigene Kinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Der Kinder Ohne Eigene Kinder</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#getAnzahlDerKinderOhneEigeneKinder()
	 * @see #getTagespflegeType()
	 * @generated
	 */
	EAttribute getTagespflegeType_AnzahlDerKinderOhneEigeneKinder();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType#getNachweis()
	 * @see #getTagespflegeType()
	 * @generated
	 */
	EReference getTagespflegeType_Nachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType <em>Teilzeittaetigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teilzeittaetigkeit Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType
	 * @generated
	 */
	EClass getTeilzeittaetigkeitType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getZeitraum()
	 * @see #getTeilzeittaetigkeitType()
	 * @generated
	 */
	EReference getTeilzeittaetigkeitType_Zeitraum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getWochenstundenJeTaetigkeitTeilzeit <em>Wochenstunden Je Taetigkeit Teilzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wochenstunden Je Taetigkeit Teilzeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getWochenstundenJeTaetigkeitTeilzeit()
	 * @see #getTeilzeittaetigkeitType()
	 * @generated
	 */
	EAttribute getTeilzeittaetigkeitType_WochenstundenJeTaetigkeitTeilzeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getNachweisTeilzeit <em>Nachweis Teilzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Teilzeit</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType#getNachweisTeilzeit()
	 * @see #getTeilzeittaetigkeitType()
	 * @generated
	 */
	EReference getTeilzeittaetigkeitType_NachweisTeilzeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType <em>Weitere Kinder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weitere Kinder Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType
	 * @generated
	 */
	EClass getWeitereKinderType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType#getAnzahlAllerImHaushaltLebendenKinder <em>Anzahl Aller Im Haushalt Lebenden Kinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Aller Im Haushalt Lebenden Kinder</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType#getAnzahlAllerImHaushaltLebendenKinder()
	 * @see #getWeitereKinderType()
	 * @generated
	 */
	EAttribute getWeitereKinderType_AnzahlAllerImHaushaltLebendenKinder();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType#getAngabenWeiteresKind <em>Angaben Weiteres Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Weiteres Kind</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType#getAngabenWeiteresKind()
	 * @see #getWeitereKinderType()
	 * @generated
	 */
	EReference getWeitereKinderType_AngabenWeiteresKind();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType <em>Zustimmung Datenabrufe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zustimmung Datenabrufe Type</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType
	 * @generated
	 */
	EClass getZustimmungDatenabrufeType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufDSRV <em>Zustimmung Datenabruf DSRV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Datenabruf DSRV</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufDSRV()
	 * @see #getZustimmungDatenabrufeType()
	 * @generated
	 */
	EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufDSRV();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufStandesamt <em>Zustimmung Datenabruf Standesamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Datenabruf Standesamt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufStandesamt()
	 * @see #getZustimmungDatenabrufeType()
	 * @generated
	 */
	EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufStandesamt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufKrankenkasse <em>Zustimmung Datenabruf Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Datenabruf Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufKrankenkasse()
	 * @see #getZustimmungDatenabrufeType()
	 * @generated
	 */
	EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufKrankenkasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufFinanzamt <em>Zustimmung Datenabruf Finanzamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Datenabruf Finanzamt</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufFinanzamt()
	 * @see #getZustimmungDatenabrufeType()
	 * @generated
	 */
	EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufFinanzamt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufBeamte <em>Zustimmung Datenabruf Beamte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Datenabruf Beamte</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufBeamte()
	 * @see #getZustimmungDatenabrufeType()
	 * @generated
	 */
	EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufBeamte();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Abbruchgrund <em>Abbruchgrund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Abbruchgrund</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Abbruchgrund
	 * @generated
	 */
	EEnum getAbbruchgrund();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Anfragegrund <em>Anfragegrund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anfragegrund</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Anfragegrund
	 * @generated
	 */
	EEnum getAnfragegrund();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Elterngeldantrag <em>Elterngeldantrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Elterngeldantrag</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Elterngeldantrag
	 * @generated
	 */
	EEnum getElterngeldantrag();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Fehlerfall <em>Fehlerfall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fehlerfall</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Fehlerfall
	 * @generated
	 */
	EEnum getFehlerfall();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Gesamteinkommen <em>Gesamteinkommen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gesamteinkommen</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Gesamteinkommen
	 * @generated
	 */
	EEnum getGesamteinkommen();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Kindschaftsverhaeltnis <em>Kindschaftsverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kindschaftsverhaeltnis</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Kindschaftsverhaeltnis
	 * @generated
	 */
	EEnum getKindschaftsverhaeltnis();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Leistungshoehe <em>Leistungshoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leistungshoehe</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Leistungshoehe
	 * @generated
	 */
	EEnum getLeistungshoehe();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versandweg <em>Versandweg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Versandweg</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versandweg
	 * @generated
	 */
	EEnum getVersandweg();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versicherungsart <em>Versicherungsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Versicherungsart</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versicherungsart
	 * @generated
	 */
	EEnum getVersicherungsart();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Abbruchgrund <em>Abbruchgrund Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abbruchgrund Object</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Abbruchgrund
	 * @model instanceClass="de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Abbruchgrund"
	 *        extendedMetaData="name='abbruchgrund:Object' baseType='abbruchgrund'"
	 * @generated
	 */
	EDataType getAbbruchgrundObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Anfragegrund <em>Anfragegrund Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anfragegrund Object</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Anfragegrund
	 * @model instanceClass="de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Anfragegrund"
	 *        extendedMetaData="name='anfragegrund:Object' baseType='anfragegrund'"
	 * @generated
	 */
	EDataType getAnfragegrundObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Elterngeldantrag <em>Elterngeldantrag Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Elterngeldantrag Object</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Elterngeldantrag
	 * @model instanceClass="de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Elterngeldantrag"
	 *        extendedMetaData="name='elterngeldantrag:Object' baseType='elterngeldantrag'"
	 * @generated
	 */
	EDataType getElterngeldantragObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Fehlerfall <em>Fehlerfall Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fehlerfall Object</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Fehlerfall
	 * @model instanceClass="de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Fehlerfall"
	 *        extendedMetaData="name='fehlerfall:Object' baseType='fehlerfall'"
	 * @generated
	 */
	EDataType getFehlerfallObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Gesamteinkommen <em>Gesamteinkommen Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gesamteinkommen Object</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Gesamteinkommen
	 * @model instanceClass="de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Gesamteinkommen"
	 *        extendedMetaData="name='gesamteinkommen:Object' baseType='gesamteinkommen'"
	 * @generated
	 */
	EDataType getGesamteinkommenObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Kindschaftsverhaeltnis <em>Kindschaftsverhaeltnis Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kindschaftsverhaeltnis Object</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Kindschaftsverhaeltnis
	 * @model instanceClass="de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Kindschaftsverhaeltnis"
	 *        extendedMetaData="name='kindschaftsverhaeltnis:Object' baseType='kindschaftsverhaeltnis'"
	 * @generated
	 */
	EDataType getKindschaftsverhaeltnisObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Leistungshoehe <em>Leistungshoehe Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Leistungshoehe Object</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Leistungshoehe
	 * @model instanceClass="de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Leistungshoehe"
	 *        extendedMetaData="name='leistungshoehe:Object' baseType='leistungshoehe'"
	 * @generated
	 */
	EDataType getLeistungshoeheObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versandweg <em>Versandweg Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Versandweg Object</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versandweg
	 * @model instanceClass="de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versandweg"
	 *        extendedMetaData="name='versandweg:Object' baseType='versandweg'"
	 * @generated
	 */
	EDataType getVersandwegObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versicherungsart <em>Versicherungsart Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Versicherungsart Object</em>'.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versicherungsart
	 * @model instanceClass="de.xoev.xfamilie.elterngeldantrag._1.elterngeld.Versicherungsart"
	 *        extendedMetaData="name='versicherungsart:Object' baseType='versicherungsart'"
	 * @generated
	 */
	EDataType getVersicherungsartObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElterngeldFactory getElterngeldFactory();

} //ElterngeldPackage
