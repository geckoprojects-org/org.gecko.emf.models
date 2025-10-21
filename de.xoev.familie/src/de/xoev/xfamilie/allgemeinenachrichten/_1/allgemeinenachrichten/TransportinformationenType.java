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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transportinformationen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getNachrichtenId <em>Nachrichten Id</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getBetreff <em>Betreff</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getSendezeitpunkt <em>Sendezeitpunkt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getErgaenzendeHinweise <em>Ergaenzende Hinweise</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getTransportinformationenType()
 * @model extendedMetaData="name='TransportinformationenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TransportinformationenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachrichten Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier kann eine Identifikation der aus den genannten Gründen zurückgewiesenen Nachricht übermittelt werden, sofern sich diese aus dem Transportprotokoll entnehmen lässt. Im Falle von OSCI-Transport wäre hier die messageID des Transportumschlages zu nutzen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachrichten Id</em>' attribute.
	 * @see #setNachrichtenId(String)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getTransportinformationenType_NachrichtenId()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='nachrichtenId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNachrichtenId();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getNachrichtenId <em>Nachrichten Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachrichten Id</em>' attribute.
	 * @see #getNachrichtenId()
	 * @generated
	 */
	void setNachrichtenId(String value);

	/**
	 * Returns the value of the '<em><b>Betreff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier kann der Inhalt der Betreff- oder Subject-Zeile der aus den genannten Gründen zurückgewiesenen Nachricht übermittelt werden, sofern sich diese aus dem Transportprotokoll entnehmen lässt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betreff</em>' attribute.
	 * @see #setBetreff(String)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getTransportinformationenType_Betreff()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='betreff' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBetreff();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getBetreff <em>Betreff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betreff</em>' attribute.
	 * @see #getBetreff()
	 * @generated
	 */
	void setBetreff(String value);

	/**
	 * Returns the value of the '<em><b>Sendezeitpunkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier kann der Zeitpunkt des Versands der aus den genannten Gründen zurückgewiesenen Nachricht übermittelt werden, sofern sich dieser aus dem Transportprotokoll entnehmen lässt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sendezeitpunkt</em>' attribute.
	 * @see #setSendezeitpunkt(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getTransportinformationenType_Sendezeitpunkt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='sendezeitpunkt' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSendezeitpunkt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getSendezeitpunkt <em>Sendezeitpunkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sendezeitpunkt</em>' attribute.
	 * @see #getSendezeitpunkt()
	 * @generated
	 */
	void setSendezeitpunkt(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Ergaenzende Hinweise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier können weitere Angaben gemacht werden, die dem Empfänger der aus den genannten Gründen zurückgewiesenen Nachricht helfen, diese in seinem Verfahren zu identifizieren.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ergaenzende Hinweise</em>' attribute.
	 * @see #setErgaenzendeHinweise(String)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getTransportinformationenType_ErgaenzendeHinweise()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='ergaenzendeHinweise' namespace='##targetNamespace'"
	 * @generated
	 */
	String getErgaenzendeHinweise();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getErgaenzendeHinweise <em>Ergaenzende Hinweise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ergaenzende Hinweise</em>' attribute.
	 * @see #getErgaenzendeHinweise()
	 * @generated
	 */
	void setErgaenzendeHinweise(String value);

} // TransportinformationenType
