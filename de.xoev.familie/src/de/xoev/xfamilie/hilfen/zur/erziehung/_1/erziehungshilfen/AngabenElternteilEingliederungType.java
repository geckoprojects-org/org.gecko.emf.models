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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Elternteil Eingliederung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zu weiteren Elternteilen für Eingliederungshilfe.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getAngabenGeburtElternteil <em>Angaben Geburt Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getKontaktdaten <em>Kontaktdaten</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenElternteilEingliederungType()
 * @model extendedMetaData="name='AngabenElternteilEingliederungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenElternteilEingliederungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namen</em>' containment reference.
	 * @see #setNamen(NameNatuerlichePersonVornameVerpflichtendType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenElternteilEingliederungType_Namen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='namen' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonVornameVerpflichtendType getNamen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getNamen <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namen</em>' containment reference.
	 * @see #getNamen()
	 * @generated
	 */
	void setNamen(NameNatuerlichePersonVornameVerpflichtendType value);

	/**
	 * Returns the value of the '<em><b>Angaben Geburt Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Geburt Elternteil</em>' containment reference.
	 * @see #setAngabenGeburtElternteil(GeburtGeburtsortOptionalType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenElternteilEingliederungType_AngabenGeburtElternteil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenGeburtElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtGeburtsortOptionalType getAngabenGeburtElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getAngabenGeburtElternteil <em>Angaben Geburt Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Geburt Elternteil</em>' containment reference.
	 * @see #getAngabenGeburtElternteil()
	 * @generated
	 */
	void setAngabenGeburtElternteil(GeburtGeburtsortOptionalType value);

	/**
	 * Returns the value of the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adresse, die im Personalausweis steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktuelle Anschrift</em>' containment reference.
	 * @see #setAktuelleAnschrift(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenElternteilEingliederungType_AktuelleAnschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aktuelleAnschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAktuelleAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktuelle Anschrift</em>' containment reference.
	 * @see #getAktuelleAnschrift()
	 * @generated
	 */
	void setAktuelleAnschrift(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Kontaktdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kontaktdaten</em>' containment reference.
	 * @see #setKontaktdaten(ErreichbarkeitType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenElternteilEingliederungType_Kontaktdaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kontaktdaten' namespace='##targetNamespace'"
	 * @generated
	 */
	ErreichbarkeitType getKontaktdaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getKontaktdaten <em>Kontaktdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontaktdaten</em>' containment reference.
	 * @see #getKontaktdaten()
	 * @generated
	 */
	void setKontaktdaten(ErreichbarkeitType value);

} // AngabenElternteilEingliederungType
