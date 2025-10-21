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
package de.xoev.domea.domea;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Akte Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Akte enthält die Metadatenfelder für den Austausch von Akten einschließlich der allgemeinen Metadaten, Aussonderungsmetadaten, anwendungsspezifischer Metadaten, Historien- und Protokollinformationen sowie Informationen zum internen Geschäftsgang. Die absendende Behörde (Autor) kann festlegen, welche Informationen dem Leser mit der Übertragung zur Verfügung gestellt werden sollen. So kann auch der Anforderung nach einer ggf. erforderlichen Beschränkung der übertragenen Metadaten Rechnung getragen werden (z. B. auf Grund datenschutzrechtlicher oder sonstiger gesetzlicher Bestimmungen).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AkteType#getIdentifikation <em>Identifikation</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getAllgemeineMetadaten <em>Allgemeine Metadaten</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getAussonderungsmetadaten <em>Aussonderungsmetadaten</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getStandort <em>Standort</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getLaufzeit <em>Laufzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getHistorienProtokollInformation <em>Historien Protokoll Information</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getInternerGeschaeftsgang <em>Interner Geschaeftsgang</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getAkteninhalt <em>Akteninhalt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getVerweis <em>Verweis</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getKontakt <em>Kontakt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#isZdA <em>Zd A</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getZdADatum <em>Zd ADatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAkteType()
 * @model extendedMetaData="name='AkteType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AkteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifikation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über Identifikation werden zur systemübergreifend eindeutigen Identifizierung der Akte spezifische Merkmale übergeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifikation</em>' containment reference.
	 * @see #setIdentifikation(IdentifikationObjektType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_Identifikation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Identifikation' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifikationObjektType getIdentifikation();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#getIdentifikation <em>Identifikation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifikation</em>' containment reference.
	 * @see #getIdentifikation()
	 * @generated
	 */
	void setIdentifikation(IdentifikationObjektType value);

	/**
	 * Returns the value of the '<em><b>Allgemeine Metadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über AllgemeineMetadaten werden allgemeine Metadaten zu einer Akte angegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allgemeine Metadaten</em>' containment reference.
	 * @see #setAllgemeineMetadaten(AllgemeineMetadatenType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_AllgemeineMetadaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllgemeineMetadaten' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeineMetadatenType getAllgemeineMetadaten();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#getAllgemeineMetadaten <em>Allgemeine Metadaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allgemeine Metadaten</em>' containment reference.
	 * @see #getAllgemeineMetadaten()
	 * @generated
	 */
	void setAllgemeineMetadaten(AllgemeineMetadatenType value);

	/**
	 * Returns the value of the '<em><b>Aussonderungsmetadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über Aussonderungsmetadaten werden die für die Aussonderung relevanten Metadaten zu einer Akte angegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aussonderungsmetadaten</em>' containment reference.
	 * @see #setAussonderungsmetadaten(AussonderungsmetadatenType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_Aussonderungsmetadaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aussonderungsmetadaten' namespace='##targetNamespace'"
	 * @generated
	 */
	AussonderungsmetadatenType getAussonderungsmetadaten();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#getAussonderungsmetadaten <em>Aussonderungsmetadaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aussonderungsmetadaten</em>' containment reference.
	 * @see #getAussonderungsmetadaten()
	 * @generated
	 */
	void setAussonderungsmetadaten(AussonderungsmetadatenType value);

	/**
	 * Returns the value of the '<em><b>Standort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Aufbewahrungsort der Akte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standort</em>' attribute.
	 * @see #setStandort(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_Standort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Standort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStandort();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#getStandort <em>Standort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standort</em>' attribute.
	 * @see #getStandort()
	 * @generated
	 */
	void setStandort(String value);

	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die weitere Spezifikation der Akte, um u. a. Recherche durchzuführen oder um zusätzliche Metadaten festzulegen. Beispiele sind Bauakte oder auch Personalakte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see #setTyp(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_Typ()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Typ' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTyp();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(String value);

	/**
	 * Returns the value of the '<em><b>Laufzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Laufzeit der Akte, d.h. Zeitpunkt des Beginns und des Endes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laufzeit</em>' containment reference.
	 * @see #setLaufzeit(ZeitraumType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_Laufzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Laufzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getLaufzeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#getLaufzeit <em>Laufzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laufzeit</em>' containment reference.
	 * @see #getLaufzeit()
	 * @generated
	 */
	void setLaufzeit(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Historien Protokoll Information</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.HistorienProtokollInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über HistorienProtokollInformation werden die zur Historisierung und Protokollierung relevanten Metadaten zu einer Akte angegeben, in der die Veränderungen an den beschreibenden Attributen und dem Zustand der Akte erfasst werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Historien Protokoll Information</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_HistorienProtokollInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HistorienProtokollInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HistorienProtokollInformationType> getHistorienProtokollInformation();

	/**
	 * Returns the value of the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.GeschaeftsgangType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über InternerGeschaeftsgang wird der Akte zum Nachweis des internen Geschäftsgangs eine spezifische Ausprägung eines Geschäftsgangs zugeordnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interner Geschaeftsgang</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_InternerGeschaeftsgang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InternerGeschaeftsgang' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GeschaeftsgangType> getInternerGeschaeftsgang();

	/**
	 * Returns the value of the '<em><b>Akteninhalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Sachverhalte in der Akte sind inhaltlich mittels üblicher Akteninhalte wie z. B. Vorgänge abgegrenzt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Akteninhalt</em>' containment reference.
	 * @see #setAkteninhalt(AkteninhaltType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_Akteninhalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Akteninhalt' namespace='##targetNamespace'"
	 * @generated
	 */
	AkteninhaltType getAkteninhalt();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#getAkteninhalt <em>Akteninhalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Akteninhalt</em>' containment reference.
	 * @see #getAkteninhalt()
	 * @generated
	 */
	void setAkteninhalt(AkteninhaltType value);

	/**
	 * Returns the value of the '<em><b>Verweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.VerweisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Verweis stellt eine inhaltliche Querbeziehung eines Schriftgutobjekts z. B. zu einem anderen Schriftgutobjekt oder zu einem Objekt auf einem Datenspeicher oder einem Datenträger dar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verweis</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_Verweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VerweisType> getVerweis();

	/**
	 * Returns the value of the '<em><b>Kontakt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.KontaktType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Kontaktinformation zu einem Geschäftsprozessbeteiligten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kontakt</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_Kontakt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kontakt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KontaktType> getKontakt();

	/**
	 * Returns the value of the '<em><b>Zd A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ZdA kennzeichnet, ob die Akte zu den Akten verfügt wurde (Wert "1") oder nicht (Wert "0").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zd A</em>' attribute.
	 * @see #isSetZdA()
	 * @see #unsetZdA()
	 * @see #setZdA(boolean)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_ZdA()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ZdA' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZdA();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#isZdA <em>Zd A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zd A</em>' attribute.
	 * @see #isSetZdA()
	 * @see #unsetZdA()
	 * @see #isZdA()
	 * @generated
	 */
	void setZdA(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.AkteType#isZdA <em>Zd A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZdA()
	 * @see #isZdA()
	 * @see #setZdA(boolean)
	 * @generated
	 */
	void unsetZdA();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.AkteType#isZdA <em>Zd A</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zd A</em>' attribute is set.
	 * @see #unsetZdA()
	 * @see #isZdA()
	 * @see #setZdA(boolean)
	 * @generated
	 */
	boolean isSetZdA();

	/**
	 * Returns the value of the '<em><b>Zd ADatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ZdADatum kennzeichnet, wann die Akte geschlossen wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zd ADatum</em>' attribute.
	 * @see #setZdADatum(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_ZdADatum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='ZdADatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZdADatum();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#getZdADatum <em>Zd ADatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zd ADatum</em>' attribute.
	 * @see #getZdADatum()
	 * @generated
	 */
	void setZdADatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnwendungsspezifischeErweiterung darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungsspezifische Erweiterung</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_AnwendungsspezifischeErweiterung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnwendungsspezifischeErweiterung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnwendungsspezifischeErweiterungType> getAnwendungsspezifischeErweiterung();

	/**
	 * Returns the value of the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnwendungsspezifischeErweiterungXML darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist. Die AnwendungsspezifischeErweiterungXML bietet die Möglichkeit, mittels Einbindung externer XML-Schemata diese Metadaten zu spezifizieren. Es können beliebige XML-Schemata mit unterschiedlichen Namensräumen angegeben werden. Die XML-Schema-Validierung der weiterführenden Metadaten erfolgt innerhalb der xdomea-Nachricht selbst "lax".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungsspezifische Erweiterung XML</em>' containment reference.
	 * @see #setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteType_AnwendungsspezifischeErweiterungXML()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnwendungsspezifischeErweiterungXML' namespace='##targetNamespace'"
	 * @generated
	 */
	AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AkteType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anwendungsspezifische Erweiterung XML</em>' containment reference.
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 */
	void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType value);

} // AkteType
