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

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elterngeldantrag Anfrageabschluss0205 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageID <em>Anfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAntragsReferenz <em>Antrags Referenz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragegrund <em>Anfragegrund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageparameter <em>Anfrageparameter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragendesSystem <em>Anfragendes System</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragerOrganisationsID <em>Anfrager Organisations ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAntwortAbweichenderEmpfaenger <em>Antwort Abweichender Empfaenger</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageergebnis <em>Anfrageergebnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getFehlerfall <em>Fehlerfall</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type()
 * @model extendedMetaData="name='elterngeldantrag.anfrageabschluss.0205_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElterngeldantragAnfrageabschluss0205Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Anfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anfrage ID</em>' attribute.
	 * @see #setAnfrageID(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type_AnfrageID()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='anfrageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnfrageID();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageID <em>Anfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anfrage ID</em>' attribute.
	 * @see #getAnfrageID()
	 * @generated
	 */
	void setAnfrageID(String value);

	/**
	 * Returns the value of the '<em><b>Antrags Referenz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antrags Referenz</em>' attribute.
	 * @see #setAntragsReferenz(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type_AntragsReferenz()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='antragsReferenz' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAntragsReferenz();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAntragsReferenz <em>Antrags Referenz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antrags Referenz</em>' attribute.
	 * @see #getAntragsReferenz()
	 * @generated
	 */
	void setAntragsReferenz(String value);

	/**
	 * Returns the value of the '<em><b>Anfragegrund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anfragegrund</em>' containment reference.
	 * @see #setAnfragegrund(CodeAnfragegrundType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type_Anfragegrund()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anfragegrund' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAnfragegrundType getAnfragegrund();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragegrund <em>Anfragegrund</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anfragegrund</em>' containment reference.
	 * @see #getAnfragegrund()
	 * @generated
	 */
	void setAnfragegrund(CodeAnfragegrundType value);

	/**
	 * Returns the value of the '<em><b>Anfrageparameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anfrageparameter</em>' containment reference.
	 * @see #setAnfrageparameter(EObject)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type_Anfrageparameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anfrageparameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAnfrageparameter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfrageparameter <em>Anfrageparameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anfrageparameter</em>' containment reference.
	 * @see #getAnfrageparameter()
	 * @generated
	 */
	void setAnfrageparameter(EObject value);

	/**
	 * Returns the value of the '<em><b>Anfragendes System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anfragendes System</em>' attribute.
	 * @see #setAnfragendesSystem(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type_AnfragendesSystem()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='anfragendesSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnfragendesSystem();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragendesSystem <em>Anfragendes System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anfragendes System</em>' attribute.
	 * @see #getAnfragendesSystem()
	 * @generated
	 */
	void setAnfragendesSystem(String value);

	/**
	 * Returns the value of the '<em><b>Anfrager Organisations ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anfrager Organisations ID</em>' attribute.
	 * @see #setAnfragerOrganisationsID(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type_AnfragerOrganisationsID()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='anfragerOrganisationsID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnfragerOrganisationsID();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAnfragerOrganisationsID <em>Anfrager Organisations ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anfrager Organisations ID</em>' attribute.
	 * @see #getAnfragerOrganisationsID()
	 * @generated
	 */
	void setAnfragerOrganisationsID(String value);

	/**
	 * Returns the value of the '<em><b>Antwort Abweichender Empfaenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antwort Abweichender Empfaenger</em>' containment reference.
	 * @see #setAntwortAbweichenderEmpfaenger(BehoerdenkennungType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type_AntwortAbweichenderEmpfaenger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='antwortAbweichenderEmpfaenger' namespace='##targetNamespace'"
	 * @generated
	 */
	BehoerdenkennungType getAntwortAbweichenderEmpfaenger();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getAntwortAbweichenderEmpfaenger <em>Antwort Abweichender Empfaenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antwort Abweichender Empfaenger</em>' containment reference.
	 * @see #getAntwortAbweichenderEmpfaenger()
	 * @generated
	 */
	void setAntwortAbweichenderEmpfaenger(BehoerdenkennungType value);

	/**
	 * Returns the value of the '<em><b>Anfrageergebnis</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anfrageergebnis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type_Anfrageergebnis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anfrageergebnis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getAnfrageergebnis();

	/**
	 * Returns the value of the '<em><b>Fehlerfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fehlerfall</em>' containment reference.
	 * @see #setFehlerfall(CodeFehlerfallType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAnfrageabschluss0205Type_Fehlerfall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fehlerfall' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeFehlerfallType getFehlerfall();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type#getFehlerfall <em>Fehlerfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fehlerfall</em>' containment reference.
	 * @see #getFehlerfall()
	 * @generated
	 */
	void setFehlerfall(CodeFehlerfallType value);

} // ElterngeldantragAnfrageabschluss0205Type
