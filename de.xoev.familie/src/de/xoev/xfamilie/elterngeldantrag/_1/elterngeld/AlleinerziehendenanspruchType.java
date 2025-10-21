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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alleinerziehendenanspruch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isEntlastungsbetragAlleinerziehende <em>Entlastungsbetrag Alleinerziehende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#getNachweisEntlastungsbetrag <em>Nachweis Entlastungsbetrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isBetreuungDurchAnderenETUnmoeglich <em>Betreuung Durch Anderen ET Unmoeglich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#getNachweisBetreuung <em>Nachweis Betreuung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isKindeswohlgefaehrdungDurchAnderenET <em>Kindeswohlgefaehrdung Durch Anderen ET</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#getNachweisKindeswohlgefaehrdung <em>Nachweis Kindeswohlgefaehrdung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAlleinerziehendenanspruchType()
 * @model extendedMetaData="name='AlleinerziehendenanspruchType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AlleinerziehendenanspruchType extends EObject {
	/**
	 * Returns the value of the '<em><b>Entlastungsbetrag Alleinerziehende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entlastungsbetrag Alleinerziehende</em>' attribute.
	 * @see #isSetEntlastungsbetragAlleinerziehende()
	 * @see #unsetEntlastungsbetragAlleinerziehende()
	 * @see #setEntlastungsbetragAlleinerziehende(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAlleinerziehendenanspruchType_EntlastungsbetragAlleinerziehende()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='entlastungsbetragAlleinerziehende' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEntlastungsbetragAlleinerziehende();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isEntlastungsbetragAlleinerziehende <em>Entlastungsbetrag Alleinerziehende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entlastungsbetrag Alleinerziehende</em>' attribute.
	 * @see #isSetEntlastungsbetragAlleinerziehende()
	 * @see #unsetEntlastungsbetragAlleinerziehende()
	 * @see #isEntlastungsbetragAlleinerziehende()
	 * @generated
	 */
	void setEntlastungsbetragAlleinerziehende(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isEntlastungsbetragAlleinerziehende <em>Entlastungsbetrag Alleinerziehende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntlastungsbetragAlleinerziehende()
	 * @see #isEntlastungsbetragAlleinerziehende()
	 * @see #setEntlastungsbetragAlleinerziehende(boolean)
	 * @generated
	 */
	void unsetEntlastungsbetragAlleinerziehende();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isEntlastungsbetragAlleinerziehende <em>Entlastungsbetrag Alleinerziehende</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entlastungsbetrag Alleinerziehende</em>' attribute is set.
	 * @see #unsetEntlastungsbetragAlleinerziehende()
	 * @see #isEntlastungsbetragAlleinerziehende()
	 * @see #setEntlastungsbetragAlleinerziehende(boolean)
	 * @generated
	 */
	boolean isSetEntlastungsbetragAlleinerziehende();

	/**
	 * Returns the value of the '<em><b>Nachweis Entlastungsbetrag</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Entlastungsbetrag</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAlleinerziehendenanspruchType_NachweisEntlastungsbetrag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisEntlastungsbetrag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisEntlastungsbetrag();

	/**
	 * Returns the value of the '<em><b>Betreuung Durch Anderen ET Unmoeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Betreuung Durch Anderen ET Unmoeglich</em>' attribute.
	 * @see #isSetBetreuungDurchAnderenETUnmoeglich()
	 * @see #unsetBetreuungDurchAnderenETUnmoeglich()
	 * @see #setBetreuungDurchAnderenETUnmoeglich(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAlleinerziehendenanspruchType_BetreuungDurchAnderenETUnmoeglich()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='betreuungDurchAnderenETUnmoeglich' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBetreuungDurchAnderenETUnmoeglich();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isBetreuungDurchAnderenETUnmoeglich <em>Betreuung Durch Anderen ET Unmoeglich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betreuung Durch Anderen ET Unmoeglich</em>' attribute.
	 * @see #isSetBetreuungDurchAnderenETUnmoeglich()
	 * @see #unsetBetreuungDurchAnderenETUnmoeglich()
	 * @see #isBetreuungDurchAnderenETUnmoeglich()
	 * @generated
	 */
	void setBetreuungDurchAnderenETUnmoeglich(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isBetreuungDurchAnderenETUnmoeglich <em>Betreuung Durch Anderen ET Unmoeglich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBetreuungDurchAnderenETUnmoeglich()
	 * @see #isBetreuungDurchAnderenETUnmoeglich()
	 * @see #setBetreuungDurchAnderenETUnmoeglich(boolean)
	 * @generated
	 */
	void unsetBetreuungDurchAnderenETUnmoeglich();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isBetreuungDurchAnderenETUnmoeglich <em>Betreuung Durch Anderen ET Unmoeglich</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Betreuung Durch Anderen ET Unmoeglich</em>' attribute is set.
	 * @see #unsetBetreuungDurchAnderenETUnmoeglich()
	 * @see #isBetreuungDurchAnderenETUnmoeglich()
	 * @see #setBetreuungDurchAnderenETUnmoeglich(boolean)
	 * @generated
	 */
	boolean isSetBetreuungDurchAnderenETUnmoeglich();

	/**
	 * Returns the value of the '<em><b>Nachweis Betreuung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Betreuung</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAlleinerziehendenanspruchType_NachweisBetreuung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisBetreuung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisBetreuung();

	/**
	 * Returns the value of the '<em><b>Kindeswohlgefaehrdung Durch Anderen ET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kindeswohlgefaehrdung Durch Anderen ET</em>' attribute.
	 * @see #isSetKindeswohlgefaehrdungDurchAnderenET()
	 * @see #unsetKindeswohlgefaehrdungDurchAnderenET()
	 * @see #setKindeswohlgefaehrdungDurchAnderenET(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAlleinerziehendenanspruchType_KindeswohlgefaehrdungDurchAnderenET()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='kindeswohlgefaehrdungDurchAnderenET' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKindeswohlgefaehrdungDurchAnderenET();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isKindeswohlgefaehrdungDurchAnderenET <em>Kindeswohlgefaehrdung Durch Anderen ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kindeswohlgefaehrdung Durch Anderen ET</em>' attribute.
	 * @see #isSetKindeswohlgefaehrdungDurchAnderenET()
	 * @see #unsetKindeswohlgefaehrdungDurchAnderenET()
	 * @see #isKindeswohlgefaehrdungDurchAnderenET()
	 * @generated
	 */
	void setKindeswohlgefaehrdungDurchAnderenET(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isKindeswohlgefaehrdungDurchAnderenET <em>Kindeswohlgefaehrdung Durch Anderen ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKindeswohlgefaehrdungDurchAnderenET()
	 * @see #isKindeswohlgefaehrdungDurchAnderenET()
	 * @see #setKindeswohlgefaehrdungDurchAnderenET(boolean)
	 * @generated
	 */
	void unsetKindeswohlgefaehrdungDurchAnderenET();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType#isKindeswohlgefaehrdungDurchAnderenET <em>Kindeswohlgefaehrdung Durch Anderen ET</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kindeswohlgefaehrdung Durch Anderen ET</em>' attribute is set.
	 * @see #unsetKindeswohlgefaehrdungDurchAnderenET()
	 * @see #isKindeswohlgefaehrdungDurchAnderenET()
	 * @see #setKindeswohlgefaehrdungDurchAnderenET(boolean)
	 * @generated
	 */
	boolean isSetKindeswohlgefaehrdungDurchAnderenET();

	/**
	 * Returns the value of the '<em><b>Nachweis Kindeswohlgefaehrdung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Kindeswohlgefaehrdung</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAlleinerziehendenanspruchType_NachweisKindeswohlgefaehrdung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisKindeswohlgefaehrdung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisKindeswohlgefaehrdung();

} // AlleinerziehendenanspruchType
