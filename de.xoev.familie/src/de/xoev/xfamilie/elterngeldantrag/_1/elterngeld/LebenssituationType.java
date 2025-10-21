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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lebenssituation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Das Verhältnis des antragstellenden Elternteils zum anderen Elternteil. Regel: Man darf nicht gleichzeitig unverheiratet zusammen und getrennt leben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#getUnverheiratetesZusammenlebenSeit <em>Unverheiratetes Zusammenleben Seit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isDauerndesGetrenntLeben <em>Dauerndes Getrennt Leben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#getDauerndesGetrenntLebenSeit <em>Dauerndes Getrennt Leben Seit</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getLebenssituationType()
 * @model extendedMetaData="name='LebenssituationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LebenssituationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unverheiratetes Zusammenleben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der antragstellende Elternteil unverheiratet mit dem anderen Elternteil zusammenlebt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unverheiratetes Zusammenleben</em>' attribute.
	 * @see #isSetUnverheiratetesZusammenleben()
	 * @see #unsetUnverheiratetesZusammenleben()
	 * @see #setUnverheiratetesZusammenleben(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getLebenssituationType_UnverheiratetesZusammenleben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='unverheiratetesZusammenleben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUnverheiratetesZusammenleben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unverheiratetes Zusammenleben</em>' attribute.
	 * @see #isSetUnverheiratetesZusammenleben()
	 * @see #unsetUnverheiratetesZusammenleben()
	 * @see #isUnverheiratetesZusammenleben()
	 * @generated
	 */
	void setUnverheiratetesZusammenleben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnverheiratetesZusammenleben()
	 * @see #isUnverheiratetesZusammenleben()
	 * @see #setUnverheiratetesZusammenleben(boolean)
	 * @generated
	 */
	void unsetUnverheiratetesZusammenleben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unverheiratetes Zusammenleben</em>' attribute is set.
	 * @see #unsetUnverheiratetesZusammenleben()
	 * @see #isUnverheiratetesZusammenleben()
	 * @see #setUnverheiratetesZusammenleben(boolean)
	 * @generated
	 */
	boolean isSetUnverheiratetesZusammenleben();

	/**
	 * Returns the value of the '<em><b>Unverheiratetes Zusammenleben Seit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Zeitraum, in dem der antragstellende Elternteil unverheiratet mit dem anderen Elternteil zusammenlebt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unverheiratetes Zusammenleben Seit</em>' containment reference.
	 * @see #setUnverheiratetesZusammenlebenSeit(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getLebenssituationType_UnverheiratetesZusammenlebenSeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unverheiratetesZusammenlebenSeit' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getUnverheiratetesZusammenlebenSeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#getUnverheiratetesZusammenlebenSeit <em>Unverheiratetes Zusammenleben Seit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unverheiratetes Zusammenleben Seit</em>' containment reference.
	 * @see #getUnverheiratetesZusammenlebenSeit()
	 * @generated
	 */
	void setUnverheiratetesZusammenlebenSeit(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Dauerndes Getrennt Leben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der antragstellende Elternteil dauernd getrennt vom anderen Elternteil lebt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dauerndes Getrennt Leben</em>' attribute.
	 * @see #isSetDauerndesGetrenntLeben()
	 * @see #unsetDauerndesGetrenntLeben()
	 * @see #setDauerndesGetrenntLeben(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getLebenssituationType_DauerndesGetrenntLeben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='dauerndesGetrenntLeben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDauerndesGetrenntLeben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isDauerndesGetrenntLeben <em>Dauerndes Getrennt Leben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauerndes Getrennt Leben</em>' attribute.
	 * @see #isSetDauerndesGetrenntLeben()
	 * @see #unsetDauerndesGetrenntLeben()
	 * @see #isDauerndesGetrenntLeben()
	 * @generated
	 */
	void setDauerndesGetrenntLeben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isDauerndesGetrenntLeben <em>Dauerndes Getrennt Leben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDauerndesGetrenntLeben()
	 * @see #isDauerndesGetrenntLeben()
	 * @see #setDauerndesGetrenntLeben(boolean)
	 * @generated
	 */
	void unsetDauerndesGetrenntLeben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#isDauerndesGetrenntLeben <em>Dauerndes Getrennt Leben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dauerndes Getrennt Leben</em>' attribute is set.
	 * @see #unsetDauerndesGetrenntLeben()
	 * @see #isDauerndesGetrenntLeben()
	 * @see #setDauerndesGetrenntLeben(boolean)
	 * @generated
	 */
	boolean isSetDauerndesGetrenntLeben();

	/**
	 * Returns the value of the '<em><b>Dauerndes Getrennt Leben Seit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Zeitraum, in dem der antragstellende Elternteil dauernd getrennt vom anderen Elternteil lebt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dauerndes Getrennt Leben Seit</em>' containment reference.
	 * @see #setDauerndesGetrenntLebenSeit(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getLebenssituationType_DauerndesGetrenntLebenSeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dauerndesGetrenntLebenSeit' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getDauerndesGetrenntLebenSeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType#getDauerndesGetrenntLebenSeit <em>Dauerndes Getrennt Leben Seit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauerndes Getrennt Leben Seit</em>' containment reference.
	 * @see #getDauerndesGetrenntLebenSeit()
	 * @generated
	 */
	void setDauerndesGetrenntLebenSeit(TeilbekanntesDatumType value);

} // LebenssituationType
