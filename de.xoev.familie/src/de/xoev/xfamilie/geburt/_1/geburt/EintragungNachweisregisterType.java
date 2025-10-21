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
package de.xoev.xfamilie.geburt._1.geburt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eintragung Nachweisregister Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur Eintragung im Nachweisregister.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#isEintragungVorhanden <em>Eintragung Vorhanden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getEintragungSorgeregisterArt <em>Eintragung Sorgeregister Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getWohnortJugendamtMutter <em>Wohnort Jugendamt Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getRegisterfuerhrendesJugendamt <em>Registerfuerhrendes Jugendamt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getEintragungNachweisregisterType()
 * @model extendedMetaData="name='EintragungNachweisregisterType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EintragungNachweisregisterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Eintragung Vorhanden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob für das betreffende Kind ein Eintrag in einem Sorgeregister vorliegt. Ist dieser boolean [false] kann ein automatisierter Negativbescheid ausgestellt werden. Ist er [true] muss ein Wert der Codeliste AlleinsorgeEintragung mitgesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eintragung Vorhanden</em>' attribute.
	 * @see #isSetEintragungVorhanden()
	 * @see #unsetEintragungVorhanden()
	 * @see #setEintragungVorhanden(boolean)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getEintragungNachweisregisterType_EintragungVorhanden()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='eintragungVorhanden' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEintragungVorhanden();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#isEintragungVorhanden <em>Eintragung Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eintragung Vorhanden</em>' attribute.
	 * @see #isSetEintragungVorhanden()
	 * @see #unsetEintragungVorhanden()
	 * @see #isEintragungVorhanden()
	 * @generated
	 */
	void setEintragungVorhanden(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#isEintragungVorhanden <em>Eintragung Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEintragungVorhanden()
	 * @see #isEintragungVorhanden()
	 * @see #setEintragungVorhanden(boolean)
	 * @generated
	 */
	void unsetEintragungVorhanden();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#isEintragungVorhanden <em>Eintragung Vorhanden</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eintragung Vorhanden</em>' attribute is set.
	 * @see #unsetEintragungVorhanden()
	 * @see #isEintragungVorhanden()
	 * @see #setEintragungVorhanden(boolean)
	 * @generated
	 */
	boolean isSetEintragungVorhanden();

	/**
	 * Returns the value of the '<em><b>Eintragung Sorgeregister Art</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.geburt._1.geburt.CodeAlleinsorgeEintragungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Eintragung im Sorgeregister.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eintragung Sorgeregister Art</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getEintragungNachweisregisterType_EintragungSorgeregisterArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eintragungSorgeregisterArt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeAlleinsorgeEintragungType> getEintragungSorgeregisterArt();

	/**
	 * Returns the value of the '<em><b>Wohnort Jugendamt Mutter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das für die Mutter des Kindes zuständige Wohnortjugendamt gemäß § 87c Absatz 6 Satz 1 SGB VIII. Die Zuständigkeit ergibt sich aus dem gewöhnlichen bzw. tatsächlichem Aufenthaltsort der Mutter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wohnort Jugendamt Mutter</em>' attribute.
	 * @see #setWohnortJugendamtMutter(String)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getEintragungNachweisregisterType_WohnortJugendamtMutter()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='wohnortJugendamtMutter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWohnortJugendamtMutter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getWohnortJugendamtMutter <em>Wohnort Jugendamt Mutter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnort Jugendamt Mutter</em>' attribute.
	 * @see #getWohnortJugendamtMutter()
	 * @generated
	 */
	void setWohnortJugendamtMutter(String value);

	/**
	 * Returns the value of the '<em><b>Registerfuerhrendes Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das für den Sorgeregistereintrag des Kinds zuständige Jugendamt gemäß 87c Absatz 6 Satz 2 SGB VIII.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registerfuerhrendes Jugendamt</em>' attribute.
	 * @see #setRegisterfuerhrendesJugendamt(String)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getEintragungNachweisregisterType_RegisterfuerhrendesJugendamt()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='registerfuerhrendesJugendamt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegisterfuerhrendesJugendamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getRegisterfuerhrendesJugendamt <em>Registerfuerhrendes Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registerfuerhrendes Jugendamt</em>' attribute.
	 * @see #getRegisterfuerhrendesJugendamt()
	 * @generated
	 */
	void setRegisterfuerhrendesJugendamt(String value);

} // EintragungNachweisregisterType
