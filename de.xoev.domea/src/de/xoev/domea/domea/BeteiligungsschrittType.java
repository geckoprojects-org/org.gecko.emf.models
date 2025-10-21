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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beteiligungsschritt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Das Verwaltungshandeln an einem Schriftgutobjekt wird in dem zugehörigen Geschäftsgang protokolliert, der sich aus einzelnen Beteiligungsschritten zusammensetzt. Jeder Beteiligungsschritt hat einen Verfügungsteil, in dem der Bearbeitungsschritt festgelegt, und einen Bearbeitungsteil, in dem der Beteiligungsschritt bearbeitet wird. Die Beteiligungsschritte im Geschäftsgang werden fortlaufend nummeriert.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.BeteiligungsschrittType#getNummer <em>Nummer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BeteiligungsschrittType#getStatus <em>Status</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BeteiligungsschrittType#getVerfuegung <em>Verfuegung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BeteiligungsschrittType#getBearbeitung <em>Bearbeitung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BeteiligungsschrittType#getParallelZuBeteiligungsschritt <em>Parallel Zu Beteiligungsschritt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BeteiligungsschrittType#getVersionNummer <em>Version Nummer</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getBeteiligungsschrittType()
 * @model extendedMetaData="name='BeteiligungsschrittType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BeteiligungsschrittType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Nummer des Beteiligungsschrittes innerhalb der fortlaufenden Nummerierung im Geschäftsgang. Die Nummerierung ist innerhalb eines xdomea-Geschäftsgangsobjekts eindeutig. Werden in den xdomea-Geschäftsgang neue Bearbeitungsschritte eingefügt, werden dementsprechend die Nummern der nachfolgenden Beteiligungsschritte verändert. Beteiligungsschritte, die abgeschlossen sind, sind unveränderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nummer</em>' attribute.
	 * @see #setNummer(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getBeteiligungsschrittType_Nummer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Nummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNummer();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BeteiligungsschrittType#getNummer <em>Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer</em>' attribute.
	 * @see #getNummer()
	 * @generated
	 */
	void setNummer(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Status beschreibt den Fortschritt eines Beteiligungsschrittes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(BeteiligungsstatusCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getBeteiligungsschrittType_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Status' namespace='##targetNamespace'"
	 * @generated
	 */
	BeteiligungsstatusCodeType getStatus();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BeteiligungsschrittType#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(BeteiligungsstatusCodeType value);

	/**
	 * Returns the value of the '<em><b>Verfuegung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steuerungsinformation und Arbeitsanweisung bei der Bearbeitung eines Geschäftsvorfalls. Im konkreten Fall von xdomea ist hier die Arbeitsanweisung für den Bearbeiter eines Beteiligungsschrittes im externen und internen Geschäftsgang gemeint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verfuegung</em>' containment reference.
	 * @see #setVerfuegung(VerfuegungType)
	 * @see de.xoev.domea.domea.DomeaPackage#getBeteiligungsschrittType_Verfuegung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Verfuegung' namespace='##targetNamespace'"
	 * @generated
	 */
	VerfuegungType getVerfuegung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BeteiligungsschrittType#getVerfuegung <em>Verfuegung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verfuegung</em>' containment reference.
	 * @see #getVerfuegung()
	 * @generated
	 */
	void setVerfuegung(VerfuegungType value);

	/**
	 * Returns the value of the '<em><b>Bearbeitung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In der Bearbeitung sind die Informationen zum Bearbeitungsteil des Beteiligungsschrittes zusammengefasst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearbeitung</em>' containment reference.
	 * @see #setBearbeitung(BearbeitungType)
	 * @see de.xoev.domea.domea.DomeaPackage#getBeteiligungsschrittType_Bearbeitung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bearbeitung' namespace='##targetNamespace'"
	 * @generated
	 */
	BearbeitungType getBearbeitung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BeteiligungsschrittType#getBearbeitung <em>Bearbeitung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeitung</em>' containment reference.
	 * @see #getBearbeitung()
	 * @generated
	 */
	void setBearbeitung(BearbeitungType value);

	/**
	 * Returns the value of the '<em><b>Parallel Zu Beteiligungsschritt</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei einem internen Geschäftsgang mit parallelen Stationen ist hier die Nummer der weiteren parallelen Station einzutragen. Hinweis: Dieses Element kommt nur zum Tragen, wenn der BeteiligungsschrittType im Kontext des Elements "InternerGeschaeftsgang" verwendet wird. Im Rahmen der Nachrichtengruppe "Geschäftsgang durchführen" ist dieses Element nicht zu verwenden, da im Rahmen systemexterner Geschäftsgänge nur sequentielle Laufwege unterstützt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parallel Zu Beteiligungsschritt</em>' attribute list.
	 * @see de.xoev.domea.domea.DomeaPackage#getBeteiligungsschrittType_ParallelZuBeteiligungsschritt()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ParallelZuBeteiligungsschritt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getParallelZuBeteiligungsschritt();

	/**
	 * Returns the value of the '<em><b>Version Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Nummer der Version desjenigen Dokuments oder Schriftstücks, auf das sich der Beteiligungsschritt bezieht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Nummer</em>' attribute.
	 * @see #setVersionNummer(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getBeteiligungsschrittType_VersionNummer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VersionNummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionNummer();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BeteiligungsschrittType#getVersionNummer <em>Version Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Nummer</em>' attribute.
	 * @see #getVersionNummer()
	 * @generated
	 */
	void setVersionNummer(String value);

} // BeteiligungsschrittType
