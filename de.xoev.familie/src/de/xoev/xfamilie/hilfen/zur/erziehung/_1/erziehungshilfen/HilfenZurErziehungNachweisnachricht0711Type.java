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

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hilfen Zur Erziehung Nachweisnachricht0711 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getAngabenKind <em>Angaben Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getJugendamt <em>Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getBearbeitungsnummer <em>Bearbeitungsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getAntragsdatum <em>Antragsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getZusatznachrichtHZE <em>Zusatznachricht HZE</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungNachweisnachricht0711Type()
 * @model extendedMetaData="name='hilfenZurErziehung.nachweisnachricht.0711_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HilfenZurErziehungNachweisnachricht0711Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit werden die persönlichen Angaben zur antragstellenden Person übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persoenliche Angaben Zu Ihrer Person</em>' containment reference.
	 * @see #setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungNachweisnachricht0711Type_PersoenlicheAngabenZuIhrerPerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='persoenlicheAngabenZuIhrerPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersoenlicheAngabenHZEType getPersoenlicheAngabenZuIhrerPerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persoenliche Angaben Zu Ihrer Person</em>' containment reference.
	 * @see #getPersoenlicheAngabenZuIhrerPerson()
	 * @generated
	 */
	void setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType value);

	/**
	 * Returns the value of the '<em><b>Angaben Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit werden die Angaben zum betroffenen Kind übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Kind</em>' containment reference.
	 * @see #setAngabenKind(AngabenKindHZEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungNachweisnachricht0711Type_AngabenKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenKind' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenKindHZEType getAngabenKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getAngabenKind <em>Angaben Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Kind</em>' containment reference.
	 * @see #getAngabenKind()
	 * @generated
	 */
	void setAngabenKind(AngabenKindHZEType value);

	/**
	 * Returns the value of the '<em><b>Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Datenfeld werden Angaben zum zuständigen Jugendamt übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jugendamt</em>' attribute.
	 * @see #setJugendamt(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungNachweisnachricht0711Type_Jugendamt()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='jugendamt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJugendamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getJugendamt <em>Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jugendamt</em>' attribute.
	 * @see #getJugendamt()
	 * @generated
	 */
	void setJugendamt(String value);

	/**
	 * Returns the value of the '<em><b>Bearbeitungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Datenfeld wird die Bearbeitungsnummer übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearbeitungsnummer</em>' attribute.
	 * @see #setBearbeitungsnummer(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungNachweisnachricht0711Type_Bearbeitungsnummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='bearbeitungsnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBearbeitungsnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getBearbeitungsnummer <em>Bearbeitungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeitungsnummer</em>' attribute.
	 * @see #getBearbeitungsnummer()
	 * @generated
	 */
	void setBearbeitungsnummer(String value);

	/**
	 * Returns the value of the '<em><b>Antragsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Datenfeld wird das Antragsdatum übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antragsdatum</em>' attribute.
	 * @see #setAntragsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungNachweisnachricht0711Type_Antragsdatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='antragsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAntragsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getAntragsdatum <em>Antragsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragsdatum</em>' attribute.
	 * @see #getAntragsdatum()
	 * @generated
	 */
	void setAntragsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier werden Informationen zum Nachweis und der Nachweis selbst übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungNachweisnachricht0711Type_Nachweis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweiseHZEType> getNachweis();

	/**
	 * Returns the value of the '<em><b>Zusatznachricht HZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Datenfeld werden Zusatzangaben zur Nachweisübermittlung erfasst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatznachricht HZE</em>' attribute.
	 * @see #setZusatznachrichtHZE(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungNachweisnachricht0711Type_ZusatznachrichtHZE()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='zusatznachrichtHZE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZusatznachrichtHZE();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getZusatznachrichtHZE <em>Zusatznachricht HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatznachricht HZE</em>' attribute.
	 * @see #getZusatznachrichtHZE()
	 * @generated
	 */
	void setZusatznachrichtHZE(String value);

} // HilfenZurErziehungNachweisnachricht0711Type
