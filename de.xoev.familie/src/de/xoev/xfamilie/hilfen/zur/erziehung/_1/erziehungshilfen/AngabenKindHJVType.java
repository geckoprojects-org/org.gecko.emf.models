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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Kind HJV Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getGeschlecht <em>Geschlecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getAufenthaltsort <em>Aufenthaltsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getJugendlichAufenthaltsortSonstige <em>Jugendlich Aufenthaltsort Sonstige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHJVType()
 * @model extendedMetaData="name='AngabenKindHJVType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenKindHJVType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorname, Familienname sind verpflichtend, Geburtsname ist an dieser Stelle irrelevant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namen</em>' containment reference.
	 * @see #setNamen(NameNatuerlichePersonVornameVerpflichtendType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHJVType_Namen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='namen' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonVornameVerpflichtendType getNamen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getNamen <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namen</em>' containment reference.
	 * @see #getNamen()
	 * @generated
	 */
	void setNamen(NameNatuerlichePersonVornameVerpflichtendType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #setGeburtsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHJVType_Geburtsdatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getGeburtsdatum <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geschlecht</em>' containment reference.
	 * @see #setGeschlecht(CodeGeschlechtType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHJVType_Geschlecht()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geschlecht' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeGeschlechtType getGeschlecht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getGeschlecht <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschlecht</em>' containment reference.
	 * @see #getGeschlecht()
	 * @generated
	 */
	void setGeschlecht(CodeGeschlechtType value);

	/**
	 * Returns the value of the '<em><b>Aufenthaltsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe zum Aufenthalt der Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthaltsort</em>' containment reference.
	 * @see #setAufenthaltsort(CodeAufenthaltType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHJVType_Aufenthaltsort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aufenthaltsort' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAufenthaltType getAufenthaltsort();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getAufenthaltsort <em>Aufenthaltsort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufenthaltsort</em>' containment reference.
	 * @see #getAufenthaltsort()
	 * @generated
	 */
	void setAufenthaltsort(CodeAufenthaltType value);

	/**
	 * Returns the value of the '<em><b>Jugendlich Aufenthaltsort Sonstige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wird zu einer Pflichtangabe, wenn aufenthaltsort = Sonstiger Aufenthaltsort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jugendlich Aufenthaltsort Sonstige</em>' attribute.
	 * @see #setJugendlichAufenthaltsortSonstige(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHJVType_JugendlichAufenthaltsortSonstige()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='jugendlichAufenthaltsortSonstige' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJugendlichAufenthaltsortSonstige();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getJugendlichAufenthaltsortSonstige <em>Jugendlich Aufenthaltsort Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jugendlich Aufenthaltsort Sonstige</em>' attribute.
	 * @see #getJugendlichAufenthaltsortSonstige()
	 * @generated
	 */
	void setJugendlichAufenthaltsortSonstige(String value);

	/**
	 * Returns the value of the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aktuelle Anschrift</em>' containment reference.
	 * @see #setAktuelleAnschrift(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHJVType_AktuelleAnschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aktuelleAnschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAktuelleAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktuelle Anschrift</em>' containment reference.
	 * @see #getAktuelleAnschrift()
	 * @generated
	 */
	void setAktuelleAnschrift(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Anschriftsaenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hat sich der Aufenthalt des Kindes in den letzten 6 Monaten geändert?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschriftsaenderung</em>' attribute.
	 * @see #isSetAnschriftsaenderung()
	 * @see #unsetAnschriftsaenderung()
	 * @see #setAnschriftsaenderung(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenKindHJVType_Anschriftsaenderung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='anschriftsaenderung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAnschriftsaenderung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschriftsaenderung</em>' attribute.
	 * @see #isSetAnschriftsaenderung()
	 * @see #unsetAnschriftsaenderung()
	 * @see #isAnschriftsaenderung()
	 * @generated
	 */
	void setAnschriftsaenderung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnschriftsaenderung()
	 * @see #isAnschriftsaenderung()
	 * @see #setAnschriftsaenderung(boolean)
	 * @generated
	 */
	void unsetAnschriftsaenderung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anschriftsaenderung</em>' attribute is set.
	 * @see #unsetAnschriftsaenderung()
	 * @see #isAnschriftsaenderung()
	 * @see #setAnschriftsaenderung(boolean)
	 * @generated
	 */
	boolean isSetAnschriftsaenderung();

} // AngabenKindHJVType
