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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isMutterschaftsgeld <em>Mutterschaftsgeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getMutterschaftsgeldZeitraum <em>Mutterschaftsgeld Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getMutterschaftsgeldNachweis <em>Mutterschaftsgeld Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isArbeitgeberzuschuss <em>Arbeitgeberzuschuss</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getArbeitgeberzuschussZeitraum <em>Arbeitgeberzuschuss Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getArbeitgeberzuschussNachweis <em>Arbeitgeberzuschuss Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isKrankentagegeld <em>Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getKrankentagegeldZeitraum <em>Krankentagegeld Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getKrankentagegeldNachweis <em>Krankentagegeld Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isDienstAnwaerterbezug <em>Dienst Anwaerterbezug</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getDienstAnwaerterbezugZeitraum <em>Dienst Anwaerterbezug Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getDienstAnwaerterbezugNachweis <em>Dienst Anwaerterbezug Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isBeamtenSoldatenrecht <em>Beamten Soldatenrecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getBeamtenSoldatenrechtZeitraum <em>Beamten Soldatenrecht Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getBeamtenSodatenrechtNachweis <em>Beamten Sodatenrecht Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isAuslFamilienleistungen <em>Ausl Familienleistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getAuslFamilienleistungenZeitraum <em>Ausl Familienleistungen Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#getAuslFamilienleistungenNachweis <em>Ausl Familienleistungen Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType()
 * @model extendedMetaData="name='MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Erhalt von oder Anspruch auf Mutterschaftsgeld.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutterschaftsgeld</em>' attribute.
	 * @see #isSetMutterschaftsgeld()
	 * @see #unsetMutterschaftsgeld()
	 * @see #setMutterschaftsgeld(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_Mutterschaftsgeld()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeld' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMutterschaftsgeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isMutterschaftsgeld <em>Mutterschaftsgeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutterschaftsgeld</em>' attribute.
	 * @see #isSetMutterschaftsgeld()
	 * @see #unsetMutterschaftsgeld()
	 * @see #isMutterschaftsgeld()
	 * @generated
	 */
	void setMutterschaftsgeld(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isMutterschaftsgeld <em>Mutterschaftsgeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMutterschaftsgeld()
	 * @see #isMutterschaftsgeld()
	 * @see #setMutterschaftsgeld(boolean)
	 * @generated
	 */
	void unsetMutterschaftsgeld();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isMutterschaftsgeld <em>Mutterschaftsgeld</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mutterschaftsgeld</em>' attribute is set.
	 * @see #unsetMutterschaftsgeld()
	 * @see #isMutterschaftsgeld()
	 * @see #setMutterschaftsgeld(boolean)
	 * @generated
	 */
	boolean isSetMutterschaftsgeld();

	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeld Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutterschaftsgeld Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_MutterschaftsgeldZeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldZeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getMutterschaftsgeldZeitraum();

	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeld Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutterschaftsgeld Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_MutterschaftsgeldNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getMutterschaftsgeldNachweis();

	/**
	 * Returns the value of the '<em><b>Arbeitgeberzuschuss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Erhalt von Arbeitsgeberzuschüssen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arbeitgeberzuschuss</em>' attribute.
	 * @see #isSetArbeitgeberzuschuss()
	 * @see #unsetArbeitgeberzuschuss()
	 * @see #setArbeitgeberzuschuss(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_Arbeitgeberzuschuss()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='arbeitgeberzuschuss' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isArbeitgeberzuschuss();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isArbeitgeberzuschuss <em>Arbeitgeberzuschuss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arbeitgeberzuschuss</em>' attribute.
	 * @see #isSetArbeitgeberzuschuss()
	 * @see #unsetArbeitgeberzuschuss()
	 * @see #isArbeitgeberzuschuss()
	 * @generated
	 */
	void setArbeitgeberzuschuss(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isArbeitgeberzuschuss <em>Arbeitgeberzuschuss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArbeitgeberzuschuss()
	 * @see #isArbeitgeberzuschuss()
	 * @see #setArbeitgeberzuschuss(boolean)
	 * @generated
	 */
	void unsetArbeitgeberzuschuss();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isArbeitgeberzuschuss <em>Arbeitgeberzuschuss</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arbeitgeberzuschuss</em>' attribute is set.
	 * @see #unsetArbeitgeberzuschuss()
	 * @see #isArbeitgeberzuschuss()
	 * @see #setArbeitgeberzuschuss(boolean)
	 * @generated
	 */
	boolean isSetArbeitgeberzuschuss();

	/**
	 * Returns the value of the '<em><b>Arbeitgeberzuschuss Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arbeitgeberzuschuss Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_ArbeitgeberzuschussZeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arbeitgeberzuschussZeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getArbeitgeberzuschussZeitraum();

	/**
	 * Returns the value of the '<em><b>Arbeitgeberzuschuss Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arbeitgeberzuschuss Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_ArbeitgeberzuschussNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arbeitgeberzuschussNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getArbeitgeberzuschussNachweis();

	/**
	 * Returns the value of the '<em><b>Krankentagegeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Erhalt von Krankentagegeld.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Krankentagegeld</em>' attribute.
	 * @see #isSetKrankentagegeld()
	 * @see #unsetKrankentagegeld()
	 * @see #setKrankentagegeld(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_Krankentagegeld()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='krankentagegeld' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKrankentagegeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isKrankentagegeld <em>Krankentagegeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Krankentagegeld</em>' attribute.
	 * @see #isSetKrankentagegeld()
	 * @see #unsetKrankentagegeld()
	 * @see #isKrankentagegeld()
	 * @generated
	 */
	void setKrankentagegeld(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isKrankentagegeld <em>Krankentagegeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKrankentagegeld()
	 * @see #isKrankentagegeld()
	 * @see #setKrankentagegeld(boolean)
	 * @generated
	 */
	void unsetKrankentagegeld();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isKrankentagegeld <em>Krankentagegeld</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Krankentagegeld</em>' attribute is set.
	 * @see #unsetKrankentagegeld()
	 * @see #isKrankentagegeld()
	 * @see #setKrankentagegeld(boolean)
	 * @generated
	 */
	boolean isSetKrankentagegeld();

	/**
	 * Returns the value of the '<em><b>Krankentagegeld Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Krankentagegeld Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_KrankentagegeldZeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='krankentagegeldZeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getKrankentagegeldZeitraum();

	/**
	 * Returns the value of the '<em><b>Krankentagegeld Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Krankentagegeld Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_KrankentagegeldNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='krankentagegeldNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getKrankentagegeldNachweis();

	/**
	 * Returns the value of the '<em><b>Dienst Anwaerterbezug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Erhalt von Dienst- oder Anwärterbezügen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dienst Anwaerterbezug</em>' attribute.
	 * @see #isSetDienstAnwaerterbezug()
	 * @see #unsetDienstAnwaerterbezug()
	 * @see #setDienstAnwaerterbezug(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_DienstAnwaerterbezug()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='dienstAnwaerterbezug' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDienstAnwaerterbezug();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isDienstAnwaerterbezug <em>Dienst Anwaerterbezug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dienst Anwaerterbezug</em>' attribute.
	 * @see #isSetDienstAnwaerterbezug()
	 * @see #unsetDienstAnwaerterbezug()
	 * @see #isDienstAnwaerterbezug()
	 * @generated
	 */
	void setDienstAnwaerterbezug(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isDienstAnwaerterbezug <em>Dienst Anwaerterbezug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDienstAnwaerterbezug()
	 * @see #isDienstAnwaerterbezug()
	 * @see #setDienstAnwaerterbezug(boolean)
	 * @generated
	 */
	void unsetDienstAnwaerterbezug();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isDienstAnwaerterbezug <em>Dienst Anwaerterbezug</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dienst Anwaerterbezug</em>' attribute is set.
	 * @see #unsetDienstAnwaerterbezug()
	 * @see #isDienstAnwaerterbezug()
	 * @see #setDienstAnwaerterbezug(boolean)
	 * @generated
	 */
	boolean isSetDienstAnwaerterbezug();

	/**
	 * Returns the value of the '<em><b>Dienst Anwaerterbezug Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dienst Anwaerterbezug Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_DienstAnwaerterbezugZeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dienstAnwaerterbezugZeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getDienstAnwaerterbezugZeitraum();

	/**
	 * Returns the value of the '<em><b>Dienst Anwaerterbezug Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dienst Anwaerterbezug Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_DienstAnwaerterbezugNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dienstAnwaerterbezugNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getDienstAnwaerterbezugNachweis();

	/**
	 * Returns the value of the '<em><b>Beamten Soldatenrecht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Erhalt von Beamten- oder Soldatenrechtlichen Bezügen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beamten Soldatenrecht</em>' attribute.
	 * @see #isSetBeamtenSoldatenrecht()
	 * @see #unsetBeamtenSoldatenrecht()
	 * @see #setBeamtenSoldatenrecht(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_BeamtenSoldatenrecht()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='beamtenSoldatenrecht' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBeamtenSoldatenrecht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isBeamtenSoldatenrecht <em>Beamten Soldatenrecht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beamten Soldatenrecht</em>' attribute.
	 * @see #isSetBeamtenSoldatenrecht()
	 * @see #unsetBeamtenSoldatenrecht()
	 * @see #isBeamtenSoldatenrecht()
	 * @generated
	 */
	void setBeamtenSoldatenrecht(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isBeamtenSoldatenrecht <em>Beamten Soldatenrecht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBeamtenSoldatenrecht()
	 * @see #isBeamtenSoldatenrecht()
	 * @see #setBeamtenSoldatenrecht(boolean)
	 * @generated
	 */
	void unsetBeamtenSoldatenrecht();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isBeamtenSoldatenrecht <em>Beamten Soldatenrecht</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Beamten Soldatenrecht</em>' attribute is set.
	 * @see #unsetBeamtenSoldatenrecht()
	 * @see #isBeamtenSoldatenrecht()
	 * @see #setBeamtenSoldatenrecht(boolean)
	 * @generated
	 */
	boolean isSetBeamtenSoldatenrecht();

	/**
	 * Returns the value of the '<em><b>Beamten Soldatenrecht Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beamten Soldatenrecht Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_BeamtenSoldatenrechtZeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beamtenSoldatenrechtZeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getBeamtenSoldatenrechtZeitraum();

	/**
	 * Returns the value of the '<em><b>Beamten Sodatenrecht Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beamten Sodatenrecht Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_BeamtenSodatenrechtNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beamtenSodatenrechtNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getBeamtenSodatenrechtNachweis();

	/**
	 * Returns the value of the '<em><b>Ausl Familienleistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Erhalt von ausländischen Familienleistungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausl Familienleistungen</em>' attribute.
	 * @see #isSetAuslFamilienleistungen()
	 * @see #unsetAuslFamilienleistungen()
	 * @see #setAuslFamilienleistungen(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_AuslFamilienleistungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='auslFamilienleistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAuslFamilienleistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isAuslFamilienleistungen <em>Ausl Familienleistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausl Familienleistungen</em>' attribute.
	 * @see #isSetAuslFamilienleistungen()
	 * @see #unsetAuslFamilienleistungen()
	 * @see #isAuslFamilienleistungen()
	 * @generated
	 */
	void setAuslFamilienleistungen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isAuslFamilienleistungen <em>Ausl Familienleistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuslFamilienleistungen()
	 * @see #isAuslFamilienleistungen()
	 * @see #setAuslFamilienleistungen(boolean)
	 * @generated
	 */
	void unsetAuslFamilienleistungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType#isAuslFamilienleistungen <em>Ausl Familienleistungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ausl Familienleistungen</em>' attribute is set.
	 * @see #unsetAuslFamilienleistungen()
	 * @see #isAuslFamilienleistungen()
	 * @see #setAuslFamilienleistungen(boolean)
	 * @generated
	 */
	boolean isSetAuslFamilienleistungen();

	/**
	 * Returns the value of the '<em><b>Ausl Familienleistungen Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ausl Familienleistungen Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_AuslFamilienleistungenZeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='auslFamilienleistungenZeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getAuslFamilienleistungenZeitraum();

	/**
	 * Returns the value of the '<em><b>Ausl Familienleistungen Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ausl Familienleistungen Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_AuslFamilienleistungenNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='auslFamilienleistungenNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getAuslFamilienleistungenNachweis();

} // MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType
