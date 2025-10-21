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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType#getPointLabelGroup <em>Point Label Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType#getPointLabel <em>Point Label</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType()
 * @model extendedMetaData="name='label_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LabelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Point Label Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein PointLabel verortet Text an einem Punkt oder dem CenterPoint einer Fläche oder Linie. 
	 * 
	 * Zusätzlich zu den von Label ererbten Attributen ermöglicht PointLabel eine Drehung und eine Verschiebung des Texts. 
	 * 
	 * Mehrzeilge Texte werden im Inneren horizontal entsprechend der 'horizontalAlignment'-Option ausgerichtet.
	 * 
	 * Im Äußeren erfolgt das Alignment bezogen auf die gesamte Box. Der Wert verticalAlignment=base wird auf die unterste Zeile der Box bezogen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Label Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType_PointLabelGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='PointLabel:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPointLabelGroup();

	/**
	 * Returns the value of the '<em><b>Point Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein PointLabel verortet Text an einem Punkt oder dem CenterPoint einer Fläche oder Linie. 
	 * 
	 * Zusätzlich zu den von Label ererbten Attributen ermöglicht PointLabel eine Drehung und eine Verschiebung des Texts. 
	 * 
	 * Mehrzeilge Texte werden im Inneren horizontal entsprechend der 'horizontalAlignment'-Option ausgerichtet.
	 * 
	 * Im Äußeren erfolgt das Alignment bezogen auf die gesamte Box. Der Wert verticalAlignment=base wird auf die unterste Zeile der Box bezogen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Label</em>' containment reference.
	 * @see #setPointLabel(PointLabelType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType_PointLabel()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointLabel' namespace='##targetNamespace' group='PointLabel:group'"
	 * @generated
	 */
	PointLabelType getPointLabel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType#getPointLabel <em>Point Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Label</em>' containment reference.
	 * @see #getPointLabel()
	 * @generated
	 */
	void setPointLabel(PointLabelType value);

} // LabelType
