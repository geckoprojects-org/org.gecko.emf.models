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
 * A representation of the model object '<em><b>Hilfen Zur Erziehung Widerspruch0704 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getAktenzeichen <em>Aktenzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getBescheiddatum <em>Bescheiddatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getBegruendungWiderspruch <em>Begruendung Widerspruch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#isBestaetigungWiderspruch <em>Bestaetigung Widerspruch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getAuswahlBescheidart <em>Auswahl Bescheidart</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungWiderspruch0704Type()
 * @model extendedMetaData="name='hilfenZurErziehung.widerspruch.0704_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HilfenZurErziehungWiderspruch0704Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit werden die persönlichen Angaben zur antragstellenden Person übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persoenliche Angaben Zu Ihrer Person</em>' containment reference.
	 * @see #setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungWiderspruch0704Type_PersoenlicheAngabenZuIhrerPerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='persoenlicheAngabenZuIhrerPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersoenlicheAngabenHZEType getPersoenlicheAngabenZuIhrerPerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persoenliche Angaben Zu Ihrer Person</em>' containment reference.
	 * @see #getPersoenlicheAngabenZuIhrerPerson()
	 * @generated
	 */
	void setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType value);

	/**
	 * Returns the value of the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit wird das Aktenzeichen übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenzeichen</em>' attribute.
	 * @see #setAktenzeichen(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungWiderspruch0704Type_Aktenzeichen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='aktenzeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getAktenzeichen <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenzeichen</em>' attribute.
	 * @see #getAktenzeichen()
	 * @generated
	 */
	void setAktenzeichen(String value);

	/**
	 * Returns the value of the '<em><b>Bescheiddatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Datenfeld wird das Bescheiddatum übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bescheiddatum</em>' attribute.
	 * @see #setBescheiddatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungWiderspruch0704Type_Bescheiddatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='bescheiddatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBescheiddatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getBescheiddatum <em>Bescheiddatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bescheiddatum</em>' attribute.
	 * @see #getBescheiddatum()
	 * @generated
	 */
	void setBescheiddatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Begruendung Widerspruch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Datenfeld wird die Begründung des Widerspruchs übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begruendung Widerspruch</em>' attribute.
	 * @see #setBegruendungWiderspruch(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungWiderspruch0704Type_BegruendungWiderspruch()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='begruendungWiderspruch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBegruendungWiderspruch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getBegruendungWiderspruch <em>Begruendung Widerspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begruendung Widerspruch</em>' attribute.
	 * @see #getBegruendungWiderspruch()
	 * @generated
	 */
	void setBegruendungWiderspruch(String value);

	/**
	 * Returns the value of the '<em><b>Bestaetigung Widerspruch</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit wird der Widerspruch bestätigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bestaetigung Widerspruch</em>' attribute.
	 * @see #isSetBestaetigungWiderspruch()
	 * @see #unsetBestaetigungWiderspruch()
	 * @see #setBestaetigungWiderspruch(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungWiderspruch0704Type_BestaetigungWiderspruch()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bestaetigungWiderspruch' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBestaetigungWiderspruch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#isBestaetigungWiderspruch <em>Bestaetigung Widerspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bestaetigung Widerspruch</em>' attribute.
	 * @see #isSetBestaetigungWiderspruch()
	 * @see #unsetBestaetigungWiderspruch()
	 * @see #isBestaetigungWiderspruch()
	 * @generated
	 */
	void setBestaetigungWiderspruch(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#isBestaetigungWiderspruch <em>Bestaetigung Widerspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestaetigungWiderspruch()
	 * @see #isBestaetigungWiderspruch()
	 * @see #setBestaetigungWiderspruch(boolean)
	 * @generated
	 */
	void unsetBestaetigungWiderspruch();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#isBestaetigungWiderspruch <em>Bestaetigung Widerspruch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bestaetigung Widerspruch</em>' attribute is set.
	 * @see #unsetBestaetigungWiderspruch()
	 * @see #isBestaetigungWiderspruch()
	 * @see #setBestaetigungWiderspruch(boolean)
	 * @generated
	 */
	boolean isSetBestaetigungWiderspruch();

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier werden Informationen zum Nachweis und der Nachweis selbst übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungWiderspruch0704Type_Nachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweiseHZEType> getNachweis();

	/**
	 * Returns the value of the '<em><b>Auswahl Bescheidart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An dieser Stelle wird die Art des Bescheides ausgewählt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auswahl Bescheidart</em>' containment reference.
	 * @see #setAuswahlBescheidart(AuswahlBescheidartType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getHilfenZurErziehungWiderspruch0704Type_AuswahlBescheidart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='auswahlBescheidart' namespace='##targetNamespace'"
	 * @generated
	 */
	AuswahlBescheidartType getAuswahlBescheidart();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getAuswahlBescheidart <em>Auswahl Bescheidart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auswahl Bescheidart</em>' containment reference.
	 * @see #getAuswahlBescheidart()
	 * @generated
	 */
	void setAuswahlBescheidart(AuswahlBescheidartType value);

} // HilfenZurErziehungWiderspruch0704Type
