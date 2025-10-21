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
package de.xoev.xfamilie.baukasten._1.baukasten;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifikation Nachricht Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Typ enthält die für die Identifikation einer Nachricht erforderlichen Informationen. Er kann verwendet werden, um Identifizierungsmerkmale zu setzen, auf die sich Leser oder Empfänger beziehen kann (Verwendung im Nachrichtenkopf) oder sich auf Identifizierungsmerkmale einer übermittelten Nachricht zu beziehen (Verwendung im Nachrichteninhalt von Reaktions- oder RtS-Nachrichten). Darüber hinaus enthält der Typ den Erstellungszeitpunkt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getNachrichtenUUID <em>Nachrichten UUID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getNachrichtentyp <em>Nachrichtentyp</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getErstellungszeitpunkt <em>Erstellungszeitpunkt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getIdentifikationNachrichtType()
 * @model extendedMetaData="name='Identifikation.NachrichtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdentifikationNachrichtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachrichten UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier wird der Universally Unique Identifier (UUID) der Nachricht mitgeteilt, der das primäre Identifikationsmerkmal einer Nachricht darstellt. Der UUID der Nachricht ist weltweit eindeutig. So wird es möglich, Nachrichten hersteller- und anwendungsübergreifend eindeutig zu identifizieren. Für jede Nachricht muss eine neue UUID erzeugt werden, um eine eindeutige Identifikation der Nachricht sicherzustellen. Insbesondere ist es nicht zulässig, in einer korrigierten Nachricht (bspw. nach Erhalt einer RTS-Nachricht) die UUID der ursprünglichen Nachricht wiederzuverwenden. Sofern eine einmal erzeugte Nachricht ein weiteres Mal gesendet werden soll (bspw. aufgrund von Problemen beim Nachrichtentransport), muss die UUID nicht angepasst werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachrichten UUID</em>' attribute.
	 * @see #setNachrichtenUUID(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getIdentifikationNachrichtType_NachrichtenUUID()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='nachrichtenUUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNachrichtenUUID();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getNachrichtenUUID <em>Nachrichten UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachrichten UUID</em>' attribute.
	 * @see #getNachrichtenUUID()
	 * @generated
	 */
	void setNachrichtenUUID(String value);

	/**
	 * Returns the value of the '<em><b>Nachrichtentyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die eindeutige Identifizierungsnummer für einen Nachrichtentyp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachrichtentyp</em>' containment reference.
	 * @see #setNachrichtentyp(CodeNachrichtentypType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getIdentifikationNachrichtType_Nachrichtentyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachrichtentyp' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeNachrichtentypType getNachrichtentyp();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getNachrichtentyp <em>Nachrichtentyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachrichtentyp</em>' containment reference.
	 * @see #getNachrichtentyp()
	 * @generated
	 */
	void setNachrichtentyp(CodeNachrichtentypType value);

	/**
	 * Returns the value of the '<em><b>Erstellungszeitpunkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Zeitpunkt, an dem die Nachricht erstellt wurde. Dieses Feld wird durch das Fachverfahren beim Erstellen der Nachricht gefüllt. Hier ist explizit nicht der Sende- und Empfangszeitpunkt festgehalten, denn die können in der Regel der Transportschicht entnommen werden. Der Erstellungszeitpunkt muss neben einer Angabe zum Datum eine zeitliche Information beinhalten. Diese ist mit einer Genauigkeit auf Ebene von Millisekunden und der Angabe zur Zeitzone zu übermitteln.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erstellungszeitpunkt</em>' attribute.
	 * @see #setErstellungszeitpunkt(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getIdentifikationNachrichtType_Erstellungszeitpunkt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='erstellungszeitpunkt' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getErstellungszeitpunkt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getErstellungszeitpunkt <em>Erstellungszeitpunkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erstellungszeitpunkt</em>' attribute.
	 * @see #getErstellungszeitpunkt()
	 * @generated
	 */
	void setErstellungszeitpunkt(XMLGregorianCalendar value);

} // IdentifikationNachrichtType
