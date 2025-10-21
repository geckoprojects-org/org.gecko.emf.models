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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beendigung0604 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getAntragstellenderElternteilBeendigung <em>Antragstellender Elternteil Beendigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getAngabenZumKindBeendigung <em>Angaben Zum Kind Beendigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isBeendigungBestaetigung <em>Beendigung Bestaetigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftBeendigung0604Type()
 * @model extendedMetaData="name='beistandschaft.beendigung.0604_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BeistandschaftBeendigung0604Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Antragstellender Elternteil Beendigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antragstellender Elternteil Beendigung</em>' containment reference.
	 * @see #setAntragstellenderElternteilBeendigung(AntragstellenderElternteilBeendigungType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftBeendigung0604Type_AntragstellenderElternteilBeendigung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragstellenderElternteilBeendigung' namespace='##targetNamespace'"
	 * @generated
	 */
	AntragstellenderElternteilBeendigungType getAntragstellenderElternteilBeendigung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getAntragstellenderElternteilBeendigung <em>Antragstellender Elternteil Beendigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragstellender Elternteil Beendigung</em>' containment reference.
	 * @see #getAntragstellenderElternteilBeendigung()
	 * @generated
	 */
	void setAntragstellenderElternteilBeendigung(AntragstellenderElternteilBeendigungType value);

	/**
	 * Returns the value of the '<em><b>Angaben Zum Kind Beendigung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Zum Kind Beendigung</em>' containment reference list.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftBeendigung0604Type_AngabenZumKindBeendigung()
	 * @model containment="true" required="true" upper="10"
	 *        extendedMetaData="kind='element' name='angabenZumKindBeendigung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngabenZumKindBeendigungType> getAngabenZumKindBeendigung();

	/**
	 * Returns the value of the '<em><b>Beendigung Bestaetigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beendigung Bestaetigung</em>' attribute.
	 * @see #isSetBeendigungBestaetigung()
	 * @see #unsetBeendigungBestaetigung()
	 * @see #setBeendigungBestaetigung(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftBeendigung0604Type_BeendigungBestaetigung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='beendigungBestaetigung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBeendigungBestaetigung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isBeendigungBestaetigung <em>Beendigung Bestaetigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beendigung Bestaetigung</em>' attribute.
	 * @see #isSetBeendigungBestaetigung()
	 * @see #unsetBeendigungBestaetigung()
	 * @see #isBeendigungBestaetigung()
	 * @generated
	 */
	void setBeendigungBestaetigung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isBeendigungBestaetigung <em>Beendigung Bestaetigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBeendigungBestaetigung()
	 * @see #isBeendigungBestaetigung()
	 * @see #setBeendigungBestaetigung(boolean)
	 * @generated
	 */
	void unsetBeendigungBestaetigung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isBeendigungBestaetigung <em>Beendigung Bestaetigung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Beendigung Bestaetigung</em>' attribute is set.
	 * @see #unsetBeendigungBestaetigung()
	 * @see #isBeendigungBestaetigung()
	 * @see #setBeendigungBestaetigung(boolean)
	 * @generated
	 */
	boolean isSetBeendigungBestaetigung();

	/**
	 * Returns the value of the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestätigung zur Datenschutzerklärung des Dienst-betreibenden Landes sowie zur spezifischen Datenschutzerklärung des nachnutzenden Landes oder der nachnutzenden Kommune.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo</em>' containment reference.
	 * @see #setDsgvo(DatenschutzerklaerungenType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftBeendigung0604Type_Dsgvo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dsgvo' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzerklaerungenType getDsgvo();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getDsgvo <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgvo</em>' containment reference.
	 * @see #getDsgvo()
	 * @generated
	 */
	void setDsgvo(DatenschutzerklaerungenType value);

	/**
	 * Returns the value of the '<em><b>Richtigkeit Der Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Richtigkeit Der Angaben</em>' attribute.
	 * @see #isSetRichtigkeitDerAngaben()
	 * @see #unsetRichtigkeitDerAngaben()
	 * @see #setRichtigkeitDerAngaben(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftBeendigung0604Type_RichtigkeitDerAngaben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='richtigkeitDerAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRichtigkeitDerAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtigkeit Der Angaben</em>' attribute.
	 * @see #isSetRichtigkeitDerAngaben()
	 * @see #unsetRichtigkeitDerAngaben()
	 * @see #isRichtigkeitDerAngaben()
	 * @generated
	 */
	void setRichtigkeitDerAngaben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRichtigkeitDerAngaben()
	 * @see #isRichtigkeitDerAngaben()
	 * @see #setRichtigkeitDerAngaben(boolean)
	 * @generated
	 */
	void unsetRichtigkeitDerAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Richtigkeit Der Angaben</em>' attribute is set.
	 * @see #unsetRichtigkeitDerAngaben()
	 * @see #isRichtigkeitDerAngaben()
	 * @see #setRichtigkeitDerAngaben(boolean)
	 * @generated
	 */
	boolean isSetRichtigkeitDerAngaben();

	/**
	 * Returns the value of the '<em><b>Warten Auf Unterschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob noch auf Unterschrit gewartet werden muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warten Auf Unterschrift</em>' attribute.
	 * @see #isSetWartenAufUnterschrift()
	 * @see #unsetWartenAufUnterschrift()
	 * @see #setWartenAufUnterschrift(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getBeistandschaftBeendigung0604Type_WartenAufUnterschrift()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='wartenAufUnterschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWartenAufUnterschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warten Auf Unterschrift</em>' attribute.
	 * @see #isSetWartenAufUnterschrift()
	 * @see #unsetWartenAufUnterschrift()
	 * @see #isWartenAufUnterschrift()
	 * @generated
	 */
	void setWartenAufUnterschrift(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWartenAufUnterschrift()
	 * @see #isWartenAufUnterschrift()
	 * @see #setWartenAufUnterschrift(boolean)
	 * @generated
	 */
	void unsetWartenAufUnterschrift();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warten Auf Unterschrift</em>' attribute is set.
	 * @see #unsetWartenAufUnterschrift()
	 * @see #isWartenAufUnterschrift()
	 * @see #setWartenAufUnterschrift(boolean)
	 * @generated
	 */
	boolean isSetWartenAufUnterschrift();

} // BeistandschaftBeendigung0604Type
