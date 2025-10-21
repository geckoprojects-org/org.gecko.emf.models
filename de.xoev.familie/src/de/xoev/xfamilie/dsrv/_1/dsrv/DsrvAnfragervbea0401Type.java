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
package de.xoev.xfamilie.dsrv._1.dsrv;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsrv Anfragervbea0401 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAbfrageID <em>Abfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAnforderungsgrund <em>Anforderungsgrund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getEinkommensDatenBisDatum <em>Einkommens Daten Bis Datum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getEinkommensDatenVonDatum <em>Einkommens Daten Von Datum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getNameNatuerlichePerson <em>Name Natuerliche Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAnschrift <em>Anschrift</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvAnfragervbea0401Type()
 * @model extendedMetaData="name='dsrv.anfragervbea.0401_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DsrvAnfragervbea0401Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Abfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige ID, mit der sämtliche Antworten zu dieser Abfrage versehen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abfrage ID</em>' attribute.
	 * @see #setAbfrageID(String)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvAnfragervbea0401Type_AbfrageID()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='abfrageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbfrageID();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAbfrageID <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abfrage ID</em>' attribute.
	 * @see #getAbfrageID()
	 * @generated
	 */
	void setAbfrageID(String value);

	/**
	 * Returns the value of the '<em><b>Anforderungsgrund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Grund der Abfrage (z.B.: "ELFE")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anforderungsgrund</em>' attribute.
	 * @see #setAnforderungsgrund(String)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvAnfragervbea0401Type_Anforderungsgrund()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='anforderungsgrund' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnforderungsgrund();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAnforderungsgrund <em>Anforderungsgrund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anforderungsgrund</em>' attribute.
	 * @see #getAnforderungsgrund()
	 * @generated
	 */
	void setAnforderungsgrund(String value);

	/**
	 * Returns the value of the '<em><b>Einkommens Daten Bis Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einkommensdaten bis zu diesem Jahr/Monat der gesuchten Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommens Daten Bis Datum</em>' attribute.
	 * @see #setEinkommensDatenBisDatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvAnfragervbea0401Type_EinkommensDatenBisDatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.JahrMonatType" required="true"
	 *        extendedMetaData="kind='element' name='einkommensDatenBisDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEinkommensDatenBisDatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getEinkommensDatenBisDatum <em>Einkommens Daten Bis Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommens Daten Bis Datum</em>' attribute.
	 * @see #getEinkommensDatenBisDatum()
	 * @generated
	 */
	void setEinkommensDatenBisDatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Einkommens Daten Von Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einkommensdaten ab diesem Jahr/Monat der gesuchten Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommens Daten Von Datum</em>' attribute.
	 * @see #setEinkommensDatenVonDatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvAnfragervbea0401Type_EinkommensDatenVonDatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.JahrMonatType" required="true"
	 *        extendedMetaData="kind='element' name='einkommensDatenVonDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEinkommensDatenVonDatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getEinkommensDatenVonDatum <em>Einkommens Daten Von Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommens Daten Von Datum</em>' attribute.
	 * @see #getEinkommensDatenVonDatum()
	 * @generated
	 */
	void setEinkommensDatenVonDatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geburtsdatum einer gesuchten Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtGeburtsortOptionalType)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvAnfragervbea0401Type_Geburt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtGeburtsortOptionalType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtGeburtsortOptionalType value);

	/**
	 * Returns the value of the '<em><b>Name Natuerliche Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informationen zum Namen einer gesuchten Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Natuerliche Person</em>' containment reference.
	 * @see #setNameNatuerlichePerson(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvAnfragervbea0401Type_NameNatuerlichePerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nameNatuerlichePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNameNatuerlichePerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getNameNatuerlichePerson <em>Name Natuerliche Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Natuerliche Person</em>' containment reference.
	 * @see #getNameNatuerlichePerson()
	 * @generated
	 */
	void setNameNatuerlichePerson(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aktueller Wohnort einer gesuchten Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvAnfragervbea0401Type_Anschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(PostalischeInlandsanschriftBasisType value);

} // DsrvAnfragervbea0401Type
