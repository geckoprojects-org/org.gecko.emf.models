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

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Zu Jugendlich Kontaktformular Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getNameDerDesJugendlichen <em>Name Der Des Jugendlichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#isAnschriftStimmtUeberein <em>Anschrift Stimmt Ueberein</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenZuJugendlichKontaktformularType()
 * @model extendedMetaData="name='AngabenZuJugendlichKontaktformularType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenZuJugendlichKontaktformularType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Der Des Jugendlichen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorname, Familienname sind verpflichtend, Geburtsname ist an dieser Stelle irrelevant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Der Des Jugendlichen</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenZuJugendlichKontaktformularType_NameDerDesJugendlichen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nameDerDesJugendlichen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameNatuerlichePersonVornameVerpflichtendType> getNameDerDesJugendlichen();

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #setGeburtsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenZuJugendlichKontaktformularType_Geburtsdatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getGeburtsdatum <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Anschrift Stimmt Ueberein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anschrift Stimmt Ueberein</em>' attribute.
	 * @see #isSetAnschriftStimmtUeberein()
	 * @see #unsetAnschriftStimmtUeberein()
	 * @see #setAnschriftStimmtUeberein(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenZuJugendlichKontaktformularType_AnschriftStimmtUeberein()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='anschriftStimmtUeberein' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAnschriftStimmtUeberein();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#isAnschriftStimmtUeberein <em>Anschrift Stimmt Ueberein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Stimmt Ueberein</em>' attribute.
	 * @see #isSetAnschriftStimmtUeberein()
	 * @see #unsetAnschriftStimmtUeberein()
	 * @see #isAnschriftStimmtUeberein()
	 * @generated
	 */
	void setAnschriftStimmtUeberein(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#isAnschriftStimmtUeberein <em>Anschrift Stimmt Ueberein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnschriftStimmtUeberein()
	 * @see #isAnschriftStimmtUeberein()
	 * @see #setAnschriftStimmtUeberein(boolean)
	 * @generated
	 */
	void unsetAnschriftStimmtUeberein();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#isAnschriftStimmtUeberein <em>Anschrift Stimmt Ueberein</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anschrift Stimmt Ueberein</em>' attribute is set.
	 * @see #unsetAnschriftStimmtUeberein()
	 * @see #isAnschriftStimmtUeberein()
	 * @see #setAnschriftStimmtUeberein(boolean)
	 * @generated
	 */
	boolean isSetAnschriftStimmtUeberein();

	/**
	 * Returns the value of the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aktuelle Anschrift</em>' containment reference.
	 * @see #setAktuelleAnschrift(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAngabenZuJugendlichKontaktformularType_AktuelleAnschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aktuelleAnschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAktuelleAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktuelle Anschrift</em>' containment reference.
	 * @see #getAktuelleAnschrift()
	 * @generated
	 */
	void setAktuelleAnschrift(PostalischeInlandsanschriftBasisType value);

} // AngabenZuJugendlichKontaktformularType
