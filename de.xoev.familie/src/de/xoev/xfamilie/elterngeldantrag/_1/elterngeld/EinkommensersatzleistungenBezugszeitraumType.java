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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einkommensersatzleistungen Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugALGI <em>Bezug ALGI</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugKrankengeld <em>Bezug Krankengeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugRenten <em>Bezug Renten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugSonstigeLeistungen <em>Bezug Sonstige Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getAndereLeistungen <em>Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType()
 * @model extendedMetaData="name='EinkommensersatzleistungenBezugszeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkommensersatzleistungenBezugszeitraumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug Einkommensersatzleistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Einkommensersatzleistungen</em>' attribute.
	 * @see #isSetBezugEinkommensersatzleistungen()
	 * @see #unsetBezugEinkommensersatzleistungen()
	 * @see #setBezugEinkommensersatzleistungen(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_BezugEinkommensersatzleistungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bezugEinkommensersatzleistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugEinkommensersatzleistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Einkommensersatzleistungen</em>' attribute.
	 * @see #isSetBezugEinkommensersatzleistungen()
	 * @see #unsetBezugEinkommensersatzleistungen()
	 * @see #isBezugEinkommensersatzleistungen()
	 * @generated
	 */
	void setBezugEinkommensersatzleistungen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugEinkommensersatzleistungen()
	 * @see #isBezugEinkommensersatzleistungen()
	 * @see #setBezugEinkommensersatzleistungen(boolean)
	 * @generated
	 */
	void unsetBezugEinkommensersatzleistungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Einkommensersatzleistungen</em>' attribute is set.
	 * @see #unsetBezugEinkommensersatzleistungen()
	 * @see #isBezugEinkommensersatzleistungen()
	 * @see #setBezugEinkommensersatzleistungen(boolean)
	 * @generated
	 */
	boolean isSetBezugEinkommensersatzleistungen();

	/**
	 * Returns the value of the '<em><b>Bezug ALGI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben über den Bezug von ALG I.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug ALGI</em>' containment reference.
	 * @see #setBezugALGI(ALGIType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_BezugALGI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugALGI' namespace='##targetNamespace'"
	 * @generated
	 */
	ALGIType getBezugALGI();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugALGI <em>Bezug ALGI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug ALGI</em>' containment reference.
	 * @see #getBezugALGI()
	 * @generated
	 */
	void setBezugALGI(ALGIType value);

	/**
	 * Returns the value of the '<em><b>Bezug Krankentagegeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Krankentagegeld</em>' containment reference.
	 * @see #setBezugKrankentagegeld(KrankentagegeldType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_BezugKrankentagegeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugKrankentagegeld' namespace='##targetNamespace'"
	 * @generated
	 */
	KrankentagegeldType getBezugKrankentagegeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Krankentagegeld</em>' containment reference.
	 * @see #getBezugKrankentagegeld()
	 * @generated
	 */
	void setBezugKrankentagegeld(KrankentagegeldType value);

	/**
	 * Returns the value of the '<em><b>Bezug Krankengeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Krankengeld</em>' containment reference.
	 * @see #setBezugKrankengeld(KrankengeldType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_BezugKrankengeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugKrankengeld' namespace='##targetNamespace'"
	 * @generated
	 */
	KrankengeldType getBezugKrankengeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugKrankengeld <em>Bezug Krankengeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Krankengeld</em>' containment reference.
	 * @see #getBezugKrankengeld()
	 * @generated
	 */
	void setBezugKrankengeld(KrankengeldType value);

	/**
	 * Returns the value of the '<em><b>Bezug EG Aelteres Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug EG Aelteres Kind</em>' containment reference.
	 * @see #setBezugEGAelteresKind(EGAelteresKindType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_BezugEGAelteresKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugEGAelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EGAelteresKindType getBezugEGAelteresKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug EG Aelteres Kind</em>' containment reference.
	 * @see #getBezugEGAelteresKind()
	 * @generated
	 */
	void setBezugEGAelteresKind(EGAelteresKindType value);

	/**
	 * Returns the value of the '<em><b>Bezug Renten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Renten</em>' containment reference.
	 * @see #setBezugRenten(RentenType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_BezugRenten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugRenten' namespace='##targetNamespace'"
	 * @generated
	 */
	RentenType getBezugRenten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugRenten <em>Bezug Renten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Renten</em>' containment reference.
	 * @see #getBezugRenten()
	 * @generated
	 */
	void setBezugRenten(RentenType value);

	/**
	 * Returns the value of the '<em><b>Bezug Sonstige Leistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Sonstige Leistungen</em>' containment reference.
	 * @see #setBezugSonstigeLeistungen(SonstigeLeistungenBezugszeitraumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_BezugSonstigeLeistungen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bezugSonstigeLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	SonstigeLeistungenBezugszeitraumType getBezugSonstigeLeistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getBezugSonstigeLeistungen <em>Bezug Sonstige Leistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Sonstige Leistungen</em>' containment reference.
	 * @see #getBezugSonstigeLeistungen()
	 * @generated
	 */
	void setBezugSonstigeLeistungen(SonstigeLeistungenBezugszeitraumType value);

	/**
	 * Returns the value of the '<em><b>Andere Leistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Andere Leistungen</em>' containment reference.
	 * @see #setAndereLeistungen(AndereLeistungenType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_AndereLeistungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='andereLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	AndereLeistungenType getAndereLeistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#getAndereLeistungen <em>Andere Leistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Andere Leistungen</em>' containment reference.
	 * @see #getAndereLeistungen()
	 * @generated
	 */
	void setAndereLeistungen(AndereLeistungenType value);

	/**
	 * Returns the value of the '<em><b>Bezug Ausl Leistungen Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezug von Leistungen aus dem Ausland für dieses Kind oder ein älteres Kind, die mit dem Elterngeld oder den Mutterschaftsleistungen vergleichbar sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug Ausl Leistungen Kind</em>' attribute.
	 * @see #isSetBezugAuslLeistungenKind()
	 * @see #unsetBezugAuslLeistungenKind()
	 * @see #setBezugAuslLeistungenKind(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_BezugAuslLeistungenKind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='bezugAuslLeistungenKind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugAuslLeistungenKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Ausl Leistungen Kind</em>' attribute.
	 * @see #isSetBezugAuslLeistungenKind()
	 * @see #unsetBezugAuslLeistungenKind()
	 * @see #isBezugAuslLeistungenKind()
	 * @generated
	 */
	void setBezugAuslLeistungenKind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugAuslLeistungenKind()
	 * @see #isBezugAuslLeistungenKind()
	 * @see #setBezugAuslLeistungenKind(boolean)
	 * @generated
	 */
	void unsetBezugAuslLeistungenKind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Ausl Leistungen Kind</em>' attribute is set.
	 * @see #unsetBezugAuslLeistungenKind()
	 * @see #isBezugAuslLeistungenKind()
	 * @see #setBezugAuslLeistungenKind(boolean)
	 * @generated
	 */
	boolean isSetBezugAuslLeistungenKind();

	/**
	 * Returns the value of the '<em><b>Bezug Zwischenstaatl Leistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezug von Leistungen von einer zwischenstaatlichen Organisation für dieses Kind oder ein älteres Kind, die mit dem Elterngeld oder den Mutterschaftsleistungen vergleichbar sind (zum Beispiel von der EU oder der UN)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug Zwischenstaatl Leistungen</em>' attribute.
	 * @see #isSetBezugZwischenstaatlLeistungen()
	 * @see #unsetBezugZwischenstaatlLeistungen()
	 * @see #setBezugZwischenstaatlLeistungen(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenBezugszeitraumType_BezugZwischenstaatlLeistungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='bezugZwischenstaatlLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugZwischenstaatlLeistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Zwischenstaatl Leistungen</em>' attribute.
	 * @see #isSetBezugZwischenstaatlLeistungen()
	 * @see #unsetBezugZwischenstaatlLeistungen()
	 * @see #isBezugZwischenstaatlLeistungen()
	 * @generated
	 */
	void setBezugZwischenstaatlLeistungen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugZwischenstaatlLeistungen()
	 * @see #isBezugZwischenstaatlLeistungen()
	 * @see #setBezugZwischenstaatlLeistungen(boolean)
	 * @generated
	 */
	void unsetBezugZwischenstaatlLeistungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Zwischenstaatl Leistungen</em>' attribute is set.
	 * @see #unsetBezugZwischenstaatlLeistungen()
	 * @see #isBezugZwischenstaatlLeistungen()
	 * @see #setBezugZwischenstaatlLeistungen(boolean)
	 * @generated
	 */
	boolean isSetBezugZwischenstaatlLeistungen();

} // EinkommensersatzleistungenBezugszeitraumType
