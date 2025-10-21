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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;


import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AdoptionPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/adoption.ecore", ecoreSourceLocations="/model/adoption.ecore")
public interface AdoptionPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adoption";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/adoptionundpflegekinder/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adoption";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdoptionPackage eINSTANCE = de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl <em>Abgebender Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAbgebenderElternteilType()
	 * @generated
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL = 0;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN = 1;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE__GEBURT = 2;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT = 3;

	/**
	 * The feature id for the '<em><b>Einstellung Adoptionsabsicht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE__EINSTELLUNG_ADOPTIONSABSICHT = 4;

	/**
	 * The feature id for the '<em><b>Aufenthaltsstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS = 5;

	/**
	 * The feature id for the '<em><b>Elternteil Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN = 6;

	/**
	 * The number of structural features of the '<em>Abgebender Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Abgebender Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABGEBENDER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderAdoption0901TypeImpl <em>Adoptionundpflegekinder Adoption0901 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderAdoption0901TypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAdoptionundpflegekinderAdoption0901Type()
	 * @generated
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Kontaktformular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nachweise Einreichen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stiefkindadoption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verwandtenadoption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fremdkindadoption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Adoptionundpflegekinder Adoption0901 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Adoptionundpflegekinder Adoption0901 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl <em>Adoptionundpflegekinder Pflegekinder0902 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAdoptionundpflegekinderPflegekinder0902Type()
	 * @generated
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Kontaktformular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nachweise Einreichen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pflegeperson</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sonstige Antraege Senden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Beitragsuebernahme Unfallversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alterssicherung Pflegeperson</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pauschalbetrag Vollzeitpflege</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Adoptionundpflegekinder Pflegekinder0902 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Adoptionundpflegekinder Pflegekinder0902 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl <em>Allgemeine Angaben Fremdkindadoption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT = 2;

	/**
	 * The feature id for the '<em><b>Religionszugehoerigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__RELIGIONSZUGEHOERIGKEIT = 3;

	/**
	 * The feature id for the '<em><b>Aktuelle Berufliche Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT = 4;

	/**
	 * The feature id for the '<em><b>Einkuenfte Aus Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__EINKUENFTE_AUS_TAETIGKEIT = 5;

	/**
	 * The feature id for the '<em><b>Andere Einkuenfte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__ANDERE_EINKUENFTE = 6;

	/**
	 * The feature id for the '<em><b>Schuldverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__SCHULDVERPFLICHTUNGEN = 7;

	/**
	 * The feature id for the '<em><b>Unterhaltsverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UNTERHALTSVERPFLICHTUNGEN = 8;

	/**
	 * The feature id for the '<em><b>Monatliche Fixkosten Unterkunft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT = 9;

	/**
	 * The feature id for the '<em><b>Aufenthaltsstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS = 10;

	/**
	 * The feature id for the '<em><b>Aktueller Familienstand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLER_FAMILIENSTAND = 11;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT = 12;

	/**
	 * The feature id for the '<em><b>Bereits Verheiratet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__BEREITS_VERHEIRATET = 13;

	/**
	 * The feature id for the '<em><b>Umfang Verheiratet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UMFANG_VERHEIRATET = 14;

	/**
	 * The number of structural features of the '<em>Allgemeine Angaben Fremdkindadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Allgemeine Angaben Fremdkindadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonBasisTypeImpl <em>Pflegeperson Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonBasisTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPflegepersonBasisType()
	 * @generated
	 */
	int PFLEGEPERSON_BASIS_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_BASIS_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_BASIS_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Steueridentifikationsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_BASIS_TYPE__STEUERIDENTIFIKATIONSNUMMER = 2;

	/**
	 * The number of structural features of the '<em>Pflegeperson Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_BASIS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pflegeperson Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenPflegeTypeImpl <em>Allgemeine Angaben Pflege Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenPflegeTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAllgemeineAngabenPflegeType()
	 * @generated
	 */
	int ALLGEMEINE_ANGABEN_PFLEGE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_PFLEGE_TYPE__PERSONENDATEN = PFLEGEPERSON_BASIS_TYPE__PERSONENDATEN;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GEBURT = PFLEGEPERSON_BASIS_TYPE__GEBURT;

	/**
	 * The feature id for the '<em><b>Steueridentifikationsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_PFLEGE_TYPE__STEUERIDENTIFIKATIONSNUMMER = PFLEGEPERSON_BASIS_TYPE__STEUERIDENTIFIKATIONSNUMMER;

	/**
	 * The feature id for the '<em><b>Wochenstunden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_PFLEGE_TYPE__WOCHENSTUNDEN = PFLEGEPERSON_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT = PFLEGEPERSON_BASIS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT = PFLEGEPERSON_BASIS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Allgemeine Angaben Pflege Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_PFLEGE_TYPE_FEATURE_COUNT = PFLEGEPERSON_BASIS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Allgemeine Angaben Pflege Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_PFLEGE_TYPE_OPERATION_COUNT = PFLEGEPERSON_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl <em>Allgemeine Angaben Stiefkindadoption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Kontakt Zu Leiblicher Familie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE = 0;

	/**
	 * The feature id for the '<em><b>Erlaeuterung Kontakt Zu Leiblicher Familie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE = 1;

	/**
	 * The feature id for the '<em><b>Personensorgerecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT = 2;

	/**
	 * The feature id for the '<em><b>Personensorgerecht Bei Sonstige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE = 3;

	/**
	 * The feature id for the '<em><b>Geschpraech Ueber Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION = 4;

	/**
	 * The feature id for the '<em><b>Reaktion Kind Gespraech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__REAKTION_KIND_GESPRAECH = 5;

	/**
	 * The feature id for the '<em><b>Kontakt Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_JUGENDAMT = 6;

	/**
	 * The feature id for the '<em><b>Art Kontakt Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ART_KONTAKT_JUGENDAMT = 7;

	/**
	 * The feature id for the '<em><b>Gerichtliche Regelung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GERICHTLICHE_REGELUNG = 8;

	/**
	 * The number of structural features of the '<em>Allgemeine Angaben Stiefkindadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Allgemeine Angaben Stiefkindadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl <em>Allgemeine Angaben Verwandtenadoption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAllgemeineAngabenVerwandtenadoptionType()
	 * @generated
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Herkunft Bekannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__HERKUNFT_BEKANNT = 0;

	/**
	 * The feature id for the '<em><b>Kontakt Zu Leiblicher Familie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE = 1;

	/**
	 * The feature id for the '<em><b>Erlaeuterung Kontakt Zu Leiblicher Familie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE = 2;

	/**
	 * The feature id for the '<em><b>Personensorgerecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT = 3;

	/**
	 * The feature id for the '<em><b>Personensorgerecht Bei Sonstige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE = 4;

	/**
	 * The feature id for the '<em><b>Geschpraech Ueber Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION = 5;

	/**
	 * The feature id for the '<em><b>Reaktion Kind Gespraech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__REAKTION_KIND_GESPRAECH = 6;

	/**
	 * The number of structural features of the '<em>Allgemeine Angaben Verwandtenadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Allgemeine Angaben Verwandtenadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl <em>Alterssicherung Pflegeperson Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAlterssicherungPflegepersonType()
	 * @generated
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 0;

	/**
	 * The feature id for the '<em><b>Allgemeine Angaben</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN = 1;

	/**
	 * The feature id for the '<em><b>Antragdetails Alterssicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG = 2;

	/**
	 * The feature id for the '<em><b>Pflegekinder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE__PFLEGEKINDER = 3;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE__NACHWEISE = 4;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 5;

	/**
	 * The feature id for the '<em><b>Signatur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR = 6;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL = 7;

	/**
	 * The number of structural features of the '<em>Alterssicherung Pflegeperson Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Alterssicherung Pflegeperson Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSSICHERUNG_PFLEGEPERSON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl <em>Angaben Des Zu Adoptierenden Kindes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAngabenDesZuAdoptierendenKindesType()
	 * @generated
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT = 2;

	/**
	 * The feature id for the '<em><b>Religionszugehoerigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__RELIGIONSZUGEHOERIGKEIT = 3;

	/**
	 * The feature id for the '<em><b>Aus Ausland Geholt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUS_AUSLAND_GEHOLT = 4;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT = 5;

	/**
	 * The feature id for the '<em><b>Aufenthaltsstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS = 6;

	/**
	 * The number of structural features of the '<em>Angaben Des Zu Adoptierenden Kindes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Angaben Des Zu Adoptierenden Kindes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl <em>Angaben Pflegekind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAngabenPflegekindType()
	 * @generated
	 */
	int ANGABEN_PFLEGEKIND_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Beginn Pflegeverhaeltnis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE__BEGINN_PFLEGEVERHAELTNIS = 3;

	/**
	 * The feature id for the '<em><b>Krankenversichert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT = 4;

	/**
	 * The feature id for the '<em><b>Krankenversichert Ueber Pflegeperson</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT_UEBER_PFLEGEPERSON = 5;

	/**
	 * The feature id for the '<em><b>Schule Ausbildungsstaette</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE__SCHULE_AUSBILDUNGSSTAETTE = 6;

	/**
	 * The feature id for the '<em><b>Klassenstufe Ausbildungsjahr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE__KLASSENSTUFE_AUSBILDUNGSJAHR = 7;

	/**
	 * The feature id for the '<em><b>Einkommen Pflegekind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND = 8;

	/**
	 * The number of structural features of the '<em>Angaben Pflegekind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Angaben Pflegekind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_PFLEGEKIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl <em>Angaben Zu Kindern Der Familie Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAngabenZuKindernDerFamilieType()
	 * @generated
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Verhaeltnis Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__VERHAELTNIS_KIND = 2;

	/**
	 * The feature id for the '<em><b>Elternteil Des Kindes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__ELTERNTEIL_DES_KINDES = 3;

	/**
	 * The feature id for the '<em><b>Kind Wohnhaft Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_HAUSHALT = 4;

	/**
	 * The feature id for the '<em><b>Kind Wohnhaft Alterntive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_ALTERNTIVE = 5;

	/**
	 * The feature id for the '<em><b>Kind Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN = 6;

	/**
	 * The number of structural features of the '<em>Angaben Zu Kindern Der Familie Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Angaben Zu Kindern Der Familie Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl <em>Angaben Zur Partnerschaft Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAngabenZurPartnerschaftType()
	 * @generated
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Dauer Partnerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_PARTNERSCHAFT = 0;

	/**
	 * The feature id for the '<em><b>Dauer Gemeinsamer Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_GEMEINSAMER_HAUSHALT = 1;

	/**
	 * The feature id for the '<em><b>Verheiratet Oder Lebenspartnerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__VERHEIRATET_ODER_LEBENSPARTNERSCHAFT = 2;

	/**
	 * The feature id for the '<em><b>Dauer Verheiratet Oder Lebenspartnerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT = 3;

	/**
	 * The feature id for the '<em><b>Gespraech Ueber Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GESPRAECH_UEBER_ADOPTION = 4;

	/**
	 * The feature id for the '<em><b>Meinung Familie Und Freunde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MEINUNG_FAMILIE_UND_FREUNDE = 5;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT = 6;

	/**
	 * The feature id for the '<em><b>Wohnverhaeltnisse Anzahl Zimmer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER = 7;

	/**
	 * The feature id for the '<em><b>Wohnverhaeltnisse Wohnflaeche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE = 8;

	/**
	 * The feature id for the '<em><b>Miete Oder Eigentum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MIETE_ODER_EIGENTUM = 9;

	/**
	 * The feature id for the '<em><b>Garten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GARTEN = 10;

	/**
	 * The feature id for the '<em><b>Kinderzimmer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__KINDERZIMMER = 11;

	/**
	 * The feature id for the '<em><b>Haustiere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE__HAUSTIERE = 12;

	/**
	 * The number of structural features of the '<em>Angaben Zur Partnerschaft Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Angaben Zur Partnerschaft Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_PARTNERSCHAFT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnliegenTypeImpl <em>Anliegen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnliegenTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAnliegenType()
	 * @generated
	 */
	int ANLIEGEN_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Wunsch Beratung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGEN_TYPE__WUNSCH_BERATUNG = 0;

	/**
	 * The feature id for the '<em><b>Kommentar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGEN_TYPE__KOMMENTAR = 1;

	/**
	 * The number of structural features of the '<em>Anliegen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Anliegen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnnehmenderElternteilTypeImpl <em>Annehmender Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnnehmenderElternteilTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAnnehmenderElternteilType()
	 * @generated
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT = 1;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__GEBURT = 2;

	/**
	 * The feature id for the '<em><b>Aktuelle Berufliche Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT = 3;

	/**
	 * The feature id for the '<em><b>Gruende Motive Fuer Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__GRUENDE_MOTIVE_FUER_ADOPTION = 4;

	/**
	 * The feature id for the '<em><b>Veraenderung Durch Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__VERAENDERUNG_DURCH_ADOPTION = 5;

	/**
	 * The feature id for the '<em><b>Einkuenfte Aus Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__EINKUENFTE_AUS_TAETIGKEIT = 6;

	/**
	 * The feature id for the '<em><b>Andere Einkuenfte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__ANDERE_EINKUENFTE = 7;

	/**
	 * The feature id for the '<em><b>Schuldverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__SCHULDVERPFLICHTUNGEN = 8;

	/**
	 * The feature id for the '<em><b>Unterhaltsverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__UNTERHALTSVERPFLICHTUNGEN = 9;

	/**
	 * The feature id for the '<em><b>Monatliche Fixkosten Unterkunft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT = 10;

	/**
	 * The feature id for the '<em><b>Religionszugehoerigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__RELIGIONSZUGEHOERIGKEIT = 11;

	/**
	 * The feature id for the '<em><b>Aufenthaltsstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS = 12;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE__GESCHLECHT = 13;

	/**
	 * The number of structural features of the '<em>Annehmender Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Annehmender Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEHMENDER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl <em>Antragdetails Alterssicherung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAntragdetailsAlterssicherungType()
	 * @generated
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Beantragung Zuschuss Alterssicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG = 0;

	/**
	 * The feature id for the '<em><b>Zuschuesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE = 1;

	/**
	 * The feature id for the '<em><b>Hoehe Zuschuesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HOEHE_ZUSCHUESSE = 2;

	/**
	 * The feature id for the '<em><b>Von Anderer Stelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__VON_ANDERER_STELLE = 3;

	/**
	 * The feature id for the '<em><b>Art Hoehe Absicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ART_HOEHE_ABSICHERUNG = 4;

	/**
	 * The feature id for the '<em><b>Alleinige Pflegeperson</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ALLEINIGE_PFLEGEPERSON = 5;

	/**
	 * The feature id for the '<em><b>Hauptpflegeperson</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HAUPTPFLEGEPERSON = 6;

	/**
	 * The number of structural features of the '<em>Antragdetails Alterssicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Antragdetails Alterssicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_ALTERSSICHERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsTypeImpl <em>Antragdetails Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAntragdetailsType()
	 * @generated
	 */
	int ANTRAGDETAILS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Antrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_TYPE__ANTRAG = 0;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_TYPE__INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Antragdetails Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Antragdetails Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsUnfallversicherungTypeImpl <em>Antragdetails Unfallversicherung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsUnfallversicherungTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAntragdetailsUnfallversicherungType()
	 * @generated
	 */
	int ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Beantragung Kosten Unfallversicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG = 0;

	/**
	 * The feature id for the '<em><b>Zuschuesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE = 1;

	/**
	 * The feature id for the '<em><b>Hoehe Zuschuesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__HOEHE_ZUSCHUESSE = 2;

	/**
	 * The number of structural features of the '<em>Antragdetails Unfallversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Antragdetails Unfallversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragstellerTypeImpl <em>Antragsteller Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragstellerTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAntragstellerType()
	 * @generated
	 */
	int ANTRAGSTELLER_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLER_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Fallnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLER_TYPE__FALLNUMMER = 1;

	/**
	 * The feature id for the '<em><b>Antragsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLER_TYPE__ANTRAGSDATUM = 2;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLER_TYPE__GEBURT = 3;

	/**
	 * The number of structural features of the '<em>Antragsteller Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Antragsteller Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.BeitragsuebernahmeUnfallversicherungTypeImpl <em>Beitragsuebernahme Unfallversicherung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.BeitragsuebernahmeUnfallversicherungTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getBeitragsuebernahmeUnfallversicherungType()
	 * @generated
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 0;

	/**
	 * The feature id for the '<em><b>Allgemeine Angaben</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__ALLGEMEINE_ANGABEN = 1;

	/**
	 * The feature id for the '<em><b>Antragdetails Unfallversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__ANTRAGDETAILS_UNFALLVERSICHERUNG = 2;

	/**
	 * The feature id for the '<em><b>Pflegekinder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__PFLEGEKINDER = 3;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__NACHWEISE = 4;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 5;

	/**
	 * The feature id for the '<em><b>Signatur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__SIGNATUR = 6;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__DIGITALER_RUECKKANAL = 7;

	/**
	 * The number of structural features of the '<em>Beitragsuebernahme Unfallversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Beitragsuebernahme Unfallversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.BestimmtesKindTypeImpl <em>Bestimmtes Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.BestimmtesKindTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getBestimmtesKindType()
	 * @generated
	 */
	int BESTIMMTES_KIND_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTIMMTES_KIND_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTIMMTES_KIND_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Zustaendiges Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTIMMTES_KIND_TYPE__ZUSTAENDIGES_JUGENDAMT = 2;

	/**
	 * The number of structural features of the '<em>Bestimmtes Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTIMMTES_KIND_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bestimmtes Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESTIMMTES_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DatenschutzUndEinwilligungTypeImpl <em>Datenschutz Und Einwilligung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DatenschutzUndEinwilligungTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getDatenschutzUndEinwilligungType()
	 * @generated
	 */
	int DATENSCHUTZ_UND_EINWILLIGUNG_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Allgemeine Datenschutzerklaerung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__ALLGEMEINE_DATENSCHUTZERKLAERUNG = 0;

	/**
	 * The feature id for the '<em><b>Kenntnissnahme Datenschutzerklaerung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__KENNTNISSNAHME_DATENSCHUTZERKLAERUNG = 1;

	/**
	 * The number of structural features of the '<em>Datenschutz Und Einwilligung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZ_UND_EINWILLIGUNG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Datenschutz Und Einwilligung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZ_UND_EINWILLIGUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DigitalerRueckkanalTypeImpl <em>Digitaler Rueckkanal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DigitalerRueckkanalTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getDigitalerRueckkanalType()
	 * @generated
	 */
	int DIGITALER_RUECKKANAL_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Postfach UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITALER_RUECKKANAL_TYPE__POSTFACH_UUID = 0;

	/**
	 * The feature id for the '<em><b>Einverstaendnis Digitaler Rueckkanal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITALER_RUECKKANAL_TYPE__EINVERSTAENDNIS_DIGITALER_RUECKKANAL = 1;

	/**
	 * The number of structural features of the '<em>Digitaler Rueckkanal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITALER_RUECKKANAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Digitaler Rueckkanal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITALER_RUECKKANAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 22;

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
	 * The feature id for the '<em><b>Adoptionundpflegekinder Adoption0901</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901 = 3;

	/**
	 * The feature id for the '<em><b>Adoptionundpflegekinder Pflegekinder0902</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902 = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl <em>Einkommen Pflegekind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getEinkommenPflegekindType()
	 * @generated
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Einkommen Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE__EINKOMMEN_AB = 0;

	/**
	 * The feature id for the '<em><b>Hoehe Einkommen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_EINKOMMEN = 1;

	/**
	 * The feature id for the '<em><b>Bezug Kindergeld Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE__BEZUG_KINDERGELD_AB = 2;

	/**
	 * The feature id for the '<em><b>Hoehe Kindergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_KINDERGELD = 3;

	/**
	 * The feature id for the '<em><b>Art Des Einkommens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS = 4;

	/**
	 * The feature id for the '<em><b>Sonstiges Einkommen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE__SONSTIGES_EINKOMMEN = 5;

	/**
	 * The feature id for the '<em><b>Zustaendige Familienkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE__ZUSTAENDIGE_FAMILIENKASSE = 6;

	/**
	 * The number of structural features of the '<em>Einkommen Pflegekind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Einkommen Pflegekind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_PFLEGEKIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl <em>Einkommen Und Wohnen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getEinkommenUndWohnenType()
	 * @generated
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Einkuenfte Aus Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE__EINKUENFTE_AUS_TAETIGKEIT = 0;

	/**
	 * The feature id for the '<em><b>Andere Einkuenfte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE__ANDERE_EINKUENFTE = 1;

	/**
	 * The feature id for the '<em><b>Schuldverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE__SCHULDVERPFLICHTUNGEN = 2;

	/**
	 * The feature id for the '<em><b>Unterhaltsverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE__UNTERHALTSVERPFLICHTUNGEN = 3;

	/**
	 * The feature id for the '<em><b>Monatliche Fixkosten Unterkunft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT = 4;

	/**
	 * The feature id for the '<em><b>Wohnverhaeltnisse Anzahl Zimmer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER = 5;

	/**
	 * The feature id for the '<em><b>Wohnverhaeltnisse Wohnflaeche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE = 6;

	/**
	 * The number of structural features of the '<em>Einkommen Und Wohnen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Einkommen Und Wohnen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINKOMMEN_UND_WOHNEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl <em>Fremdkindadoption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getFremdkindadoptionType()
	 * @generated
	 */
	int FREMDKINDADOPTION_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Beratungscode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__BERATUNGSCODE = 0;

	/**
	 * The feature id for the '<em><b>Allgemeine Angaben</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN = 1;

	/**
	 * The feature id for the '<em><b>Angaben Zur Partnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT = 2;

	/**
	 * The feature id for the '<em><b>Angaben Zu Kindern Der Familie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE = 3;

	/**
	 * The feature id for the '<em><b>Weitere Personen Im Hauhalt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT = 4;

	/**
	 * The feature id for the '<em><b>Auseinandersetzung Thema Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__AUSEINANDERSETZUNG_THEMA_ADOPTION = 5;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__NACHWEISE = 6;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 7;

	/**
	 * The feature id for the '<em><b>Signatur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__SIGNATUR = 8;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL = 9;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 10;

	/**
	 * The feature id for the '<em><b>Aertzliche Behandlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE__AERTZLICHE_BEHANDLUNG = 11;

	/**
	 * The number of structural features of the '<em>Fremdkindadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Fremdkindadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREMDKINDADOPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontakformularTypeImpl <em>Kontakformular Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontakformularTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getKontakformularType()
	 * @generated
	 */
	int KONTAKFORMULAR_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKFORMULAR_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 0;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKFORMULAR_TYPE__PERSONENDATEN = 1;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKFORMULAR_TYPE__ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Anliegen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKFORMULAR_TYPE__ANLIEGEN = 3;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKFORMULAR_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 4;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKFORMULAR_TYPE__DIGITALER_RUECKKANAL = 5;

	/**
	 * The number of structural features of the '<em>Kontakformular Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKFORMULAR_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Kontakformular Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKFORMULAR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontoinformationenTypeImpl <em>Kontoinformationen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontoinformationenTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getKontoinformationenType()
	 * @generated
	 */
	int KONTOINFORMATIONEN_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Beantragung Jugendhilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE = 0;

	/**
	 * The feature id for the '<em><b>Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG = 1;

	/**
	 * The number of structural features of the '<em>Kontoinformationen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTOINFORMATIONEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Kontoinformationen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTOINFORMATIONEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl <em>Moeglichkeiten Und Grenzen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getMoeglichkeitenUndGrenzenType()
	 * @generated
	 */
	int MOEGLICHKEITEN_UND_GRENZEN_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Zutrauen Kind Jeden Alters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_JEDEN_ALTERS = 0;

	/**
	 * The feature id for the '<em><b>Zutrauen Kind Altersangabe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_ALTERSANGABE = 1;

	/**
	 * The feature id for the '<em><b>Zutrauen Kind Beeintraechtigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_BEEINTRAECHTIGUNG = 2;

	/**
	 * The feature id for the '<em><b>Zutrauen Kind Koerperliche Beeintraechtigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG = 3;

	/**
	 * The feature id for the '<em><b>Zutrauen Kind Geistiger Beeintraechtigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG = 4;

	/**
	 * The feature id for the '<em><b>Zutrauen Kind Psychischer Beeintraechtigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG = 5;

	/**
	 * The number of structural features of the '<em>Moeglichkeiten Und Grenzen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOEGLICHKEITEN_UND_GRENZEN_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Moeglichkeiten Und Grenzen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOEGLICHKEITEN_UND_GRENZEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweiseEinreichenTypeImpl <em>Nachweise Einreichen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweiseEinreichenTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getNachweiseEinreichenType()
	 * @generated
	 */
	int NACHWEISE_EINREICHEN_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 0;

	/**
	 * The feature id for the '<em><b>Antragsteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER = 1;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_EINREICHEN_TYPE__NACHWEISE = 2;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 3;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL = 4;

	/**
	 * The number of structural features of the '<em>Nachweise Einreichen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_EINREICHEN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Nachweise Einreichen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_EINREICHEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweisTypeImpl <em>Nachweis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweisTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getNachweisType()
	 * @generated
	 */
	int NACHWEIS_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Dokumentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__DOKUMENTID = BaukastenPackage.NACHWEISDOKUMENT_TYPE__DOKUMENTID;

	/**
	 * The feature id for the '<em><b>Dateiname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__DATEINAME = BaukastenPackage.NACHWEISDOKUMENT_TYPE__DATEINAME;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__MIMETYPE = BaukastenPackage.NACHWEISDOKUMENT_TYPE__MIMETYPE;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__KATEGORIE = BaukastenPackage.NACHWEISDOKUMENT_TYPE__KATEGORIE;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__BESCHREIBUNG = BaukastenPackage.NACHWEISDOKUMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nachweis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE_FEATURE_COUNT = BaukastenPackage.NACHWEISDOKUMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nachweis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE_OPERATION_COUNT = BaukastenPackage.NACHWEISDOKUMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragGezahltVonTypeImpl <em>Pauschalbetrag Gezahlt Von Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragGezahltVonTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPauschalbetragGezahltVonType()
	 * @generated
	 */
	int PAUSCHALBETRAG_GEZAHLT_VON_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Stadt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_GEZAHLT_VON_TYPE__STADT = 0;

	/**
	 * The feature id for the '<em><b>Bezirk Stadtteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_GEZAHLT_VON_TYPE__BEZIRK_STADTTEIL = 1;

	/**
	 * The feature id for the '<em><b>Aktenzeichen Wirtschaftliche Jugendhilfe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_GEZAHLT_VON_TYPE__AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE = 2;

	/**
	 * The number of structural features of the '<em>Pauschalbetrag Gezahlt Von Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_GEZAHLT_VON_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pauschalbetrag Gezahlt Von Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_GEZAHLT_VON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl <em>Pauschalbetrag Vollzeitpflege Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 0;

	/**
	 * The feature id for the '<em><b>Angaben Pflegekind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND = 1;

	/**
	 * The feature id for the '<em><b>Pflegeperson</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__PFLEGEPERSON = 2;

	/**
	 * The feature id for the '<em><b>Kinder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KINDER = 3;

	/**
	 * The feature id for the '<em><b>Kontoinformationen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN = 4;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__NACHWEISE = 5;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 6;

	/**
	 * The feature id for the '<em><b>Signatur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR = 7;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL = 8;

	/**
	 * The number of structural features of the '<em>Pauschalbetrag Vollzeitpflege Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pauschalbetrag Vollzeitpflege Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PersonendatenTypeImpl <em>Personendaten Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PersonendatenTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPersonendatenType()
	 * @generated
	 */
	int PERSONENDATEN_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENDATEN_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kontakt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENDATEN_TYPE__KONTAKT = 1;

	/**
	 * The number of structural features of the '<em>Personendaten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENDATEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Personendaten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENDATEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindBasisTypeImpl <em>Pflegekind Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindBasisTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPflegekindBasisType()
	 * @generated
	 */
	int PFLEGEKIND_BASIS_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_BASIS_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_BASIS_TYPE__GEBURT = 1;

	/**
	 * The number of structural features of the '<em>Pflegekind Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_BASIS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pflegekind Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindTypeImpl <em>Pflegekind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPflegekindType()
	 * @generated
	 */
	int PFLEGEKIND_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_TYPE__PERSONENDATEN = PFLEGEKIND_BASIS_TYPE__PERSONENDATEN;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_TYPE__GEBURT = PFLEGEKIND_BASIS_TYPE__GEBURT;

	/**
	 * The feature id for the '<em><b>In Pflege Seit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_TYPE__IN_PFLEGE_SEIT = PFLEGEKIND_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pflegeform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_TYPE__PFLEGEFORM = PFLEGEKIND_BASIS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pauschalbetrag Gezahlt Von</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON = PFLEGEKIND_BASIS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pflegekind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_TYPE_FEATURE_COUNT = PFLEGEKIND_BASIS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pflegekind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEKIND_TYPE_OPERATION_COUNT = PFLEGEKIND_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl <em>Pflegeperson Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPflegepersonType()
	 * @generated
	 */
	int PFLEGEPERSON_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Beratungscode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__BERATUNGSCODE = 0;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 1;

	/**
	 * The feature id for the '<em><b>Allgemeine Angaben</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN = 2;

	/**
	 * The feature id for the '<em><b>Einkommen Und Wohnen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN = 3;

	/**
	 * The feature id for the '<em><b>Angaben Zu Kindern Der Familie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE = 4;

	/**
	 * The feature id for the '<em><b>Weitere Personen Im Hauhalt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__WEITERE_PERSONEN_IM_HAUHALT = 5;

	/**
	 * The feature id for the '<em><b>Bestimmtes Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__BESTIMMTES_KIND = 6;

	/**
	 * The feature id for the '<em><b>Moeglichkeiten Und Grenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN = 7;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__NACHWEISE = 8;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 9;

	/**
	 * The feature id for the '<em><b>Signatur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__SIGNATUR = 10;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL = 11;

	/**
	 * The number of structural features of the '<em>Pflegeperson Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Pflegeperson Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLEGEPERSON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SignaturTypeImpl <em>Signatur Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SignaturTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getSignaturType()
	 * @generated
	 */
	int SIGNATUR_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Elektronisch Signieren</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATUR_TYPE__ELEKTRONISCH_SIGNIEREN = 0;

	/**
	 * The feature id for the '<em><b>Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATUR_TYPE__ANLAGE = 1;

	/**
	 * The number of structural features of the '<em>Signatur Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATUR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Signatur Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATUR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SonstigeAntraegeSendenTypeImpl <em>Sonstige Antraege Senden Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SonstigeAntraegeSendenTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getSonstigeAntraegeSendenType()
	 * @generated
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 0;

	/**
	 * The feature id for the '<em><b>Allgemeine Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE__ALLGEMEINE_ANGABEN = 1;

	/**
	 * The feature id for the '<em><b>Antragdetails</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE__ANTRAGDETAILS = 2;

	/**
	 * The feature id for the '<em><b>Pflegekinder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE__PFLEGEKINDER = 3;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE__NACHWEISE = 4;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 5;

	/**
	 * The feature id for the '<em><b>Signatur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE__SIGNATUR = 6;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE__DIGITALER_RUECKKANAL = 7;

	/**
	 * The number of structural features of the '<em>Sonstige Antraege Senden Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Sonstige Antraege Senden Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_ANTRAEGE_SENDEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.StiefkindadoptionTypeImpl <em>Stiefkindadoption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.StiefkindadoptionTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getStiefkindadoptionType()
	 * @generated
	 */
	int STIEFKINDADOPTION_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Beratungscode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__BERATUNGSCODE = 0;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 1;

	/**
	 * The feature id for the '<em><b>Angaben Des Zu Adoptierenden Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES = 2;

	/**
	 * The feature id for the '<em><b>Allgemeine Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN = 3;

	/**
	 * The feature id for the '<em><b>Verbleibender Sorgeberechtigter Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL = 4;

	/**
	 * The feature id for the '<em><b>Annehmender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL = 5;

	/**
	 * The feature id for the '<em><b>Angaben Zur Partnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT = 6;

	/**
	 * The feature id for the '<em><b>Angaben Zu Kindern Der Familie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE = 7;

	/**
	 * The feature id for the '<em><b>Weitere Personen Im Hauhalt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT = 8;

	/**
	 * The feature id for the '<em><b>Abgebender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__ABGEBENDER_ELTERNTEIL = 9;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__NACHWEISE = 10;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 11;

	/**
	 * The feature id for the '<em><b>Signatur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__SIGNATUR = 12;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE__DIGITALER_RUECKKANAL = 13;

	/**
	 * The number of structural features of the '<em>Stiefkindadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Stiefkindadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIEFKINDADOPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerbleibenderSorgeberechtigterElternteilTypeImpl <em>Verbleibender Sorgeberechtigter Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerbleibenderSorgeberechtigterElternteilTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT = 1;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__GEBURT = 2;

	/**
	 * The feature id for the '<em><b>Einkuenfte Aus Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__EINKUENFTE_AUS_TAETIGKEIT = 3;

	/**
	 * The feature id for the '<em><b>Andere Einkuenfte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__ANDERE_EINKUENFTE = 4;

	/**
	 * The feature id for the '<em><b>Schuldverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__SCHULDVERPFLICHTUNGEN = 5;

	/**
	 * The feature id for the '<em><b>Unterhaltsverpflichtungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__UNTERHALTSVERPFLICHTUNGEN = 6;

	/**
	 * The feature id for the '<em><b>Monatliche Fixkosten Unterkunft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT = 7;

	/**
	 * The feature id for the '<em><b>Aufenthaltsstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS = 8;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__GESCHLECHT = 9;

	/**
	 * The number of structural features of the '<em>Verbleibender Sorgeberechtigter Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Verbleibender Sorgeberechtigter Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl <em>Verwandtenadoption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getVerwandtenadoptionType()
	 * @generated
	 */
	int VERWANDTENADOPTION_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Beratungscode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__BERATUNGSCODE = 0;

	/**
	 * The feature id for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = 1;

	/**
	 * The feature id for the '<em><b>Angaben Des Zu Adoptierenden Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES = 2;

	/**
	 * The feature id for the '<em><b>Allgemeine Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN = 3;

	/**
	 * The feature id for the '<em><b>Annehmender Elternteil</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL = 4;

	/**
	 * The feature id for the '<em><b>Angaben Zur Partnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT = 5;

	/**
	 * The feature id for the '<em><b>Angaben Zu Kindern Der Familie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE = 6;

	/**
	 * The feature id for the '<em><b>Weitere Personen Im Hauhalt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT = 7;

	/**
	 * The feature id for the '<em><b>Abgebender Elternteil</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__ABGEBENDER_ELTERNTEIL = 8;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__NACHWEISE = 9;

	/**
	 * The feature id for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = 10;

	/**
	 * The feature id for the '<em><b>Signatur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__SIGNATUR = 11;

	/**
	 * The feature id for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL = 12;

	/**
	 * The number of structural features of the '<em>Verwandtenadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Verwandtenadoption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWANDTENADOPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.WeiterePersonenImHauhaltTypeImpl <em>Weitere Personen Im Hauhalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.WeiterePersonenImHauhaltTypeImpl
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getWeiterePersonenImHauhaltType()
	 * @generated
	 */
	int WEITERE_PERSONEN_IM_HAUHALT_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN = 0;

	/**
	 * The feature id for the '<em><b>Beziehung Zur Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_PERSONEN_IM_HAUHALT_TYPE__BEZIEHUNG_ZUR_PERSON = 1;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT = 2;

	/**
	 * The number of structural features of the '<em>Weitere Personen Im Hauhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_PERSONEN_IM_HAUHALT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Weitere Personen Im Hauhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_PERSONEN_IM_HAUHALT_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType <em>Abgebender Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abgebender Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType
	 * @generated
	 */
	EClass getAbgebenderElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getElternteil <em>Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elternteil</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getElternteil()
	 * @see #getAbgebenderElternteilType()
	 * @generated
	 */
	EReference getAbgebenderElternteilType_Elternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getPersonendaten()
	 * @see #getAbgebenderElternteilType()
	 * @generated
	 */
	EReference getAbgebenderElternteilType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getGeburt()
	 * @see #getAbgebenderElternteilType()
	 * @generated
	 */
	EReference getAbgebenderElternteilType_Geburt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getStaatsangehoerigkeit()
	 * @see #getAbgebenderElternteilType()
	 * @generated
	 */
	EReference getAbgebenderElternteilType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getEinstellungAdoptionsabsicht <em>Einstellung Adoptionsabsicht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einstellung Adoptionsabsicht</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getEinstellungAdoptionsabsicht()
	 * @see #getAbgebenderElternteilType()
	 * @generated
	 */
	EAttribute getAbgebenderElternteilType_EinstellungAdoptionsabsicht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufenthaltsstatus</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getAufenthaltsstatus()
	 * @see #getAbgebenderElternteilType()
	 * @generated
	 */
	EReference getAbgebenderElternteilType_Aufenthaltsstatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getElternteilVerstorben <em>Elternteil Verstorben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elternteil Verstorben</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getElternteilVerstorben()
	 * @see #getAbgebenderElternteilType()
	 * @generated
	 */
	EReference getAbgebenderElternteilType_ElternteilVerstorben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type <em>Adoptionundpflegekinder Adoption0901 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adoptionundpflegekinder Adoption0901 Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type
	 * @generated
	 */
	EClass getAdoptionundpflegekinderAdoption0901Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getKontaktformular <em>Kontaktformular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kontaktformular</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getKontaktformular()
	 * @see #getAdoptionundpflegekinderAdoption0901Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderAdoption0901Type_Kontaktformular();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getNachweiseEinreichen <em>Nachweise Einreichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweise Einreichen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getNachweiseEinreichen()
	 * @see #getAdoptionundpflegekinderAdoption0901Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderAdoption0901Type_NachweiseEinreichen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getStiefkindadoption <em>Stiefkindadoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stiefkindadoption</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getStiefkindadoption()
	 * @see #getAdoptionundpflegekinderAdoption0901Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderAdoption0901Type_Stiefkindadoption();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getVerwandtenadoption <em>Verwandtenadoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verwandtenadoption</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getVerwandtenadoption()
	 * @see #getAdoptionundpflegekinderAdoption0901Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderAdoption0901Type_Verwandtenadoption();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getFremdkindadoption <em>Fremdkindadoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fremdkindadoption</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getFremdkindadoption()
	 * @see #getAdoptionundpflegekinderAdoption0901Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderAdoption0901Type_Fremdkindadoption();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type <em>Adoptionundpflegekinder Pflegekinder0902 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adoptionundpflegekinder Pflegekinder0902 Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type
	 * @generated
	 */
	EClass getAdoptionundpflegekinderPflegekinder0902Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getKontaktformular <em>Kontaktformular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kontaktformular</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getKontaktformular()
	 * @see #getAdoptionundpflegekinderPflegekinder0902Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderPflegekinder0902Type_Kontaktformular();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getNachweiseEinreichen <em>Nachweise Einreichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweise Einreichen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getNachweiseEinreichen()
	 * @see #getAdoptionundpflegekinderPflegekinder0902Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderPflegekinder0902Type_NachweiseEinreichen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getPflegeperson <em>Pflegeperson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pflegeperson</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getPflegeperson()
	 * @see #getAdoptionundpflegekinderPflegekinder0902Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderPflegekinder0902Type_Pflegeperson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getSonstigeAntraegeSenden <em>Sonstige Antraege Senden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sonstige Antraege Senden</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getSonstigeAntraegeSenden()
	 * @see #getAdoptionundpflegekinderPflegekinder0902Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderPflegekinder0902Type_SonstigeAntraegeSenden();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getBeitragsuebernahmeUnfallversicherung <em>Beitragsuebernahme Unfallversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beitragsuebernahme Unfallversicherung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getBeitragsuebernahmeUnfallversicherung()
	 * @see #getAdoptionundpflegekinderPflegekinder0902Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderPflegekinder0902Type_BeitragsuebernahmeUnfallversicherung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getAlterssicherungPflegeperson <em>Alterssicherung Pflegeperson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alterssicherung Pflegeperson</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getAlterssicherungPflegeperson()
	 * @see #getAdoptionundpflegekinderPflegekinder0902Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderPflegekinder0902Type_AlterssicherungPflegeperson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getPauschalbetragVollzeitpflege <em>Pauschalbetrag Vollzeitpflege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pauschalbetrag Vollzeitpflege</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getPauschalbetragVollzeitpflege()
	 * @see #getAdoptionundpflegekinderPflegekinder0902Type()
	 * @generated
	 */
	EReference getAdoptionundpflegekinderPflegekinder0902Type_PauschalbetragVollzeitpflege();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType <em>Allgemeine Angaben Fremdkindadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeine Angaben Fremdkindadoption Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType
	 * @generated
	 */
	EClass getAllgemeineAngabenFremdkindadoptionType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getPersonendaten()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EReference getAllgemeineAngabenFremdkindadoptionType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getGeburt()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EReference getAllgemeineAngabenFremdkindadoptionType_Geburt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getStaatsangehoerigkeit()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EReference getAllgemeineAngabenFremdkindadoptionType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getReligionszugehoerigkeit <em>Religionszugehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Religionszugehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getReligionszugehoerigkeit()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_Religionszugehoerigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getAktuelleBeruflicheTaetigkeit <em>Aktuelle Berufliche Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktuelle Berufliche Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getAktuelleBeruflicheTaetigkeit()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_AktuelleBeruflicheTaetigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkuenfte Aus Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getEinkuenfteAusTaetigkeit()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_EinkuenfteAusTaetigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Andere Einkuenfte</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getAndereEinkuenfte()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_AndereEinkuenfte();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schuldverpflichtungen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getSchuldverpflichtungen()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_Schuldverpflichtungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unterhaltsverpflichtungen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getUnterhaltsverpflichtungen()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_Unterhaltsverpflichtungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monatliche Fixkosten Unterkunft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getMonatlicheFixkostenUnterkunft()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_MonatlicheFixkostenUnterkunft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufenthaltsstatus</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getAufenthaltsstatus()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EReference getAllgemeineAngabenFremdkindadoptionType_Aufenthaltsstatus();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getAktuellerFamilienstand <em>Aktueller Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktueller Familienstand</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getAktuellerFamilienstand()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_AktuellerFamilienstand();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getGeschlecht()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EReference getAllgemeineAngabenFremdkindadoptionType_Geschlecht();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#isBereitsVerheiratet <em>Bereits Verheiratet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bereits Verheiratet</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#isBereitsVerheiratet()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_BereitsVerheiratet();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getUmfangVerheiratet <em>Umfang Verheiratet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Umfang Verheiratet</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType#getUmfangVerheiratet()
	 * @see #getAllgemeineAngabenFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenFremdkindadoptionType_UmfangVerheiratet();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType <em>Allgemeine Angaben Pflege Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeine Angaben Pflege Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType
	 * @generated
	 */
	EClass getAllgemeineAngabenPflegeType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType#getWochenstunden <em>Wochenstunden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wochenstunden</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType#getWochenstunden()
	 * @see #getAllgemeineAngabenPflegeType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenPflegeType_Wochenstunden();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType#getAnschrift()
	 * @see #getAllgemeineAngabenPflegeType()
	 * @generated
	 */
	EReference getAllgemeineAngabenPflegeType_Anschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType#getGeschlecht()
	 * @see #getAllgemeineAngabenPflegeType()
	 * @generated
	 */
	EReference getAllgemeineAngabenPflegeType_Geschlecht();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType <em>Allgemeine Angaben Stiefkindadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeine Angaben Stiefkindadoption Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType
	 * @generated
	 */
	EClass getAllgemeineAngabenStiefkindadoptionType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktZuLeiblicherFamilie <em>Kontakt Zu Leiblicher Familie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kontakt Zu Leiblicher Familie</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktZuLeiblicherFamilie()
	 * @see #getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenStiefkindadoptionType_KontaktZuLeiblicherFamilie();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getErlaeuterungKontaktZuLeiblicherFamilie <em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getErlaeuterungKontaktZuLeiblicherFamilie()
	 * @see #getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenStiefkindadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getPersonensorgerecht <em>Personensorgerecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personensorgerecht</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getPersonensorgerecht()
	 * @see #getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	EReference getAllgemeineAngabenStiefkindadoptionType_Personensorgerecht();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getPersonensorgerechtBeiSonstige <em>Personensorgerecht Bei Sonstige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personensorgerecht Bei Sonstige</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getPersonensorgerechtBeiSonstige()
	 * @see #getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenStiefkindadoptionType_PersonensorgerechtBeiSonstige();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGeschpraechUeberAdoption <em>Geschpraech Ueber Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geschpraech Ueber Adoption</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGeschpraechUeberAdoption()
	 * @see #getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenStiefkindadoptionType_GeschpraechUeberAdoption();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getReaktionKindGespraech <em>Reaktion Kind Gespraech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reaktion Kind Gespraech</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getReaktionKindGespraech()
	 * @see #getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenStiefkindadoptionType_ReaktionKindGespraech();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktJugendamt <em>Kontakt Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kontakt Jugendamt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktJugendamt()
	 * @see #getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenStiefkindadoptionType_KontaktJugendamt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getArtKontaktJugendamt <em>Art Kontakt Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Kontakt Jugendamt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getArtKontaktJugendamt()
	 * @see #getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenStiefkindadoptionType_ArtKontaktJugendamt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGerichtlicheRegelung <em>Gerichtliche Regelung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gerichtliche Regelung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGerichtlicheRegelung()
	 * @see #getAllgemeineAngabenStiefkindadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenStiefkindadoptionType_GerichtlicheRegelung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType <em>Allgemeine Angaben Verwandtenadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeine Angaben Verwandtenadoption Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType
	 * @generated
	 */
	EClass getAllgemeineAngabenVerwandtenadoptionType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#isHerkunftBekannt <em>Herkunft Bekannt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Herkunft Bekannt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#isHerkunftBekannt()
	 * @see #getAllgemeineAngabenVerwandtenadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenVerwandtenadoptionType_HerkunftBekannt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#isKontaktZuLeiblicherFamilie <em>Kontakt Zu Leiblicher Familie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kontakt Zu Leiblicher Familie</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#isKontaktZuLeiblicherFamilie()
	 * @see #getAllgemeineAngabenVerwandtenadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenVerwandtenadoptionType_KontaktZuLeiblicherFamilie();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#getErlaeuterungKontaktZuLeiblicherFamilie <em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#getErlaeuterungKontaktZuLeiblicherFamilie()
	 * @see #getAllgemeineAngabenVerwandtenadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenVerwandtenadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#getPersonensorgerecht <em>Personensorgerecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personensorgerecht</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#getPersonensorgerecht()
	 * @see #getAllgemeineAngabenVerwandtenadoptionType()
	 * @generated
	 */
	EReference getAllgemeineAngabenVerwandtenadoptionType_Personensorgerecht();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#getPersonensorgerechtBeiSonstige <em>Personensorgerecht Bei Sonstige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personensorgerecht Bei Sonstige</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#getPersonensorgerechtBeiSonstige()
	 * @see #getAllgemeineAngabenVerwandtenadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenVerwandtenadoptionType_PersonensorgerechtBeiSonstige();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#isGeschpraechUeberAdoption <em>Geschpraech Ueber Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geschpraech Ueber Adoption</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#isGeschpraechUeberAdoption()
	 * @see #getAllgemeineAngabenVerwandtenadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenVerwandtenadoptionType_GeschpraechUeberAdoption();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#getReaktionKindGespraech <em>Reaktion Kind Gespraech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reaktion Kind Gespraech</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType#getReaktionKindGespraech()
	 * @see #getAllgemeineAngabenVerwandtenadoptionType()
	 * @generated
	 */
	EAttribute getAllgemeineAngabenVerwandtenadoptionType_ReaktionKindGespraech();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType <em>Alterssicherung Pflegeperson Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alterssicherung Pflegeperson Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType
	 * @generated
	 */
	EClass getAlterssicherungPflegepersonType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getDatenschutzUndEinwilligung()
	 * @see #getAlterssicherungPflegepersonType()
	 * @generated
	 */
	EReference getAlterssicherungPflegepersonType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allgemeine Angaben</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getAllgemeineAngaben()
	 * @see #getAlterssicherungPflegepersonType()
	 * @generated
	 */
	EReference getAlterssicherungPflegepersonType_AllgemeineAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getAntragdetailsAlterssicherung <em>Antragdetails Alterssicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragdetails Alterssicherung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getAntragdetailsAlterssicherung()
	 * @see #getAlterssicherungPflegepersonType()
	 * @generated
	 */
	EReference getAlterssicherungPflegepersonType_AntragdetailsAlterssicherung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getPflegekinder <em>Pflegekinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pflegekinder</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getPflegekinder()
	 * @see #getAlterssicherungPflegepersonType()
	 * @generated
	 */
	EReference getAlterssicherungPflegepersonType_Pflegekinder();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getNachweise()
	 * @see #getAlterssicherungPflegepersonType()
	 * @generated
	 */
	EReference getAlterssicherungPflegepersonType_Nachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getDatenschutzDerFachbehoerde()
	 * @see #getAlterssicherungPflegepersonType()
	 * @generated
	 */
	EReference getAlterssicherungPflegepersonType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getSignatur <em>Signatur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatur</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getSignatur()
	 * @see #getAlterssicherungPflegepersonType()
	 * @generated
	 */
	EReference getAlterssicherungPflegepersonType_Signatur();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType#getDigitalerRueckkanal()
	 * @see #getAlterssicherungPflegepersonType()
	 * @generated
	 */
	EReference getAlterssicherungPflegepersonType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType <em>Angaben Des Zu Adoptierenden Kindes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Des Zu Adoptierenden Kindes Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType
	 * @generated
	 */
	EClass getAngabenDesZuAdoptierendenKindesType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getPersonendaten()
	 * @see #getAngabenDesZuAdoptierendenKindesType()
	 * @generated
	 */
	EReference getAngabenDesZuAdoptierendenKindesType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getGeburt()
	 * @see #getAngabenDesZuAdoptierendenKindesType()
	 * @generated
	 */
	EReference getAngabenDesZuAdoptierendenKindesType_Geburt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getStaatsangehoerigkeit()
	 * @see #getAngabenDesZuAdoptierendenKindesType()
	 * @generated
	 */
	EReference getAngabenDesZuAdoptierendenKindesType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getReligionszugehoerigkeit <em>Religionszugehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Religionszugehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getReligionszugehoerigkeit()
	 * @see #getAngabenDesZuAdoptierendenKindesType()
	 * @generated
	 */
	EAttribute getAngabenDesZuAdoptierendenKindesType_Religionszugehoerigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#isAusAuslandGeholt <em>Aus Ausland Geholt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aus Ausland Geholt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#isAusAuslandGeholt()
	 * @see #getAngabenDesZuAdoptierendenKindesType()
	 * @generated
	 */
	EAttribute getAngabenDesZuAdoptierendenKindesType_AusAuslandGeholt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getAnschrift()
	 * @see #getAngabenDesZuAdoptierendenKindesType()
	 * @generated
	 */
	EReference getAngabenDesZuAdoptierendenKindesType_Anschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufenthaltsstatus</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getAufenthaltsstatus()
	 * @see #getAngabenDesZuAdoptierendenKindesType()
	 * @generated
	 */
	EReference getAngabenDesZuAdoptierendenKindesType_Aufenthaltsstatus();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType <em>Angaben Pflegekind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Pflegekind Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType
	 * @generated
	 */
	EClass getAngabenPflegekindType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getPersonendaten()
	 * @see #getAngabenPflegekindType()
	 * @generated
	 */
	EReference getAngabenPflegekindType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getGeburt()
	 * @see #getAngabenPflegekindType()
	 * @generated
	 */
	EReference getAngabenPflegekindType_Geburt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getAnschrift()
	 * @see #getAngabenPflegekindType()
	 * @generated
	 */
	EReference getAngabenPflegekindType_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getBeginnPflegeverhaeltnis <em>Beginn Pflegeverhaeltnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginn Pflegeverhaeltnis</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getBeginnPflegeverhaeltnis()
	 * @see #getAngabenPflegekindType()
	 * @generated
	 */
	EAttribute getAngabenPflegekindType_BeginnPflegeverhaeltnis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKrankenversichert <em>Krankenversichert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Krankenversichert</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKrankenversichert()
	 * @see #getAngabenPflegekindType()
	 * @generated
	 */
	EAttribute getAngabenPflegekindType_Krankenversichert();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKrankenversichertUeberPflegeperson <em>Krankenversichert Ueber Pflegeperson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Krankenversichert Ueber Pflegeperson</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKrankenversichertUeberPflegeperson()
	 * @see #getAngabenPflegekindType()
	 * @generated
	 */
	EAttribute getAngabenPflegekindType_KrankenversichertUeberPflegeperson();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getSchuleAusbildungsstaette <em>Schule Ausbildungsstaette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schule Ausbildungsstaette</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getSchuleAusbildungsstaette()
	 * @see #getAngabenPflegekindType()
	 * @generated
	 */
	EAttribute getAngabenPflegekindType_SchuleAusbildungsstaette();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKlassenstufeAusbildungsjahr <em>Klassenstufe Ausbildungsjahr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Klassenstufe Ausbildungsjahr</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getKlassenstufeAusbildungsjahr()
	 * @see #getAngabenPflegekindType()
	 * @generated
	 */
	EAttribute getAngabenPflegekindType_KlassenstufeAusbildungsjahr();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getEinkommenPflegekind <em>Einkommen Pflegekind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einkommen Pflegekind</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType#getEinkommenPflegekind()
	 * @see #getAngabenPflegekindType()
	 * @generated
	 */
	EReference getAngabenPflegekindType_EinkommenPflegekind();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType <em>Angaben Zu Kindern Der Familie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zu Kindern Der Familie Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType
	 * @generated
	 */
	EClass getAngabenZuKindernDerFamilieType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getPersonendaten()
	 * @see #getAngabenZuKindernDerFamilieType()
	 * @generated
	 */
	EReference getAngabenZuKindernDerFamilieType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getGeburt()
	 * @see #getAngabenZuKindernDerFamilieType()
	 * @generated
	 */
	EReference getAngabenZuKindernDerFamilieType_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getVerhaeltnisKind <em>Verhaeltnis Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verhaeltnis Kind</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getVerhaeltnisKind()
	 * @see #getAngabenZuKindernDerFamilieType()
	 * @generated
	 */
	EAttribute getAngabenZuKindernDerFamilieType_VerhaeltnisKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getElternteilDesKindes <em>Elternteil Des Kindes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elternteil Des Kindes</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getElternteilDesKindes()
	 * @see #getAngabenZuKindernDerFamilieType()
	 * @generated
	 */
	EAttribute getAngabenZuKindernDerFamilieType_ElternteilDesKindes();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#isKindWohnhaftHaushalt <em>Kind Wohnhaft Haushalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Wohnhaft Haushalt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#isKindWohnhaftHaushalt()
	 * @see #getAngabenZuKindernDerFamilieType()
	 * @generated
	 */
	EAttribute getAngabenZuKindernDerFamilieType_KindWohnhaftHaushalt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getKindWohnhaftAlterntive <em>Kind Wohnhaft Alterntive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Wohnhaft Alterntive</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getKindWohnhaftAlterntive()
	 * @see #getAngabenZuKindernDerFamilieType()
	 * @generated
	 */
	EAttribute getAngabenZuKindernDerFamilieType_KindWohnhaftAlterntive();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getKindVerstorben <em>Kind Verstorben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kind Verstorben</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType#getKindVerstorben()
	 * @see #getAngabenZuKindernDerFamilieType()
	 * @generated
	 */
	EReference getAngabenZuKindernDerFamilieType_KindVerstorben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType <em>Angaben Zur Partnerschaft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zur Partnerschaft Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType
	 * @generated
	 */
	EClass getAngabenZurPartnerschaftType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerPartnerschaft <em>Dauer Partnerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dauer Partnerschaft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerPartnerschaft()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_DauerPartnerschaft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerGemeinsamerHaushalt <em>Dauer Gemeinsamer Haushalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dauer Gemeinsamer Haushalt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerGemeinsamerHaushalt()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_DauerGemeinsamerHaushalt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isVerheiratetOderLebenspartnerschaft <em>Verheiratet Oder Lebenspartnerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verheiratet Oder Lebenspartnerschaft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isVerheiratetOderLebenspartnerschaft()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_VerheiratetOderLebenspartnerschaft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerVerheiratetOderLebenspartnerschaft <em>Dauer Verheiratet Oder Lebenspartnerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dauer Verheiratet Oder Lebenspartnerschaft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getDauerVerheiratetOderLebenspartnerschaft()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_DauerVerheiratetOderLebenspartnerschaft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGespraechUeberAdoption <em>Gespraech Ueber Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gespraech Ueber Adoption</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGespraechUeberAdoption()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_GespraechUeberAdoption();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getMeinungFamilieUndFreunde <em>Meinung Familie Und Freunde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meinung Familie Und Freunde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getMeinungFamilieUndFreunde()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_MeinungFamilieUndFreunde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getAnschrift()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EReference getAngabenZurPartnerschaftType_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnverhaeltnisse Anzahl Zimmer</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseAnzahlZimmer()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_WohnverhaeltnisseAnzahlZimmer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseWohnflaeche <em>Wohnverhaeltnisse Wohnflaeche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnverhaeltnisse Wohnflaeche</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#getWohnverhaeltnisseWohnflaeche()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_WohnverhaeltnisseWohnflaeche();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isMieteOderEigentum <em>Miete Oder Eigentum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miete Oder Eigentum</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isMieteOderEigentum()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_MieteOderEigentum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGarten <em>Garten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Garten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isGarten()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_Garten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isKinderzimmer <em>Kinderzimmer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kinderzimmer</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isKinderzimmer()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_Kinderzimmer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isHaustiere <em>Haustiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Haustiere</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType#isHaustiere()
	 * @see #getAngabenZurPartnerschaftType()
	 * @generated
	 */
	EAttribute getAngabenZurPartnerschaftType_Haustiere();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType <em>Anliegen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anliegen Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType
	 * @generated
	 */
	EClass getAnliegenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType#getWunschBeratung <em>Wunsch Beratung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wunsch Beratung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType#getWunschBeratung()
	 * @see #getAnliegenType()
	 * @generated
	 */
	EReference getAnliegenType_WunschBeratung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType#getKommentar <em>Kommentar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kommentar</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType#getKommentar()
	 * @see #getAnliegenType()
	 * @generated
	 */
	EAttribute getAnliegenType_Kommentar();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType <em>Annehmender Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annehmender Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType
	 * @generated
	 */
	EClass getAnnehmenderElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getPersonendaten()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EReference getAnnehmenderElternteilType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getStaatsangehoerigkeit()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EReference getAnnehmenderElternteilType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getGeburt()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EReference getAnnehmenderElternteilType_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getAktuelleBeruflicheTaetigkeit <em>Aktuelle Berufliche Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktuelle Berufliche Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getAktuelleBeruflicheTaetigkeit()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EAttribute getAnnehmenderElternteilType_AktuelleBeruflicheTaetigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getGruendeMotiveFuerAdoption <em>Gruende Motive Fuer Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gruende Motive Fuer Adoption</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getGruendeMotiveFuerAdoption()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EAttribute getAnnehmenderElternteilType_GruendeMotiveFuerAdoption();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getVeraenderungDurchAdoption <em>Veraenderung Durch Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Veraenderung Durch Adoption</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getVeraenderungDurchAdoption()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EAttribute getAnnehmenderElternteilType_VeraenderungDurchAdoption();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkuenfte Aus Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getEinkuenfteAusTaetigkeit()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EAttribute getAnnehmenderElternteilType_EinkuenfteAusTaetigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Andere Einkuenfte</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getAndereEinkuenfte()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EAttribute getAnnehmenderElternteilType_AndereEinkuenfte();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schuldverpflichtungen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getSchuldverpflichtungen()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EAttribute getAnnehmenderElternteilType_Schuldverpflichtungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unterhaltsverpflichtungen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getUnterhaltsverpflichtungen()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EAttribute getAnnehmenderElternteilType_Unterhaltsverpflichtungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monatliche Fixkosten Unterkunft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getMonatlicheFixkostenUnterkunft()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EAttribute getAnnehmenderElternteilType_MonatlicheFixkostenUnterkunft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getReligionszugehoerigkeit <em>Religionszugehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Religionszugehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getReligionszugehoerigkeit()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EAttribute getAnnehmenderElternteilType_Religionszugehoerigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufenthaltsstatus</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getAufenthaltsstatus()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EReference getAnnehmenderElternteilType_Aufenthaltsstatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType#getGeschlecht()
	 * @see #getAnnehmenderElternteilType()
	 * @generated
	 */
	EReference getAnnehmenderElternteilType_Geschlecht();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType <em>Antragdetails Alterssicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragdetails Alterssicherung Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType
	 * @generated
	 */
	EClass getAntragdetailsAlterssicherungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getBeantragungZuschussAlterssicherung <em>Beantragung Zuschuss Alterssicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beantragung Zuschuss Alterssicherung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getBeantragungZuschussAlterssicherung()
	 * @see #getAntragdetailsAlterssicherungType()
	 * @generated
	 */
	EAttribute getAntragdetailsAlterssicherungType_BeantragungZuschussAlterssicherung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getZuschuesse <em>Zuschuesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zuschuesse</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getZuschuesse()
	 * @see #getAntragdetailsAlterssicherungType()
	 * @generated
	 */
	EReference getAntragdetailsAlterssicherungType_Zuschuesse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hoehe Zuschuesse</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getHoeheZuschuesse()
	 * @see #getAntragdetailsAlterssicherungType()
	 * @generated
	 */
	EAttribute getAntragdetailsAlterssicherungType_HoeheZuschuesse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getVonAndererStelle <em>Von Anderer Stelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Von Anderer Stelle</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getVonAndererStelle()
	 * @see #getAntragdetailsAlterssicherungType()
	 * @generated
	 */
	EAttribute getAntragdetailsAlterssicherungType_VonAndererStelle();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isArtHoeheAbsicherung <em>Art Hoehe Absicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Hoehe Absicherung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isArtHoeheAbsicherung()
	 * @see #getAntragdetailsAlterssicherungType()
	 * @generated
	 */
	EAttribute getAntragdetailsAlterssicherungType_ArtHoeheAbsicherung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isAlleinigePflegeperson <em>Alleinige Pflegeperson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alleinige Pflegeperson</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isAlleinigePflegeperson()
	 * @see #getAntragdetailsAlterssicherungType()
	 * @generated
	 */
	EAttribute getAntragdetailsAlterssicherungType_AlleinigePflegeperson();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isHauptpflegeperson <em>Hauptpflegeperson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hauptpflegeperson</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isHauptpflegeperson()
	 * @see #getAntragdetailsAlterssicherungType()
	 * @generated
	 */
	EAttribute getAntragdetailsAlterssicherungType_Hauptpflegeperson();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType <em>Antragdetails Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragdetails Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType
	 * @generated
	 */
	EClass getAntragdetailsType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType#getAntrag <em>Antrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antrag</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType#getAntrag()
	 * @see #getAntragdetailsType()
	 * @generated
	 */
	EReference getAntragdetailsType_Antrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType#getInformation()
	 * @see #getAntragdetailsType()
	 * @generated
	 */
	EAttribute getAntragdetailsType_Information();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType <em>Antragdetails Unfallversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragdetails Unfallversicherung Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType
	 * @generated
	 */
	EClass getAntragdetailsUnfallversicherungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getBeantragungKostenUnfallversicherung <em>Beantragung Kosten Unfallversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beantragung Kosten Unfallversicherung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getBeantragungKostenUnfallversicherung()
	 * @see #getAntragdetailsUnfallversicherungType()
	 * @generated
	 */
	EAttribute getAntragdetailsUnfallversicherungType_BeantragungKostenUnfallversicherung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getZuschuesse <em>Zuschuesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zuschuesse</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getZuschuesse()
	 * @see #getAntragdetailsUnfallversicherungType()
	 * @generated
	 */
	EReference getAntragdetailsUnfallversicherungType_Zuschuesse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hoehe Zuschuesse</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getHoeheZuschuesse()
	 * @see #getAntragdetailsUnfallversicherungType()
	 * @generated
	 */
	EAttribute getAntragdetailsUnfallversicherungType_HoeheZuschuesse();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType <em>Antragsteller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragsteller Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType
	 * @generated
	 */
	EClass getAntragstellerType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getPersonendaten()
	 * @see #getAntragstellerType()
	 * @generated
	 */
	EReference getAntragstellerType_Personendaten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getFallnummer <em>Fallnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fallnummer</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getFallnummer()
	 * @see #getAntragstellerType()
	 * @generated
	 */
	EAttribute getAntragstellerType_Fallnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getAntragsdatum <em>Antragsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antragsdatum</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getAntragsdatum()
	 * @see #getAntragstellerType()
	 * @generated
	 */
	EAttribute getAntragstellerType_Antragsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragstellerType#getGeburt()
	 * @see #getAntragstellerType()
	 * @generated
	 */
	EReference getAntragstellerType_Geburt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType <em>Beitragsuebernahme Unfallversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beitragsuebernahme Unfallversicherung Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType
	 * @generated
	 */
	EClass getBeitragsuebernahmeUnfallversicherungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getDatenschutzUndEinwilligung()
	 * @see #getBeitragsuebernahmeUnfallversicherungType()
	 * @generated
	 */
	EReference getBeitragsuebernahmeUnfallversicherungType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allgemeine Angaben</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getAllgemeineAngaben()
	 * @see #getBeitragsuebernahmeUnfallversicherungType()
	 * @generated
	 */
	EReference getBeitragsuebernahmeUnfallversicherungType_AllgemeineAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getAntragdetailsUnfallversicherung <em>Antragdetails Unfallversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragdetails Unfallversicherung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getAntragdetailsUnfallversicherung()
	 * @see #getBeitragsuebernahmeUnfallversicherungType()
	 * @generated
	 */
	EReference getBeitragsuebernahmeUnfallversicherungType_AntragdetailsUnfallversicherung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getPflegekinder <em>Pflegekinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pflegekinder</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getPflegekinder()
	 * @see #getBeitragsuebernahmeUnfallversicherungType()
	 * @generated
	 */
	EReference getBeitragsuebernahmeUnfallversicherungType_Pflegekinder();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getNachweise()
	 * @see #getBeitragsuebernahmeUnfallversicherungType()
	 * @generated
	 */
	EReference getBeitragsuebernahmeUnfallversicherungType_Nachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getDatenschutzDerFachbehoerde()
	 * @see #getBeitragsuebernahmeUnfallversicherungType()
	 * @generated
	 */
	EReference getBeitragsuebernahmeUnfallversicherungType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getSignatur <em>Signatur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatur</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getSignatur()
	 * @see #getBeitragsuebernahmeUnfallversicherungType()
	 * @generated
	 */
	EReference getBeitragsuebernahmeUnfallversicherungType_Signatur();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType#getDigitalerRueckkanal()
	 * @see #getBeitragsuebernahmeUnfallversicherungType()
	 * @generated
	 */
	EReference getBeitragsuebernahmeUnfallversicherungType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType <em>Bestimmtes Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bestimmtes Kind Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType
	 * @generated
	 */
	EClass getBestimmtesKindType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType#getPersonendaten()
	 * @see #getBestimmtesKindType()
	 * @generated
	 */
	EReference getBestimmtesKindType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType#getGeburt()
	 * @see #getBestimmtesKindType()
	 * @generated
	 */
	EReference getBestimmtesKindType_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType#getZustaendigesJugendamt <em>Zustaendiges Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustaendiges Jugendamt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType#getZustaendigesJugendamt()
	 * @see #getBestimmtesKindType()
	 * @generated
	 */
	EAttribute getBestimmtesKindType_ZustaendigesJugendamt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType <em>Datenschutz Und Einwilligung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenschutz Und Einwilligung Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType
	 * @generated
	 */
	EClass getDatenschutzUndEinwilligungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#getAllgemeineDatenschutzerklaerung <em>Allgemeine Datenschutzerklaerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allgemeine Datenschutzerklaerung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#getAllgemeineDatenschutzerklaerung()
	 * @see #getDatenschutzUndEinwilligungType()
	 * @generated
	 */
	EAttribute getDatenschutzUndEinwilligungType_AllgemeineDatenschutzerklaerung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#isKenntnissnahmeDatenschutzerklaerung <em>Kenntnissnahme Datenschutzerklaerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kenntnissnahme Datenschutzerklaerung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#isKenntnissnahmeDatenschutzerklaerung()
	 * @see #getDatenschutzUndEinwilligungType()
	 * @generated
	 */
	EAttribute getDatenschutzUndEinwilligungType_KenntnissnahmeDatenschutzerklaerung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType <em>Digitaler Rueckkanal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digitaler Rueckkanal Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType
	 * @generated
	 */
	EClass getDigitalerRueckkanalType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#getPostfachUUID <em>Postfach UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postfach UUID</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#getPostfachUUID()
	 * @see #getDigitalerRueckkanalType()
	 * @generated
	 */
	EAttribute getDigitalerRueckkanalType_PostfachUUID();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#isEinverstaendnisDigitalerRueckkanal <em>Einverstaendnis Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einverstaendnis Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType#isEinverstaendnisDigitalerRueckkanal()
	 * @see #getDigitalerRueckkanalType()
	 * @generated
	 */
	EAttribute getDigitalerRueckkanalType_EinverstaendnisDigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getAdoptionundpflegekinderAdoption0901 <em>Adoptionundpflegekinder Adoption0901</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adoptionundpflegekinder Adoption0901</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getAdoptionundpflegekinderAdoption0901()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdoptionundpflegekinderAdoption0901();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getAdoptionundpflegekinderPflegekinder0902 <em>Adoptionundpflegekinder Pflegekinder0902</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adoptionundpflegekinder Pflegekinder0902</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot#getAdoptionundpflegekinderPflegekinder0902()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdoptionundpflegekinderPflegekinder0902();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType <em>Einkommen Pflegekind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkommen Pflegekind Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType
	 * @generated
	 */
	EClass getEinkommenPflegekindType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getEinkommenAb <em>Einkommen Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommen Ab</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getEinkommenAb()
	 * @see #getEinkommenPflegekindType()
	 * @generated
	 */
	EAttribute getEinkommenPflegekindType_EinkommenAb();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheEinkommen <em>Hoehe Einkommen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hoehe Einkommen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheEinkommen()
	 * @see #getEinkommenPflegekindType()
	 * @generated
	 */
	EAttribute getEinkommenPflegekindType_HoeheEinkommen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getBezugKindergeldAb <em>Bezug Kindergeld Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug Kindergeld Ab</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getBezugKindergeldAb()
	 * @see #getEinkommenPflegekindType()
	 * @generated
	 */
	EAttribute getEinkommenPflegekindType_BezugKindergeldAb();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheKindergeld <em>Hoehe Kindergeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hoehe Kindergeld</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheKindergeld()
	 * @see #getEinkommenPflegekindType()
	 * @generated
	 */
	EAttribute getEinkommenPflegekindType_HoeheKindergeld();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getArtDesEinkommens <em>Art Des Einkommens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art Des Einkommens</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getArtDesEinkommens()
	 * @see #getEinkommenPflegekindType()
	 * @generated
	 */
	EReference getEinkommenPflegekindType_ArtDesEinkommens();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getSonstigesEinkommen <em>Sonstiges Einkommen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sonstiges Einkommen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getSonstigesEinkommen()
	 * @see #getEinkommenPflegekindType()
	 * @generated
	 */
	EAttribute getEinkommenPflegekindType_SonstigesEinkommen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getZustaendigeFamilienkasse <em>Zustaendige Familienkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustaendige Familienkasse</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getZustaendigeFamilienkasse()
	 * @see #getEinkommenPflegekindType()
	 * @generated
	 */
	EAttribute getEinkommenPflegekindType_ZustaendigeFamilienkasse();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType <em>Einkommen Und Wohnen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einkommen Und Wohnen Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType
	 * @generated
	 */
	EClass getEinkommenUndWohnenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkuenfte Aus Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getEinkuenfteAusTaetigkeit()
	 * @see #getEinkommenUndWohnenType()
	 * @generated
	 */
	EAttribute getEinkommenUndWohnenType_EinkuenfteAusTaetigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Andere Einkuenfte</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getAndereEinkuenfte()
	 * @see #getEinkommenUndWohnenType()
	 * @generated
	 */
	EAttribute getEinkommenUndWohnenType_AndereEinkuenfte();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schuldverpflichtungen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getSchuldverpflichtungen()
	 * @see #getEinkommenUndWohnenType()
	 * @generated
	 */
	EAttribute getEinkommenUndWohnenType_Schuldverpflichtungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unterhaltsverpflichtungen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getUnterhaltsverpflichtungen()
	 * @see #getEinkommenUndWohnenType()
	 * @generated
	 */
	EAttribute getEinkommenUndWohnenType_Unterhaltsverpflichtungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monatliche Fixkosten Unterkunft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getMonatlicheFixkostenUnterkunft()
	 * @see #getEinkommenUndWohnenType()
	 * @generated
	 */
	EAttribute getEinkommenUndWohnenType_MonatlicheFixkostenUnterkunft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnverhaeltnisse Anzahl Zimmer</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseAnzahlZimmer()
	 * @see #getEinkommenUndWohnenType()
	 * @generated
	 */
	EAttribute getEinkommenUndWohnenType_WohnverhaeltnisseAnzahlZimmer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseWohnflaeche <em>Wohnverhaeltnisse Wohnflaeche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnverhaeltnisse Wohnflaeche</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType#getWohnverhaeltnisseWohnflaeche()
	 * @see #getEinkommenUndWohnenType()
	 * @generated
	 */
	EAttribute getEinkommenUndWohnenType_WohnverhaeltnisseWohnflaeche();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType <em>Fremdkindadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fremdkindadoption Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType
	 * @generated
	 */
	EClass getFremdkindadoptionType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getBeratungscode <em>Beratungscode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beratungscode</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getBeratungscode()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getFremdkindadoptionType_Beratungscode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allgemeine Angaben</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAllgemeineAngaben()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EReference getFremdkindadoptionType_AllgemeineAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAngabenZurPartnerschaft <em>Angaben Zur Partnerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Partnerschaft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAngabenZurPartnerschaft()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EReference getFremdkindadoptionType_AngabenZurPartnerschaft();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAngabenZuKindernDerFamilie <em>Angaben Zu Kindern Der Familie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Zu Kindern Der Familie</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAngabenZuKindernDerFamilie()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EReference getFremdkindadoptionType_AngabenZuKindernDerFamilie();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getWeiterePersonenImHauhalt <em>Weitere Personen Im Hauhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Personen Im Hauhalt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getWeiterePersonenImHauhalt()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EReference getFremdkindadoptionType_WeiterePersonenImHauhalt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAuseinandersetzungThemaAdoption <em>Auseinandersetzung Thema Adoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auseinandersetzung Thema Adoption</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAuseinandersetzungThemaAdoption()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getFremdkindadoptionType_AuseinandersetzungThemaAdoption();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getNachweise()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EReference getFremdkindadoptionType_Nachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDatenschutzDerFachbehoerde()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EReference getFremdkindadoptionType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getSignatur <em>Signatur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatur</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getSignatur()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EReference getFremdkindadoptionType_Signatur();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDigitalerRueckkanal()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EReference getFremdkindadoptionType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDatenschutzUndEinwilligung()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EReference getFremdkindadoptionType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#isAertzlicheBehandlung <em>Aertzliche Behandlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aertzliche Behandlung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#isAertzlicheBehandlung()
	 * @see #getFremdkindadoptionType()
	 * @generated
	 */
	EAttribute getFremdkindadoptionType_AertzlicheBehandlung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType <em>Kontakformular Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kontakformular Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType
	 * @generated
	 */
	EClass getKontakformularType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getDatenschutzUndEinwilligung()
	 * @see #getKontakformularType()
	 * @generated
	 */
	EReference getKontakformularType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getPersonendaten()
	 * @see #getKontakformularType()
	 * @generated
	 */
	EReference getKontakformularType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getAnschrift()
	 * @see #getKontakformularType()
	 * @generated
	 */
	EReference getKontakformularType_Anschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getAnliegen <em>Anliegen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anliegen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getAnliegen()
	 * @see #getKontakformularType()
	 * @generated
	 */
	EReference getKontakformularType_Anliegen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getDatenschutzDerFachbehoerde()
	 * @see #getKontakformularType()
	 * @generated
	 */
	EReference getKontakformularType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType#getDigitalerRueckkanal()
	 * @see #getKontakformularType()
	 * @generated
	 */
	EReference getKontakformularType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType <em>Kontoinformationen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kontoinformationen Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType
	 * @generated
	 */
	EClass getKontoinformationenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType#getBeantragungJugendhilfe <em>Beantragung Jugendhilfe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beantragung Jugendhilfe</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType#getBeantragungJugendhilfe()
	 * @see #getKontoinformationenType()
	 * @generated
	 */
	EReference getKontoinformationenType_BeantragungJugendhilfe();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType#getBankverbindung <em>Bankverbindung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bankverbindung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType#getBankverbindung()
	 * @see #getKontoinformationenType()
	 * @generated
	 */
	EReference getKontoinformationenType_Bankverbindung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType <em>Moeglichkeiten Und Grenzen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moeglichkeiten Und Grenzen Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType
	 * @generated
	 */
	EClass getMoeglichkeitenUndGrenzenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindJedenAlters <em>Zutrauen Kind Jeden Alters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zutrauen Kind Jeden Alters</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindJedenAlters()
	 * @see #getMoeglichkeitenUndGrenzenType()
	 * @generated
	 */
	EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindJedenAlters();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#getZutrauenKindAltersangabe <em>Zutrauen Kind Altersangabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zutrauen Kind Altersangabe</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#getZutrauenKindAltersangabe()
	 * @see #getMoeglichkeitenUndGrenzenType()
	 * @generated
	 */
	EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindAltersangabe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindBeeintraechtigung <em>Zutrauen Kind Beeintraechtigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zutrauen Kind Beeintraechtigung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindBeeintraechtigung()
	 * @see #getMoeglichkeitenUndGrenzenType()
	 * @generated
	 */
	EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindBeeintraechtigung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindKoerperlicheBeeintraechtigung <em>Zutrauen Kind Koerperliche Beeintraechtigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zutrauen Kind Koerperliche Beeintraechtigung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindKoerperlicheBeeintraechtigung()
	 * @see #getMoeglichkeitenUndGrenzenType()
	 * @generated
	 */
	EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindKoerperlicheBeeintraechtigung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindGeistigerBeeintraechtigung <em>Zutrauen Kind Geistiger Beeintraechtigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zutrauen Kind Geistiger Beeintraechtigung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindGeistigerBeeintraechtigung()
	 * @see #getMoeglichkeitenUndGrenzenType()
	 * @generated
	 */
	EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindGeistigerBeeintraechtigung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindPsychischerBeeintraechtigung <em>Zutrauen Kind Psychischer Beeintraechtigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zutrauen Kind Psychischer Beeintraechtigung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindPsychischerBeeintraechtigung()
	 * @see #getMoeglichkeitenUndGrenzenType()
	 * @generated
	 */
	EAttribute getMoeglichkeitenUndGrenzenType_ZutrauenKindPsychischerBeeintraechtigung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType <em>Nachweise Einreichen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweise Einreichen Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType
	 * @generated
	 */
	EClass getNachweiseEinreichenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDatenschutzUndEinwilligung()
	 * @see #getNachweiseEinreichenType()
	 * @generated
	 */
	EReference getNachweiseEinreichenType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getAntragsteller <em>Antragsteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragsteller</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getAntragsteller()
	 * @see #getNachweiseEinreichenType()
	 * @generated
	 */
	EReference getNachweiseEinreichenType_Antragsteller();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getNachweise()
	 * @see #getNachweiseEinreichenType()
	 * @generated
	 */
	EReference getNachweiseEinreichenType_Nachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDatenschutzDerFachbehoerde()
	 * @see #getNachweiseEinreichenType()
	 * @generated
	 */
	EReference getNachweiseEinreichenType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDigitalerRueckkanal()
	 * @see #getNachweiseEinreichenType()
	 * @generated
	 */
	EReference getNachweiseEinreichenType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType <em>Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweis Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType
	 * @generated
	 */
	EClass getNachweisType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType#getBeschreibung()
	 * @see #getNachweisType()
	 * @generated
	 */
	EAttribute getNachweisType_Beschreibung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType <em>Pauschalbetrag Gezahlt Von Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pauschalbetrag Gezahlt Von Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType
	 * @generated
	 */
	EClass getPauschalbetragGezahltVonType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getStadt <em>Stadt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stadt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getStadt()
	 * @see #getPauschalbetragGezahltVonType()
	 * @generated
	 */
	EAttribute getPauschalbetragGezahltVonType_Stadt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getBezirkStadtteil <em>Bezirk Stadtteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezirk Stadtteil</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getBezirkStadtteil()
	 * @see #getPauschalbetragGezahltVonType()
	 * @generated
	 */
	EAttribute getPauschalbetragGezahltVonType_BezirkStadtteil();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getAktenzeichenWirtschaftlicheJugendhilfe <em>Aktenzeichen Wirtschaftliche Jugendhilfe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen Wirtschaftliche Jugendhilfe</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getAktenzeichenWirtschaftlicheJugendhilfe()
	 * @see #getPauschalbetragGezahltVonType()
	 * @generated
	 */
	EAttribute getPauschalbetragGezahltVonType_AktenzeichenWirtschaftlicheJugendhilfe();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType <em>Pauschalbetrag Vollzeitpflege Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pauschalbetrag Vollzeitpflege Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType
	 * @generated
	 */
	EClass getPauschalbetragVollzeitpflegeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getDatenschutzUndEinwilligung()
	 * @see #getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	EReference getPauschalbetragVollzeitpflegeType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getAngabenPflegekind <em>Angaben Pflegekind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Pflegekind</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getAngabenPflegekind()
	 * @see #getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	EReference getPauschalbetragVollzeitpflegeType_AngabenPflegekind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getPflegeperson <em>Pflegeperson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pflegeperson</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getPflegeperson()
	 * @see #getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	EReference getPauschalbetragVollzeitpflegeType_Pflegeperson();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getKinder <em>Kinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kinder</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getKinder()
	 * @see #getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	EReference getPauschalbetragVollzeitpflegeType_Kinder();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getKontoinformationen <em>Kontoinformationen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kontoinformationen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getKontoinformationen()
	 * @see #getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	EReference getPauschalbetragVollzeitpflegeType_Kontoinformationen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getNachweise()
	 * @see #getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	EReference getPauschalbetragVollzeitpflegeType_Nachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getDatenschutzDerFachbehoerde()
	 * @see #getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	EReference getPauschalbetragVollzeitpflegeType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getSignatur <em>Signatur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatur</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getSignatur()
	 * @see #getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	EReference getPauschalbetragVollzeitpflegeType_Signatur();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType#getDigitalerRueckkanal()
	 * @see #getPauschalbetragVollzeitpflegeType()
	 * @generated
	 */
	EReference getPauschalbetragVollzeitpflegeType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType <em>Personendaten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personendaten Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType
	 * @generated
	 */
	EClass getPersonendatenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType#getName()
	 * @see #getPersonendatenType()
	 * @generated
	 */
	EReference getPersonendatenType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType#getKontakt <em>Kontakt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontakt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType#getKontakt()
	 * @see #getPersonendatenType()
	 * @generated
	 */
	EReference getPersonendatenType_Kontakt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType <em>Pflegekind Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pflegekind Basis Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType
	 * @generated
	 */
	EClass getPflegekindBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType#getPersonendaten()
	 * @see #getPflegekindBasisType()
	 * @generated
	 */
	EReference getPflegekindBasisType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindBasisType#getGeburt()
	 * @see #getPflegekindBasisType()
	 * @generated
	 */
	EReference getPflegekindBasisType_Geburt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType <em>Pflegekind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pflegekind Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType
	 * @generated
	 */
	EClass getPflegekindType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getInPflegeSeit <em>In Pflege Seit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Pflege Seit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getInPflegeSeit()
	 * @see #getPflegekindType()
	 * @generated
	 */
	EAttribute getPflegekindType_InPflegeSeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getPflegeform <em>Pflegeform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pflegeform</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getPflegeform()
	 * @see #getPflegekindType()
	 * @generated
	 */
	EReference getPflegekindType_Pflegeform();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getPauschalbetragGezahltVon <em>Pauschalbetrag Gezahlt Von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pauschalbetrag Gezahlt Von</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getPauschalbetragGezahltVon()
	 * @see #getPflegekindType()
	 * @generated
	 */
	EReference getPflegekindType_PauschalbetragGezahltVon();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType <em>Pflegeperson Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pflegeperson Basis Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType
	 * @generated
	 */
	EClass getPflegepersonBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType#getPersonendaten()
	 * @see #getPflegepersonBasisType()
	 * @generated
	 */
	EReference getPflegepersonBasisType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType#getGeburt()
	 * @see #getPflegepersonBasisType()
	 * @generated
	 */
	EReference getPflegepersonBasisType_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType#getSteueridentifikationsnummer <em>Steueridentifikationsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steueridentifikationsnummer</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonBasisType#getSteueridentifikationsnummer()
	 * @see #getPflegepersonBasisType()
	 * @generated
	 */
	EAttribute getPflegepersonBasisType_Steueridentifikationsnummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType <em>Pflegeperson Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pflegeperson Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType
	 * @generated
	 */
	EClass getPflegepersonType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getBeratungscode <em>Beratungscode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beratungscode</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getBeratungscode()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EAttribute getPflegepersonType_Beratungscode();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getDatenschutzUndEinwilligung()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allgemeine Angaben</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getAllgemeineAngaben()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_AllgemeineAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getEinkommenUndWohnen <em>Einkommen Und Wohnen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einkommen Und Wohnen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getEinkommenUndWohnen()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_EinkommenUndWohnen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getAngabenZuKindernDerFamilie <em>Angaben Zu Kindern Der Familie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Zu Kindern Der Familie</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getAngabenZuKindernDerFamilie()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_AngabenZuKindernDerFamilie();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getWeiterePersonenImHauhalt <em>Weitere Personen Im Hauhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Personen Im Hauhalt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getWeiterePersonenImHauhalt()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_WeiterePersonenImHauhalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getBestimmtesKind <em>Bestimmtes Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bestimmtes Kind</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getBestimmtesKind()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_BestimmtesKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getMoeglichkeitenUndGrenzen <em>Moeglichkeiten Und Grenzen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Moeglichkeiten Und Grenzen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getMoeglichkeitenUndGrenzen()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_MoeglichkeitenUndGrenzen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getNachweise()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_Nachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getDatenschutzDerFachbehoerde()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getSignatur <em>Signatur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatur</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getSignatur()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_Signatur();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType#getDigitalerRueckkanal()
	 * @see #getPflegepersonType()
	 * @generated
	 */
	EReference getPflegepersonType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType <em>Signatur Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signatur Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType
	 * @generated
	 */
	EClass getSignaturType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#isElektronischSignieren <em>Elektronisch Signieren</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elektronisch Signieren</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#isElektronischSignieren()
	 * @see #getSignaturType()
	 * @generated
	 */
	EAttribute getSignaturType_ElektronischSignieren();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#getAnlage <em>Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anlage</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType#getAnlage()
	 * @see #getSignaturType()
	 * @generated
	 */
	EReference getSignaturType_Anlage();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType <em>Sonstige Antraege Senden Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sonstige Antraege Senden Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType
	 * @generated
	 */
	EClass getSonstigeAntraegeSendenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDatenschutzUndEinwilligung()
	 * @see #getSonstigeAntraegeSendenType()
	 * @generated
	 */
	EReference getSonstigeAntraegeSendenType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeine Angaben</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getAllgemeineAngaben()
	 * @see #getSonstigeAntraegeSendenType()
	 * @generated
	 */
	EReference getSonstigeAntraegeSendenType_AllgemeineAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getAntragdetails <em>Antragdetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragdetails</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getAntragdetails()
	 * @see #getSonstigeAntraegeSendenType()
	 * @generated
	 */
	EReference getSonstigeAntraegeSendenType_Antragdetails();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getPflegekinder <em>Pflegekinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pflegekinder</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getPflegekinder()
	 * @see #getSonstigeAntraegeSendenType()
	 * @generated
	 */
	EReference getSonstigeAntraegeSendenType_Pflegekinder();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getNachweise()
	 * @see #getSonstigeAntraegeSendenType()
	 * @generated
	 */
	EReference getSonstigeAntraegeSendenType_Nachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDatenschutzDerFachbehoerde()
	 * @see #getSonstigeAntraegeSendenType()
	 * @generated
	 */
	EReference getSonstigeAntraegeSendenType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getSignatur <em>Signatur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatur</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getSignatur()
	 * @see #getSonstigeAntraegeSendenType()
	 * @generated
	 */
	EReference getSonstigeAntraegeSendenType_Signatur();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDigitalerRueckkanal()
	 * @see #getSonstigeAntraegeSendenType()
	 * @generated
	 */
	EReference getSonstigeAntraegeSendenType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType <em>Stiefkindadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stiefkindadoption Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType
	 * @generated
	 */
	EClass getStiefkindadoptionType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getBeratungscode <em>Beratungscode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beratungscode</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getBeratungscode()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EAttribute getStiefkindadoptionType_Beratungscode();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDatenschutzUndEinwilligung()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenDesZuAdoptierendenKindes <em>Angaben Des Zu Adoptierenden Kindes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Des Zu Adoptierenden Kindes</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenDesZuAdoptierendenKindes()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_AngabenDesZuAdoptierendenKindes();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeine Angaben</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAllgemeineAngaben()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_AllgemeineAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getVerbleibenderSorgeberechtigterElternteil <em>Verbleibender Sorgeberechtigter Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verbleibender Sorgeberechtigter Elternteil</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getVerbleibenderSorgeberechtigterElternteil()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_VerbleibenderSorgeberechtigterElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAnnehmenderElternteil <em>Annehmender Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annehmender Elternteil</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAnnehmenderElternteil()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_AnnehmenderElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenZurPartnerschaft <em>Angaben Zur Partnerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Partnerschaft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenZurPartnerschaft()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_AngabenZurPartnerschaft();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenZuKindernDerFamilie <em>Angaben Zu Kindern Der Familie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Zu Kindern Der Familie</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenZuKindernDerFamilie()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_AngabenZuKindernDerFamilie();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getWeiterePersonenImHauhalt <em>Weitere Personen Im Hauhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Personen Im Hauhalt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getWeiterePersonenImHauhalt()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_WeiterePersonenImHauhalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAbgebenderElternteil <em>Abgebender Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abgebender Elternteil</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAbgebenderElternteil()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_AbgebenderElternteil();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getNachweise()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_Nachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDatenschutzDerFachbehoerde()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getSignatur <em>Signatur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatur</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getSignatur()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_Signatur();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDigitalerRueckkanal()
	 * @see #getStiefkindadoptionType()
	 * @generated
	 */
	EReference getStiefkindadoptionType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType <em>Verbleibender Sorgeberechtigter Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verbleibender Sorgeberechtigter Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType
	 * @generated
	 */
	EClass getVerbleibenderSorgeberechtigterElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getPersonendaten()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EReference getVerbleibenderSorgeberechtigterElternteilType_Personendaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getStaatsangehoerigkeit()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EReference getVerbleibenderSorgeberechtigterElternteilType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getGeburt()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EReference getVerbleibenderSorgeberechtigterElternteilType_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkuenfte Aus Taetigkeit</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getEinkuenfteAusTaetigkeit()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EAttribute getVerbleibenderSorgeberechtigterElternteilType_EinkuenfteAusTaetigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAndereEinkuenfte <em>Andere Einkuenfte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Andere Einkuenfte</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAndereEinkuenfte()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EAttribute getVerbleibenderSorgeberechtigterElternteilType_AndereEinkuenfte();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schuldverpflichtungen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getSchuldverpflichtungen()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EAttribute getVerbleibenderSorgeberechtigterElternteilType_Schuldverpflichtungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unterhaltsverpflichtungen</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getUnterhaltsverpflichtungen()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EAttribute getVerbleibenderSorgeberechtigterElternteilType_Unterhaltsverpflichtungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monatliche Fixkosten Unterkunft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getMonatlicheFixkostenUnterkunft()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EAttribute getVerbleibenderSorgeberechtigterElternteilType_MonatlicheFixkostenUnterkunft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufenthaltsstatus</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getAufenthaltsstatus()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EReference getVerbleibenderSorgeberechtigterElternteilType_Aufenthaltsstatus();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerbleibenderSorgeberechtigterElternteilType#getGeschlecht()
	 * @see #getVerbleibenderSorgeberechtigterElternteilType()
	 * @generated
	 */
	EReference getVerbleibenderSorgeberechtigterElternteilType_Geschlecht();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType <em>Verwandtenadoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verwandtenadoption Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType
	 * @generated
	 */
	EClass getVerwandtenadoptionType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getBeratungscode <em>Beratungscode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beratungscode</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getBeratungscode()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EAttribute getVerwandtenadoptionType_Beratungscode();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutz Und Einwilligung</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getDatenschutzUndEinwilligung()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_DatenschutzUndEinwilligung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAngabenDesZuAdoptierendenKindes <em>Angaben Des Zu Adoptierenden Kindes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Des Zu Adoptierenden Kindes</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAngabenDesZuAdoptierendenKindes()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_AngabenDesZuAdoptierendenKindes();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeine Angaben</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAllgemeineAngaben()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_AllgemeineAngaben();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAnnehmenderElternteil <em>Annehmender Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annehmender Elternteil</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAnnehmenderElternteil()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_AnnehmenderElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAngabenZurPartnerschaft <em>Angaben Zur Partnerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Partnerschaft</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAngabenZurPartnerschaft()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_AngabenZurPartnerschaft();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAngabenZuKindernDerFamilie <em>Angaben Zu Kindern Der Familie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Zu Kindern Der Familie</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAngabenZuKindernDerFamilie()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_AngabenZuKindernDerFamilie();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getWeiterePersonenImHauhalt <em>Weitere Personen Im Hauhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Personen Im Hauhalt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getWeiterePersonenImHauhalt()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_WeiterePersonenImHauhalt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAbgebenderElternteil <em>Abgebender Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abgebender Elternteil</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getAbgebenderElternteil()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_AbgebenderElternteil();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getNachweise()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_Nachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datenschutz Der Fachbehoerde</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getDatenschutzDerFachbehoerde()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_DatenschutzDerFachbehoerde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getSignatur <em>Signatur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatur</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getSignatur()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_Signatur();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digitaler Rueckkanal</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType#getDigitalerRueckkanal()
	 * @see #getVerwandtenadoptionType()
	 * @generated
	 */
	EReference getVerwandtenadoptionType_DigitalerRueckkanal();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType <em>Weitere Personen Im Hauhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weitere Personen Im Hauhalt Type</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType
	 * @generated
	 */
	EClass getWeiterePersonenImHauhaltType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getPersonendaten <em>Personendaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personendaten</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getPersonendaten()
	 * @see #getWeiterePersonenImHauhaltType()
	 * @generated
	 */
	EReference getWeiterePersonenImHauhaltType_Personendaten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getBeziehungZurPerson <em>Beziehung Zur Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beziehung Zur Person</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getBeziehungZurPerson()
	 * @see #getWeiterePersonenImHauhaltType()
	 * @generated
	 */
	EAttribute getWeiterePersonenImHauhaltType_BeziehungZurPerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType#getGeburt()
	 * @see #getWeiterePersonenImHauhaltType()
	 * @generated
	 */
	EReference getWeiterePersonenImHauhaltType_Geburt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdoptionFactory getAdoptionFactory();

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
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl <em>Abgebender Elternteil Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAbgebenderElternteilType()
		 * @generated
		 */
		EClass ABGEBENDER_ELTERNTEIL_TYPE = eINSTANCE.getAbgebenderElternteilType();

		/**
		 * The meta object literal for the '<em><b>Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL = eINSTANCE.getAbgebenderElternteilType_Elternteil();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN = eINSTANCE.getAbgebenderElternteilType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABGEBENDER_ELTERNTEIL_TYPE__GEBURT = eINSTANCE.getAbgebenderElternteilType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT = eINSTANCE.getAbgebenderElternteilType_Staatsangehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Einstellung Adoptionsabsicht</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABGEBENDER_ELTERNTEIL_TYPE__EINSTELLUNG_ADOPTIONSABSICHT = eINSTANCE.getAbgebenderElternteilType_EinstellungAdoptionsabsicht();

		/**
		 * The meta object literal for the '<em><b>Aufenthaltsstatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS = eINSTANCE.getAbgebenderElternteilType_Aufenthaltsstatus();

		/**
		 * The meta object literal for the '<em><b>Elternteil Verstorben</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN = eINSTANCE.getAbgebenderElternteilType_ElternteilVerstorben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderAdoption0901TypeImpl <em>Adoptionundpflegekinder Adoption0901 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderAdoption0901TypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAdoptionundpflegekinderAdoption0901Type()
		 * @generated
		 */
		EClass ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE = eINSTANCE.getAdoptionundpflegekinderAdoption0901Type();

		/**
		 * The meta object literal for the '<em><b>Kontaktformular</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__KONTAKTFORMULAR = eINSTANCE.getAdoptionundpflegekinderAdoption0901Type_Kontaktformular();

		/**
		 * The meta object literal for the '<em><b>Nachweise Einreichen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__NACHWEISE_EINREICHEN = eINSTANCE.getAdoptionundpflegekinderAdoption0901Type_NachweiseEinreichen();

		/**
		 * The meta object literal for the '<em><b>Stiefkindadoption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__STIEFKINDADOPTION = eINSTANCE.getAdoptionundpflegekinderAdoption0901Type_Stiefkindadoption();

		/**
		 * The meta object literal for the '<em><b>Verwandtenadoption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__VERWANDTENADOPTION = eINSTANCE.getAdoptionundpflegekinderAdoption0901Type_Verwandtenadoption();

		/**
		 * The meta object literal for the '<em><b>Fremdkindadoption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_ADOPTION0901_TYPE__FREMDKINDADOPTION = eINSTANCE.getAdoptionundpflegekinderAdoption0901Type_Fremdkindadoption();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl <em>Adoptionundpflegekinder Pflegekinder0902 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAdoptionundpflegekinderPflegekinder0902Type()
		 * @generated
		 */
		EClass ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE = eINSTANCE.getAdoptionundpflegekinderPflegekinder0902Type();

		/**
		 * The meta object literal for the '<em><b>Kontaktformular</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR = eINSTANCE.getAdoptionundpflegekinderPflegekinder0902Type_Kontaktformular();

		/**
		 * The meta object literal for the '<em><b>Nachweise Einreichen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN = eINSTANCE.getAdoptionundpflegekinderPflegekinder0902Type_NachweiseEinreichen();

		/**
		 * The meta object literal for the '<em><b>Pflegeperson</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON = eINSTANCE.getAdoptionundpflegekinderPflegekinder0902Type_Pflegeperson();

		/**
		 * The meta object literal for the '<em><b>Sonstige Antraege Senden</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN = eINSTANCE.getAdoptionundpflegekinderPflegekinder0902Type_SonstigeAntraegeSenden();

		/**
		 * The meta object literal for the '<em><b>Beitragsuebernahme Unfallversicherung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG = eINSTANCE.getAdoptionundpflegekinderPflegekinder0902Type_BeitragsuebernahmeUnfallversicherung();

		/**
		 * The meta object literal for the '<em><b>Alterssicherung Pflegeperson</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON = eINSTANCE.getAdoptionundpflegekinderPflegekinder0902Type_AlterssicherungPflegeperson();

		/**
		 * The meta object literal for the '<em><b>Pauschalbetrag Vollzeitpflege</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE = eINSTANCE.getAdoptionundpflegekinderPflegekinder0902Type_PauschalbetragVollzeitpflege();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl <em>Allgemeine Angaben Fremdkindadoption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAllgemeineAngabenFremdkindadoptionType()
		 * @generated
		 */
		EClass ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_Staatsangehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Religionszugehoerigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__RELIGIONSZUGEHOERIGKEIT = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_Religionszugehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Berufliche Taetigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_AktuelleBeruflicheTaetigkeit();

		/**
		 * The meta object literal for the '<em><b>Einkuenfte Aus Taetigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__EINKUENFTE_AUS_TAETIGKEIT = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_EinkuenfteAusTaetigkeit();

		/**
		 * The meta object literal for the '<em><b>Andere Einkuenfte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__ANDERE_EINKUENFTE = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_AndereEinkuenfte();

		/**
		 * The meta object literal for the '<em><b>Schuldverpflichtungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__SCHULDVERPFLICHTUNGEN = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_Schuldverpflichtungen();

		/**
		 * The meta object literal for the '<em><b>Unterhaltsverpflichtungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UNTERHALTSVERPFLICHTUNGEN = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_Unterhaltsverpflichtungen();

		/**
		 * The meta object literal for the '<em><b>Monatliche Fixkosten Unterkunft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_MonatlicheFixkostenUnterkunft();

		/**
		 * The meta object literal for the '<em><b>Aufenthaltsstatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_Aufenthaltsstatus();

		/**
		 * The meta object literal for the '<em><b>Aktueller Familienstand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLER_FAMILIENSTAND = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_AktuellerFamilienstand();

		/**
		 * The meta object literal for the '<em><b>Geschlecht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_Geschlecht();

		/**
		 * The meta object literal for the '<em><b>Bereits Verheiratet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__BEREITS_VERHEIRATET = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_BereitsVerheiratet();

		/**
		 * The meta object literal for the '<em><b>Umfang Verheiratet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UMFANG_VERHEIRATET = eINSTANCE.getAllgemeineAngabenFremdkindadoptionType_UmfangVerheiratet();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenPflegeTypeImpl <em>Allgemeine Angaben Pflege Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenPflegeTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAllgemeineAngabenPflegeType()
		 * @generated
		 */
		EClass ALLGEMEINE_ANGABEN_PFLEGE_TYPE = eINSTANCE.getAllgemeineAngabenPflegeType();

		/**
		 * The meta object literal for the '<em><b>Wochenstunden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_PFLEGE_TYPE__WOCHENSTUNDEN = eINSTANCE.getAllgemeineAngabenPflegeType_Wochenstunden();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT = eINSTANCE.getAllgemeineAngabenPflegeType_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Geschlecht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT = eINSTANCE.getAllgemeineAngabenPflegeType_Geschlecht();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl <em>Allgemeine Angaben Stiefkindadoption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAllgemeineAngabenStiefkindadoptionType()
		 * @generated
		 */
		EClass ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType();

		/**
		 * The meta object literal for the '<em><b>Kontakt Zu Leiblicher Familie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType_KontaktZuLeiblicherFamilie();

		/**
		 * The meta object literal for the '<em><b>Erlaeuterung Kontakt Zu Leiblicher Familie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie();

		/**
		 * The meta object literal for the '<em><b>Personensorgerecht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType_Personensorgerecht();

		/**
		 * The meta object literal for the '<em><b>Personensorgerecht Bei Sonstige</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType_PersonensorgerechtBeiSonstige();

		/**
		 * The meta object literal for the '<em><b>Geschpraech Ueber Adoption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType_GeschpraechUeberAdoption();

		/**
		 * The meta object literal for the '<em><b>Reaktion Kind Gespraech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__REAKTION_KIND_GESPRAECH = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType_ReaktionKindGespraech();

		/**
		 * The meta object literal for the '<em><b>Kontakt Jugendamt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_JUGENDAMT = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType_KontaktJugendamt();

		/**
		 * The meta object literal for the '<em><b>Art Kontakt Jugendamt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ART_KONTAKT_JUGENDAMT = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType_ArtKontaktJugendamt();

		/**
		 * The meta object literal for the '<em><b>Gerichtliche Regelung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GERICHTLICHE_REGELUNG = eINSTANCE.getAllgemeineAngabenStiefkindadoptionType_GerichtlicheRegelung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl <em>Allgemeine Angaben Verwandtenadoption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAllgemeineAngabenVerwandtenadoptionType()
		 * @generated
		 */
		EClass ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE = eINSTANCE.getAllgemeineAngabenVerwandtenadoptionType();

		/**
		 * The meta object literal for the '<em><b>Herkunft Bekannt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__HERKUNFT_BEKANNT = eINSTANCE.getAllgemeineAngabenVerwandtenadoptionType_HerkunftBekannt();

		/**
		 * The meta object literal for the '<em><b>Kontakt Zu Leiblicher Familie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE = eINSTANCE.getAllgemeineAngabenVerwandtenadoptionType_KontaktZuLeiblicherFamilie();

		/**
		 * The meta object literal for the '<em><b>Erlaeuterung Kontakt Zu Leiblicher Familie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE = eINSTANCE.getAllgemeineAngabenVerwandtenadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie();

		/**
		 * The meta object literal for the '<em><b>Personensorgerecht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT = eINSTANCE.getAllgemeineAngabenVerwandtenadoptionType_Personensorgerecht();

		/**
		 * The meta object literal for the '<em><b>Personensorgerecht Bei Sonstige</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE = eINSTANCE.getAllgemeineAngabenVerwandtenadoptionType_PersonensorgerechtBeiSonstige();

		/**
		 * The meta object literal for the '<em><b>Geschpraech Ueber Adoption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION = eINSTANCE.getAllgemeineAngabenVerwandtenadoptionType_GeschpraechUeberAdoption();

		/**
		 * The meta object literal for the '<em><b>Reaktion Kind Gespraech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__REAKTION_KIND_GESPRAECH = eINSTANCE.getAllgemeineAngabenVerwandtenadoptionType_ReaktionKindGespraech();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl <em>Alterssicherung Pflegeperson Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AlterssicherungPflegepersonTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAlterssicherungPflegepersonType()
		 * @generated
		 */
		EClass ALTERSSICHERUNG_PFLEGEPERSON_TYPE = eINSTANCE.getAlterssicherungPflegepersonType();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getAlterssicherungPflegepersonType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Angaben</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN = eINSTANCE.getAlterssicherungPflegepersonType_AllgemeineAngaben();

		/**
		 * The meta object literal for the '<em><b>Antragdetails Alterssicherung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERSSICHERUNG_PFLEGEPERSON_TYPE__ANTRAGDETAILS_ALTERSSICHERUNG = eINSTANCE.getAlterssicherungPflegepersonType_AntragdetailsAlterssicherung();

		/**
		 * The meta object literal for the '<em><b>Pflegekinder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERSSICHERUNG_PFLEGEPERSON_TYPE__PFLEGEKINDER = eINSTANCE.getAlterssicherungPflegepersonType_Pflegekinder();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERSSICHERUNG_PFLEGEPERSON_TYPE__NACHWEISE = eINSTANCE.getAlterssicherungPflegepersonType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getAlterssicherungPflegepersonType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Signatur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERSSICHERUNG_PFLEGEPERSON_TYPE__SIGNATUR = eINSTANCE.getAlterssicherungPflegepersonType_Signatur();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERSSICHERUNG_PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getAlterssicherungPflegepersonType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl <em>Angaben Des Zu Adoptierenden Kindes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAngabenDesZuAdoptierendenKindesType()
		 * @generated
		 */
		EClass ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE = eINSTANCE.getAngabenDesZuAdoptierendenKindesType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN = eINSTANCE.getAngabenDesZuAdoptierendenKindesType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT = eINSTANCE.getAngabenDesZuAdoptierendenKindesType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT = eINSTANCE.getAngabenDesZuAdoptierendenKindesType_Staatsangehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Religionszugehoerigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__RELIGIONSZUGEHOERIGKEIT = eINSTANCE.getAngabenDesZuAdoptierendenKindesType_Religionszugehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Aus Ausland Geholt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUS_AUSLAND_GEHOLT = eINSTANCE.getAngabenDesZuAdoptierendenKindesType_AusAuslandGeholt();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT = eINSTANCE.getAngabenDesZuAdoptierendenKindesType_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Aufenthaltsstatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS = eINSTANCE.getAngabenDesZuAdoptierendenKindesType_Aufenthaltsstatus();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl <em>Angaben Pflegekind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAngabenPflegekindType()
		 * @generated
		 */
		EClass ANGABEN_PFLEGEKIND_TYPE = eINSTANCE.getAngabenPflegekindType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN = eINSTANCE.getAngabenPflegekindType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_PFLEGEKIND_TYPE__GEBURT = eINSTANCE.getAngabenPflegekindType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT = eINSTANCE.getAngabenPflegekindType_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Beginn Pflegeverhaeltnis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_PFLEGEKIND_TYPE__BEGINN_PFLEGEVERHAELTNIS = eINSTANCE.getAngabenPflegekindType_BeginnPflegeverhaeltnis();

		/**
		 * The meta object literal for the '<em><b>Krankenversichert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT = eINSTANCE.getAngabenPflegekindType_Krankenversichert();

		/**
		 * The meta object literal for the '<em><b>Krankenversichert Ueber Pflegeperson</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT_UEBER_PFLEGEPERSON = eINSTANCE.getAngabenPflegekindType_KrankenversichertUeberPflegeperson();

		/**
		 * The meta object literal for the '<em><b>Schule Ausbildungsstaette</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_PFLEGEKIND_TYPE__SCHULE_AUSBILDUNGSSTAETTE = eINSTANCE.getAngabenPflegekindType_SchuleAusbildungsstaette();

		/**
		 * The meta object literal for the '<em><b>Klassenstufe Ausbildungsjahr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_PFLEGEKIND_TYPE__KLASSENSTUFE_AUSBILDUNGSJAHR = eINSTANCE.getAngabenPflegekindType_KlassenstufeAusbildungsjahr();

		/**
		 * The meta object literal for the '<em><b>Einkommen Pflegekind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND = eINSTANCE.getAngabenPflegekindType_EinkommenPflegekind();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl <em>Angaben Zu Kindern Der Familie Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAngabenZuKindernDerFamilieType()
		 * @generated
		 */
		EClass ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE = eINSTANCE.getAngabenZuKindernDerFamilieType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN = eINSTANCE.getAngabenZuKindernDerFamilieType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT = eINSTANCE.getAngabenZuKindernDerFamilieType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Verhaeltnis Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__VERHAELTNIS_KIND = eINSTANCE.getAngabenZuKindernDerFamilieType_VerhaeltnisKind();

		/**
		 * The meta object literal for the '<em><b>Elternteil Des Kindes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__ELTERNTEIL_DES_KINDES = eINSTANCE.getAngabenZuKindernDerFamilieType_ElternteilDesKindes();

		/**
		 * The meta object literal for the '<em><b>Kind Wohnhaft Haushalt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_HAUSHALT = eINSTANCE.getAngabenZuKindernDerFamilieType_KindWohnhaftHaushalt();

		/**
		 * The meta object literal for the '<em><b>Kind Wohnhaft Alterntive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_ALTERNTIVE = eINSTANCE.getAngabenZuKindernDerFamilieType_KindWohnhaftAlterntive();

		/**
		 * The meta object literal for the '<em><b>Kind Verstorben</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN = eINSTANCE.getAngabenZuKindernDerFamilieType_KindVerstorben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl <em>Angaben Zur Partnerschaft Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAngabenZurPartnerschaftType()
		 * @generated
		 */
		EClass ANGABEN_ZUR_PARTNERSCHAFT_TYPE = eINSTANCE.getAngabenZurPartnerschaftType();

		/**
		 * The meta object literal for the '<em><b>Dauer Partnerschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_PARTNERSCHAFT = eINSTANCE.getAngabenZurPartnerschaftType_DauerPartnerschaft();

		/**
		 * The meta object literal for the '<em><b>Dauer Gemeinsamer Haushalt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_GEMEINSAMER_HAUSHALT = eINSTANCE.getAngabenZurPartnerschaftType_DauerGemeinsamerHaushalt();

		/**
		 * The meta object literal for the '<em><b>Verheiratet Oder Lebenspartnerschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__VERHEIRATET_ODER_LEBENSPARTNERSCHAFT = eINSTANCE.getAngabenZurPartnerschaftType_VerheiratetOderLebenspartnerschaft();

		/**
		 * The meta object literal for the '<em><b>Dauer Verheiratet Oder Lebenspartnerschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT = eINSTANCE.getAngabenZurPartnerschaftType_DauerVerheiratetOderLebenspartnerschaft();

		/**
		 * The meta object literal for the '<em><b>Gespraech Ueber Adoption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GESPRAECH_UEBER_ADOPTION = eINSTANCE.getAngabenZurPartnerschaftType_GespraechUeberAdoption();

		/**
		 * The meta object literal for the '<em><b>Meinung Familie Und Freunde</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MEINUNG_FAMILIE_UND_FREUNDE = eINSTANCE.getAngabenZurPartnerschaftType_MeinungFamilieUndFreunde();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT = eINSTANCE.getAngabenZurPartnerschaftType_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Wohnverhaeltnisse Anzahl Zimmer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER = eINSTANCE.getAngabenZurPartnerschaftType_WohnverhaeltnisseAnzahlZimmer();

		/**
		 * The meta object literal for the '<em><b>Wohnverhaeltnisse Wohnflaeche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE = eINSTANCE.getAngabenZurPartnerschaftType_WohnverhaeltnisseWohnflaeche();

		/**
		 * The meta object literal for the '<em><b>Miete Oder Eigentum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MIETE_ODER_EIGENTUM = eINSTANCE.getAngabenZurPartnerschaftType_MieteOderEigentum();

		/**
		 * The meta object literal for the '<em><b>Garten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GARTEN = eINSTANCE.getAngabenZurPartnerschaftType_Garten();

		/**
		 * The meta object literal for the '<em><b>Kinderzimmer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__KINDERZIMMER = eINSTANCE.getAngabenZurPartnerschaftType_Kinderzimmer();

		/**
		 * The meta object literal for the '<em><b>Haustiere</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_PARTNERSCHAFT_TYPE__HAUSTIERE = eINSTANCE.getAngabenZurPartnerschaftType_Haustiere();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnliegenTypeImpl <em>Anliegen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnliegenTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAnliegenType()
		 * @generated
		 */
		EClass ANLIEGEN_TYPE = eINSTANCE.getAnliegenType();

		/**
		 * The meta object literal for the '<em><b>Wunsch Beratung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLIEGEN_TYPE__WUNSCH_BERATUNG = eINSTANCE.getAnliegenType_WunschBeratung();

		/**
		 * The meta object literal for the '<em><b>Kommentar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLIEGEN_TYPE__KOMMENTAR = eINSTANCE.getAnliegenType_Kommentar();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnnehmenderElternteilTypeImpl <em>Annehmender Elternteil Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnnehmenderElternteilTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAnnehmenderElternteilType()
		 * @generated
		 */
		EClass ANNEHMENDER_ELTERNTEIL_TYPE = eINSTANCE.getAnnehmenderElternteilType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEHMENDER_ELTERNTEIL_TYPE__PERSONENDATEN = eINSTANCE.getAnnehmenderElternteilType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEHMENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT = eINSTANCE.getAnnehmenderElternteilType_Staatsangehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEHMENDER_ELTERNTEIL_TYPE__GEBURT = eINSTANCE.getAnnehmenderElternteilType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Berufliche Taetigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEHMENDER_ELTERNTEIL_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT = eINSTANCE.getAnnehmenderElternteilType_AktuelleBeruflicheTaetigkeit();

		/**
		 * The meta object literal for the '<em><b>Gruende Motive Fuer Adoption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEHMENDER_ELTERNTEIL_TYPE__GRUENDE_MOTIVE_FUER_ADOPTION = eINSTANCE.getAnnehmenderElternteilType_GruendeMotiveFuerAdoption();

		/**
		 * The meta object literal for the '<em><b>Veraenderung Durch Adoption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEHMENDER_ELTERNTEIL_TYPE__VERAENDERUNG_DURCH_ADOPTION = eINSTANCE.getAnnehmenderElternteilType_VeraenderungDurchAdoption();

		/**
		 * The meta object literal for the '<em><b>Einkuenfte Aus Taetigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEHMENDER_ELTERNTEIL_TYPE__EINKUENFTE_AUS_TAETIGKEIT = eINSTANCE.getAnnehmenderElternteilType_EinkuenfteAusTaetigkeit();

		/**
		 * The meta object literal for the '<em><b>Andere Einkuenfte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEHMENDER_ELTERNTEIL_TYPE__ANDERE_EINKUENFTE = eINSTANCE.getAnnehmenderElternteilType_AndereEinkuenfte();

		/**
		 * The meta object literal for the '<em><b>Schuldverpflichtungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEHMENDER_ELTERNTEIL_TYPE__SCHULDVERPFLICHTUNGEN = eINSTANCE.getAnnehmenderElternteilType_Schuldverpflichtungen();

		/**
		 * The meta object literal for the '<em><b>Unterhaltsverpflichtungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEHMENDER_ELTERNTEIL_TYPE__UNTERHALTSVERPFLICHTUNGEN = eINSTANCE.getAnnehmenderElternteilType_Unterhaltsverpflichtungen();

		/**
		 * The meta object literal for the '<em><b>Monatliche Fixkosten Unterkunft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEHMENDER_ELTERNTEIL_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT = eINSTANCE.getAnnehmenderElternteilType_MonatlicheFixkostenUnterkunft();

		/**
		 * The meta object literal for the '<em><b>Religionszugehoerigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEHMENDER_ELTERNTEIL_TYPE__RELIGIONSZUGEHOERIGKEIT = eINSTANCE.getAnnehmenderElternteilType_Religionszugehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Aufenthaltsstatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEHMENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS = eINSTANCE.getAnnehmenderElternteilType_Aufenthaltsstatus();

		/**
		 * The meta object literal for the '<em><b>Geschlecht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEHMENDER_ELTERNTEIL_TYPE__GESCHLECHT = eINSTANCE.getAnnehmenderElternteilType_Geschlecht();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl <em>Antragdetails Alterssicherung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAntragdetailsAlterssicherungType()
		 * @generated
		 */
		EClass ANTRAGDETAILS_ALTERSSICHERUNG_TYPE = eINSTANCE.getAntragdetailsAlterssicherungType();

		/**
		 * The meta object literal for the '<em><b>Beantragung Zuschuss Alterssicherung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG = eINSTANCE.getAntragdetailsAlterssicherungType_BeantragungZuschussAlterssicherung();

		/**
		 * The meta object literal for the '<em><b>Zuschuesse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE = eINSTANCE.getAntragdetailsAlterssicherungType_Zuschuesse();

		/**
		 * The meta object literal for the '<em><b>Hoehe Zuschuesse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HOEHE_ZUSCHUESSE = eINSTANCE.getAntragdetailsAlterssicherungType_HoeheZuschuesse();

		/**
		 * The meta object literal for the '<em><b>Von Anderer Stelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__VON_ANDERER_STELLE = eINSTANCE.getAntragdetailsAlterssicherungType_VonAndererStelle();

		/**
		 * The meta object literal for the '<em><b>Art Hoehe Absicherung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ART_HOEHE_ABSICHERUNG = eINSTANCE.getAntragdetailsAlterssicherungType_ArtHoeheAbsicherung();

		/**
		 * The meta object literal for the '<em><b>Alleinige Pflegeperson</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ALLEINIGE_PFLEGEPERSON = eINSTANCE.getAntragdetailsAlterssicherungType_AlleinigePflegeperson();

		/**
		 * The meta object literal for the '<em><b>Hauptpflegeperson</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HAUPTPFLEGEPERSON = eINSTANCE.getAntragdetailsAlterssicherungType_Hauptpflegeperson();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsTypeImpl <em>Antragdetails Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAntragdetailsType()
		 * @generated
		 */
		EClass ANTRAGDETAILS_TYPE = eINSTANCE.getAntragdetailsType();

		/**
		 * The meta object literal for the '<em><b>Antrag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGDETAILS_TYPE__ANTRAG = eINSTANCE.getAntragdetailsType_Antrag();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGDETAILS_TYPE__INFORMATION = eINSTANCE.getAntragdetailsType_Information();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsUnfallversicherungTypeImpl <em>Antragdetails Unfallversicherung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsUnfallversicherungTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAntragdetailsUnfallversicherungType()
		 * @generated
		 */
		EClass ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE = eINSTANCE.getAntragdetailsUnfallversicherungType();

		/**
		 * The meta object literal for the '<em><b>Beantragung Kosten Unfallversicherung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG = eINSTANCE.getAntragdetailsUnfallversicherungType_BeantragungKostenUnfallversicherung();

		/**
		 * The meta object literal for the '<em><b>Zuschuesse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE = eINSTANCE.getAntragdetailsUnfallversicherungType_Zuschuesse();

		/**
		 * The meta object literal for the '<em><b>Hoehe Zuschuesse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__HOEHE_ZUSCHUESSE = eINSTANCE.getAntragdetailsUnfallversicherungType_HoeheZuschuesse();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragstellerTypeImpl <em>Antragsteller Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragstellerTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getAntragstellerType()
		 * @generated
		 */
		EClass ANTRAGSTELLER_TYPE = eINSTANCE.getAntragstellerType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLER_TYPE__PERSONENDATEN = eINSTANCE.getAntragstellerType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Fallnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLER_TYPE__FALLNUMMER = eINSTANCE.getAntragstellerType_Fallnummer();

		/**
		 * The meta object literal for the '<em><b>Antragsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLER_TYPE__ANTRAGSDATUM = eINSTANCE.getAntragstellerType_Antragsdatum();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLER_TYPE__GEBURT = eINSTANCE.getAntragstellerType_Geburt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.BeitragsuebernahmeUnfallversicherungTypeImpl <em>Beitragsuebernahme Unfallversicherung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.BeitragsuebernahmeUnfallversicherungTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getBeitragsuebernahmeUnfallversicherungType()
		 * @generated
		 */
		EClass BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE = eINSTANCE.getBeitragsuebernahmeUnfallversicherungType();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getBeitragsuebernahmeUnfallversicherungType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Angaben</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__ALLGEMEINE_ANGABEN = eINSTANCE.getBeitragsuebernahmeUnfallversicherungType_AllgemeineAngaben();

		/**
		 * The meta object literal for the '<em><b>Antragdetails Unfallversicherung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__ANTRAGDETAILS_UNFALLVERSICHERUNG = eINSTANCE.getBeitragsuebernahmeUnfallversicherungType_AntragdetailsUnfallversicherung();

		/**
		 * The meta object literal for the '<em><b>Pflegekinder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__PFLEGEKINDER = eINSTANCE.getBeitragsuebernahmeUnfallversicherungType_Pflegekinder();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__NACHWEISE = eINSTANCE.getBeitragsuebernahmeUnfallversicherungType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getBeitragsuebernahmeUnfallversicherungType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Signatur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__SIGNATUR = eINSTANCE.getBeitragsuebernahmeUnfallversicherungType_Signatur();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getBeitragsuebernahmeUnfallversicherungType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.BestimmtesKindTypeImpl <em>Bestimmtes Kind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.BestimmtesKindTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getBestimmtesKindType()
		 * @generated
		 */
		EClass BESTIMMTES_KIND_TYPE = eINSTANCE.getBestimmtesKindType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BESTIMMTES_KIND_TYPE__PERSONENDATEN = eINSTANCE.getBestimmtesKindType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BESTIMMTES_KIND_TYPE__GEBURT = eINSTANCE.getBestimmtesKindType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Zustaendiges Jugendamt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BESTIMMTES_KIND_TYPE__ZUSTAENDIGES_JUGENDAMT = eINSTANCE.getBestimmtesKindType_ZustaendigesJugendamt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DatenschutzUndEinwilligungTypeImpl <em>Datenschutz Und Einwilligung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DatenschutzUndEinwilligungTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getDatenschutzUndEinwilligungType()
		 * @generated
		 */
		EClass DATENSCHUTZ_UND_EINWILLIGUNG_TYPE = eINSTANCE.getDatenschutzUndEinwilligungType();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Datenschutzerklaerung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__ALLGEMEINE_DATENSCHUTZERKLAERUNG = eINSTANCE.getDatenschutzUndEinwilligungType_AllgemeineDatenschutzerklaerung();

		/**
		 * The meta object literal for the '<em><b>Kenntnissnahme Datenschutzerklaerung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__KENNTNISSNAHME_DATENSCHUTZERKLAERUNG = eINSTANCE.getDatenschutzUndEinwilligungType_KenntnissnahmeDatenschutzerklaerung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DigitalerRueckkanalTypeImpl <em>Digitaler Rueckkanal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DigitalerRueckkanalTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getDigitalerRueckkanalType()
		 * @generated
		 */
		EClass DIGITALER_RUECKKANAL_TYPE = eINSTANCE.getDigitalerRueckkanalType();

		/**
		 * The meta object literal for the '<em><b>Postfach UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITALER_RUECKKANAL_TYPE__POSTFACH_UUID = eINSTANCE.getDigitalerRueckkanalType_PostfachUUID();

		/**
		 * The meta object literal for the '<em><b>Einverstaendnis Digitaler Rueckkanal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITALER_RUECKKANAL_TYPE__EINVERSTAENDNIS_DIGITALER_RUECKKANAL = eINSTANCE.getDigitalerRueckkanalType_EinverstaendnisDigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DocumentRootImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Adoptionundpflegekinder Adoption0901</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901 = eINSTANCE.getDocumentRoot_AdoptionundpflegekinderAdoption0901();

		/**
		 * The meta object literal for the '<em><b>Adoptionundpflegekinder Pflegekinder0902</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902 = eINSTANCE.getDocumentRoot_AdoptionundpflegekinderPflegekinder0902();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl <em>Einkommen Pflegekind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getEinkommenPflegekindType()
		 * @generated
		 */
		EClass EINKOMMEN_PFLEGEKIND_TYPE = eINSTANCE.getEinkommenPflegekindType();

		/**
		 * The meta object literal for the '<em><b>Einkommen Ab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_PFLEGEKIND_TYPE__EINKOMMEN_AB = eINSTANCE.getEinkommenPflegekindType_EinkommenAb();

		/**
		 * The meta object literal for the '<em><b>Hoehe Einkommen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_EINKOMMEN = eINSTANCE.getEinkommenPflegekindType_HoeheEinkommen();

		/**
		 * The meta object literal for the '<em><b>Bezug Kindergeld Ab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_PFLEGEKIND_TYPE__BEZUG_KINDERGELD_AB = eINSTANCE.getEinkommenPflegekindType_BezugKindergeldAb();

		/**
		 * The meta object literal for the '<em><b>Hoehe Kindergeld</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_KINDERGELD = eINSTANCE.getEinkommenPflegekindType_HoeheKindergeld();

		/**
		 * The meta object literal for the '<em><b>Art Des Einkommens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS = eINSTANCE.getEinkommenPflegekindType_ArtDesEinkommens();

		/**
		 * The meta object literal for the '<em><b>Sonstiges Einkommen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_PFLEGEKIND_TYPE__SONSTIGES_EINKOMMEN = eINSTANCE.getEinkommenPflegekindType_SonstigesEinkommen();

		/**
		 * The meta object literal for the '<em><b>Zustaendige Familienkasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_PFLEGEKIND_TYPE__ZUSTAENDIGE_FAMILIENKASSE = eINSTANCE.getEinkommenPflegekindType_ZustaendigeFamilienkasse();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl <em>Einkommen Und Wohnen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getEinkommenUndWohnenType()
		 * @generated
		 */
		EClass EINKOMMEN_UND_WOHNEN_TYPE = eINSTANCE.getEinkommenUndWohnenType();

		/**
		 * The meta object literal for the '<em><b>Einkuenfte Aus Taetigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_UND_WOHNEN_TYPE__EINKUENFTE_AUS_TAETIGKEIT = eINSTANCE.getEinkommenUndWohnenType_EinkuenfteAusTaetigkeit();

		/**
		 * The meta object literal for the '<em><b>Andere Einkuenfte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_UND_WOHNEN_TYPE__ANDERE_EINKUENFTE = eINSTANCE.getEinkommenUndWohnenType_AndereEinkuenfte();

		/**
		 * The meta object literal for the '<em><b>Schuldverpflichtungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_UND_WOHNEN_TYPE__SCHULDVERPFLICHTUNGEN = eINSTANCE.getEinkommenUndWohnenType_Schuldverpflichtungen();

		/**
		 * The meta object literal for the '<em><b>Unterhaltsverpflichtungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_UND_WOHNEN_TYPE__UNTERHALTSVERPFLICHTUNGEN = eINSTANCE.getEinkommenUndWohnenType_Unterhaltsverpflichtungen();

		/**
		 * The meta object literal for the '<em><b>Monatliche Fixkosten Unterkunft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_UND_WOHNEN_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT = eINSTANCE.getEinkommenUndWohnenType_MonatlicheFixkostenUnterkunft();

		/**
		 * The meta object literal for the '<em><b>Wohnverhaeltnisse Anzahl Zimmer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER = eINSTANCE.getEinkommenUndWohnenType_WohnverhaeltnisseAnzahlZimmer();

		/**
		 * The meta object literal for the '<em><b>Wohnverhaeltnisse Wohnflaeche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE = eINSTANCE.getEinkommenUndWohnenType_WohnverhaeltnisseWohnflaeche();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl <em>Fremdkindadoption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getFremdkindadoptionType()
		 * @generated
		 */
		EClass FREMDKINDADOPTION_TYPE = eINSTANCE.getFremdkindadoptionType();

		/**
		 * The meta object literal for the '<em><b>Beratungscode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREMDKINDADOPTION_TYPE__BERATUNGSCODE = eINSTANCE.getFremdkindadoptionType_Beratungscode();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Angaben</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREMDKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN = eINSTANCE.getFremdkindadoptionType_AllgemeineAngaben();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Partnerschaft</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT = eINSTANCE.getFremdkindadoptionType_AngabenZurPartnerschaft();

		/**
		 * The meta object literal for the '<em><b>Angaben Zu Kindern Der Familie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREMDKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE = eINSTANCE.getFremdkindadoptionType_AngabenZuKindernDerFamilie();

		/**
		 * The meta object literal for the '<em><b>Weitere Personen Im Hauhalt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREMDKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT = eINSTANCE.getFremdkindadoptionType_WeiterePersonenImHauhalt();

		/**
		 * The meta object literal for the '<em><b>Auseinandersetzung Thema Adoption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREMDKINDADOPTION_TYPE__AUSEINANDERSETZUNG_THEMA_ADOPTION = eINSTANCE.getFremdkindadoptionType_AuseinandersetzungThemaAdoption();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREMDKINDADOPTION_TYPE__NACHWEISE = eINSTANCE.getFremdkindadoptionType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREMDKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getFremdkindadoptionType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Signatur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREMDKINDADOPTION_TYPE__SIGNATUR = eINSTANCE.getFremdkindadoptionType_Signatur();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getFremdkindadoptionType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getFremdkindadoptionType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Aertzliche Behandlung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREMDKINDADOPTION_TYPE__AERTZLICHE_BEHANDLUNG = eINSTANCE.getFremdkindadoptionType_AertzlicheBehandlung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontakformularTypeImpl <em>Kontakformular Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontakformularTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getKontakformularType()
		 * @generated
		 */
		EClass KONTAKFORMULAR_TYPE = eINSTANCE.getKontakformularType();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKFORMULAR_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getKontakformularType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKFORMULAR_TYPE__PERSONENDATEN = eINSTANCE.getKontakformularType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKFORMULAR_TYPE__ANSCHRIFT = eINSTANCE.getKontakformularType_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Anliegen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKFORMULAR_TYPE__ANLIEGEN = eINSTANCE.getKontakformularType_Anliegen();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKFORMULAR_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getKontakformularType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKFORMULAR_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getKontakformularType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontoinformationenTypeImpl <em>Kontoinformationen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontoinformationenTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getKontoinformationenType()
		 * @generated
		 */
		EClass KONTOINFORMATIONEN_TYPE = eINSTANCE.getKontoinformationenType();

		/**
		 * The meta object literal for the '<em><b>Beantragung Jugendhilfe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE = eINSTANCE.getKontoinformationenType_BeantragungJugendhilfe();

		/**
		 * The meta object literal for the '<em><b>Bankverbindung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG = eINSTANCE.getKontoinformationenType_Bankverbindung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl <em>Moeglichkeiten Und Grenzen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getMoeglichkeitenUndGrenzenType()
		 * @generated
		 */
		EClass MOEGLICHKEITEN_UND_GRENZEN_TYPE = eINSTANCE.getMoeglichkeitenUndGrenzenType();

		/**
		 * The meta object literal for the '<em><b>Zutrauen Kind Jeden Alters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_JEDEN_ALTERS = eINSTANCE.getMoeglichkeitenUndGrenzenType_ZutrauenKindJedenAlters();

		/**
		 * The meta object literal for the '<em><b>Zutrauen Kind Altersangabe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_ALTERSANGABE = eINSTANCE.getMoeglichkeitenUndGrenzenType_ZutrauenKindAltersangabe();

		/**
		 * The meta object literal for the '<em><b>Zutrauen Kind Beeintraechtigung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_BEEINTRAECHTIGUNG = eINSTANCE.getMoeglichkeitenUndGrenzenType_ZutrauenKindBeeintraechtigung();

		/**
		 * The meta object literal for the '<em><b>Zutrauen Kind Koerperliche Beeintraechtigung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG = eINSTANCE.getMoeglichkeitenUndGrenzenType_ZutrauenKindKoerperlicheBeeintraechtigung();

		/**
		 * The meta object literal for the '<em><b>Zutrauen Kind Geistiger Beeintraechtigung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG = eINSTANCE.getMoeglichkeitenUndGrenzenType_ZutrauenKindGeistigerBeeintraechtigung();

		/**
		 * The meta object literal for the '<em><b>Zutrauen Kind Psychischer Beeintraechtigung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG = eINSTANCE.getMoeglichkeitenUndGrenzenType_ZutrauenKindPsychischerBeeintraechtigung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweiseEinreichenTypeImpl <em>Nachweise Einreichen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweiseEinreichenTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getNachweiseEinreichenType()
		 * @generated
		 */
		EClass NACHWEISE_EINREICHEN_TYPE = eINSTANCE.getNachweiseEinreichenType();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getNachweiseEinreichenType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Antragsteller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_EINREICHEN_TYPE__ANTRAGSTELLER = eINSTANCE.getNachweiseEinreichenType_Antragsteller();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_EINREICHEN_TYPE__NACHWEISE = eINSTANCE.getNachweiseEinreichenType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_EINREICHEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getNachweiseEinreichenType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_EINREICHEN_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getNachweiseEinreichenType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweisTypeImpl <em>Nachweis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.NachweisTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getNachweisType()
		 * @generated
		 */
		EClass NACHWEIS_TYPE = eINSTANCE.getNachweisType();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEIS_TYPE__BESCHREIBUNG = eINSTANCE.getNachweisType_Beschreibung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragGezahltVonTypeImpl <em>Pauschalbetrag Gezahlt Von Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragGezahltVonTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPauschalbetragGezahltVonType()
		 * @generated
		 */
		EClass PAUSCHALBETRAG_GEZAHLT_VON_TYPE = eINSTANCE.getPauschalbetragGezahltVonType();

		/**
		 * The meta object literal for the '<em><b>Stadt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAUSCHALBETRAG_GEZAHLT_VON_TYPE__STADT = eINSTANCE.getPauschalbetragGezahltVonType_Stadt();

		/**
		 * The meta object literal for the '<em><b>Bezirk Stadtteil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAUSCHALBETRAG_GEZAHLT_VON_TYPE__BEZIRK_STADTTEIL = eINSTANCE.getPauschalbetragGezahltVonType_BezirkStadtteil();

		/**
		 * The meta object literal for the '<em><b>Aktenzeichen Wirtschaftliche Jugendhilfe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAUSCHALBETRAG_GEZAHLT_VON_TYPE__AKTENZEICHEN_WIRTSCHAFTLICHE_JUGENDHILFE = eINSTANCE.getPauschalbetragGezahltVonType_AktenzeichenWirtschaftlicheJugendhilfe();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl <em>Pauschalbetrag Vollzeitpflege Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PauschalbetragVollzeitpflegeTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPauschalbetragVollzeitpflegeType()
		 * @generated
		 */
		EClass PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE = eINSTANCE.getPauschalbetragVollzeitpflegeType();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getPauschalbetragVollzeitpflegeType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Angaben Pflegekind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__ANGABEN_PFLEGEKIND = eINSTANCE.getPauschalbetragVollzeitpflegeType_AngabenPflegekind();

		/**
		 * The meta object literal for the '<em><b>Pflegeperson</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__PFLEGEPERSON = eINSTANCE.getPauschalbetragVollzeitpflegeType_Pflegeperson();

		/**
		 * The meta object literal for the '<em><b>Kinder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KINDER = eINSTANCE.getPauschalbetragVollzeitpflegeType_Kinder();

		/**
		 * The meta object literal for the '<em><b>Kontoinformationen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__KONTOINFORMATIONEN = eINSTANCE.getPauschalbetragVollzeitpflegeType_Kontoinformationen();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__NACHWEISE = eINSTANCE.getPauschalbetragVollzeitpflegeType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getPauschalbetragVollzeitpflegeType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Signatur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__SIGNATUR = eINSTANCE.getPauschalbetragVollzeitpflegeType_Signatur();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAUSCHALBETRAG_VOLLZEITPFLEGE_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getPauschalbetragVollzeitpflegeType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PersonendatenTypeImpl <em>Personendaten Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PersonendatenTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPersonendatenType()
		 * @generated
		 */
		EClass PERSONENDATEN_TYPE = eINSTANCE.getPersonendatenType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONENDATEN_TYPE__NAME = eINSTANCE.getPersonendatenType_Name();

		/**
		 * The meta object literal for the '<em><b>Kontakt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONENDATEN_TYPE__KONTAKT = eINSTANCE.getPersonendatenType_Kontakt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindBasisTypeImpl <em>Pflegekind Basis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindBasisTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPflegekindBasisType()
		 * @generated
		 */
		EClass PFLEGEKIND_BASIS_TYPE = eINSTANCE.getPflegekindBasisType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEKIND_BASIS_TYPE__PERSONENDATEN = eINSTANCE.getPflegekindBasisType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEKIND_BASIS_TYPE__GEBURT = eINSTANCE.getPflegekindBasisType_Geburt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindTypeImpl <em>Pflegekind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegekindTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPflegekindType()
		 * @generated
		 */
		EClass PFLEGEKIND_TYPE = eINSTANCE.getPflegekindType();

		/**
		 * The meta object literal for the '<em><b>In Pflege Seit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLEGEKIND_TYPE__IN_PFLEGE_SEIT = eINSTANCE.getPflegekindType_InPflegeSeit();

		/**
		 * The meta object literal for the '<em><b>Pflegeform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEKIND_TYPE__PFLEGEFORM = eINSTANCE.getPflegekindType_Pflegeform();

		/**
		 * The meta object literal for the '<em><b>Pauschalbetrag Gezahlt Von</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEKIND_TYPE__PAUSCHALBETRAG_GEZAHLT_VON = eINSTANCE.getPflegekindType_PauschalbetragGezahltVon();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonBasisTypeImpl <em>Pflegeperson Basis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonBasisTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPflegepersonBasisType()
		 * @generated
		 */
		EClass PFLEGEPERSON_BASIS_TYPE = eINSTANCE.getPflegepersonBasisType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_BASIS_TYPE__PERSONENDATEN = eINSTANCE.getPflegepersonBasisType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_BASIS_TYPE__GEBURT = eINSTANCE.getPflegepersonBasisType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Steueridentifikationsnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLEGEPERSON_BASIS_TYPE__STEUERIDENTIFIKATIONSNUMMER = eINSTANCE.getPflegepersonBasisType_Steueridentifikationsnummer();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl <em>Pflegeperson Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getPflegepersonType()
		 * @generated
		 */
		EClass PFLEGEPERSON_TYPE = eINSTANCE.getPflegepersonType();

		/**
		 * The meta object literal for the '<em><b>Beratungscode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLEGEPERSON_TYPE__BERATUNGSCODE = eINSTANCE.getPflegepersonType_Beratungscode();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getPflegepersonType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Angaben</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN = eINSTANCE.getPflegepersonType_AllgemeineAngaben();

		/**
		 * The meta object literal for the '<em><b>Einkommen Und Wohnen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN = eINSTANCE.getPflegepersonType_EinkommenUndWohnen();

		/**
		 * The meta object literal for the '<em><b>Angaben Zu Kindern Der Familie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE = eINSTANCE.getPflegepersonType_AngabenZuKindernDerFamilie();

		/**
		 * The meta object literal for the '<em><b>Weitere Personen Im Hauhalt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__WEITERE_PERSONEN_IM_HAUHALT = eINSTANCE.getPflegepersonType_WeiterePersonenImHauhalt();

		/**
		 * The meta object literal for the '<em><b>Bestimmtes Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__BESTIMMTES_KIND = eINSTANCE.getPflegepersonType_BestimmtesKind();

		/**
		 * The meta object literal for the '<em><b>Moeglichkeiten Und Grenzen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN = eINSTANCE.getPflegepersonType_MoeglichkeitenUndGrenzen();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__NACHWEISE = eINSTANCE.getPflegepersonType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getPflegepersonType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Signatur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__SIGNATUR = eINSTANCE.getPflegepersonType_Signatur();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getPflegepersonType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SignaturTypeImpl <em>Signatur Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SignaturTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getSignaturType()
		 * @generated
		 */
		EClass SIGNATUR_TYPE = eINSTANCE.getSignaturType();

		/**
		 * The meta object literal for the '<em><b>Elektronisch Signieren</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATUR_TYPE__ELEKTRONISCH_SIGNIEREN = eINSTANCE.getSignaturType_ElektronischSignieren();

		/**
		 * The meta object literal for the '<em><b>Anlage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATUR_TYPE__ANLAGE = eINSTANCE.getSignaturType_Anlage();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SonstigeAntraegeSendenTypeImpl <em>Sonstige Antraege Senden Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SonstigeAntraegeSendenTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getSonstigeAntraegeSendenType()
		 * @generated
		 */
		EClass SONSTIGE_ANTRAEGE_SENDEN_TYPE = eINSTANCE.getSonstigeAntraegeSendenType();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONSTIGE_ANTRAEGE_SENDEN_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getSonstigeAntraegeSendenType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Angaben</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONSTIGE_ANTRAEGE_SENDEN_TYPE__ALLGEMEINE_ANGABEN = eINSTANCE.getSonstigeAntraegeSendenType_AllgemeineAngaben();

		/**
		 * The meta object literal for the '<em><b>Antragdetails</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONSTIGE_ANTRAEGE_SENDEN_TYPE__ANTRAGDETAILS = eINSTANCE.getSonstigeAntraegeSendenType_Antragdetails();

		/**
		 * The meta object literal for the '<em><b>Pflegekinder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONSTIGE_ANTRAEGE_SENDEN_TYPE__PFLEGEKINDER = eINSTANCE.getSonstigeAntraegeSendenType_Pflegekinder();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONSTIGE_ANTRAEGE_SENDEN_TYPE__NACHWEISE = eINSTANCE.getSonstigeAntraegeSendenType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONSTIGE_ANTRAEGE_SENDEN_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getSonstigeAntraegeSendenType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Signatur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONSTIGE_ANTRAEGE_SENDEN_TYPE__SIGNATUR = eINSTANCE.getSonstigeAntraegeSendenType_Signatur();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONSTIGE_ANTRAEGE_SENDEN_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getSonstigeAntraegeSendenType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.StiefkindadoptionTypeImpl <em>Stiefkindadoption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.StiefkindadoptionTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getStiefkindadoptionType()
		 * @generated
		 */
		EClass STIEFKINDADOPTION_TYPE = eINSTANCE.getStiefkindadoptionType();

		/**
		 * The meta object literal for the '<em><b>Beratungscode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIEFKINDADOPTION_TYPE__BERATUNGSCODE = eINSTANCE.getStiefkindadoptionType_Beratungscode();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getStiefkindadoptionType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Angaben Des Zu Adoptierenden Kindes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES = eINSTANCE.getStiefkindadoptionType_AngabenDesZuAdoptierendenKindes();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Angaben</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN = eINSTANCE.getStiefkindadoptionType_AllgemeineAngaben();

		/**
		 * The meta object literal for the '<em><b>Verbleibender Sorgeberechtigter Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL = eINSTANCE.getStiefkindadoptionType_VerbleibenderSorgeberechtigterElternteil();

		/**
		 * The meta object literal for the '<em><b>Annehmender Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL = eINSTANCE.getStiefkindadoptionType_AnnehmenderElternteil();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Partnerschaft</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT = eINSTANCE.getStiefkindadoptionType_AngabenZurPartnerschaft();

		/**
		 * The meta object literal for the '<em><b>Angaben Zu Kindern Der Familie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE = eINSTANCE.getStiefkindadoptionType_AngabenZuKindernDerFamilie();

		/**
		 * The meta object literal for the '<em><b>Weitere Personen Im Hauhalt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT = eINSTANCE.getStiefkindadoptionType_WeiterePersonenImHauhalt();

		/**
		 * The meta object literal for the '<em><b>Abgebender Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__ABGEBENDER_ELTERNTEIL = eINSTANCE.getStiefkindadoptionType_AbgebenderElternteil();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__NACHWEISE = eINSTANCE.getStiefkindadoptionType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getStiefkindadoptionType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Signatur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__SIGNATUR = eINSTANCE.getStiefkindadoptionType_Signatur();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIEFKINDADOPTION_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getStiefkindadoptionType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerbleibenderSorgeberechtigterElternteilTypeImpl <em>Verbleibender Sorgeberechtigter Elternteil Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerbleibenderSorgeberechtigterElternteilTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getVerbleibenderSorgeberechtigterElternteilType()
		 * @generated
		 */
		EClass VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__PERSONENDATEN = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_Staatsangehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__GEBURT = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Einkuenfte Aus Taetigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__EINKUENFTE_AUS_TAETIGKEIT = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_EinkuenfteAusTaetigkeit();

		/**
		 * The meta object literal for the '<em><b>Andere Einkuenfte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__ANDERE_EINKUENFTE = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_AndereEinkuenfte();

		/**
		 * The meta object literal for the '<em><b>Schuldverpflichtungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__SCHULDVERPFLICHTUNGEN = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_Schuldverpflichtungen();

		/**
		 * The meta object literal for the '<em><b>Unterhaltsverpflichtungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__UNTERHALTSVERPFLICHTUNGEN = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_Unterhaltsverpflichtungen();

		/**
		 * The meta object literal for the '<em><b>Monatliche Fixkosten Unterkunft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_MonatlicheFixkostenUnterkunft();

		/**
		 * The meta object literal for the '<em><b>Aufenthaltsstatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_Aufenthaltsstatus();

		/**
		 * The meta object literal for the '<em><b>Geschlecht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBLEIBENDER_SORGEBERECHTIGTER_ELTERNTEIL_TYPE__GESCHLECHT = eINSTANCE.getVerbleibenderSorgeberechtigterElternteilType_Geschlecht();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl <em>Verwandtenadoption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getVerwandtenadoptionType()
		 * @generated
		 */
		EClass VERWANDTENADOPTION_TYPE = eINSTANCE.getVerwandtenadoptionType();

		/**
		 * The meta object literal for the '<em><b>Beratungscode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERWANDTENADOPTION_TYPE__BERATUNGSCODE = eINSTANCE.getVerwandtenadoptionType_Beratungscode();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG = eINSTANCE.getVerwandtenadoptionType_DatenschutzUndEinwilligung();

		/**
		 * The meta object literal for the '<em><b>Angaben Des Zu Adoptierenden Kindes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES = eINSTANCE.getVerwandtenadoptionType_AngabenDesZuAdoptierendenKindes();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Angaben</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN = eINSTANCE.getVerwandtenadoptionType_AllgemeineAngaben();

		/**
		 * The meta object literal for the '<em><b>Annehmender Elternteil</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL = eINSTANCE.getVerwandtenadoptionType_AnnehmenderElternteil();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Partnerschaft</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT = eINSTANCE.getVerwandtenadoptionType_AngabenZurPartnerschaft();

		/**
		 * The meta object literal for the '<em><b>Angaben Zu Kindern Der Familie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE = eINSTANCE.getVerwandtenadoptionType_AngabenZuKindernDerFamilie();

		/**
		 * The meta object literal for the '<em><b>Weitere Personen Im Hauhalt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT = eINSTANCE.getVerwandtenadoptionType_WeiterePersonenImHauhalt();

		/**
		 * The meta object literal for the '<em><b>Abgebender Elternteil</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__ABGEBENDER_ELTERNTEIL = eINSTANCE.getVerwandtenadoptionType_AbgebenderElternteil();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__NACHWEISE = eINSTANCE.getVerwandtenadoptionType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE = eINSTANCE.getVerwandtenadoptionType_DatenschutzDerFachbehoerde();

		/**
		 * The meta object literal for the '<em><b>Signatur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__SIGNATUR = eINSTANCE.getVerwandtenadoptionType_Signatur();

		/**
		 * The meta object literal for the '<em><b>Digitaler Rueckkanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL = eINSTANCE.getVerwandtenadoptionType_DigitalerRueckkanal();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.WeiterePersonenImHauhaltTypeImpl <em>Weitere Personen Im Hauhalt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.WeiterePersonenImHauhaltTypeImpl
		 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl#getWeiterePersonenImHauhaltType()
		 * @generated
		 */
		EClass WEITERE_PERSONEN_IM_HAUHALT_TYPE = eINSTANCE.getWeiterePersonenImHauhaltType();

		/**
		 * The meta object literal for the '<em><b>Personendaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN = eINSTANCE.getWeiterePersonenImHauhaltType_Personendaten();

		/**
		 * The meta object literal for the '<em><b>Beziehung Zur Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEITERE_PERSONEN_IM_HAUHALT_TYPE__BEZIEHUNG_ZUR_PERSON = eINSTANCE.getWeiterePersonenImHauhaltType_BeziehungZurPerson();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT = eINSTANCE.getWeiterePersonenImHauhaltType_Geburt();

	}

} //AdoptionPackage
