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
 * A representation of the model object '<em><b>Bearbeitung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Erledigung eines Beteiligungsschrittes in einem Geschäftsgang.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.BearbeitungType#getBearbeiter <em>Bearbeiter</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BearbeitungType#getDatum <em>Datum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BearbeitungType#getUhrzeit <em>Uhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BearbeitungType#getVermerk <em>Vermerk</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BearbeitungType#getNotiz <em>Notiz</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BearbeitungType#getAnlage <em>Anlage</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getBearbeitungType()
 * @model extendedMetaData="name='BearbeitungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BearbeitungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bearbeiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die spezifische Ausprägung eines Kontaktes, der die Informationen zum Bearbeiter des Beteiligungsschrittes enthält.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearbeiter</em>' containment reference.
	 * @see #setBearbeiter(KontaktType)
	 * @see de.xoev.domea.domea.DomeaPackage#getBearbeitungType_Bearbeiter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bearbeiter' namespace='##targetNamespace'"
	 * @generated
	 */
	KontaktType getBearbeiter();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BearbeitungType#getBearbeiter <em>Bearbeiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeiter</em>' containment reference.
	 * @see #getBearbeiter()
	 * @generated
	 */
	void setBearbeiter(KontaktType value);

	/**
	 * Returns the value of the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Datum des Bearbeitungsabschlusses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum</em>' attribute.
	 * @see #setDatum(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getBearbeitungType_Datum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='Datum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDatum();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BearbeitungType#getDatum <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum</em>' attribute.
	 * @see #getDatum()
	 * @generated
	 */
	void setDatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Zeitpunkt des Bearbeitungsabschlusses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uhrzeit</em>' attribute.
	 * @see #setUhrzeit(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getBearbeitungType_Uhrzeit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='element' name='Uhrzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getUhrzeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BearbeitungType#getUhrzeit <em>Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uhrzeit</em>' attribute.
	 * @see #getUhrzeit()
	 * @generated
	 */
	void setUhrzeit(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Vermerk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Bemerkung auf einem Schriftgutobjekt, die den Geschäftsgang und die Bearbeitung steuert. Sie dient dem Nachvollziehen der Erledigung eines Geschäftsvorfalls. Im konkreten Fall von xdomea ist hiermit die Bestätigung der Erledigung eines Beteiligungsschrittes im externen und internen Geschäftsgang gemeint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vermerk</em>' attribute.
	 * @see #setVermerk(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getBearbeitungType_Vermerk()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Vermerk' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVermerk();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BearbeitungType#getVermerk <em>Vermerk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vermerk</em>' attribute.
	 * @see #getVermerk()
	 * @generated
	 */
	void setVermerk(String value);

	/**
	 * Returns the value of the '<em><b>Notiz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die ergänzende Anmerkung, die der Bearbeiter zum Beteiligungsschritt erfasst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notiz</em>' attribute.
	 * @see #setNotiz(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getBearbeitungType_Notiz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Notiz' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNotiz();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BearbeitungType#getNotiz <em>Notiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notiz</em>' attribute.
	 * @see #getNotiz()
	 * @generated
	 */
	void setNotiz(String value);

	/**
	 * Returns the value of the '<em><b>Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Dokument, das der Bearbeiter des Beteiligungsschrittes dem Beteiligungsschritt z. B. als Stellungnahme beifügt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anlage</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getBearbeitungType_Anlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anlage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DokumentOderDokumentMitSchriftstueckType> getAnlage();

} // BearbeitungType
