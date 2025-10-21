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
 * A representation of the model object '<em><b>Einkommensersatzleistungen Vor Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugALGI <em>Bezug ALGI</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugRenten <em>Bezug Renten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBuergergeld <em>Buergergeld</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType()
 * @model extendedMetaData="name='EinkommensersatzleistungenVorGeburtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkommensersatzleistungenVorGeburtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug Einkommensersatzleistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Einkommensersatzleistungen</em>' attribute.
	 * @see #isSetBezugEinkommensersatzleistungen()
	 * @see #unsetBezugEinkommensersatzleistungen()
	 * @see #setBezugEinkommensersatzleistungen(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_BezugEinkommensersatzleistungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bezugEinkommensersatzleistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugEinkommensersatzleistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugEinkommensersatzleistungen()
	 * @see #isBezugEinkommensersatzleistungen()
	 * @see #setBezugEinkommensersatzleistungen(boolean)
	 * @generated
	 */
	void unsetBezugEinkommensersatzleistungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_BezugALGI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugALGI' namespace='##targetNamespace'"
	 * @generated
	 */
	ALGIType getBezugALGI();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugALGI <em>Bezug ALGI</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_BezugKrankentagegeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugKrankentagegeld' namespace='##targetNamespace'"
	 * @generated
	 */
	KrankentagegeldType getBezugKrankentagegeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Krankentagegeld</em>' containment reference.
	 * @see #getBezugKrankentagegeld()
	 * @generated
	 */
	void setBezugKrankentagegeld(KrankentagegeldType value);

	/**
	 * Returns the value of the '<em><b>Bezug Krankengeld Schwangerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Krankengeld Schwangerschaft</em>' containment reference.
	 * @see #setBezugKrankengeldSchwangerschaft(KrankengeldType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_BezugKrankengeldSchwangerschaft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugKrankengeldSchwangerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	KrankengeldType getBezugKrankengeldSchwangerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Krankengeld Schwangerschaft</em>' containment reference.
	 * @see #getBezugKrankengeldSchwangerschaft()
	 * @generated
	 */
	void setBezugKrankengeldSchwangerschaft(KrankengeldType value);

	/**
	 * Returns the value of the '<em><b>Bezug EG Aelteres Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug EG Aelteres Kind</em>' containment reference.
	 * @see #setBezugEGAelteresKind(EGAelteresKindType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_BezugEGAelteresKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugEGAelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EGAelteresKindType getBezugEGAelteresKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_BezugRenten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugRenten' namespace='##targetNamespace'"
	 * @generated
	 */
	RentenType getBezugRenten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugRenten <em>Bezug Renten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Renten</em>' containment reference.
	 * @see #getBezugRenten()
	 * @generated
	 */
	void setBezugRenten(RentenType value);

	/**
	 * Returns the value of the '<em><b>Bezug Andere Leistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Andere Leistungen</em>' containment reference.
	 * @see #setBezugAndereLeistungen(AndereLeistungenType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_BezugAndereLeistungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugAndereLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	AndereLeistungenType getBezugAndereLeistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Andere Leistungen</em>' containment reference.
	 * @see #getBezugAndereLeistungen()
	 * @generated
	 */
	void setBezugAndereLeistungen(AndereLeistungenType value);

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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_BezugAuslLeistungenKind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='bezugAuslLeistungenKind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugAuslLeistungenKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugAuslLeistungenKind()
	 * @see #isBezugAuslLeistungenKind()
	 * @see #setBezugAuslLeistungenKind(boolean)
	 * @generated
	 */
	void unsetBezugAuslLeistungenKind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_BezugZwischenstaatlLeistungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='bezugZwischenstaatlLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugZwischenstaatlLeistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugZwischenstaatlLeistungen()
	 * @see #isBezugZwischenstaatlLeistungen()
	 * @see #setBezugZwischenstaatlLeistungen(boolean)
	 * @generated
	 */
	void unsetBezugZwischenstaatlLeistungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Zwischenstaatl Leistungen</em>' attribute is set.
	 * @see #unsetBezugZwischenstaatlLeistungen()
	 * @see #isBezugZwischenstaatlLeistungen()
	 * @see #setBezugZwischenstaatlLeistungen(boolean)
	 * @generated
	 */
	boolean isSetBezugZwischenstaatlLeistungen();

	/**
	 * Returns the value of the '<em><b>Buergergeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Bezug und zum Beginn und Ende des Bezugs von ALGII/ Bürgergeld.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buergergeld</em>' containment reference.
	 * @see #setBuergergeld(BuergergeldType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkommensersatzleistungenVorGeburtType_Buergergeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='buergergeld' namespace='##targetNamespace'"
	 * @generated
	 */
	BuergergeldType getBuergergeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType#getBuergergeld <em>Buergergeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buergergeld</em>' containment reference.
	 * @see #getBuergergeld()
	 * @generated
	 */
	void setBuergergeld(BuergergeldType value);

} // EinkommensersatzleistungenVorGeburtType
